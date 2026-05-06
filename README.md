# compose-icons

> **A high-performance, R8-friendly icon library for Jetpack Compose on Android.**
> Powered by [svg2compose](https://github.com/linebender/resvg/tree/main/crates/usvg) (usvg-based Rust CLI) for build-time SVG normalization. Zero runtime overhead, perfect tree-shaking. Currently shipping Tabler 3.41.1 + Lucide + Phosphor + Radix + Remix.

---

面向 **Android Jetpack Compose** 的高性能图标库。

借助 `svg2compose`（基于 [usvg](https://github.com/linebender/resvg/tree/main/crates/usvg) 的 Rust CLI）在构建期把所有 SVG 拍平到极简 path 数据，直接生成 `ImageVector` Kotlin 代码，**零冗余、零中间格式**。运行时不解析、不反射、不持有全局图标集合，配合 R8 实现完美裁剪：**用了多少打包多少**。

## ✨ 特性

- ⚡ **零运行时开销** —— 纯 `ImageVector`，无反射、无解析、无注册表
- 🎯 **R8 完美裁剪** —— 顶层 `val` getter，未引用图标在 release build 中**全部移除**
- 🧱 **极简 API** —— `Icon(TablerIcons.Outline.Home, null)`，IDE 自动补全友好
- 🛠️ **构建期纯净** —— svg2compose（usvg 内核）拍平消化所有 SVG 复杂度（`<g>` / `<use>` / transform / CSS / 嵌套），Rust 端直接输出 `.kt` 文件
- 📊 **基准透明** —— Sample 模块实测 0 / 10 / 100 / 全量 引用下的 APK 体积矩阵

## 📦 安装

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
```

```kotlin
// app/build.gradle.kts
dependencies {
    // 选择需要的图标源（可同时引入多个）
    implementation("io.github.jinghu-moon.composeicons:icons-tabler:0.1.0")
    implementation("io.github.jinghu-moon.composeicons:icons-lucide:0.1.0")
}
```

> 每个 artifact 已包含该图标源的所有 style（Tabler 含 outline + filled，Lucide 含 outline）。

## 🚀 快速开始

```kotlin
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import composeicons.tabler.TablerIcons
import composeicons.tabler.outline.Home

@Composable
fun MyScreen() {
    Icon(
        imageVector = TablerIcons.Outline.Home,
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary,
    )
}
```

主题切换跟随系统/手动切换 Dark/Light，**无需任何额外配置**——`Icon` 的 `tint` 参数就是 Compose 原生的着色入口。

## 📊 APK 体积模型

| 引用图标数 | 增量 Dex 大小 (相对于 0) | 区间内单图标平均边际 |
|----------|---------------------------|----------------|
| 0（baseline） | 0 KB (基准 856 KB) | - |
| 10 | +112 KB (含类库基础结构初始化) | ~11 KB（首次引入摊销）|
| 100 | +144 KB | ~360 字节（10 → 100 区间）|
| 全量 (~7795 个) | +2.31 MB | ~285 字节（100 → 全量区间）|

> 数据由 `sample/` 模块的 4 个 build variant（zero / ten / hundred / all）实测填充。详见 [架构白皮书 §6.4](./docs/architecture.md#64-与同类项目的体积对照)。
>
> ⚠️ **关于 "全量" 行的口径**：`all` variant 通过 `proguard-rules-all.pro` 中的 `-keep class composeicons.tabler.**` 强制 R8 保留所有图标类，得到的 +2.31 MB 是 **R8 不裁剪时的上界**。真实使用场景下，开发者主动在代码里引用 7795 个 `val`，编译器会做 const inlining + 部分 lambda 内联，实际体积**略低于此值**。该指标用于回答 "如果你不小心把全部图标都拉进来，最坏多大"。

**核心承诺**：使用方 APK 中**只**包含被实际引用的图标。如果你只用了 `TablerIcons.Outline.Home`，release APK 中只有 `Home` 这一个图标的 path 数据，剩下 6091 个 outline + 1053 个 filled icons **全部被 R8 移除**。

## 🧩 已支持图标源

| 图标源 | 上游版本 | Style | 图标数量 | Artifact |
|--------|---------|-------|---------|----------|
| [Tabler Icons](https://tabler.io/icons) | 3.41.1 | Outline / Filled | ~7145 | `icons-tabler` |
| [Lucide Icons](https://lucide.dev/) | latest main | Outline | ~1703 | `icons-lucide` |
| [Phosphor Icons](https://phosphoricons.com/) | latest | 6 weight | ~9000 | `icons-phosphor` |
| [Radix Icons](https://www.radix-ui.com/icons) | latest | Outline | ~332 | `icons-radix` |
| [Remix Icon](https://remixicon.com/) | latest | Line / Fill | ~2000+ | `icons-remix` |

**v2 路线图**：[Heroicons v2](https://heroicons.com/)、多色保真（L3）、独立 catalog 包。详见 [架构白皮书 §5.2](./docs/architecture.md#52-v2-路线图按优先级排序)。

## 🆚 与同类项目的差异

| 维度 | DevSrSouza | composablehorizons | **compose-icons (本项目)** |
|------|-----------|---------------------|---------------------------|
| 平台 | KMP | Android + KMP | **仅 Android** |
| Tabler | ✅ | ✅（按 style 拆 artifact） | ✅（单 artifact 含全 style） |
| Lucide | ❌ | ✅ | ✅ |
| 解析路径 | DOM/字符串 | androidx VD 中间格式 | **svg2compose (usvg 内核)** |
| `<g>` / transform / `<use>` | 部分 | 部分 | **完整（svg2compose 处理）** |
| 截图基线测试 | ❌ | ❌ | **Paparazzi 采样** |
| 体积基准矩阵 | ❌ | ❌ | **Sample 实测** |
| Web Preview | ❌ | ❌ | ✅（Vue 3） |

详见 [架构白皮书 §1.1 一句话定位](./docs/architecture.md#11-一句话定位) 与 [§7 与同类项目的对比定位](./docs/architecture.md#7-与同类项目的对比定位)。

## 🎯 适用场景

✅ **适合**：

- 移动端 Android App，使用方明确知道要用哪些图标
- 对 APK 体积敏感的项目
- 用 R8 / ProGuard 做 release build 优化
- 需要主题响应（Dark/Light）的图标

❌ **不适合**：

- 跨平台（Compose Multiplatform / Desktop / iOS）—— 请用 [DevSrSouza/compose-icons](https://github.com/DevSrSouza/compose-icons)
- 需要"动态图标选择器"（让用户在数千图标中搜索 / 浏览）—— v1 不提供 catalog 模块，v2 计划独立可选包
- 需要多色品牌图标完整保真（含渐变 / mask / filter）—— v2 计划支持简化多色（L3），不计划支持完整 SVG 1.1
- 需要运行时通过字符串名查找图标 —— 违反 R8 裁剪友好原则，本项目明确不支持

## ⚠️ 重要约束

### 不要尝试用 `@Composable val` 模式包装 ImageVector

```kotlin
// ❌ 反模式：每次 Recomposition 重建 Path 对象树，破坏运行时性能
val MyIcon: ImageVector
    @Composable
    get() = remember(...) { ImageVector.Builder(...).apply { ... }.build() }

// ✅ 正确做法：用 Compose 原生 Icon tint
Icon(TablerIcons.Outline.Home, null, tint = MaterialTheme.colorScheme.primary)
```

详见 [架构白皮书 §1.3 设计红线](./docs/architecture.md#13-设计红线永久不做)。

### 不要构造"全部图标"的集合

```kotlin
// ❌ 反模式：强引用全部图标，R8 无法裁剪
val allIcons: List<ImageVector> = listOf(
    TablerIcons.Outline.Home,
    TablerIcons.Outline.User,
    // ... 6092 个
)

// ✅ 正确做法：v2 时引入独立的 icons-tabler-catalog 包
implementation("io.github.jinghu-moon.composeicons:icons-tabler-catalog:0.1.0")  // v2，未发布
```

如果你**确实**需要 picker UI / 动态搜索，请等待 v2 catalog 独立包，或暂时用 [composablehorizons/compose-icons](https://github.com/composablehorizons/compose-icons) 的 catalog 方案。

## 🛠️ 构建期工具链（仅贡献者关心）

如果你打算从源码构建（fork / 修改 / 提 PR）：

```bash
# 自动下载 svg2compose binary（首次需要联网）
./gradlew :tools:resolveSvg2Compose

# 生成 Tabler 全部图标
./gradlew :generator:tabler:run

# 生成 Lucide 全部图标
./gradlew :generator:lucide:run

# 生成 Phosphor 全部图标
./gradlew :generator:phosphor:run

# 生成 Radix 全部图标
./gradlew :generator:radix:run

# 生成 Remix 全部图标
./gradlew :generator:remix:run

# 跑全量测试 + Paparazzi 截图基线验证
./gradlew check
```

`svg2compose` 是基于 usvg 的 Rust CLI，源码位于 `tools/svg2compose/`，编译产物 `svg2compose(.exe)` 在 `.gitignore` 中，不会进入仓库。首次构建由 Gradle 任务自动触发编译。

## 📚 文档

| 文档 | 受众 | 内容 |
|------|------|------|
| [README.md](./README.md)（本文） | 使用方 | 安装 / 快速开始 / 适用场景 |
| [docs/architecture.md](./docs/architecture.md) | 贡献者 / 架构评审 | 三层解耦 / IconSource 契约 / v1→v2 演进 |
| [docs/01_design_specification.md](./docs/01_design_specification.md) | 实现者 | 详细设计规格 / API / 命名规则 / 失败处理 |
| [docs/02_implementation_tasks.md](./docs/02_implementation_tasks.md) | 实现者 | 分阶段任务清单 / 验收标准 |

## 🪪 许可证

本项目本身的代码采用 [MIT](./LICENSE) 许可证。

各图标源的上游许可证：

| 图标源 | 许可证 |
|--------|-------|
| [Tabler Icons](https://github.com/tabler/tabler-icons) | MIT |
| [Lucide Icons](https://github.com/lucide-icons/lucide) | ISC |
| [usvg](https://github.com/linebender/resvg)（svg2compose 内核） | Apache 2.0 / MIT |

完整许可证文本见 [LICENSE-tabler](./LICENSE-tabler) / [LICENSE-lucide](./LICENSE-lucide)。

## 🤝 贡献

PR 欢迎，重点关注方向：

- **新图标源接入**（参考 [架构白皮书 §4.2 实现 checklist](./docs/architecture.md#42-实现-checklist)）
- **构建期性能优化**（svg2compose / 增量构建）
- **截图基线扩充**（Paparazzi 代表图标采样）

提交前请确认：

1. 不违反 [设计红线](./docs/architecture.md#13-设计红线永久不做)（不做 L2 / L4 / 跨平台 / 主包 catalog）
2. generator-core 改动不引入具体图标源耦合（grep `tabler|lucide` 在 generator/core 中应该 0 命中）
3. 跑过 `./gradlew check`，Paparazzi 基线无 diff

## 🌟 设计哲学

> **图标不应该有任何成本，除非你真的用了它们。**

> *Icons should cost nothing unless you use them.*
