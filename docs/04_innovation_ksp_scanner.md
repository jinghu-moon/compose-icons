# 创新方案 1：KSP Consumer Scanner（消费方图标引用扫描与 R8 keep 自动化）

> 本文档对应已实现的 `scanner/` 模块。源码是权威参考：
> - `scanner/ksp/` — KSP processor，编译期扫描消费方源码
> - `scanner/gradle-plugin/` — Gradle 插件，注册任务 + 自动注入 R8 keep 规则
>
> 相关：[architecture.md](./architecture.md)、[05_innovation_shared_path_pool.md](./05_innovation_shared_path_pool.md)

---

## 1. 问题定义

### 1.1 R8 收益与消费方的关系

本项目承诺"用了多少打包多少"依赖 R8 的静态可达性分析。但消费方只要写一条防御性通配：

```proguard
-keep class composeicons.tabler.** { *; }
```

就会把 Tabler 全部 ~7145 个 ImageVector 拉进 dex，整个项目的优化前功尽弃。

**问题**：R8 默认可达性已经是最优，但消费方常因担心反射破坏而写 keep 通配，得不偿失。

### 1.2 Scanner 的定位

一句话：**让"精确 keep"成为默认行为，消费方无需手写任何规则**。

做法：KSP 编译期扫描消费方代码，识别每一处 `XxxIcons.Style.Name` 引用，生成一份**精确到图标**的 R8 keep allowlist，自动注入到 AGP 的 `proguardFiles`。

消费方 `build.gradle.kts` 一行接入：

```kotlin
plugins {
    id("io.github.jinghu-moon.composeicons.scanner")
}
```

---

## 2. 架构

### 2.1 数据流

```
┌─────────────────────────────────────────────────────────────────┐
│  消费方源码（MyApp.kt）                                          │
│  Icon(TablerIcons.Outline.Home, null)                           │
│  Icon(LucideIcons.Outline.User, null)                           │
└──────────────────────┬──────────────────────────────────────────┘
                       │ KSP 编译期读取
                       ▼
┌─────────────────────────────────────────────────────────────────┐
│  scanner-ksp (IconUsageProcessor + IconReferenceScanner)        │
│  - 正则扫描 {Source}Icons.{Style}.{Name}                         │
│  - 额外扫描动态用法（Style 被当作值），发 warning                │
│  - 输出 icon-usage.json (IconUsageManifest)                      │
└──────────────────────┬──────────────────────────────────────────┘
                       │ 写到 build/generated/ksp/<variant>/
                       ▼
┌─────────────────────────────────────────────────────────────────┐
│  scanner-gradle-plugin                                          │
│  - ComposeIconsScannerPlugin 注册以下 Gradle 任务：              │
│    • validateIconReferences    — 校验引用存在，拼错给 suggestion │
│    • iconUsageReport           — 人类可读的使用分布报告          │
│    • generateIconKeepRules     — 从 manifest 生成 .pro           │
│  - KeepRulesAutoInjector 把 .pro 加入 variant.proguardFiles      │
└──────────────────────┬──────────────────────────────────────────┘
                       │ AGP 把 .pro 传给 R8
                       ▼
┌─────────────────────────────────────────────────────────────────┐
│  R8 按 allowlist 精确保留引用的图标 getter；其余裁剪             │
└─────────────────────────────────────────────────────────────────┘
```

### 2.2 核心数据结构

```kotlin
// scanner/ksp/.../IconReference.kt
data class IconReference(
    val source: String,   // "tabler", "lucide", ...
    val style: String,    // "Outline", "Filled", ...
    val name: String,     // "Home"
    val file: String, val line: Int, val column: Int,
)

data class IconUsageManifest(
    val module: String,
    val generatedAt: String,
    val icons: List<IconReference>,
)
```

### 2.3 IconReferenceScanner：正则双阶段扫描

`scanner/ksp/.../IconReferenceScanner.kt` 用两个正则：

| 模式 | 正则 | 匹配示例 | 用途 |
|------|------|----------|------|
| 三段式 | `\b(?:$sources)\w*Icons\.(\w+)\.(\w+)` | `TablerIcons.Outline.Home` | 正确引用 → 写入 manifest |
| 两段式 | `\b((?:$sources)\w*Icons\.(\w+))` | `TablerIcons.Outline`（作为值） | 动态用法 → 发 warning |

两段式用于抓反模式：

```kotlin
// ❌ 会被 warning 的写法
val iconSet = TablerIcons.Outline
fun render(style: Any) { /* ... */ }; render(TablerIcons.Outline)
return TablerIcons.Outline
```

这种"把 Style 对象当值用"意味着 R8 可能保留整个 `Outline` 对象（连带所有 ~6000 个属性），破坏裁剪。scanner 通过排除"与三段式重叠"的两段式匹配、并检测 `val x = ...` / 函数参数 / `return` 三种 sink pattern，精确定位反模式发出建议。

### 2.4 KeepRuleStrategy：三档策略

由消费方 DSL 控制，默认 `NONE`：

| 策略 | 生成规则 | 适用场景 |
|------|---------|----------|
| `NONE` | （不生成任何 keep） | 默认。R8 静态分析自己能裁到最小 |
| `MEMBERS` | `-keep class ...Kt { public static *** get*(...); }` | 需要保留 getter 签名抗反射 |
| `AGGRESSIVE` | `-keep class ...Kt { *; }` | 替代消费方手写的通配 keep，降级到精确类级保留 |

实证（sample APK 矩阵，docs/05 §4.1）：在 R8 自由裁剪场景下（消费方 `proguard-rules.pro` 不写任何 `-keep ... **`）：

- `NONE` dex 最小（基线）
- `MEMBERS` +19 KB
- `AGGRESSIVE` +27 KB

**关键洞察**：`AGGRESSIVE` 的价值不在"比 R8 默认更优"，而在**"替代消费方已有的全包 keep 通配"**。如果消费方原本写了 `-keep class composeicons.tabler.** { *; }`（7145 个图标全保），切到 `AGGRESSIVE` + 删手动通配后，会从"全保 7145"降到"只保实际引用的 ~50 个"——**从 MB 级别节省到 KB 级别**。

### 2.5 KeepRulesAutoInjector：AGP 集成

`scanner/gradle-plugin/.../KeepRulesAutoInjector.kt` 利用 AGP `AndroidComponentsExtension.onVariants` API：

1. 对每个 variant（`debug`/`release` × flavor）注册一个 `generateIconKeepRules<Variant>` 任务
2. 任务读 `build/generated/ksp/<variant>/.../icon-usage.json`
3. 写出 `build/generated/composeicons/proguard/<variant>/icon-allowlist.pro`
4. 用 `variant.proguardFiles.add(task.flatMap { it.outputFile })` 加入 proguard 文件链

**红线**：
- 只对 `com.android.application` 模块自动注入；library 模块 noop（消费方下游才知道实际引用）
- 可通过 `-Pcomposeicons.scanner.injectKeepRules=false` 禁用自动注入（供基准测试用）

### 2.6 诊断工具

**validateIconReferences**：校验每个引用确实存在于对应源的 generator report 中。拼错的图标（如 `TablerIcons.Outline.Homee`）会列出候选：

```
Invalid icon reference: TablerIcons.Outline.Homee (MyApp.kt:42)
Did you mean: Home / Home2 / HomeDot (Levenshtein distance 1)
```

`Levenshtein.kt` 实现经典动态规划，给出距离 ≤ 3 的 top-3 候选。

**iconUsageReport**：输出按源、按 (source, style) 的引用分布，方便消费方看自己实际用了多少图标。

---

## 3. 与其他方案的协作

| 方案 | 协作点 |
|------|--------|
| Shared Path Pool (Layer 1) | 共享常量是 `@PublishedApi internal val`，scanner 生成的 keep 针对图标顶层 Kt 类，R8 能正确让共享常量跟随裁剪 |
| Canonical Hash Pool (T3) | 同上。T3 常量也是 internal；若所有引用方被 scanner 标记为"未使用"且被 R8 裁掉，常量也被裁 |
| generator-core | 无耦合。scanner 完全工作在消费方编译期，生成器侧零改动 |

---

## 4. 测试覆盖

- `scanner/ksp/src/test/kotlin/`：`IconReferenceScannerTest`、`IconUsageManifestGroupingTest`、`KeepRulesGeneratorTest` 共 ~40 个测试
- `scanner/gradle-plugin/src/test/kotlin/`：`GenerateIconKeepRulesTaskTest`、`ValidateIconTaskIntegrationTest`、`KeepRulesAutoInjectorTest`、`LevenshteinTest` 共 ~30 个测试
- 端到端验证：sample 模块四 flavor × release 实测 APK 体积矩阵（`./gradlew :sample:reportApkSize`）

---

## 5. 消费方使用示例

最小接入（自动模式）：

```kotlin
// consumer/build.gradle.kts
plugins {
    id("com.android.application")
    id("io.github.jinghu-moon.composeicons.scanner")
}

dependencies {
    implementation("io.github.jinghu-moon.composeicons:icons-tabler:...")
}
```

无需手写任何 keep 规则。R8 收益自动达成。

策略切换（基准测试或有特殊反射需求）：

```kotlin
composeIconsScanner {
    keepRuleStrategy = KeepRuleStrategy.MEMBERS  // 保留 getter 抗反射
}
```

CLI 覆盖（A/B 对比，不改 build.gradle.kts）：

```bash
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=NONE
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=MEMBERS
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.strategy=AGGRESSIVE
./gradlew :sample:assembleHundredRelease -Pcomposeicons.scanner.injectKeepRules=false
```

CI 对这四种配置固化了 dumps：`sample/baseline/icon-keep-rules/<variant>-keep.pro`（`./gradlew :sample:dumpIconKeepRules`），任何规则漂移都会被 git diff 抓到。

---

## 6. 未来工作

- **扩展扫描策略**：当前只认 `{Source}Icons.{Style}.{Name}` 三段式。如果 `icons-core` 引入 `LocalComposeIconSource`（`CompositionLocal`）让消费方写 `LocalIcons.current.Home`，scanner 需增强做类型推断或者静态提取 LocalIcons 可见图标集。见 architecture.md 相关讨论。
- **跨模块引用追踪**：当前 scanner 只扫单模块。如果消费方把图标引用封装在 `:core-ui` 模块，`:app` 模块继承但不直接引用，scanner 可能漏追。需要 KSP 多模块协同。
- **动态用法白名单**：某些合法场景确实需要把 Style 当值用（比如主题系统）。提供一个 `@IconStyleUsage` 注解让消费方声明"我知道我在做什么"，跳过 warning。
