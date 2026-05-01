# compose-icons 设计规格

## 1. 文档目标

本文档定义 `compose-icons` 的 `v1` 设计边界、核心抽象、生成流水线、运行时 API、发布策略与质量要求。

本文档回答两个问题：

1. 这个项目在 `v1` 需要解决什么问题。
2. 这个项目以什么约束和方式解决这些问题。

**关于"为什么这样设计"的架构哲学，见 [architecture.md](./architecture.md)。本文聚焦"具体怎么实现"。**

## 2. 范围与非目标

### 2.1 v1 目标

- 提供面向 `Android` 的 `Jetpack Compose ImageVector` 图标库。
- 首期交付 **Tabler Icons v3.41.1** 与 **Lucide Icons (latest main)**。
- 架构支持后续接入同类型的静态 SVG icon pack（Phosphor、Heroicons 等）。
- 每个图标源以独立 artifact 发布，使用方按需引入。
- **生成过程引入 usvg 预处理**，运行时不解析 SVG。

### 2.2 v1 设计边界

`v1` 明确聚焦以下图标源：

- 静态 SVG
- 单色或准单色图标
- 以 `path`、基础几何图形、简单变换为主
- 不依赖复杂 CSS、动画、滤镜、遮罩正确渲染

复杂特性（`<g transform>` / `<use>` / 嵌套 `<svg>` / CSS / 基础形状）由 **usvg 在构建期拍平**消化，generator-core 不感知。

### 2.3 v1 非目标

以下内容**不属于 `v1`**：

- **catalog 模块（任何形式）**：U1 决策。需要 picker UI 的使用方在 v2 引入独立 `icons-<source>-catalog` 包。
- **多色品牌图标完整保真**：v2 通过 L3 模式实现（`PathAttributes.originalFill` 透传字段已在 v1 预埋）。
- **运行时 SVG 解析 / `Drawable` / `Font Icon` / `Gradle Plugin`**。
- **渐变 / 复杂滤镜 / 复杂遮罩 / 动画 SVG**。
- **全局可变 `IconRegistry`**。
- **跨平台（Compose Multiplatform / Desktop / iOS）**。

### 2.4 永久不做（红线）

- ❌ **L2：`@Composable val ImageVector` 主题响应模式** —— 违背运行时性能承诺
- ❌ **L4：完整 SVG 1.1（渐变 / mask / filter / animation）** —— 违背简洁产物承诺
- ❌ **运行时跨源聚合 catalog（`AllIcons.entries`）** —— 破坏 R8 裁剪
- ❌ **跨平台改造** —— 项目范围限定 Android

详见 [architecture.md §1.3 设计红线](./architecture.md#13-设计红线永久不做)。

## 3. 核心指标

| 指标 | 目标 |
|------|------|
| 首期图标源 | Tabler Icons `v3.41.1` + Lucide Icons (latest main) |
| 首期 API 风格 | `TablerIcons.Outline.Home` / `LucideIcons.Outline.Home` |
| 平台 | Android |
| 最低 API | 21 |
| 编译目标 | compileSdk 36 |
| 运行时格式 | `ImageVector` |
| 发布模块 | `icons-core`、`icons-tabler`、`icons-lucide` |
| 不发布 | `icons-catalog`（v1） |
| 发布渠道 | `Maven Central` 为主，`JitPack` 可选 |

## 4. 设计原则

- **`KISS`**：generator-core 只做"消费 usvg 输出 → emit ImageVector"，不在运行时做额外工作。
- **`DRY`**：SVG 简化由 usvg 一次性完成；命名转换、Kotlin 输出、失败报告由 generator-core 复用。
- **`YAGNI`**：v1 只做单色 icon pack，不为未验证需求预留过多复杂扩展。多色保真字段已预埋但 emit 阶段不消费。
- **`SOLID-S`**：generator-core、IconSource 适配器、运行时模块职责分离。
- **`SOLID-O`**：新增图标源通过实现 `IconSource` 完成，**不修改 generator-core**。
- **`SOLID-D`**：generator-core 依赖抽象接口（`IconSource`），不依赖具体图标源结构。
- **fail-fast**：generator pipeline 中任何不支持的 SVG 特性立即让该图标失败并写入报告，不生成"看起来差不多"的错误产物。

## 5. 关键设计决策

### 5.1 API 形态：命名空间式

保留命名空间式 API：

```kotlin
TablerIcons.Outline.Home
TablerIcons.Filled.Heart
LucideIcons.Outline.Home
```

**Why**：

- 编译期类型安全
- IDE 自动补全友好
- 使用方式与 Compose 图标生态一致
- 顶层 property getter 是 R8 静态可达性分析最友好的形态

### 5.2 每图标一个文件

保留 `1 file / 1 icon` 组织方式。

**Why**：

- 单图标差异更易审查
- 生成后的 Git diff 更清晰
- 冲突处理和回滚更简单
- 编译器对小文件并行编译效率更高
- 文件颗粒度不决定 R8 是否能裁剪未使用成员（裁剪由顶层 val 引用关系决定）

### 5.3 单 artifact 含 outline + filled

**Why**（M1 决策）：

- 开发者诉求是"顺畅的心流"，单 artifact 一次依赖随时调用
- 混合使用 outline + filled（如未选中 / 选中状态）是高频场景
- R8 已经能完美裁剪未引用 style 的图标，按 style 拆 artifact 收益微小

### 5.4 不发布 catalog（v1）

**Why**（C8-A 决策）：

- catalog 强引用全部 ImageVector，违反 R8 友好承诺
- 99% 移动端项目是 U1 场景（精选 5-50 个图标），不需要 catalog
- catalog 在主仓库存在会形成"破窗效应"，迟早被人引入
- 需要 picker UI 的使用方走 v2 独立 `icons-<source>-catalog` 包

### 5.5 发布策略

稳定版优先发布到 `Maven Central`。

`JitPack` 仅作为以下场景的补充渠道：

- 早期预览
- 临时验证 tag
- 未完成 Central 流程前的过渡分发

## 6. 架构概览

`compose-icons` 采用三层解耦架构：**IconSource（适配器）→ usvg（标准化预处理）→ PathAttributes（合并）**。

详细系统总图与三层契约见 [architecture.md §2-3](./architecture.md#2-系统总图)。

### 6.1 模块边界

| 模块 | 类型 | 发布 | 职责 |
|------|------|------|------|
| `generator/core` | JVM lib | ❌ | 图标源无关的 pipeline 核心 |
| `generator/tabler` | JVM app | ❌ | TablerIconSource 实现 + 入口 |
| `generator/lucide` | JVM app | ❌ | LucideIconSource 实现 + 入口 |
| `tools/usvg(.exe)` | binary | ❌（git ignore） | SVG 标准化预处理器 |
| `icons-core` | Android lib | ✅ | 公共构建辅助函数与共享类型 |
| `icons-tabler` | Android lib | ✅ | Tabler 运行时模块（outline + filled） |
| `icons-lucide` | Android lib | ✅ | Lucide 运行时模块（outline） |
| `sample` | Android app | ❌ | 最小集成 demo + R8 体积基准 |
| `web-preview` | Vue 3 app | ❌ | 网页预览、搜索、对比与人工检查 |

`icons-catalog` 在 v1 **不存在**。v2 作为独立可选 artifact 发布。

## 7. 核心抽象

### 7.1 IconSource 接口

详见 [architecture.md §4.1 接口签名](./architecture.md#41-接口签名)。核心字段：

```kotlin
interface IconSource {
    val name: String
    val displayName: String
    val iconContainerName: String
    val upstreamVersion: String
    val basePackage: String
    val styles: List<IconStyle>

    fun discoverIcons(svgRoot: File): List<SvgIconEntry>
    fun defaultPathAttributes(style: IconStyle): PathAttributes
    fun helperFunctionName(style: IconStyle): String
}
```

### 7.2 ViewBox 模型

`v1` 保存完整四元组：

```kotlin
data class ViewBox(
    val minX: Float,
    val minY: Float,
    val width: Float,
    val height: Float,
)
```

**Why**：

- SVG `viewBox` 的原点可能不是 `(0, 0)`
- `ImageVector.Builder` 没有 `minX/minY` 概念
- 忽略原点偏移会导致生成图标位置错误

**生成规则**：

1. 从 usvg 拍平结果解析完整 `viewBox`（usvg 已做 `objectBoundingBox` → `userSpaceOnUse` 转换）
2. 若 `minX != 0` 或 `minY != 0`，在 emit 前对 path 坐标做归一化平移
3. 生成的 `ImageVector` 只保留归一化后的 `viewportWidth` 与 `viewportHeight`

### 7.3 默认尺寸策略

`v1` 不把所有图标硬编码成固定 `24.dp x 24.dp`。

**默认尺寸策略**：

1. 视口尺寸始终来自 usvg 输出的 `viewBox.width` / `viewBox.height`
2. 推荐显示尺寸做"最长边归一化到 `24.dp`"
3. Tabler / Lucide 这类天然 `24x24` 图标得到 `24.dp x 24.dp`
4. 非正方形图标保持宽高比，不做拉伸

```kotlin
data class IconSize(
    val width: Dp,
    val height: Dp,
)
```

### 7.4 PathAttributes 模型

详见 [architecture.md §3.3 第三层解耦](./architecture.md#33-第三层默认样式差异--pathattributes-合并)。

```kotlin
data class PathAttributes(
    val fill: String?,
    val stroke: String?,
    val strokeWidth: Float?,
    val strokeLineCap: String?,
    val strokeLineJoin: String?,
    val fillRule: String?,
    val originalFill: String?,    // v2 L3 透传字段，v1 不消费
    val originalStroke: String?,  // 同上
)
```

合并策略：`final = raw ?: default`（适配器提供 default，usvg 输出提供 raw）。

## 8. 命名规则

### 8.1 PascalCase

```text
home          -> Home
device-mobile -> DeviceMobile
alert-circle  -> AlertCircle
```

### 8.2 数字前缀加下划线

```text
360-view -> _360View
2fa      -> _2Fa
```

**Why**：Kotlin 不允许标识符以数字开头。

### 8.3 前缀天然分组

```text
brand-github  -> BrandGithub
brand-apple   -> BrandApple
brand-twitter -> BrandTwitter
```

### 8.4 Kotlin 关键字规避

```text
class  -> Class
return -> Return
in     -> In
```

通过首字母大写自动规避（Kotlin 关键字均小写）。

## 9. 运行时 API 设计

### 9.1 公共构建函数

```kotlin
inline fun iconBuilder(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector
```

要求：

- 不写死 `24.dp`（默认值仅作为 fallback）
- 宽高和 viewport 都来自生成结果
- 图标文件只声明数据，不复制构建逻辑

### 9.2 图标入口对象

```kotlin
object TablerIcons {
    object Outline
    object Filled
}

object LucideIcons {
    object Outline
}
```

### 9.3 生成文件示意

```kotlin
// icons-tabler/.../outline/Home.kt

val TablerIcons.Outline.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = tablerOutlineIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            // generated paths（来自 usvg 拍平输出）
        }
        return _home!!
    }

private var _home: ImageVector? = null
```

**为何不用 `lazy(...)`**：当前 check-then-write 模式在 Compose 主线程下正确，且与 androidx Material Icons 模板一致，最大化使用方迁移友好性。线程安全升级（`@Volatile` / `lazy(PUBLICATION)`）作为后续优化。

**为何不用 `@Composable val ImageVector get() = remember(color) { ... }`**：

- 每次 Recomposition 时重建庞大 Path 对象树，破坏运行时性能
- 主题切换用 `Icon(vec, tint = MaterialTheme.colorScheme.primary)` 已经足够
- 详见 [architecture.md §1.3 设计红线](./architecture.md#13-设计红线永久不做)

### 9.4 同名冲突

推荐始终通过命名空间访问，而不是直接 import 某个图标属性：

```kotlin
// ✅ 推荐
Icon(TablerIcons.Outline.Home, null)
Icon(TablerIcons.Filled.Home, null)

// ⚠️ 可行但不推荐（同名 Home 在不同 style 中歧义）
import composeicons.tabler.outline.Home
import composeicons.tabler.filled.Home as HomeFilled
```

### 9.5 Tint 约定

Compose 官方 `Icon` 适用于单色图标并自动应用 tint。

因此：

- v1 生成图标统一使用 `SolidColor(Color.Black)` 作为基底
- 使用方通过 `Icon(..., tint = MaterialTheme.colorScheme.primary)` 着色
- 多色图标不属于 v1 默认目标（v2 L3 实现）

## 10. 生成方案（usvg 接入）

### 10.1 集成方式

按 [Q7 决策](./architecture.md#32-第二层svg-结构差异--usvg-预处理) 选择 **U7-A：外部 CLI + 进程调用**。

| 项目 | 说明 |
|------|------|
| 二进制位置 | `tools/usvg(.exe)` (git ignore) |
| 下载机制 | Gradle 任务 `:tools:resolveUsvg` 检查二进制是否存在，不存在则从 [resvg releases](https://github.com/linebender/resvg/releases) 按 OS 自动下载 |
| 调用命令 | `usvg - -c --indent none --coordinates-precision 6` |
| 输入 | stdin 写入原始 SVG |
| 输出 | stdout 读取拍平后 SVG（仅含绝对坐标 path） |
| 批量优化 | 长生命周期 worker pool，stdin/stdout 流式处理 |

### 10.2 Pipeline

```text
[1] IconSource.discoverIcons()
    → 扁平化 List<SvgIconEntry>

[2] usvg 拍平（worker pool）
    → 每个 SVG 标准化为绝对坐标 path

[3] NormalizedPathParser
    → 解析 path 数据为 List<PathCommand>

[4] 检测残留视觉特性
    → 若残留 <filter>/<mask>/<clipPath>/<animate> 则该图标失败

[5] 元数据合并
    → 适配器解析上游 metadata（注释 / json / manifest）
    → 与 path 数据组装成 ParsedSvgIcon

[6] PathAttributes 合并
    → final = raw (来自 usvg 输出) ?: default (来自 IconSource)

[7] 坐标归一化
    → 消除 viewBox.minX / minY 偏移

[8] 命名转换
    → IconNameMapper.toKotlinName(fileName)

[9] Kotlin 输出
    → KotlinFileGenerator emit val Container.Style.Name: ImageVector

[10] meta.json 输出
     → MetaJsonExporter（供 web-preview 与 v2 catalog 包消费）

[11] 报告输出
     → generation-report.txt
```

### 10.3 失败处理

generator 必须容错，单图标失败不能阻塞整批生成。

```kotlin
data class GeneratorReport(
    val source: String,
    val upstreamVersion: String,
    val total: Int,
    val succeeded: Int,
    val failed: List<FailedIcon>,
    val warnings: List<IconWarning>,
)

data class FailedIcon(
    val fileName: String,
    val style: String,
    val reason: String,  // 例："contains <filter>" / "usvg exit code 1" / "name collision: Home"
)

data class IconWarning(
    val fileName: String,
    val style: String,
    val message: String,
)
```

报告用途：

- CI 可读
- 升级上游版本时可对比
- 明确哪些图标被跳过及原因

### 10.4 Path 命令支持

经过 usvg 拍平后，path 数据**只包含**：

- `M`（MoveTo，绝对坐标）
- `L`（LineTo，绝对坐标）
- `Q`（QuadTo，绝对坐标）
- `C`（CurveTo，绝对坐标）
- `Z`（ClosePath）

`NormalizedPathParser` 只识别这五种。其他命令（H / V / S / T / A / 相对版本）出现 → 视为 usvg 输出异常，该图标判失败。

## 11. 构建、发布、版本与许可证

### 11.1 Compose 版本策略

- 使用固定的稳定版 Compose BOM
- 实际版本锁定在 `gradle/libs.versions.toml`
- 升级通过单独变更 + 完整测试完成

当前版本（截至本文档）：

```
agp = "9.1.0"
kotlin = "2.3.10"
composeBom = "2026.03.00"
```

### 11.2 发布策略

**稳定版**：`Maven Central`

**补充分发**：`JitPack`（早期预览 / 临时 tag）

### 11.3 版本策略

库版本采用独立 `SemVer`，不直接把上游图标版本拼进 artifact 版本号。

示例：

```text
icons-tabler:0.1.0
icons-lucide:0.1.0
```

上游版本单独记录在：

- `README`
- `generation-report.txt`
- 生成的 `SourceInfo` 常量

这样可以区分两类变化：

1. 上游图标集升级
2. 生成器 / API / 测试 / 发布策略变化

### 11.4 许可证策略

许可证拆分声明：

- **框架代码** —— 项目自身许可证
- **每个图标源** —— 上游许可证

| 图标源 | 上游许可证 |
|--------|----------|
| Tabler Icons | MIT |
| Lucide Icons | ISC |
| Phosphor Icons (v2) | MIT |
| Heroicons (v2) | MIT |

新增图标源不应默认假定相同许可证，**必须**单独验证。

## 12. 性能策略

### 12.1 运行时策略

- ❌ 不做运行时 SVG 解析
- ❌ 不使用反射
- ❌ 不引入全局可变注册表
- ❌ 不提供宽泛 `consumerProguard` keep 规则

这与 Android 官方对库作者的优化建议一致。

### 12.2 R8 行为约定

- 顶层 `val` 引用是 R8 友好的
- 未引用的图标 property getter 整体被裁剪（包括其引用的 path 节点常量）
- AAR 包含全部 `.kt` 编译产物，但 release APK dex 中只剩被引用的部分

### 12.3 基准矩阵

不再硬编码 APK 体积估算值。改为维护基准矩阵：

| 指标 | 场景 |
|------|------|
| 生成时间 | 冷启动、增量 |
| 编译时间 | 首次编译、增量编译 |
| AAR 大小 | `icons-core` / `icons-tabler` / `icons-lucide` |
| Release APK 大小 | 引入 0 / 10 / 100 / 全量图标 |
| 渲染性能 | sample 网格列表滚动 / 首屏展示 FPS |

基准结果由 sample 模块的 R8 release 构建实测填充，详见 [02_implementation_tasks.md](./02_implementation_tasks.md) Phase 9。

## 13. 质量保障

### 13.1 测试层级

| 层级 | 内容 |
|------|------|
| 单元测试 | 命名转换、viewBox 解析、坐标归一化、fillRule 映射、PathAttributes 合并、NormalizedPathParser |
| 集成测试 | usvg 调用 → 拍平 SVG → 解析 → emit Kotlin → 编译通过 |
| 截图基线 | Paparazzi 100-300 个代表图标采样（V2 决策） |
| 发布检查 | 产物可发布 / POM 正确 / 许可证声明完整 |

### 13.2 截图基线（V2 采样）

按 Q3 决策选择 **V2：Paparazzi 100-300 个代表图标采样**。

**Why**（不选 V3 全量 / V4 resvg PNG diff）：

- V3 全量截图（6092 + 1703 = 7795 张）使 CI 时长暴增，且容易 flaky
- V4 resvg PNG diff 跨工具像素差异大，ROI 极低
- usvg 拍平后底层逻辑稳定，采样足以覆盖回归

**采样策略**：

- 每个 source × style 选 ~50 个代表图标
- 优先包含：复杂曲线（brand-github）、多 path（adjustments）、`fillRule="evenodd"`（specifically chosen）、含数字前缀（_360View）、含 alias（前后命名变更过的图标）
- Tabler outline 50 + Tabler filled 50 + Lucide outline 50 ≈ 150 张基线

### 13.3 发布前门槛

每次稳定发布至少满足：

1. ✅ 生成报告无未知失败
2. ✅ 单元与集成测试通过
3. ✅ 样例应用可以运行
4. ✅ 截图基线无异常 diff
5. ✅ 产物可在本地 `publishToMavenLocal` 发布
6. ✅ Sample APK 体积矩阵填入 README

## 14. 风险与缓解

| 风险 | 缓解 |
|------|------|
| usvg 输出行为变化 | 锁定 binary 版本，升级时重跑完整截图基线 |
| usvg binary 跨平台兼容性 | 在 CI 测试 Win / macOS / Linux 三个 OS 都能调用 |
| 进程调用开销 | 用 worker pool + stdin/stdout 流式处理，目标全量 < 90s |
| 残留 `<filter>` / `<mask>` / animation | 默认失败该图标，写入报告 |
| 非零原点 viewBox | 生成前做坐标归一化 |
| 新图标源没有可靠 metadata | `SvgMetadata` 允许全空，至少支持名称搜索（v2 catalog） |
| 发布渠道单点依赖 | `Maven Central` 为主，`JitPack` 为补充 |
| API 回归 | 通过 sample / 单元测试 / 截图基线控制 |
| Paparazzi 与 layoutlib 版本绑定 | 锁定 Paparazzi 版本，升级时重跑全部基线 |
| Compose BOM 升级 | 单独 PR 验证，跑全量测试 |

## 15. 文档相关性

- [architecture.md](./architecture.md) — 架构白皮书（"为什么这样设计"）
- [README.md](../README.md) — 使用方文档
- [02_implementation_tasks.md](./02_implementation_tasks.md) — 分阶段实施任务清单
- [DESIGN.md](./DESIGN.md) — 历史入口页（保留为重定向兼容）
