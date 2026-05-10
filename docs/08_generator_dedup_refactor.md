# Generator 全面声明式重构设计（方案 C）

> 日期：2026-05-10
> 状态：**已实施 (Layer 2 & 3)** / **挂起 (Layer 1)**
> 范围：`generator/core` + `generator/*/` + `icons-*/`
> 收益：已通过声明式 IconSource 消除 ~400 行重复代码。Layer 1 (Gradle 插件自动注册) 由于插件版本冲突暂缓。

---

## 0. 触发条件与前代方案回顾

本方案在以下三个条件同时满足下成立：

1. **快速开发期**：项目处于高速迭代，基础设施投资回报率放大
2. **允许破坏性改动**：可规范化既有不一致（Radix 命名、Tabler alias 策略等）
3. **更看重长期效益**：接受 4 天前期投入换取长期每库 120 行节省

### 前代方案及否决原因

| 方案 | 定位 | 否决理由 |
|---|---|---|
| MVP（只改 generator 侧 build.gradle.kts）| 最小侵入 | 只覆盖 10% 的真实重复量，漏掉更大的 icons-*/ 样板（~690 行）与 IconSource 重复逻辑 |
| YAML 脚手架 | 作者语言 + 代码生成 | Kotlin DSL 严格更优：类型安全、零新依赖、hook 无阻抗失配；YAML 的"非 Kotlin 开发者可编辑"优势对内部基础设施无意义 |
| 运行时 YAML 引擎 | 数据驱动 + 插件 | 投入 1-2 周 + 永久维护成本，回本点 > 10 新库，经济上不划算 |

**C 方案**合并 MVP 的稳健性 + YAML 的覆盖面 + 声明式架构的长期可维护性，用 Kotlin DSL 作为表达形式，不引入新依赖，同时打破既有不一致。

---

## 1. 问题诊断

### 1.1 重复量实测（2026-05-10 测量）

| 样板类型 | 单文件 LOC | × 10 文件 | 可抽共性 | 真差异值 LOC |
|---|---:|---:|---:|---:|
| `generator/*/build.gradle.kts` | 27 | 272 | 19 | 8/文件 |
| `icons-*/build.gradle.kts` | 69 | 690 | 65 | 4/文件 |
| `generator/*/src/.../Main.kt` | 3 | 30 | 0 | 3/文件（不可压缩） |
| `generator/*/src/.../*IconSource.kt` | 40-88 | 578 | ~400 | ~20-40/文件 |
| **合计** | | **1570** | **~1100** | |

1100+ 行的机械重复隐藏在 discovery 逻辑、数据声明、Maven publish 样板中。

### 1.2 IconSource 的差异归约

10 个 `discoverIcons` 实现的差异可归约为 **4 种发现策略 + 2 种 hook**：

| 发现策略 | 代表库 |
|---|---|
| `Flat(subdir)` | Radix、Lucide |
| `Subdirectories(subdir)` | Tabler、Iconoir、Boxicons、Heroicons |
| `SuffixBased(subdir, rules)` | Phosphor、Bootstrap、Ionicons |
| `TreeWalk(subdir, rules)` | Remix |

| Hook | 代表库 | 作用 |
|---|---|---|
| `AliasFilter` | Tabler（可选） | 过滤 `aliases.json` 里声明的别名 SVG |
| `MetadataEnricher` | Remix | 从 `tags.json` 读取每图标的 tags/category |

这意味着 **100% 的 10 个库可用 `(strategy, 0..N hooks)` 二元组描述**，不存在"无法用数据表达"的案例。

### 1.3 既有不一致（破坏性改动要处理的）

| 不一致 | 当前 | 规范化后 |
|---|---|---|
| `SvgIconEntry.fileName` 含 `.svg` 扩展名 | Radix、Remix 用 `nameWithoutExtension`，其他 8 个用 `file.name` | 统一 `file.name`（IconNameMapper 内部已处理 `.svg` 剥离） |
| `helperFunctionName` 命名 | Radix `radixIcon`（不带 style）vs Iconoir `iconoirRegularIcon`（带 style） | 每 style 显式声明，不依赖推导规则 |
| Tabler alias 过滤 | 默认开启（用户看不到 `2fa`） | **保持默认开启**，作为标准 DiscoveryHook 实施 |
| 2-arg 构造器 `(upstreamVersion, referRoot)` | Tabler/Lucide/Phosphor 有，其他没有 | 统一单参 `(referRoot)`，`upstreamVersion` 在 DSL 内声明 |

---

## 2. 设计目标

| 目标 | 验收标准 |
|---|---|
| 新库接入成本降到 < 50 行手写 | 10 个现存库平均迁移后 ≤ 50 行 |
| IconSource 接口契约不变 | `generator-core` 的 `IconSource` 接口零改动，保证向后兼容 |
| 单元测试可独立验证每种策略 | 4 种 discovery 策略各 ≥ 5 个代表场景 |
| 迁移过程零产物漂移 | 每库迁移前后 `web-preview/public/data/<lib>.json` 逐字节一致 |
| 零新运行时依赖 | 只使用已有 kotlinx.serialization + Kotlin stdlib |

### 红线（不做）

- 不引入 YAML/TOML/JSON 解析器（Kotlin DSL 已足够）
- 不改动 `generator-core` 的 `IconSource` 接口契约
- 不把 discovery 逻辑内嵌进 svg2compose（Rust 侧仍只处理 manifest 输入）
- 不引入反射或运行时代码生成

---

## 3. 架构总览

三个独立层，**每层一个 PR，分次可验收**：

```
┌─────────────────────────────────────────────────────────────┐
│ 层 1 — Convention Plugins（build.gradle.kts 样板）           │
│ [状态：挂起/暂缓] 由于 Gradle 插件 Classpath 冲突，任务仍手动注册  │
│                                                             │
│  未来计划通过 Composite Build 或独立插件库实施                │
└──────────────────────────┬──────────────────────────────────┘
                           │
┌──────────────────────────┴──────────────────────────────────┐
│ 层 2 — 声明式 IconSource（Kotlin DSL + 策略 + Hook）          │
│                                                             │
│  *IconSource.kt (手写 40-88 行)  ──►  iconLibrary { ... }   │
│                                       (声明式 20-30 行)      │
│                                                             │
│  生成产物完全相同（策略类包装当前散落逻辑）                  │
└──────────────────────────┬──────────────────────────────────┘
                           │
┌──────────────────────────┴──────────────────────────────────┐
│ 层 3 — 逐库迁移                                              │
│                                                             │
│  10 个 IconSource 从 "手写类" 迁到 "DSL 声明"                │
│  每库一条 commit，产物 hash 逐字节对比                       │
└─────────────────────────────────────────────────────────────┘
```

---

## 4. 详细设计

### 4.1 层 1 — Convention Plugins

#### 4.1.1 generator 侧：`compose-icons-generator` 扩展

承接并扩展既有 `GeneratorConventionPlugin`（现只做 kotlin.jvm + application + core 依赖），追加 `downloadIcons` + `generateIcons` 任务自动注册。

**新增 DSL 扩展** `buildSrc/src/main/kotlin/composeicons/gradle/ComposeIconsExtension.kt`：

```kotlin
abstract class ComposeIconsExtension {
    abstract val repoUrl: Property<String>
    abstract val tagName: Property<String>                // 空串 = 默认分支
    abstract val upstreamSubdir: Property<String>          // 相对 upstream/{dir} 的子路径
    abstract val upstreamDirName: Property<String>         // 默认 = project.name
    abstract val reportName: Property<String>              // 默认 = project.name + ".json"
}
```

**Convention Plugin 扩展**（关键：`Property.map { }` 链，不用 `afterEvaluate`）：

```kotlin
class GeneratorConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        // ... 现有逻辑 ...

        val ext = project.extensions.create("composeIcons", ComposeIconsExtension::class.java)
        ext.upstreamDirName.convention(project.name)
        ext.upstreamSubdir.convention("")
        ext.reportName.convention("${project.name}.json")

        val rootDir = project.rootProject.layout.projectDirectory
        val targetDirProvider = ext.upstreamDirName.map { rootDir.dir("upstream/$it") }
        val sourceRootProvider = project.providers.zip(
            ext.upstreamDirName, ext.upstreamSubdir
        ) { dirName, subdir ->
            val upstreamDir = rootDir.dir("upstream/$dirName")
            if (subdir.isEmpty()) upstreamDir else upstreamDir.dir(subdir)
        }

        val download = project.tasks.register("downloadIcons", DownloadIconSourceTask::class.java) {
            repoUrl.set(ext.repoUrl)
            tagName.set(ext.tagName)
            targetDir.set(targetDirProvider)
        }

        project.tasks.register("generateIcons", GenerateIconsTask::class.java) {
            group = "compose icons"
            description = "Generate Compose icons from ${project.name} SVG sources."
            dependsOn(":tools:resolveSvg2Compose", "classes", download)

            mainClass.set("composeicons.generator.${project.name}.MainKt")
            generatorClasspath.from(project.sourceSets.named("main").get().runtimeClasspath)
            args.set(targetDirProvider.map { dir ->
                listOf(project.rootProject.projectDir.absolutePath, dir.asFile.absolutePath)
            })
            sourceRootDir.set(sourceRootProvider)
            workingDir.set(project.rootProject.projectDir)
            svg2ComposeBinary.set(rootDir.file(
                "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
            ))
            outputDir.set(rootDir.dir("icons-${project.name}/src/generated/kotlin/composeicons/${project.name}"))
            reportFile.set(ext.reportName.map { rootDir.file("web-preview/public/data/$it").asFile })
        }
    }
}
```

**改造后 `generator/iconoir/build.gradle.kts`**：

```kotlin
plugins { id("compose-icons-generator") }

composeIcons {
    repoUrl.set("https://github.com/iconoir-icons/iconoir.git")
    tagName.set("main")
    upstreamSubdir.set("icons")
}
```

从 26 行降到 **7 行**。

#### 4.1.2 icons 侧：`compose-icons-library` 新插件

新增 `buildSrc/src/main/kotlin/composeicons/gradle/IconLibraryConventionPlugin.kt`：

```kotlin
class IconLibraryConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply("com.android.library")
        project.pluginManager.apply("org.jetbrains.kotlin.plugin.compose")
        project.pluginManager.apply("com.vanniktech.maven.publish")

        val ext = project.extensions.create("iconLibrary", IconLibraryExtension::class.java)
        ext.license.convention(License.MIT)

        val moduleSlug = project.name.removePrefix("icons-")

        project.extensions.configure<LibraryExtension>("android") {
            namespace = "composeicons.$moduleSlug"
            compileSdk = 36
            defaultConfig {
                minSdk = 21
                consumerProguardFiles("consumer-rules.pro")
            }
            buildFeatures { compose = true }
            sourceSets.getByName("main").kotlin.srcDir("src/generated/kotlin")
        }

        project.dependencies {
            add("api", project.project(":icons-core"))
            add("implementation", project.dependencies.platform(/* libs.compose.bom */))
            add("implementation", /* libs.compose.ui */)
            add("implementation", /* libs.compose.ui.graphics */)
        }

        project.extensions.configure<MavenPublishBaseExtension>("mavenPublishing") {
            publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
            signAllPublications()
            coordinates(
                groupId = project.providers.gradleProperty("composeIconsGroup").get(),
                artifactId = project.name,
                version = project.providers.gradleProperty("composeIconsVersion").get(),
            )
            configure(AndroidSingleVariantLibrary("release", sourcesJar = true, publishJavadocJar = true))
            pom {
                name.set(project.name)
                description.set(ext.displayName.map { "$it for Jetpack Compose - generated via svg2compose pipeline" })
                url.set("https://github.com/jinghu-moon/compose-icons")
                licenses {
                    license {
                        name.set(ext.license.map { it.fullName })
                        url.set(ext.license.map { it.url })
                        distribution.set("repo")
                    }
                }
                developers { developer { id.set("jinghu-moon"); name.set("Jinghu Moon"); url.set("https://github.com/jinghu-moon") } }
                scm {
                    url.set("https://github.com/jinghu-moon/compose-icons")
                    connection.set("scm:git:git://github.com/jinghu-moon/compose-icons.git")
                    developerConnection.set("scm:git:ssh://git@github.com/jinghu-moon/compose-icons.git")
                }
            }
        }
    }
}

abstract class IconLibraryExtension {
    abstract val displayName: Property<String>
    abstract val license: Property<License>
}

enum class License(val fullName: String, val url: String) {
    MIT("MIT License", "https://opensource.org/licenses/MIT"),
    ISC("ISC License", "https://opensource.org/licenses/ISC"),
    APACHE_2("Apache License 2.0", "https://opensource.org/licenses/Apache-2.0"),
    BSD_3("BSD 3-Clause License", "https://opensource.org/licenses/BSD-3-Clause"),
}
```

**改造后 `icons-iconoir/build.gradle.kts`**：

```kotlin
plugins { id("compose-icons-library") }

iconLibrary {
    displayName.set("Iconoir")
    license.set(License.MIT)
}
```

从 69 行降到 **5 行**。

> `icons-core/build.gradle.kts` 因为没有 `src/generated/kotlin` + `api(:icons-core)`，保持独立 build.gradle.kts（不经 Convention Plugin），或 plugin 加 `isCoreModule: Property<Boolean>` 开关。推荐保持独立，`icons-core` 是特例不应牵动通用模板。

---

### 4.2 层 2 — 声明式 IconSource

#### 4.2.1 核心数据模型

新增 `generator/core/src/main/kotlin/composeicons/generator/core/manifest/LibraryManifest.kt`：

```kotlin
package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

/**
 * 声明式 IconSource 的数据模型。
 *
 * 通过 [iconLibrary] DSL 构造，包装当前 10 个库散落在各 IconSource 实现里的
 * 数据声明 + discovery 逻辑，使新增图标库从 ~80 行代码降到 ~25 行 DSL。
 *
 * 不改变 [IconSource] 接口契约。[ManifestBasedIconSource] 包装此数据类，
 * 对外仍是合法的 [IconSource] 实例。
 */
data class LibraryManifest(
    val name: String,
    val displayName: String,
    val iconContainerName: String,
    val upstreamVersion: String,
    val basePackage: String,
    val styles: List<StyleDeclaration>,
    val discovery: DiscoveryStrategy,
    val hooks: List<DiscoveryHook> = emptyList(),
)

data class StyleDeclaration(
    val name: String,
    /** 相对 [DiscoveryStrategy] 根目录的子路径；Flat 策略下可为 null。 */
    val subdirectory: String?,
    val helperFunction: String,
    val defaultPathStyle: PathStyle,
)

fun StyleDeclaration.toIconStyle() = IconStyle(name, subdirectory.orEmpty())
```

#### 4.2.2 Discovery 策略 sealed 层次

```kotlin
// generator-core: DiscoveryStrategy.kt
sealed interface DiscoveryStrategy {
    fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry>
    fun resolvedSourceDir(referRoot: File): File

    /** 扁平目录，单 style，所有 SVG 归属同一 style。适用：Lucide / Radix */
    data class Flat(val subdir: String) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            require(styles.size == 1) {
                "Flat discovery requires exactly 1 style, got ${styles.size}"
            }
            return resolvedSourceDir(referRoot).listSvgFiles().map { file ->
                SvgIconEntry(fileName = file.name, style = styles[0].toIconStyle(), file = file)
            }
        }
    }

    /** 每 style 一个子目录。子目录名由 style.subdirectory 决定。适用：Tabler / Iconoir / Heroicons / Boxicons */
    data class Subdirectories(val subdir: String) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            val iconsDir = resolvedSourceDir(referRoot)
            return styles.flatMap { style ->
                val styleSubdir = style.subdirectory
                    ?: error("Subdirectories discovery requires style.subdirectory for '${style.name}'")
                iconsDir.resolve(styleSubdir).listSvgFiles().map { file ->
                    SvgIconEntry(fileName = file.name, style = style.toIconStyle(), file = file)
                }
            }
        }
    }

    /**
     * 扁平目录，文件名后缀决定 style。匹配命中时后缀被剥离。适用：Phosphor / Bootstrap / Ionicons
     *
     * rules 按声明顺序评估，先命中即返回。Default 应放最后。
     */
    data class SuffixBased(val subdir: String, val rules: List<Rule>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            return resolvedSourceDir(referRoot).listSvgFiles().mapNotNull { file ->
                classifyBySuffix(file, styles, rules)
            }
        }
    }

    /** 递归树遍历，匹配规则同 [SuffixBased]。适用：Remix */
    data class TreeWalk(val subdir: String, val rules: List<SuffixBased.Rule>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            return resolvedSourceDir(referRoot).walkTopDown()
                .filter { it.isFile && it.extension.equals("svg", ignoreCase = true) }
                .mapNotNull { file -> classifyBySuffix(file, styles, rules) }
                .sortedBy { it.file.absolutePath }
                .toList()
        }
    }

    sealed interface Rule {
        data class Match(val style: String, val suffix: String) : Rule
        data class Exclude(val suffix: String) : Rule
        data class Default(val style: String) : Rule
    }
}

// internal helper
private fun classifyBySuffix(
    file: File,
    styles: List<StyleDeclaration>,
    rules: List<DiscoveryStrategy.SuffixBased.Rule>,
): SvgIconEntry? {
    val name = file.nameWithoutExtension
    for (rule in rules) {
        when (rule) {
            is DiscoveryStrategy.SuffixBased.Rule.Match -> if (name.endsWith(rule.suffix)) {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                val strippedName = "${name.removeSuffix(rule.suffix)}.svg"
                return SvgIconEntry(fileName = strippedName, style = style.toIconStyle(), file = file)
            }
            is DiscoveryStrategy.SuffixBased.Rule.Exclude -> if (name.endsWith(rule.suffix)) {
                return null
            }
            is DiscoveryStrategy.SuffixBased.Rule.Default -> {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                return SvgIconEntry(fileName = file.name, style = style.toIconStyle(), file = file)
            }
        }
    }
    return null
}
```

#### 4.2.3 Hook 接口

```kotlin
// generator-core: DiscoveryHook.kt
fun interface DiscoveryHook {
    fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry>
}

/** 过滤 alias SVG（Tabler aliases.json 场景）。 */
class AliasFilterHook(private val aliases: Set<String>) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.filter { it.fileName !in aliases }
}

/** 用外部元数据富化每个 entry。key 为 fileName.removeSuffix(".svg")。 */
class MetadataEnricherHook(
    private val metadataBy: Map<String, SvgMetadata>,
) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.map { entry ->
            val key = entry.fileName.removeSuffix(".svg")
            entry.copy(metadata = metadataBy[key] ?: SvgMetadata.EMPTY)
        }
}
```

#### 4.2.4 ManifestBasedIconSource 包装类

```kotlin
// generator-core: ManifestBasedIconSource.kt
class ManifestBasedIconSource(
    private val manifest: LibraryManifest,
    private val referRoot: File,
) : IconSource {
    override val name: String = manifest.name
    override val displayName: String = manifest.displayName
    override val iconContainerName: String = manifest.iconContainerName
    override val upstreamVersion: String = manifest.upstreamVersion
    override val basePackage: String = manifest.basePackage
    override val styles: List<IconStyle> = manifest.styles.map { it.toIconStyle() }

    override fun downloadSvg(outputDir: File) {}  // no-op, Gradle handles

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val raw = manifest.discovery.discover(referRoot, manifest.styles)
        return manifest.hooks.fold(raw) { acc, hook -> hook.transform(acc) }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle =
        manifest.styles.find { it.name == style.name }?.defaultPathStyle
            ?: error("Unknown style: ${style.name}")

    override fun helperFunctionName(style: IconStyle): String =
        manifest.styles.find { it.name == style.name }?.helperFunction
            ?: error("Unknown style: ${style.name}")

    override fun svgSourceDir(referRoot: File): File =
        manifest.discovery.resolvedSourceDir(referRoot)
}
```

#### 4.2.5 Kotlin DSL

```kotlin
// generator-core: IconLibraryDsl.kt
@DslMarker annotation class IconLibraryDslMarker

fun iconLibrary(
    referRoot: File,
    block: LibraryManifestBuilder.() -> Unit,
): IconSource {
    val builder = LibraryManifestBuilder()
    builder.block()
    return ManifestBasedIconSource(builder.build(), referRoot)
}

@IconLibraryDslMarker
class LibraryManifestBuilder {
    var name: String = ""
    var displayName: String = ""
    var iconContainerName: String = ""
    var upstreamVersion: String = ""
    var basePackage: String = ""

    private val styles = mutableListOf<StyleDeclaration>()
    private val hooks = mutableListOf<DiscoveryHook>()
    var discovery: DiscoveryStrategy? = null

    fun style(name: String, block: StyleBuilder.() -> Unit) {
        styles.add(StyleBuilder(name).apply(block).build())
    }

    fun hook(hook: DiscoveryHook) { hooks.add(hook) }
    fun hook(transform: (List<SvgIconEntry>) -> List<SvgIconEntry>) { hooks.add(DiscoveryHook(transform)) }

    fun build() = LibraryManifest(
        name = name.ifBlank { error("name required") },
        displayName = displayName.ifBlank { error("displayName required") },
        iconContainerName = iconContainerName.ifBlank { error("iconContainerName required") },
        upstreamVersion = upstreamVersion.ifBlank { error("upstreamVersion required") },
        basePackage = basePackage.ifBlank { error("basePackage required") },
        styles = styles.toList(),
        discovery = discovery ?: error("discovery required"),
        hooks = hooks.toList(),
    )
}

@IconLibraryDslMarker
class StyleBuilder(private val styleName: String) {
    var subdirectory: String? = null
    var helperFunction: String = ""
    private var defaultPathStyle: PathStyle? = null

    fun defaultPathStyle(block: PathStyleBuilder.() -> Unit) {
        defaultPathStyle = PathStyleBuilder().apply(block).build()
    }

    fun build() = StyleDeclaration(
        name = styleName,
        subdirectory = subdirectory,
        helperFunction = helperFunction.ifBlank { error("helperFunction required for style '$styleName'") },
        defaultPathStyle = defaultPathStyle ?: error("defaultPathStyle required for style '$styleName'"),
    )
}

@IconLibraryDslMarker
class PathStyleBuilder {
    var fill: String? = null
    var stroke: String? = null
    var strokeWidth: Float? = null
    var strokeLineCap: String? = null
    var strokeLineJoin: String? = null
    var fillRule: String? = null
    var alpha: Float = 1.0f

    fun build() = PathStyle(fill, stroke, strokeWidth, strokeLineCap, strokeLineJoin, fillRule, alpha)
}

// DiscoveryStrategy 构造器辅助函数
fun flat(subdir: String) = DiscoveryStrategy.Flat(subdir)
fun subdirectories(subdir: String) = DiscoveryStrategy.Subdirectories(subdir)
fun suffixBased(subdir: String, block: SuffixRulesBuilder.() -> Unit) =
    DiscoveryStrategy.SuffixBased(subdir, SuffixRulesBuilder().apply(block).rules())
fun treeWalk(subdir: String, block: SuffixRulesBuilder.() -> Unit) =
    DiscoveryStrategy.TreeWalk(subdir, SuffixRulesBuilder().apply(block).rules())

@IconLibraryDslMarker
class SuffixRulesBuilder {
    private val rules = mutableListOf<DiscoveryStrategy.SuffixBased.Rule>()
    fun match(style: String, suffix: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Match(style, suffix)) }
    fun exclude(suffix: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Exclude(suffix)) }
    fun default(style: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Default(style)) }
    internal fun rules(): List<DiscoveryStrategy.SuffixBased.Rule> = rules.toList()
}
```

---

### 4.3 10 个库的完整 DSL 形态（全部可验证）

#### 4.3.1 Iconoir（标准 subdirectories）

```kotlin
// generator/iconoir/src/main/kotlin/composeicons/generator/iconoir/IconoirIconSource.kt
package composeicons.generator.iconoir

import composeicons.generator.core.IconSource
import composeicons.generator.core.manifest.*
import java.io.File

fun IconoirIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "iconoir"
    displayName = "Iconoir"
    iconContainerName = "IconoirIcons"
    basePackage = "composeicons.iconoir"
    upstreamVersion = "main"

    style("Regular") {
        subdirectory = "regular"
        helperFunction = "iconoirRegularIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Solid") {
        subdirectory = "solid"
        helperFunction = "iconoirSolidIcon"
        defaultPathStyle {
            fill = "currentColor"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }

    discovery = subdirectories("icons")
}

// Main.kt 保持 3 行不变
fun main(args: Array<String>) = generatorMain(args) { IconoirIconSource(it) }
```

从 48 行降到 **27 行**。

#### 4.3.2 Lucide / Radix（Flat 策略）

```kotlin
// Lucide
fun LucideIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "lucide"; displayName = "LucideIcons"; iconContainerName = "LucideIcons"
    basePackage = "composeicons.lucide"; upstreamVersion = "main"

    style("Outline") {
        helperFunction = "lucideOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 2f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    discovery = flat("icons")
}

// Radix
fun RadixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "radixicons"; displayName = "Radix Icons"; iconContainerName = "RadixIcons"
    basePackage = "composeicons.radix"; upstreamVersion = "1.3.0"

    style("Regular") {
        helperFunction = "radixIcon"
        defaultPathStyle {
            fill = "currentColor"; fillRule = "nonzero"
        }
    }
    discovery = flat("packages/radix-icons/icons")
}
```

Lucide: 48 → 16 行。Radix: 40 → 16 行（`helperFunction = "radixIcon"` 保持单 style 无后缀的现有约定）。

#### 4.3.3 Tabler（subdirectories + 可选 AliasFilter hook）

```kotlin
fun TablerIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "tabler"; displayName = "TablerIcons"; iconContainerName = "TablerIcons"
    basePackage = "composeicons.tabler"; upstreamVersion = "3.41.1"

    style("Outline") {
        subdirectory = "outline"
        helperFunction = "tablerOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 2f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Filled") {
        subdirectory = "filled"
        helperFunction = "tablerFilledIcon"
        defaultPathStyle {
            fill = "currentColor"
        }
    }

    discovery = subdirectories("icons")

    // 破坏性改动：默认关闭 alias 过滤，让 Auth2fa 和 _2fa 两个名字都可见。
    // 如需恢复旧行为（只暴露 canonical name），取消下面注释：
    // hook(AliasFilterHook(TablerAliasRegistry.load(referRoot).aliases))
}
```

Tabler: 88 → 28 行。`TablerAliasRegistry.kt` 保留，但默认不启用。

#### 4.3.4 Heroicons（subdirectories with deep path）

```kotlin
fun HeroiconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "heroicons"; displayName = "Heroicons"; iconContainerName = "HeroiconsIcons"
    basePackage = "composeicons.heroicons"; upstreamVersion = "v2.2.0"

    style("Solid16") {
        subdirectory = "16/solid"                    // 深路径直接写在 subdirectory
        helperFunction = "heroiconsSolid16Icon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Solid20") {
        subdirectory = "20/solid"
        helperFunction = "heroiconsSolid20Icon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Outline") {
        subdirectory = "24/outline"
        helperFunction = "heroiconsOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Solid") {
        subdirectory = "24/solid"
        helperFunction = "heroiconsSolidIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("src")
}
```

Heroicons: 51 → 35 行。

#### 4.3.5 Boxicons（subdirectories with renamed styles）

```kotlin
fun BoxiconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "boxicons"; displayName = "Boxicons"; iconContainerName = "BoxiconsIcons"
    basePackage = "composeicons.boxicons"; upstreamVersion = "2.1.4"

    style("Regular") { subdirectory = "basic";   helperFunction = "boxiconsRegularIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Solid")   { subdirectory = "filled";  helperFunction = "boxiconsSolidIcon";   defaultPathStyle { fill = "currentColor" } }
    style("Logos")   { subdirectory = "brands";  helperFunction = "boxiconsLogosIcon";   defaultPathStyle { fill = "currentColor" } }

    discovery = subdirectories("svg")
}
```

Boxicons: 53 → 14 行。

#### 4.3.6 Bootstrap（SuffixBased + Exclude）

```kotlin
fun BootstrapIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "bootstrap"; displayName = "Bootstrap Icons"; iconContainerName = "BootstrapIcons"
    basePackage = "composeicons.bootstrap"; upstreamVersion = "v1.11.3"

    style("Regular") { helperFunction = "bootstrapRegularIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Fill")    { helperFunction = "bootstrapFillIcon";    defaultPathStyle { fill = "currentColor" } }

    discovery = suffixBased("icons") {
        match("Fill", "-fill")
        exclude("-half")
        default("Regular")
    }
}
```

Bootstrap: 45 → 16 行。

#### 4.3.7 Ionicons（SuffixBased，反向默认）

```kotlin
fun IoniconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "ionicons"; displayName = "Ionicons"; iconContainerName = "IoniconsIcons"
    basePackage = "composeicons.ionicons"; upstreamVersion = "main"

    style("Filled") { helperFunction = "ioniconsFilledIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Outline") {
        helperFunction = "ioniconsOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 32f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Sharp") { helperFunction = "ioniconsSharpIcon"; defaultPathStyle { fill = "currentColor" } }

    discovery = suffixBased("src/svg") {
        match("Outline", "-outline")
        match("Sharp", "-sharp")
        default("Filled")             // Ionicons 的 filled 是无后缀的，放 default
    }
}
```

Ionicons: 49 → 22 行。

#### 4.3.8 Phosphor（SuffixBased，6 weight）

```kotlin
fun PhosphorIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "phosphor"; displayName = "PhosphorIcons"; iconContainerName = "PhosphorIcons"
    basePackage = "composeicons.phosphor"; upstreamVersion = "2.1.0"

    fun stroke(width: Float) = PathStyleBuilder().apply {
        fill = "none"; stroke = "currentColor"; strokeWidth = width
        strokeLineCap = "round"; strokeLineJoin = "round"
    }.build()

    style("Thin")    { helperFunction = "phosphorThinIcon";    defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 8f;  strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Light")   { helperFunction = "phosphorLightIcon";   defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 12f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Regular") { helperFunction = "phosphorRegularIcon"; defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 16f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Bold")    { helperFunction = "phosphorBoldIcon";    defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 24f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Fill")    { helperFunction = "phosphorFillIcon";    defaultPathStyle { fill = "currentColor" } }
    style("Duotone") { helperFunction = "phosphorDuotoneIcon"; defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 16f; strokeLineCap = "round"; strokeLineJoin = "round" } }

    discovery = suffixBased("public/assets/phosphor.iconjar/icons") {
        match("Thin", "-thin")
        match("Light", "-light")
        match("Bold", "-bold")
        match("Fill", "-fill")
        match("Duotone", "-duotone")
        default("Regular")
    }
}
```

Phosphor: 77 → 32 行。

#### 4.3.9 Remix（TreeWalk + MetadataEnricher hook）

```kotlin
fun RemixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "remixicons"; displayName = "Remix Icon"; iconContainerName = "RemixIcons"
    basePackage = "composeicons.remix"; upstreamVersion = "4.2.0"

    style("Fill") { helperFunction = "remixIcon"; defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" } }
    style("Line") { helperFunction = "remixIcon"; defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" } }

    discovery = treeWalk("icons") {
        match("Fill", "-fill")
        match("Line", "-line")
    }

    hook(MetadataEnricherHook(RemixTagsLoader.load(referRoot.resolve("tags.json"))))
}

// 辅助类（保留在 generator/remix 模块中）
object RemixTagsLoader {
    fun load(tagsFile: File): Map<String, SvgMetadata> { /* 现有 tagsMap 逻辑 */ }
}
```

Remix: 76 → 28 行。

#### 4.3.10 总览

| 库 | 原 LOC | 重构后 | 节省 | 策略 | Hook |
|---|---:|---:|---:|---|---|
| Lucide | 48 | 16 | -32 | Flat | - |
| Radix | 40 | 16 | -24 | Flat | - |
| Iconoir | 48 | 27 | -21 | Subdirectories | - |
| Tabler | 88 | 28 | -60 | Subdirectories | AliasFilter（可选） |
| Heroicons | 51 | 35 | -16 | Subdirectories | - |
| Boxicons | 53 | 14 | -39 | Subdirectories | - |
| Bootstrap | 45 | 16 | -29 | SuffixBased | - |
| Ionicons | 49 | 22 | -27 | SuffixBased | - |
| Phosphor | 77 | 32 | -45 | SuffixBased | - |
| Remix | 76 | 28 | -48 | TreeWalk | MetadataEnricher |
| **合计** | **575** | **234** | **-341** | | |

IconSource 层面节省 **341 行**。加上 build.gradle.kts 两层节省 **~842 行**，总节省 ~1183 行。

---

## 5. 实施路径（3 个独立 PR）

### PR 1 — 两个 Convention Plugin（半天）

**目标**：build.gradle.kts 重复消除，IconSource 不动。

**任务**：
1. 扩展 `GeneratorConventionPlugin` 追加 DSL + 任务注册（4.1.1）
2. 新增 `IconLibraryConventionPlugin`（4.1.2）
3. 改造 10 个 `generator/*/build.gradle.kts`（统一减至 ~8 行）
4. 改造 10 个 `icons-*/build.gradle.kts`（统一减至 ~5 行）
5. 验证：`./gradlew :generator:cli:run --args=". all"` 全量生成零失败

**验收**：
- 任一 generator 模块的 `build.gradle.kts` ≤ 10 行
- 任一 icons 模块的 `build.gradle.kts` ≤ 7 行
- 生成产物 hash 与 PR 前一致

### PR 2 — 声明式 IconSource 基础设施（1 天）

**目标**：DSL + 4 个 discovery 策略 + 2 个内置 hook，**不迁移任何现有库**。

**任务**：
1. 新增 `generator/core/src/main/kotlin/.../manifest/` 目录
   - `LibraryManifest.kt` + `StyleDeclaration.kt`
   - `DiscoveryStrategy.kt`（sealed hierarchy + 4 实现）
   - `DiscoveryHook.kt` + `AliasFilterHook.kt` + `MetadataEnricherHook.kt`
   - `ManifestBasedIconSource.kt`
   - `IconLibraryDsl.kt`
2. 单元测试矩阵（每 strategy ≥ 5 case）：
   - Flat: 空目录 / 单文件 / 多文件 / 子目录被忽略 / 错误 style 数量报错
   - Subdirectories: 多 style / 缺子目录报错 / 部分子目录为空
   - SuffixBased: 仅默认 / 仅 match / exclude 先于 match / 多 match 顺序敏感 / 无 default 时未匹配返回 null
   - TreeWalk: 深度嵌套 / 空目录树 / 混合后缀 / sort 稳定性
3. Hook 链测试：AliasFilter + MetadataEnricher 组合应用
4. **不触碰任何现有 IconSource.kt**

**验收**：
- 所有单测通过（25+ 个测试用例）
- `./gradlew :generator:core:test` 通过
- 10 个现有生成器仍按原逻辑工作（回归）

### PR 3 — 10 库逐个迁移（2 天）

**目标**：10 个现有 IconSource 迁到 DSL，逐个 commit。

**每库迁移流程**：
1. 准备：全量运行 `./gradlew :generator:<lib>:generateIcons --rerun-tasks`，记录 `web-preview/public/data/<lib>.json` 的 MD5
2. 重写 `*IconSource.kt` 为 DSL 形式（参考 4.3.x）
3. 重跑：再次全量生成
4. 对比：diff 两份 JSON；如 hash 完全相同则通过
5. 如有漂移：检查 diff 是否可接受（如 fileName 扩展名规范化、alias 新增等）；不可接受则回滚该库
6. commit：单库一条 commit，message 注明"migrated to DSL / diff hash: xxx/xxx"

**推荐顺序**（由简到繁）：Radix → Lucide → Iconoir → Boxicons → Heroicons → Bootstrap → Ionicons → Tabler → Phosphor → Remix

**附带清理**：
- 删除 `TablerAliasRegistry.kt` 或降级为 opt-in helper（见 §6）
- 删除 `RemixTagsLoader` 以外的 Remix 散落辅助类

**验收**：
- 10 库全量生成零失败
- `./gradlew :sample:assembleAllRelease` 编译通过
- `sample:verifyRoborazziDebug` 零视觉回归

---

## 6. 破坏性改动清单

| 改动 | 面向 | 影响 | CHANGELOG 条目 |
|---|---|---|---|
| `TablerAliasRegistry` 默认关闭 | 消费方 | Tabler 新增 ~100 个 alias 图标（`_2fa` 等） | BREAKING: TablerIcons 暴露 alias，用户可用 `TablerIcons.Outline._2fa` 或 `Auth2fa` 任一 |
| `SvgIconEntry.fileName` 统一带 `.svg` | 生成器内部 | Radix/Remix 的 manifest 文件名格式变化 | 内部；不影响最终生成的 Kotlin API |
| IconSource 构造器统一单参 `(referRoot)` | 生成器内部 | Tabler/Lucide/Phosphor 从 2-arg 改为 1-arg（`upstreamVersion` 在 DSL 内声明）| 内部；不影响消费方 |

只有第一条（Tabler alias）是真正的消费方面向破坏。建议 CHANGELOG 明确记录并在文档示例里展示两种引用风格。

---

## 7. 风险与缓解

| 风险 | 概率 | 影响 | 缓解 |
|---|---|---|---|
| Discovery 策略 bug 同时打 10 个库 | 中 | 严重 | PR 2 单测先行，每 strategy 5+ 代表场景；PR 3 逐库 hash 对比 |
| Kotlin DSL 学习曲线 | 低 | 轻 | Iconoir 作为 `@Sample` 引用；docs/07 完整改写配 5 个 strategy 对照表 |
| `SuffixBased` 规则顺序依赖 | 中 | 误分类 | 显式 `match` 先于 `exclude` 先于 `default`；单测强制 |
| 迁移过程产物漂移未察觉 | 中 | 轻-中 | PR 3 每库独立 commit + 逐字节 JSON hash 对比 |
| `Property.map` 链在 configuration cache 下失败 | 低 | 中 | 已按 Gradle 9.x 最佳实践，`providers.zip` 替代 `afterEvaluate` |
| 上游新版打破某 strategy 假设 | 低 | 单库失败 | sealed hierarchy 可编译期枚举；加新 strategy 扩展而非修改 |

---

## 8. 不在范围内

- **icons-core 扩展** (`LocalIcons` / `SemanticIcons`)：独立话题，不在此次范围
- **SVG 重命名/归一化到磁盘**：不需要——DSL 层已抹平差异
- **YAML 解析层**：Kotlin DSL 严格更优，不补 YAML（未来若有强烈场景需求可加 `LibraryManifest` 的 kaml 序列化层，现在不做）
- **scaffold 命令**：DSL 足够短（14-35 行），新库直接复制最接近的已有库即可，不需要代码生成器
- **svg2compose（Rust）修改**：零改动，仍只处理 manifest 输入
- **:generator:cli 改动**：其 `sources` map 会指向新的 DSL 工厂函数（例如 `TablerIconSource(referRoot)`），但接口签名不变

---

## 9. 完成后的开发体验对比

**接入新库 "Feather Icons"（假设 Outline + Solid 2 style，subdirectory 组织）**：

### 今天（150 行手写）

```
generator/feather/
├── build.gradle.kts                                        [27 行]
├── src/main/kotlin/composeicons/generator/feather/
│   ├── Main.kt                                             [3 行]
│   └── FeatherIconSource.kt                                [60 行 手写 IconSource]
icons-feather/
├── build.gradle.kts                                        [69 行 Maven publish]
├── consumer-rules.pro                                      [空]
└── src/main/kotlin/composeicons/feather/
    └── FeatherIcons.kt                                     [需手写容器对象]
settings.gradle.kts                                          [+2 行 include]
compose-icons-bom/build.gradle.kts                          [+1 行]
sample/build.gradle.kts                                     [+1 行]
```

### 重构后（~50 行 DSL + 1 手写容器对象）

```
generator/feather/
├── build.gradle.kts                                        [8 行]
│     plugins { id("compose-icons-generator") }
│     composeIcons {
│         repoUrl.set("https://github.com/feathericons/feather.git")
│         tagName.set("v4.29.2")
│         upstreamSubdir.set("icons")
│     }
├── src/main/kotlin/composeicons/generator/feather/
│   ├── Main.kt                                             [3 行]
│   └── FeatherIconSource.kt                                [20 行 DSL]
│         fun FeatherIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
│             name = "feather"; displayName = "Feather"
│             iconContainerName = "FeatherIcons"
│             basePackage = "composeicons.feather"; upstreamVersion = "v4.29.2"
│             style("Outline") { helperFunction = "featherOutlineIcon"; defaultPathStyle { ... } }
│             style("Solid")   { helperFunction = "featherSolidIcon";   defaultPathStyle { ... } }
│             discovery = subdirectories(".")
│         }
icons-feather/
├── build.gradle.kts                                        [5 行]
│     plugins { id("compose-icons-library") }
│     iconLibrary {
│         displayName.set("Feather")
│         license.set(License.MIT)
│     }
├── consumer-rules.pro                                      [空]
└── src/main/kotlin/composeicons/feather/
    └── FeatherIcons.kt                                     [容器对象仍需手写]
settings.gradle.kts                                         [+2 行]
compose-icons-bom/build.gradle.kts                          [+1 行]
sample/build.gradle.kts                                     [+1 行]
```

从 150 行降到 **~50 行（含空白）**。新贡献者只需理解"哪种 discovery 策略 + 每个 style 怎么渲染"两件事。

---

## 10. 参考

- [docs/07_new_icon_library_integration_plan.md](./07_new_icon_library_integration_plan.md) — 本方案完成后将完整改写
- [docs/04_innovation_ksp_scanner.md](./04_innovation_ksp_scanner.md) — KSP scanner 不受此重构影响
- [docs/05_innovation_shared_path_pool.md](./05_innovation_shared_path_pool.md) — Shared Path Pool 不受此重构影响
- [docs/architecture.md](./architecture.md) — 架构白皮书，IconSource 契约章节保持有效

---

## 变更记录

- **2026-05-10 v1**（MVP 版）：仅 Convention Plugin DSL 化
- **2026-05-10 v2**（当前，方案 C）：扩展为三层完整重构，加入声明式 IconSource + Discovery 策略 sealed 层次
