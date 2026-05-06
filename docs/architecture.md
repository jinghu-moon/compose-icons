# compose-icons 架构白皮书

> 本文档面向贡献者与架构评审者，正式陈述 `compose-icons` 的设计哲学、三层解耦架构与核心契约。
>
> 使用方文档请见根目录 [README.md](../README.md)；详细设计规格请见 [01_design_specification.md](./01_design_specification.md)；实施任务清单见 [02_implementation_tasks.md](./02_implementation_tasks.md)。

## 1. 设计哲学

### 1.1 一句话定位

> **极致的构建期（Build-Time）性能 + 绝对纯净的 Kotlin 产物**

这是 `compose-icons` 与同类项目的核心差异点：

| 项目 | 解析路径 | 产物纯净度 |
|------|---------|----------|
| [DevSrSouza/compose-icons](https://github.com/DevSrSouza/compose-icons) | 纯 Kotlin/JVM 字符串 / DOM 解析 | 残留 `<g>` / 无效 transform |
| [composablehorizons/compose-icons](https://github.com/composablehorizons/compose-icons) | androidx vector drawable 中间格式 | SVG → VD → IR → ImageVector，多次转换 |
| **本项目** | **svg2compose (usvg 内核) → 直接 emit .kt** | **零冗余，零中间格式** |

任何"原始 SVG 长得乱七八糟"的复杂度，由 `svg2compose`（基于 [usvg](https://github.com/linebender/resvg/tree/main/crates/usvg) 的 Rust CLI）一次性消化掉。Rust 端直接遍历 usvg 的强类型树，输出 `.kt` 文件，**Kotlin 端无需任何 SVG 解析逻辑**。

### 1.2 三个不可妥协的承诺

#### 承诺 1：零运行时开销

使用方 APK 中除被实际引用的 `ImageVector` 外，**不存在任何辅助类、反射、解析逻辑、全局注册表**。

- ❌ 不引入 `IconRegistry.register(...)` 这种全局可变状态
- ❌ 不在运行时通过 `Class.forName(...)` 反射加载图标（破坏 R8）
- ❌ 不解析 SVG / VD / 任何中间格式
- ❌ 不持有"全部图标的集合"供运行时遍历（破坏 R8）

#### 承诺 2：R8 完美裁剪

**未引用**的图标在 release build 中**必须**被 R8 移除。

实现机制：每个图标生成为顶层 property getter

```kotlin
val TablerIcons.Outline.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = tablerOutlineIcon(...) { ... }
        return _home!!
    }

private var _home: ImageVector? = null
```

R8 静态可达性分析能识别"使用方是否调用了 `TablerIcons.Outline.Home` 这个 property"，未被引用的 property 整体（包括其 lambda、path 节点常量）被裁剪。

#### 承诺 3：图标库无关

generator-core 不内建任何"Tabler 是 outline" / "Lucide 默认 stroke=2" 之类的判断。所有图标源差异由**适配器（IconSource 实现）**与 **usvg** 共同抹平。

新增图标源 = 新增一个 `IconSource` 实现 + 一个 `icons-<source>` 运行时模块，**不修改 generator-core**。这是**开闭原则（OCP）**的硬约束。

### 1.3 设计红线（永久不做）

#### ❌ 不把 ImageVector 改成 `@Composable val get() = remember(color) { ... }` 模式

**Why**：每次 Recomposition 时重建庞大 Path 对象树，破坏运行时性能，违背承诺 1。

**正确做法**：主题切换用 Compose 原生的 `Icon(vec, tint = MaterialTheme.colorScheme.primary)`。tint 仅修改一个 BlendMode 参数，零 path 重建开销。

#### ❌ 不实现 SVG 1.1 完整特性（渐变 / mask / filter / animation）

**Why**：用 Compose Canvas 实现这些特性的工程量与 resvg 持平，产物体积爆炸，维护不可持续。

**正确做法**：单色 + 准单色 SVG 已覆盖 Tabler / Lucide / Phosphor / Heroicons 的全部需求；多色品牌图标走 v2 L3（保留原始 fill 的简化保真，不实现渐变）。

#### ❌ 不在主 artifact 中包含 catalog（图标全集合）

**Why**：catalog 强引用全部 ImageVector，违背承诺 2。

**正确做法**：v1 不发布 catalog；需要 picker UI 的使用方在 v2 引入独立的 `icons-<source>-catalog` 包。catalog 包消费 generator 输出的 `meta.json`，主包零依赖。

#### ❌ 不做跨平台

**Why**：项目范围限定 Android（Jetpack Compose）。Compose Multiplatform / Desktop / iOS 不在路线图内。

#### ❌ 不在 generator-core 中处理 `<g>` / `<use>` / transform / 基础形状

**Why**：这些都是 svg2compose（usvg 内核）的职责。Kotlin 端重新实现一份等于在维护两份 SVG 解析器。

**正确做法**：svg2compose Rust 端直接遍历 usvg 强类型树，处理所有 SVG 复杂度后输出 `.kt` 文件。generator-core 仅负责编排调用和报告生成。

## 2. 系统总图

```
┌──────────────────────────────────────────────────────────────────────┐
│ 上游图标源（refer/，git ignore）                                      │
│ ├─ tabler-icons-main/icons/{outline,filled}/*.svg                    │
│ ├─ lucide-main/icons/*.svg                                           │
│ ├─ phosphor-icons-main/assets/{regular,thin,...}/*.svg               │
│ ├─ radix-icons-main/icons/*.svg                                      │
│ └─ remix-icon-main/icons/{line,fill}/*.svg                           │
└────────────────────┬─────────────────────────────────────────────────┘
                     │ (1) 适配器内部发现
                     ▼
┌──────────────────────────────────────────────────────────────────────┐
│ 构建期工具链（不发布到 Maven）                                        │
│                                                                      │
│  ┌─────────────────────────┐                                         │
│  │ tools/svg2compose(.exe) │  ← 第二层解耦：SVG→.kt Rust CLI        │
│  │ (Rust binary, ~300行)  │     基于 usvg 内核，由 Gradle 自动编译  │
│  └──────────┬──────────────┘                                         │
│             │ manifest JSON: SVG 路径 + 命名 + helper               │
│             │ 输出: .kt 文件 + result JSON                           │
│             ▼                                                        │
│  ┌────────────────────────────────────────────────────────────────┐  │
│  │ generator/                                                     │  │
│  │ ├─ core/   generator-core（图标源无关的纯逻辑）                │  │
│  │ │  ├─ IconSource              ← 第一层解耦                     │  │
│  │ │  ├─ UsvgPipeline            ← 调用 svg2compose manifest 模式 │  │
│  │ │  ├─ PathAttributes          ← 第三层解耦                     │  │
│  │ │  ├─ GeneratorEngine         ← 编排 pipeline                  │  │
│  │ │  └─ MetaJsonExporter        ← emit meta.json（v2 catalog 用）│  │
│  │ ├─ tabler/   TablerIconSource 实现                             │  │
│  │ ├─ lucide/   LucideIconSource 实现                             │  │
│  │ ├─ phosphor/ PhosphorIconSource 实现                           │  │
│  │ ├─ radix/    RadixIconSource 实现                              │  │
│  │ └─ remix/    RemixIconSource 实现                              │  │
│  └────────────────────────────────────────────────────────────────┘  │
└────────────────────┬─────────────────────────────────────────────────┘
                     │ (2) Rust CLI 直接 emit .kt 文件
                     ▼
┌──────────────────────────────────────────────────────────────────────┐
│ 发布到 Maven Central 的 artifact                                      │
│ ├─ icons-core      运行时公共构建器（IconSize / ViewBox / iconBuilder）│
│ ├─ icons-tabler    生成的 ImageVector（outline + filled 一个 artifact）│
│ ├─ icons-lucide    生成的 ImageVector（outline）                      │
│ ├─ icons-phosphor  生成的 ImageVector（6 weight）                     │
│ ├─ icons-radix     生成的 ImageVector（outline）                      │
│ └─ icons-remix     生成的 ImageVector（line + fill）                  │
└────────────────────┬─────────────────────────────────────────────────┘
                     │ (3) implementation 依赖
                     ▼
┌──────────────────────────────────────────────────────────────────────┐
│ 使用方 App                                                            │
│   Icon(TablerIcons.Outline.Home, contentDescription = null)          │
│         ↑                                                            │
│         R8 裁剪：未引用的图标全部从 release APK 移除                  │
└──────────────────────────────────────────────────────────────────────┘
```

## 3. 三层解耦

这是 generator-core 与具体图标源解耦的核心机制。每一层都解决一类具体问题。

### 3.1 第一层：物理文件差异 → IconSource 适配器

#### 问题

不同图标库的原始文件组织方式千差万别：

| 图标库 | 文件组织 |
|--------|---------|
| Tabler | `icons/{outline,filled}/*.svg` 两个子目录，外加 `aliases.json` |
| Lucide | `icons/*.svg` 全部根目录平铺 |
| Phosphor | `assets/{regular,thin,light,bold,fill,duotone}/*.svg` 六个子目录 |
| Radix | `icons/*.svg` 根目录平铺 |
| Remix | `icons/{line,fill}/*.svg` 两个子目录 |
| Heroicons (v2) | `optimized/{16,20,24}/{outline,solid}/*.svg` 多维度子目录 |
| 内部品牌图标库 | 可能用 `manifest.json` 描述每个 SVG 的元数据 |

如果 generator-core 直接读 `refer/tabler-icons-main/icons/outline/`，那它就被 Tabler 绑定了。

#### 解法

generator-core 不感知任何具体路径。`IconSource.discoverIcons()` 由适配器实现，返回**扁平**的 `List<SvgIconEntry>`。每个 entry 已经携带：
- `style`（已映射到统一的 IconStyle 模型）
- 原始 SVG 文件
- 文件名（用于命名转换）
- metadata（tags / category / aliases，由适配器从上游格式解析）

```kotlin
// generator-core 的通用 pipeline（简化后）
fun generate(source: IconSource, config: GeneratorConfig): GeneratorReport {
    val icons: List<SvgIconEntry> = source.discoverIcons(config.svgRoot)
    // 构建 manifest（SVG 路径 + 命名 + helper）
    val manifest = icons.map { ManifestEntry(it) }
    // svg2compose Rust CLI 直接生成 .kt 文件
    val results = pipeline.generateViaManifest(manifest, source.basePackage, ...)
    // 更新 report 和 web-preview 数据
}
```

#### 契约

- generator-core 永远不读 `refer/<source>-main/` 这种具体路径
- 添加新图标源 = 新增一个 `IconSource` 实现 + 一个 `generator/<source>/Main.kt` 入口 + 一个 `icons-<source>/` 运行时模块，**不修改 generator-core**
- 适配器内部自由处理子目录、命名约定、alias 文件、metadata 索引等

### 3.2 第二层：SVG 结构差异 → usvg 预处理

#### 问题

每一个图标库画图标的习惯都不一样：

- 库 A 喜欢用 `<circle cx="..." cy="..." r="..."/>` 画圆
- 库 B 喜欢用 `<path d="M ... Z"/>`
- 库 C 在里面嵌了复杂的 `<g transform="matrix(...)">`
- 库 D 用 `<use href="#stem"/>` 引用共用部分
- 库 E 用 CSS（外部样式表 / `<style>` 标签）定义 `fill`
- 库 F 用 `objectBoundingBox` 单位的渐变

如果用 Kotlin 自己写 TagParser，generator-core 会被迫处理：
- 6 种基础形状（rect / circle / ellipse / line / polyline / polygon）到 path 的转换
- 9 种 transform 矩阵（matrix / translate / scale / rotate / skewX / skewY / 复合 / 嵌套 / inherited）
- `<use>` 引用消解（含 cross-document、shadow tree）
- CSS 选择器与样式继承
- `<g>` 嵌套与样式下沉
- `objectBoundingBox` vs `userSpaceOnUse` 单位换算
- 相对长度单位（mm / em / % / vw）转像素

这相当于在 Kotlin 里**重写一个 SVG 1.1 解析器**——而且永远在追 bug。

#### 解法

直接降维打击：引入 `svg2compose`（基于 [usvg](https://github.com/linebender/resvg/tree/main/crates/usvg) 的 Rust CLI），作为构建期外部工具。**Rust 端直接遍历 usvg 的强类型树，输出 `.kt` 文件**，Kotlin 端无需任何 SVG 解析逻辑。

svg2compose 的核心能力：

1. **usvg 内核**：所有 SVG 复杂度（`<g>` / `<use>` / transform / CSS / 基础形状 / clipPath）由 usvg 一次性消化
2. **直接生成 .kt**：Rust 端遍历 usvg 强类型树，直接输出 Compose ImageVector Kotlin 代码
3. **manifest 模式**：接受 JSON manifest（SVG 路径 + 命名 + helper 函数名），批量处理后输出 `.kt` 文件 + result JSON
4. **transform bake**：所有祖先变换在 Rust 端 bake 进坐标，Kotlin 端只接收绝对坐标
5. **mask 降级**：带 mask 的 Group 被安全跳过（描边扩展路径对图标无意义）

#### Kotlin 端职责（极简）

Kotlin 端（`GeneratorEngine`）的全部职责：
- 调用 `svg2compose --manifest manifest.json --output-dir ... --result result.json`
- 读取 result JSON 获取 viewBox + path 元数据（用于 web-preview 和 v2 catalog）
- 增量构建：基于 SVG 文件 MD5 hash 跳过未变更图标
- 清理：删除不再生成的旧 `.kt` 文件

**不再存在**：`NormalizedPathParser`（~300 行手写解析）、`KotlinFileGenerator`（Kotlin 端代码生成）、`SvgValidator`（已被 Rust 端替代）。

#### 集成方式

1. **二进制位置**：`tools/svg2compose(.exe)`（git ignore）
2. **编译机制**：源码位于 `tools/svg2compose/`（Rust 项目），Gradle 任务自动触发 `cargo build --release`
3. **调用方式**：`ProcessBuilder` 启动 `svg2compose --manifest <file> --output-dir <dir> --result <file>`
4. **批量优化**：manifest 模式一次性传入所有待处理图标，Rust 端内部并发处理

#### 契约

- generator-core **不包含任何 SVG 解析逻辑**（已全部移至 Rust 端）
- svg2compose 处理不了的（如 filter / mask 约束的 Group），**Rust 端直接跳过**，Kotlin 端收到的 result 中不包含这些节点
- generator-core 的 `UsvgPipeline` 仅负责进程调用和 JSON 序列化/反序列化

### 3.3 第三层：默认样式差异 → PathAttributes 合并

#### 问题

每个图标库的"默认样式"不同：

| 图标库 / Style | stroke | stroke-width | fill | linecap | linejoin |
|---------------|--------|--------------|------|---------|---------|
| Tabler Outline | currentColor | 2 | none | round | round |
| Tabler Filled | none | none | currentColor | none | none |
| Lucide Outline | currentColor | 2 | none | round | round |
| Phosphor Regular | currentColor | 16 | none | round | round |
| Phosphor Fill | none | none | currentColor | none | none |
| Radix Outline | currentColor | 1.5 | none | round | round |
| Remix Line | currentColor | 2 | none | round | round |
| Remix Fill | none | none | currentColor | none | none |
| Heroicons 24 Outline | currentColor | 1.5 | none | round | round |
| Heroicons 24 Solid | none | none | currentColor | none | none |
| 品牌图标（如 brand-github） | 保留原始多色 | — | 保留原始多色 | — | — |

usvg 拍平后会把 SVG 根元素的样式继承下推到每个 path，但**默认值的归属仍然是适配器**——usvg 不知道"Tabler Outline 应该是 stroke=2"这种业务约定。

#### 解法

适配器提供"源级默认样式"，generator-core 按"raw 优先、default 兜底"合并：

```kotlin
val defaultAttrs = source.defaultPathAttributes(icon.style)
val rawPathAttrs = parseUsvgPathNode(pathNode)

val finalAttrs = PathAttributes(
    fill            = rawPathAttrs.fill            ?: defaultAttrs.fill,
    stroke          = rawPathAttrs.stroke          ?: defaultAttrs.stroke,
    strokeWidth     = rawPathAttrs.strokeWidth     ?: defaultAttrs.strokeWidth,
    strokeLineCap   = rawPathAttrs.strokeLineCap   ?: defaultAttrs.strokeLineCap,
    strokeLineJoin  = rawPathAttrs.strokeLineJoin  ?: defaultAttrs.strokeLineJoin,
    fillRule        = rawPathAttrs.fillRule        ?: defaultAttrs.fillRule,

    // v2 L3 多色保真：透传原始字段，emit 阶段决定是否黑化
    originalFill    = rawPathAttrs.fill,
    originalStroke  = rawPathAttrs.stroke,
)
```

#### v1 → v2 演进

- **v1 (L1 静态单色)**：`KotlinFileGenerator.emit` 把 `finalAttrs.fill` 中任何非 null/none 的值都映射成 `SolidColor(Color.Black)`，使用方通过 `Icon(vec, tint = ...)` 着色
- **v2 (L3 多色保真)**：`KotlinFileGenerator.emit` 改写为：
  - 若 `originalFill in {null, "none", "currentColor"}` → emit `SolidColor(Color.Black)`（使用方 tint）
  - 否则 → emit `SolidColor(Color(0xFF...))`（保留原色，多色品牌图标场景）

`originalFill` / `originalStroke` 字段在 v1 已经被透传保留，v2 升级时**仅改 emit 模板，不动 parser**。

#### 契约

- generator-core 的属性合并逻辑**对所有图标源完全相同**（`raw ?: default` 的 6 行代码）
- "Tabler Outline 默认 stroke=2"由 `TablerIconSource.defaultPathAttributes(Outline)` 给出，与 generator-core 无关
- "Lucide 没有 Filled style"由 `LucideIconSource.styles` 只声明 `Outline` 实现
- generator-core 不内建 `if (source.name == "tabler")` 类型的分支

## 4. 核心契约：IconSource 接口定义

`IconSource` 是 generator-core 与具体图标源之间的唯一边界。新增任何图标源（Phosphor / Heroicons / Feather / 自定义内部图标库）只需实现这个接口。

### 4.1 接口签名

```kotlin
// generator/core/src/main/kotlin/composeicons/generator/core/IconSource.kt

/**
 * 图标源适配器。每个图标库（Tabler / Lucide / Phosphor / ...）实现一个 IconSource。
 * generator-core 的所有 pipeline 步骤通过这个接口与具体图标库交互，
 * 永不直接依赖任何图标库的物理路径或上游格式。
 */
interface IconSource {

    /** 图标源稳定标识符。例：'tabler' / 'lucide' / 'phosphor'。 */
    val name: String

    /** 用户友好的展示名。例："TablerIcons" / "LucideIcons"。 */
    val displayName: String

    /** 生成的 Kotlin 入口对象名。例："TablerIcons" → 使用方写 `TablerIcons.Outline.Home`。 */
    val iconContainerName: String

    /** 上游版本（语义化版本或 commit）。写入 `SourceInfo.UPSTREAM_VERSION` 常量。 */
    val upstreamVersion: String

    /** 生成代码的根 package。例："composeicons.tabler" → outline icons 落在 "composeicons.tabler.outline"。 */
    val basePackage: String

    /** 该图标源支持的所有 style。Tabler 有 Outline + Filled；Lucide 仅 Outline；Phosphor 6 weight。 */
    val styles: List<IconStyle>

    /**
     * 第一层解耦：扁平化文件发现。
     * 适配器内部自由处理子目录、命名约定、alias 文件、metadata 索引等。
     *
     * @param svgRoot 上游 SVG 仓库的根目录（一般是 refer/<source>-main/）
     * @return 扁平的图标条目列表，已抹平所有文件组织差异
     */
    fun discoverIcons(svgRoot: File): List<SvgIconEntry>

    /**
     * 第三层解耦：源级默认样式。
     * 当 usvg 拍平后的 path 没有显式 fill/stroke 时，使用此处的默认值。
     * 例：Tabler Outline 在此处声明 stroke="currentColor" / strokeWidth=2 / fill="none" / linecap="round"。
     */
    fun defaultPathAttributes(style: IconStyle): PathAttributes

    /**
     * 决定生成代码中调用的 helper 函数名。
     * 例：Tabler Outline → "tablerOutlineIcon" → 生成代码中调用：
     *     tablerOutlineIcon(name, size, viewBox) { addPath(...) }
     */
    fun helperFunctionName(style: IconStyle): String
}

data class IconStyle(
    /** PascalCase 的 style 名，会成为命名空间对象名。例："Outline" → `TablerIcons.Outline`。 */
    val name: String,
    /** kebab-case 的物理子目录名，用于 emit 路径。例："outline" → 写到 outline/Home.kt。 */
    val subdirectory: String,
)

data class SvgIconEntry(
    /** 原始文件名（含 .svg）。例："alert-circle.svg"。 */
    val fileName: String,
    /** 此图标的 style。 */
    val style: IconStyle,
    /** 原始 SVG 文件（usvg 处理前）。 */
    val file: File,
    /**
     * 上游元数据（tags / category / aliases）。
     * 由适配器自行从上游格式解析（Tabler 是 SVG 注释 / Lucide 是 *.json / Phosphor 是 selection.json）。
     * v2 catalog 包消费此字段。v1 主包不依赖。
     */
    val metadata: SvgMetadata = SvgMetadata.EMPTY,
)

data class PathAttributes(
    val fill: String? = null,
    val stroke: String? = null,
    val strokeWidth: Float? = null,
    val strokeLineCap: String? = null,
    val strokeLineJoin: String? = null,
    val fillRule: String? = null,

    /** v2 L3：透传原始 fill/stroke。v1 不消费此字段，但 parser 必须填充。 */
    val originalFill: String? = null,
    val originalStroke: String? = null,
)

data class SvgMetadata(
    val tags: Set<String> = emptySet(),
    val category: String? = null,
    val aliases: Set<String> = emptySet(),
) {
    companion object { val EMPTY = SvgMetadata() }
}
```

### 4.2 实现 checklist

新增图标源时，按以下步骤：

1. **新建模块** `generator/<source>/`（参考 `generator/tabler/`）
2. **实现 IconSource**
   - `discoverIcons` 内部处理上游 SVG 文件组织（子目录、alias 文件、metadata 索引等）
   - `defaultPathAttributes` 给出该图标源每个 style 的默认 stroke / fill / linecap
   - `helperFunctionName` 决定 emit 时用哪个 helper 函数名
3. **新建运行时模块** `icons-<source>/`（参考 `icons-tabler/`）
   - `<Source>Icons` 入口对象（含每个 style 的子对象）
   - `<source><Style>Icon` inline helper（包装 `iconBuilder`）
   - `SourceInfo.UPSTREAM_VERSION` 常量
4. **写 IconSource 单元测试**
   - 验证 `discoverIcons` 在测试用 SVG 目录上的结果
   - 验证 `defaultPathAttributes` 各 style 返回正确默认值
5. **运行一次完整 pipeline**：`./gradlew :generator:<source>:run`
   - 检查 `build/compose-icons/generation-report.txt` 失败数 = 0
   - 抽样检查若干 `icons-<source>/.../outline/Foo.kt` 编译通过
6. **接入 Phase 9 截图基线**
   - 在 sample 中引用该图标源若干代表图标
   - 跑 Paparazzi 生成基线 PNG
7. **写发布配置**
   - `icons-<source>/build.gradle.kts` 与 `icons-tabler` 模板对齐
   - groupId = `io.github.jinghu-moon.composeicons`，artifactId = `icons-<source>`

### 4.3 反模式（评审时必须拒绝）

```kotlin
// ❌ generator-core 里出现具体图标源特判
fun generate(source: IconSource) {
    if (source.name == "tabler") {
        applyTablerSpecificFix()
    }
}

// ❌ generator-core 内嵌 SVG 解析逻辑（这是 svg2compose 的活）
fun parseSvgPath(svg: String): List<PathCommand> {
    // 永远不要在 generator-core 写这种代码
}

// ❌ generator-core 里硬编码图标源的默认样式
val defaultStrokeWidth = if (style == "Outline") 2f else 0f

// ❌ IconSource 接口里掺入只对某个图标源有意义的字段
interface IconSource {
    val tablerAliases: Map<String, String>  // 应放在 TablerIconSource 内部，不污染接口
}

// ❌ 在运行时模块持有所有 entries 的集合（违反 R8 友好）
object TablerIconAll {
    val entries: List<ImageVector> = listOf(Home, User, ...)  // 强引用全部图标
}
```

## 5. v1 → v2 演进路径

### 5.1 v1 范围（当前在做）

- **保真级别**：L1 静态单色（fill/stroke 一律黑化，使用方 tint 着色）
- **图标源**：Tabler 3.41.1 + Lucide main + Phosphor + Radix + Remix
- **运行时模块**：`icons-core` / `icons-tabler` / `icons-lucide` / `icons-phosphor` / `icons-radix` / `icons-remix` 各独立 artifact
- **不发布**：catalog（任何形式）
- **保真度验证**：Paparazzi 100-300 个代表图标采样
- **生成器**：svg2compose Rust CLI + IconSource 三层解耦完整落地
- **预埋字段**：`PathAttributes.originalFill` / `originalStroke` 透传保留，v1 不消费

### 5.2 v2 路线图（按优先级排序）

#### 5.2.1 L3 多色保真

- `PathAttributes.originalFill` / `originalStroke` 在 v1 已预埋
- svg2compose Rust 端改写 .kt 生成逻辑：
  - `originalFill in {null, "none", "currentColor"}` → emit `SolidColor(Color.Black)`
  - 否则 → emit `SolidColor(Color(0xFF...))` 保留原色
- 准入图标源：Phosphor Duotone（首批多色场景）
- 工作量：仅改 Rust 端 emit 模板 + 跑 generator 重新输出

#### 5.2.2 新图标源接入

- **Phosphor**（已落地 v1）：6 weight × ~9000 = ~54000 个图标
  - 6 个 sub-style：Regular / Thin / Light / Bold / Fill / Duotone
  - Duotone 涉及 L3 多色，与 5.2.1 联动
- **Radix**（已落地 v1）：~332 个 outline 图标
- **Remix**（已落地 v1）：line + fill 样式，~2000+ 图标
- **Heroicons v2**
  - 4 个 style：24 Outline / 24 Solid / 20 Solid / 16 Solid
  - 同名图标在不同 size 中可能 path 不同（design-time hand-tuned），不可共用 path 数据

#### 5.2.3 独立 catalog 包

- `icons-tabler-catalog` / `icons-lucide-catalog` / `icons-phosphor-catalog` / `icons-heroicons-catalog` 各自发布到 Maven
- 元数据来源：generator 顺手输出 `meta.json`（v1 已实现）
- catalog 模块编译期读取 meta.json 生成 `*Catalog.kt`
- **主包 `icons-tabler` 不依赖 catalog 包**
- 使用方需要 picker 时显式引入：

  ```kotlin
  implementation("io.github.jinghu-moon.composeicons:icons-tabler:0.1.0")
  implementation("io.github.jinghu-moon.composeicons:icons-tabler-catalog:0.1.0")
  ```

#### 5.2.4 IDE 体验增强（探索性）

- 当前依靠包名约定 + IDE 自动 import（`import composeicons.tabler.outline.Home`）
- 探索：Compose Material `Icons.Filled` 风格的 KSP 索引，让输入 `TablerIcons.O` 时自动列出 outline 全部
- 权衡：是否值得引入 KSP 依赖，对编译速度的影响

### 5.3 永久不做（永久 backlog）

- **L2 主题响应（@Composable val 模式）**：违背运行时性能承诺（红线 1.3）
- **L4 完整 SVG 1.1（渐变 / mask / filter / animation）**：违背简洁产物承诺（红线 1.3）
- **跨平台（Compose Multiplatform / Desktop / iOS）**：项目范围限定 Android（红线 1.3）
- **运行时跨源聚合 catalog（`AllIcons.entries`）**：破坏 R8 裁剪
- **运行时 SVG 解析 / Drawable / Font Icon / Gradle 插件式按需生成**：违背设计哲学

## 6. 性能模型

### 6.1 构建期

| 阶段 | 单图标耗时 | 全量（7795+ 张）|
|------|----------|----------------------------|
| svg2compose manifest 模式 | ~5ms（Rust 端内部并发） | **< 60s（实测）** |
| GeneratorEngine 编排 + 报告 | < 1ms | < 5s |
| **完整 fresh build** | — | **< 90s** |

增量构建：基于 SVG 文件 MD5 hash，未变更图标直接跳过，< 5s。

### 6.2 运行时

- **单 ImageVector 首次访问**：~2ms（构建 path 节点 + 缓存）
- **后续访问**：缓存命中 < 0.01ms
- **内存占用**：单 ImageVector ~1KB，已使用图标长驻
- **与 [material-icons-extended](https://developer.android.com/develop/ui/compose/resources) 同等量级**

### 6.3 R8 行为

- `val TablerIcons.Outline.Home` 是顶层 property getter
- 使用方写 `Icon(TablerIcons.Outline.Home, null)` → R8 静态可达性分析保留：
  - `Home.kt` 的 property getter
  - 其引用的 `_home` 私有字段
  - lambda 内的 `tablerOutlineIcon(...) { addPathData(...) }` 调用链
  - `addPathData` 引用的 `parseSvgPathData()` 调用
- 未引用的图标 → R8 全部移除
- AAR 中包含全部 .kt 编译产物（class 文件），但 release APK dex 中只剩被引用的部分

### 6.4 与同类项目的体积对照

> 数据由 sample 模块的 R8 release 构建实测填充，详见 [02_implementation_tasks.md](./02_implementation_tasks.md) Phase 9。

| 场景 | material-icons-extended | DevSrSouza | composablehorizons | **本项目** |
|------|------------------------|------------|---------------------|----------|
| 0 引用（baseline） | 0 KB | 0 KB | 0 KB | 0 KB (基准 856 KB) |
| 引用 10 个 outline | 待测 | 待测 | 待测 | +112 KB |
| 引用 100 个 outline | 待测 | 待测 | 待测 | +144 KB |
| 全量 Tabler+Lucide 引用（极端） | ~5 MB | ~3 MB | ~2 MB | +2.31 MB |

> ⚠️ **"全量" 行的实测口径**：`sample` 模块的 `all` variant 的 `DemoIcons` 实际是 `emptyList()`，全量保留通过 `proguard-rules-all.pro` 中的 `-keep` 规则让 R8 不裁剪任何图标类得到。这测的是 **R8 上界**——即"如果一个使用方意外引用了全部图标，最坏 dex 增长多少"。真实场景下用户主动在代码里写 N 个 `Icon(...)` 调用，编译器还会做 const inlining，实际体积**略低于**此值。
>
> 选择 R8 上界口径而非"真实写 N 行 `Icon(...)` 调用"是务实考量：后者要生成一个巨大的 `DemoIconsAll.kt`，编译时间会爆炸。上界数值已经能回答"全量场景的最坏代价"，对使用方决策足够。

## 7. 与同类项目的对比定位

| 维度 | DevSrSouza | composablehorizons | **本项目（v1）** |
|------|-----------|---------------------|----------------|
| 平台 | KMP（Android + Desktop） | Android + KMP 两版本 | **仅 Android** |
| Tabler 接入 | ✅ | ✅（按 style 拆 artifact） | ✅（单 artifact 含 outline+filled） |
| Lucide 接入 | ❌ | ✅ | ✅ |
| Phosphor 接入 | ❌ | ❌ | ✅（6 weight） |
| Radix 接入 | ❌ | ❌ | ✅ |
| Remix 接入 | ❌ | ❌ | ✅ |
| Heroicons 接入 | ❌ | ❌ | v2 路线图 |
| 解析路径 | DOM/字符串 | androidx VD 中间格式 | **svg2compose (usvg 内核)** |
| `<g>` / transform / `<use>` | 部分支持 | 部分支持 | **完整支持（svg2compose 处理）** |
| 多色保真（L3） | 部分 | 部分 | v1 预埋 / v2 实现 |
| 主题响应（L2） | 部分项目 @Composable | ❌ | **明确不做（红线）** |
| Catalog | ❌ | 部分 | **v1 不做 / v2 独立包** |
| 截图基线测试 | ❌ | ❌ | **v1 Paparazzi 采样** |
| Web Preview | ❌ | ❌ | ✅（Vue 3 实现） |
| 体积基准矩阵 | ❌ | ❌ | **v1 sample 实测** |

## 8. 关键技术债与遗留问题

### 8.1 当前 `icons-catalog/` 模块完全删除

按 v1 决策（U1 + S9-A+B + C8-A），`icons-catalog/` 在 v1 不存在：

- 删除 `icons-catalog/` 整个模块
- 删除 `generator/core/.../CatalogFileGenerator.kt`
- 删除 `IconSource.generateCatalog()` / `exportCatalog*` 相关方法
- web-preview 改为消费 `meta.json`（generator 顺手输出，不再依赖 Kotlin catalog 中转）

### 8.2 工具链演进（已落地）

`svg2compose` 替代了原先的 `usvg` + `NormalizedPathParser` + `KotlinFileGenerator` 三层：

| 旧工具 | 新工具 | 说明 |
|--------|--------|------|
| `tools/usvg(.exe)` | `tools/svg2compose(.exe)` | SVG 拍平 + 直接生成 .kt |
| `NormalizedPathParser.kt` | 已删除 | Rust 端处理 |
| `KotlinFileGenerator.kt` | 已删除 | Rust 端处理 |
| `SvgValidator.kt` | 已简化 | 仅保留基础检测 |

`UsvgLocator` 重命名为指向 `tools/svg2compose(.exe)`。

### 8.3 web-preview 数据来源（已落地）

web-preview 消费 `web-preview/public/data/{source}.json`，由 `GeneratorReportWriter` 输出的 `generation-report.json` 中的 `explorerEntries` 提供。svg2compose 的 result JSON 包含 viewBox + path 元数据，直接用于 web-preview 渲染。

后续 v2 的 `MetaJsonExporter`（Phase 8.27-8.29）将输出独立的 `meta.json` 供 catalog 包消费。

### 8.4 SvgValidator 角色淡化（已落地）

svg2compose 的 Rust 端已经处理了 `<g>` / `<use>` / 嵌套 `<svg>` / 基础形状 / transform / CSS / clipPath / mask。`SvgValidator` 仅保留对原始 SVG 中不支持特性的基础检测：

- ❌ `<filter>`（Compose 不支持）
- ❌ `<pattern>` / `<image>` / `<text>`

svg2compose 的 Rust 端对带 mask 的 Group 直接跳过，无需 Kotlin 端二次防御。

## 9. 文档相关性

- [README.md](../README.md) — 使用方文档，安装与最小示例
- [01_design_specification.md](./01_design_specification.md) — 详细设计规格（与本架构白皮书互补：本文聚焦"为什么这样设计"，01 聚焦"具体怎么实现"）
- [02_implementation_tasks.md](./02_implementation_tasks.md) — 分阶段实施任务清单
- [DESIGN.md](./DESIGN.md) — 历史入口页（保留为重定向兼容）
