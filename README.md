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

实测数据（2026-05-08，sample 模块 hundred flavor × release，AGP 9.1.0 / R8 默认）：

### 4 flavor 总览（Plugin 默认配置）

| 引用图标数 | APK 体积 | 与 zero 增量 |
|---|---|---|
| 0（zero） | 856 KB | 0 KB |
| 10（ten，跨 3 source × 5 icon） | 969 KB | +113 KB（含 Compose runtime + Tabler/Lucide/Phosphor 基础结构）|
| 100（hundred，Tabler+Lucide outline） | 970 KB | +114 KB（10→100 单图标边际 ≈ 11 字节）|
| 全量 keep（all，proguard-rules-all.pro 强制 keep）| 2,088 KB | +1,232 KB |

### Keep 规则三档策略（hundred variant 实测）

T1-04 提供三档 keep 规则形态，权衡 R8 安全性 vs dex 体积：

| 策略 | hundred APK | hundred dex | dex Δ vs NONE | 适用场景 |
|---|---|---|---|---|
| **NONE**（默认） | 993,426 B | 1,584,712 B | **0 B（基准）** | R8 默认可达性已最优；项目未写防御性 `-keep` 通配 |
| **MEMBERS** | 1,009,810 B | 1,604,428 B | +19,716 B（+19 KB） | 需要保留 getter 签名抗反射；R8 仍能裁剪 lambda/`$stable`/metadata |
| **AGGRESSIVE** | 1,009,810 B | 1,611,468 B | +26,756 B（+27 KB） | 替代 `-keep class composeicons.tabler.** { *; }` 通配；从全包 keep 降级到精确 keep |

> **关键洞察**：在 R8 自由裁剪场景（`proguard-rules.pro` 不写通配 keep）下，**NONE 总是最优**——R8 的默认静态可达性分析比任何强制 keep 都精确。
>
> AGGRESSIVE 在迁移路径上有价值：消费方原本写了 `-keep class composeicons.tabler.** { *; }`（Tabler 全部 ~7000 个图标都 keep），引入 AGGRESSIVE 后**删除手动通配**，让精确 100 条 allowlist 取代 → 从"7000 个图标 keep"降到"100 个 keep" → 节省巨大。

### 配置（`composeIconsScanner` DSL）

```kotlin
// app/build.gradle.kts
composeIconsScanner {
    keepRuleStrategy = KeepRuleStrategy.NONE        // 默认：零干预 R8
    // KeepRuleStrategy.MEMBERS                      // 仅 keep getter 成员
    // KeepRuleStrategy.AGGRESSIVE                   // -keep class …Kt { *; }
}
```

或命令行 A/B 对照：
```bash
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=NONE
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=MEMBERS
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=AGGRESSIVE
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.injectKeepRules=false  # 完全关闭注入
```

### 决策树

```
你的 proguard-rules.pro 是否写了 `-keep class composeicons.*.** { *; }` 通配？
├─ 否：用 NONE（默认）→ R8 默认可达性最优 → dex 最小
└─ 是：
   ├─ 想替换通配为精确 keep？
   │  → 用 AGGRESSIVE，并删除手动 -keep class composeicons.*.**
   │  → 节省取决于通配 keep 的图标总数 - 实际引用数（可能数 MB）
   └─ 仅作诊断 / 反射安全保险？
      → 用 MEMBERS：保留 getter 签名，让 R8 自由裁掉其他成员
```

### 复现实测命令

```bash
# 4 flavor 体积矩阵
./gradlew :sample:assembleZeroRelease :sample:assembleTenRelease :sample:assembleHundredRelease :sample:assembleAllRelease

# 三档对照（hundred variant）
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=NONE       --rerun-tasks
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=MEMBERS    --rerun-tasks
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=AGGRESSIVE --rerun-tasks

# 锁定 keep allowlist 基线（git 跟踪）
./gradlew :sample:dumpIconKeepRules
# → sample/baseline/icon-keep-rules/{zero,ten,hundred,all}Release-keep.pro
```

> 数据由 `sample/` 模块的 4 个 build variant（zero / ten / hundred / all）实测填充。详见 [架构白皮书 §6.4](./docs/architecture.md#64-与同类项目的体积对照)。
>
> ⚠️ **关于 "全量" 行的口径**：`all` variant 通过 `proguard-rules-all.pro` 中的 `-keep class composeicons.tabler.**` / `-keep class composeicons.lucide.**` 强制 R8 保留所有 Tabler/Lucide 类，得到的 +1.23 MB 是 **R8 不裁剪时的上界**。该指标用于回答 "如果你不小心 -keep 通配把全部图标都拉进来，最坏多大"。

**核心承诺**：使用方 APK 中**只**包含被实际引用的图标（前提是不写通配 -keep）。如果你只用了 `TablerIcons.Outline.Home`，release APK 中只有 `Home` 这一个图标的 path 数据，剩下 6091 个 outline + 1053 个 filled icons **全部被 R8 移除**。

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
