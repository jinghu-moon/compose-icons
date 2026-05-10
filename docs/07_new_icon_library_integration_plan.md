# 新图标库接入方案（审核修正版）

> 日期：2026-05-10
> 状态：**待实施**
> 图标库：Heroicons / Iconoir / Ionicons / Bootstrap Icons / Boxicons
> 源码位置：`refer1/` 目录（后续迁移至 `upstream/` 自动下载）

---

## 0. 变更摘要

本方案基于对 `refer1/` 中五个图标库源码的逐一审查编写，已修正原始方案中的关键偏差：

| 图标库 | 原方案假设 | 实际情况 | 影响 |
|--------|-----------|---------|------|
| Heroicons | `src/{16,20,24}/{outline,solid}` 全矩阵 | 仅 24 有 outline，16/20 仅有 solid | 变体数量从 6 降至 4 |
| Ionicons | filled 后缀为 `-filled.svg` | filled 无后缀，直接为 `{name}.svg` | 发现逻辑反转 |
| Boxicons | `bxs-`/`bxl-` 前缀区分变体 | 三个目录统一 `bx-` 前缀，靠目录区分 | 发现机制完全不同 |
| Iconoir | solid 使用 `fill="#0F172A"` 无 stroke | solid 路径同时有 `fill` 和 `stroke="currentColor"` | defaultPathStyle 需含 stroke |
| Bootstrap | fill 变体默认 `fill-rule="evenodd"` | 仅 69/670 使用 fill-rule | 不应作为默认值 |
| Bootstrap | regular 数量 1,408 | 实际 1,393 regular + 670 fill + 15 half | 计数修正 |

---

## 1. 整体架构

每个图标库创建 2 个模块：

```
generator/{lib}/          — Kotlin JVM 模块（IconSource + Main + build.gradle.kts）
icons-{lib}/              — Android Library 模块（生成产物）
```

集成点：
- `settings.gradle.kts` — 添加 `include(":generator:{lib}")` 和 `include(":icons-{lib}")`
- `compose-icons-bom/build.gradle.kts` — 添加 `api(project(":icons-{lib}"))`
- `sample/build.gradle.kts` — 添加 `implementation(project(":icons-{lib}"))`

每个 `icons-{lib}/` 模块需创建空的 `consumer-rules.pro` 文件（AGP 要求）。

`downloadSvg()` 方法：现有实现均为空操作（no-op），因为 SVG 源码通过 `DownloadIconSourceTask` 预下载到 `upstream/`。
新库沿用此模式，`downloadSvg` 方法体为空。

### 1.1 IconSource 接口完整契约

每个新图标库的 `IconSource` 实现必须提供以下全部字段和方法：

```kotlin
interface IconSource {
    val name: String                    // 小写标识符，如 "heroicons", "ionicons"
    val displayName: String             // 展示名，如 "Heroicons", "Ionicons"
    val iconContainerName: String       // 容器对象名，如 "HeroiconsIcons", "IoniconsIcons"
    val upstreamVersion: String         // 上游版本，如 "v2.2.0", "main"
    val styles: List<IconStyle>         // 变体列表
    val basePackage: String             // 包名，如 "composeicons.heroicons"

    fun downloadSvg(outputDir: File)    // 空实现（DownloadIconSourceTask 负责下载）
    fun discoverIcons(svgDir: File): List<SvgIconEntry>
    fun defaultPathStyle(style: IconStyle): PathStyle
    fun helperFunctionName(style: IconStyle): String
}
```

**各库的 IconSource 属性值：**

| 图标库 | name | displayName | iconContainerName | basePackage |
|--------|------|-------------|-------------------|-------------|
| Heroicons | `"heroicons"` | `"Heroicons"` | `"HeroiconsIcons"` | `"composeicons.heroicons"` |
| Iconoir | `"iconoir"` | `"Iconoir"` | `"IconoirIcons"` | `"composeicons.iconoir"` |
| Ionicons | `"ionicons"` | `"Ionicons"` | `"IoniconsIcons"` | `"composeicons.ionicons"` |
| Bootstrap | `"bootstrap"` | `"Bootstrap Icons"` | `"BootstrapIcons"` | `"composeicons.bootstrap"` |
| Boxicons | `"boxicons"` | `"Boxicons"` | `"BoxiconsIcons"` | `"composeicons.boxicons"` |

---

## 2. 生成器模块结构（所有库统一模式）

### 2.1 `generator/{lib}/build.gradle.kts`

```kotlin
import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin { jvmToolchain(21) }

application { mainClass.set("composeicons.generator.{lib}.MainKt") }

dependencies {
    implementation(project(":generator:core"))
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveSvg2Compose")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/{owner}/{repo}.git")
    tagName.set("")  // 或指定 tag
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/{dir}"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from {DisplayName} SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.{lib}.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    args.set(listOf(rootProject.projectDir.absolutePath, rootProject.layout.projectDirectory.dir("upstream/{dir}").asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/{svg-path}"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file("tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-{lib}/src/generated/kotlin/composeicons/{lib}"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/{report}.json"))
}
```

### 2.2 `generator/{lib}/src/main/kotlin/.../Main.kt`

> 注意：现有 5 个生成器（Tabler/Lucide/Phosphor/Remix/Radix）均**不使用** `GeneratorConfig.create()`，
> 而是手动构造 `GeneratorConfig(...)`。以下模板遵循现有惯例。

```kotlin
package composeicons.generator.{lib}

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val referRoot = args.getOrNull(1)?.let(::File) ?: projectRoot.resolve("refer/{fallback}")
    val source = {Lib}IconSource(referRoot = referRoot)

    val config = GeneratorConfig(
        sourceRootDir = referRoot.resolve("{svg-relative-path}"),
        outputDir = projectRoot.resolve("icons-{lib}/src/generated/kotlin/composeicons/{lib}"),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )

    println("Starting {DisplayName} generation...")
    GeneratorEngine(projectRoot).generate(config, source)
}
```

### 2.3 `icons-{lib}/build.gradle.kts`

> 与现有 icons 模块（icons-tabler/icons-lucide/icons-phosphor/icons-remix/icons-radix）保持一致。

```kotlin
import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.vanniktech.maven.publish)
}

android {
    namespace = "composeicons.{lib}"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    sourceSets {
        getByName("main") {
            kotlin.srcDir("src/generated/kotlin")
        }
    }
}

dependencies {
    api(project(":icons-core"))
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    coordinates(
        groupId = providers.gradleProperty("composeIconsGroup").get(),
        artifactId = "icons-{lib}",
        version = providers.gradleProperty("composeIconsVersion").get(),
    )

    configure(
        AndroidSingleVariantLibrary(
            variant = "release",
            sourcesJar = true,
            publishJavadocJar = true,
        )
    )

    pom {
        name.set("icons-{lib}")
        description.set("{Description} for Jetpack Compose - generated via svg2compose pipeline")
        url.set("https://github.com/jinghu-moon/compose-icons")
        licenses {
            license {
                name.set("{License Name}")
                url.set("{License URL}")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("jinghu-moon")
                name.set("Jinghu Moon")
                url.set("https://github.com/jinghu-moon")
            }
        }
        scm {
            url.set("https://github.com/jinghu-moon/compose-icons")
            connection.set("scm:git:git://github.com/jinghu-moon/compose-icons.git")
            developerConnection.set("scm:git:ssh://git@github.com/jinghu-moon/compose-icons.git")
        }
    }
}
```

---

## 3. 各图标库详细方案

---

### 3.1 Heroicons

**源码审查结论：**
- 结构：`src/{16,20,24}/{outline,solid}` — **稀疏矩阵**，仅 24 有 outline
- 数量：16/solid=316, 20/solid=324, 24/outline=324, 24/solid=324
- 命名：kebab-case（`academic-cap.svg`）
- 无 mini/micro 变体
- SVG 属性：路径元素**无** fill/stroke 属性（outline 需 stroke 渲染，solid 需 fill 渲染），`defaultPathStyle` 决定渲染行为

**normalizeSize 注意：** Heroicons 有 16/20/24 三种尺寸。`GeneratorConfig.normalizeSize` 默认 24.0。
16px 和 20px 变体的 viewBox 分别为 `0 0 16 16` 和 `0 0 20 20`，svg2compose 会根据 viewBox 自动归一化，
生成的 ImageVector 的 `defaultWidth`/`defaultHeight` 将分别为 16.dp / 20.dp / 24.dp。
如需统一为 24dp 输出，可对 16/20 变体设置 `normalizeSize = null`（保留原始尺寸）或接受默认行为。

**模块名：** `generator/heroicons` + `icons-heroicons`

**IconStyle 定义（4 个变体）：**

```kotlin
override val styles: List<IconStyle> = listOf(
    IconStyle(name = "Solid16", subdirectory = "solid16"),
    IconStyle(name = "Solid20", subdirectory = "solid20"),
    IconStyle(name = "Outline", subdirectory = "outline"),
    IconStyle(name = "Solid", subdirectory = "solid"),
)
```

**discoverIcons 逻辑：**

```kotlin
override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
    val srcDir = referRoot.resolve("src")
    val mapping = mapOf(
        "Solid16" to "16/solid",
        "Solid20" to "20/solid",
        "Outline" to "24/outline",
        "Solid"   to "24/solid",
    )
    return styles.flatMap { style ->
        val subPath = mapping[style.name]!!
        srcDir.resolve(subPath)
            .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?.map { file ->
                SvgIconEntry(fileName = file.name, style = style, file = file)
            }
            .orEmpty()
    }
}
```

**defaultPathStyle：**

```kotlin
override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
    "Outline" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 1.5f,
        strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
    else -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
}
```

**helperFunctionName：**

```kotlin
override fun helperFunctionName(style: IconStyle): String = when (style.name) {
    "Solid16" -> "heroiconsSolid16Icon"
    "Solid20" -> "heroiconsSolid20Icon"
    "Outline" -> "heroiconsOutlineIcon"
    "Solid"   -> "heroiconsSolidIcon"
    else -> error("Unknown style: ${style.name}")
}
```

**Gradle 配置：**
- `repoUrl` = `https://github.com/tailwindlabs/heroicons.git`
- `tagName` = `v2.2.0`
- `sourceRootDir` = `upstream/heroicons/src`
- `reportFile` = `web-preview/public/data/heroicons.json`

**预计图标数：** 1,288（316 + 324 + 324 + 324）

---

### 3.2 Iconoir

**源码审查结论：**
- 结构：`icons/{regular,solid}` — **与方案完全一致**
- 数量：regular=1,383, solid=288（solid 是 regular 的子集）
- 命名：kebab-case（`accessibility.svg`）
- SVG 属性：`viewBox="0 0 24 24"`；regular 使用 `fill="none" stroke="currentColor" stroke-width="1.5"`；solid 根元素 `fill="none"`，路径同时使用 `fill="currentColor"` 和 `stroke="currentColor" stroke-width="1.5"`

**模块名：** `generator/iconoir` + `icons-iconoir`

**IconStyle 定义（2 个变体）：**

```kotlin
override val styles: List<IconStyle> = listOf(
    IconStyle(name = "Regular", subdirectory = "regular"),
    IconStyle(name = "Solid", subdirectory = "solid"),
)
```

**discoverIcons 逻辑：**

与 TablerIconSource 模式一致 — 遍历 `icons/{regular,solid}` 子目录。

```kotlin
override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
    val iconsDir = referRoot.resolve("icons")
    return styles.flatMap { style ->
        iconsDir.resolve(style.subdirectory)
            .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?.map { file ->
                SvgIconEntry(fileName = file.name, style = style, file = file)
            }
            .orEmpty()
    }
}
```

**defaultPathStyle：**

```kotlin
override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
    "Regular" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 1.5f,
        strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
    "Solid" -> PathStyle(fill = "currentColor", stroke = "currentColor", strokeWidth = 1.5f,
        strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
    else -> error("Unknown style: ${style.name}")
}
```

> **注意**：Iconoir Solid 变体的路径同时使用 `fill="currentColor"` 和 `stroke="currentColor"`（与 Regular 的区别仅在于多了 fill），
> svg2compose 会从 SVG 中读取实际属性，`defaultPathStyle` 作为后备值。

**helperFunctionName：**

```kotlin
override fun helperFunctionName(style: IconStyle): String = when (style.name) {
    "Regular" -> "iconoirRegularIcon"
    "Solid" -> "iconoirSolidIcon"
    else -> error("Unknown style: ${style.name}")
}
```

**Gradle 配置：**
- `repoUrl` = `https://github.com/iconoir-icons/iconoir.git`
- `tagName` = `` （空 = HEAD）
- `sourceRootDir` = `upstream/iconoir/icons`
- `reportFile` = `web-preview/public/data/iconoir.json`

**预计图标数：** 1,671（1,383 + 288）

---

### 3.3 Ionicons

**源码审查结论：**
- 结构：`src/svg/` — **扁平目录**，1,357 个 SVG
- 命名：filled 为 `{name}.svg`（无后缀），outline 为 `{name}-outline.svg`，sharp 为 `{name}-sharp.svg`
- 标准图标 421 个基础名 x 3 变体 = 1,263 文件
- Logo 图标 94 个（仅 filled，无 outline/sharp）
- SVG 属性：`viewBox="0 0 512 512"`；outline 使用 `fill="none" stroke="#000" stroke-width="32"`；filled/sharp 使用填充路径无 stroke

**关键修正：** filled 变体**没有** `-filled` 后缀。发现逻辑必须反转 — 先识别 outline/sharp，剩余文件为 filled。

**normalizeSize 注意：** Ionicons 使用 512x512 viewBox（非标准 24x24）。`GeneratorConfig.normalizeSize` 默认为 24.0，
svg2compose 会自动将 512x512 坐标归一化到 24dp，无需特殊处理。

**模块名：** `generator/ionicons` + `icons-ionicons`

**IconStyle 定义（3 个变体）：**

```kotlin
override val styles: List<IconStyle> = listOf(
    IconStyle(name = "Filled", subdirectory = "filled"),
    IconStyle(name = "Outline", subdirectory = "outline"),
    IconStyle(name = "Sharp", subdirectory = "sharp"),
)
```

**discoverIcons 逻辑：**

```kotlin
override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
    val iconsDir = referRoot.resolve("src/svg")
    val allFiles = iconsDir.listFiles { f ->
        f.isFile && f.extension.equals("svg", ignoreCase = true)
    }?.sortedBy { it.name } ?: return emptyList()

    return allFiles.mapNotNull { file ->
        val style = when {
            file.name.endsWith("-outline.svg") -> styles.find { it.name == "Outline" }
            file.name.endsWith("-sharp.svg") -> styles.find { it.name == "Sharp" }
            else -> styles.find { it.name == "Filled" }
        } ?: return@mapNotNull null

        SvgIconEntry(fileName = file.name, style = style, file = file)
    }
}
```

**defaultPathStyle：**

```kotlin
override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
    "Outline" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 32f,
        strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
    "Sharp" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    "Filled" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    else -> error("Unknown style: ${style.name}")
}
```

**helperFunctionName：**

```kotlin
override fun helperFunctionName(style: IconStyle): String = when (style.name) {
    "Filled" -> "ioniconsFilledIcon"
    "Outline" -> "ioniconsOutlineIcon"
    "Sharp" -> "ioniconsSharpIcon"
    else -> error("Unknown style: ${style.name}")
}
```

**Gradle 配置：**
- `repoUrl` = `https://github.com/ionic-team/ionicons.git`
- `tagName` = `` （空 = HEAD）
- `sourceRootDir` = `upstream/ionicons/src/svg`
- `reportFile` = `web-preview/public/data/ionicons.json`

**预计图标数：** 1,357（515 filled + 421 outline + 421 sharp）

---

### 3.4 Bootstrap Icons

**源码审查结论：**
- 结构：`icons/` — **扁平目录**，2,078 个 SVG
- 命名：regular 为 `{name}.svg`，filled 为 `{name}-fill.svg`
- 额外变体：15 个 `-half.svg` 文件（如 `heart-half.svg`）
- 669/670 个 fill 文件有对应 regular 版本
- SVG 属性：根元素 `viewBox="0 0 16 16"`、`fill="currentColor"`；路径元素无额外 fill/stroke 属性；部分 fill 图标使用 `fill-rule="evenodd"`（69/670，非通用）

**方案决策：** 忽略 `-half` 变体（仅 15 个，收益低，增加复杂度）。仅接入 Regular 和 Fill 两种变体。

**模块名：** `generator/bootstrap` + `icons-bootstrap`

**IconStyle 定义（2 个变体）：**

```kotlin
override val styles: List<IconStyle> = listOf(
    IconStyle(name = "Regular", subdirectory = "regular"),
    IconStyle(name = "Fill", subdirectory = "fill"),
)
```

**discoverIcons 逻辑：**

与 PhosphorIconSource 模式一致 — 通过后缀判断变体。

```kotlin
override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
    val iconsDir = referRoot.resolve("icons")
    val allFiles = iconsDir.listFiles { f ->
        f.isFile && f.extension.equals("svg", ignoreCase = true)
    }?.sortedBy { it.name } ?: return emptyList()

    return allFiles.mapNotNull { file ->
        val style = when {
            file.name.endsWith("-fill.svg") -> styles.find { it.name == "Fill" }
            file.name.endsWith("-half.svg") -> null  // 跳过 half 变体
            else -> styles.find { it.name == "Regular" }
        } ?: return@mapNotNull null

        SvgIconEntry(fileName = file.name, style = style, file = file)
    }
}
```

**defaultPathStyle：**

> Bootstrap SVG 根元素已声明 `fill="currentColor"`，svg2compose 会读取该属性。
> `defaultPathStyle` 作为路径级后备值。`fill-rule` 仅在少数 fill 图标中使用（69/670），由 SVG 自身声明，不作为默认值。

```kotlin
override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
    "Regular" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    "Fill" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    else -> error("Unknown style: ${style.name}")
}
```

**helperFunctionName：**

```kotlin
override fun helperFunctionName(style: IconStyle): String = when (style.name) {
    "Regular" -> "bootstrapRegularIcon"
    "Fill" -> "bootstrapFillIcon"
    else -> error("Unknown style: ${style.name}")
}
```

**Gradle 配置：**
- `repoUrl` = `https://github.com/twbs/icons.git`
- `tagName` = `v1.11.3`（或最新稳定版）
- `sourceRootDir` = `upstream/bootstrap-icons/icons`
- `reportFile` = `web-preview/public/data/bootstrap.json`

**预计图标数：** 2,063（1,393 regular + 670 fill — 15 half 跳过）

---

### 3.5 Boxicons

**源码审查结论：**
- 结构：`svg/{basic,filled,brands}` — **目录区分变体**
- 命名：**三个目录统一使用 `bx-` 前缀**，无 `bxs-`/`bxl-` 区分
- basic 和 filled 文件名完全相同（1,884 对 1:1 对应，内容不同）
- brands 的 295 个文件名与 basic/filled 完全不重叠
- SVG 属性：`viewBox="0 0 24 24"`；路径元素**无** fill/stroke 属性，`defaultPathStyle` 决定渲染行为

**关键修正：** 变体通过目录路径区分，而非文件名前缀。`discoverIcons` 必须按子目录遍历。

**模块名：** `generator/boxicons` + `icons-boxicons`

**IconStyle 定义（3 个变体）：**

```kotlin
override val styles: List<IconStyle> = listOf(
    IconStyle(name = "Regular", subdirectory = "regular"),
    IconStyle(name = "Solid", subdirectory = "solid"),
    IconStyle(name = "Logos", subdirectory = "logos"),
)
```

**discoverIcons 逻辑：**

与 TablerIconSource 模式一致 — 按子目录遍历。

```kotlin
override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
    val iconsDir = referRoot.resolve("svg")
    val mapping = mapOf(
        "Regular" to "basic",
        "Solid" to "filled",
        "Logos" to "brands",
    )
    return styles.flatMap { style ->
        val subPath = mapping[style.name]!!
        iconsDir.resolve(subPath)
            .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?.map { file ->
                SvgIconEntry(fileName = file.name, style = style, file = file)
            }
            .orEmpty()
    }
}
```

**defaultPathStyle：**

> Boxicons SVG 路径元素无 fill/stroke 属性，`defaultPathStyle` 决定渲染行为。
> basic 变体（Regular）的路径为闭合轮廓，需 fill 渲染；filled 变体（Solid）路径结构不同。
> 实施时需对比 basic/filled 路径数据确认正确的 fill/stroke 配置。

```kotlin
override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
    "Regular" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    "Solid" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    "Logos" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
        strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    else -> error("Unknown style: ${style.name}")
}
```

**helperFunctionName：**

```kotlin
override fun helperFunctionName(style: IconStyle): String = when (style.name) {
    "Regular" -> "boxiconsRegularIcon"
    "Solid" -> "boxiconsSolidIcon"
    "Logos" -> "boxiconsLogosIcon"
    else -> error("Unknown style: ${style.name}")
}
```

**Gradle 配置：**
- `repoUrl` = `https://github.com/atisawd/boxicons.git`
- `tagName` = `2.1.4`（或最新稳定版）
- `sourceRootDir` = `upstream/boxicons/svg`
- `reportFile` = `web-preview/public/data/boxicons.json`

**预计图标数：** 3,063（1,884 regular + 1,884 solid + 295 logos）

---

## 4. 全局集成变更

### 4.1 `settings.gradle.kts`

追加 10 行：

```kotlin
include(":generator:heroicons")
include(":icons-heroicons")
include(":generator:iconoir")
include(":icons-iconoir")
include(":generator:ionicons")
include(":icons-ionicons")
include(":generator:bootstrap")
include(":icons-bootstrap")
include(":generator:boxicons")
include(":icons-boxicons")
```

### 4.2 `compose-icons-bom/build.gradle.kts`

在 `constraints` 块追加：

```kotlin
api(project(":icons-heroicons"))
api(project(":icons-iconoir"))
api(project(":icons-ionicons"))
api(project(":icons-bootstrap"))
api(project(":icons-boxicons"))
```

### 4.3 `sample/build.gradle.kts`

在 `dependencies` 块追加：

```kotlin
implementation(project(":icons-heroicons"))
implementation(project(":icons-iconoir"))
implementation(project(":icons-ionicons"))
implementation(project(":icons-bootstrap"))
implementation(project(":icons-boxicons"))
```

### 4.4 `.gitignore`

已在之前的 PR 中添加 `upstream/`，无需变更。

---

## 5. 实施顺序

建议按图标数量从少到多实施，逐步验证：

| 顺序 | 图标库 | 预计图标数 | 复杂度 | 备注 |
|------|--------|-----------|--------|------|
| 1 | Ionicons | 1,357 | 中 | filled 无后缀，需特殊处理 |
| 2 | Heroicons | 1,288 | 中 | 稀疏矩阵，4 变体 |
| 3 | Iconoir | 1,671 | 低 | 最简单，目录模式 |
| 4 | Bootstrap | 2,063 | 低 | 后缀模式，跳过 half |
| 5 | Boxicons | 3,063 | 低 | 目录模式，与 Tabler 一致 |

---

## 6. 验证清单

每个图标库完成后验证：

- [ ] `gradlew :generator:{lib}:generateIcons` 成功
- [ ] `icons-{lib}/src/generated/kotlin/` 下生成正确数量的 `.kt` 文件
- [ ] `web-preview/public/data/{lib}.json` 报告文件生成
- [ ] `gradlew :icons-{lib}:assembleDebug` 编译通过
- [ ] `gradlew :sample:assembleAllRelease` 包含新图标库
- [ ] R8 基线更新后 APK 尺寸合理增长
