# 创新方案 3：Shared Path Pool（跨图标共享路径池）

> 本文档定义 Shared Path Pool 的完整架构、渲染风险分析、安全降级策略与 TDD 任务清单。
>
> 前置阅读：[01_design_specification.md](./01_design_specification.md)、[architecture.md](./architecture.md)、[03_path_compaction.md](./03_path_compaction.md)

## 1. 问题定义

### 1.1 pathData 冗余假设

> ⚠️ **实证结论已修正本节假设，请优先阅读 §1.2.1**。本节保留原假设以记录设计动机。

设计之初的假设：每个图标的 pathData 是独立字符串常量，多 weight 图标源（如 Phosphor）会大量重复。以 Phosphor 为例的**理论模型**：

```
Phosphor/Regular/Heart.kt  → addPathData("M12 21.35l-1.45-1.32C5.4...")
Phosphor/Light/Heart.kt    → addPathData("M12 21.35l-1.45-1.32C5.4...")  ← 假设几乎相同
Phosphor/Bold/Heart.kt      → addPathData("M12 21.35l-1.45-1.32C5.4...")  ← 假设几乎相同
Phosphor/Fill/Heart.kt      → addPathData("M12 21.35l-1.45-1.32C5.4...")  ← 假设几乎相同
Phosphor/Thin/Heart.kt      → addPathData("M12 21.35l-1.45-1.32C5.4...")  ← 假设几乎相同
Phosphor/Duotone/Heart.kt   → addPathData("M12 21.35l-1.45-1.32C5.4...")  ← 假设几乎相同
```

假设：6 个 weight，同一图标的**结构完全一致**，只有 stroke-width 和 fill 策略不同。若假设成立，pathData 字符串重复 6 次。

### 1.2 量化分析（理论上界）

以 Phosphor 为例（最重的图标源）的**理论估算**：

```
图标数：9000
Weight 数：6
总实例数：9000 × 6 = 54,000
每图标平均 path 数：3
每条 path 平均字节数：80 bytes
总 pathData 量：54,000 × 3 × 80 = ~12.5 MB (源码)
```

若同名图标跨 weight 一致率达 85%，去重后**理论节省**约 75%：

```
共享常量数：9,000（每图标一份 pathData）
引用开销：54,000 - 9,000 = 45,000 条引用 × ~20 bytes ≈ 0.9 MB
总 pathData 量：9,000 × 3 × 80 + 900,000 ≈ 3.1 MB
理论节省：~75%（仅理论上界，实测见 §1.2.1）
```

### 1.2.1 实测命中率（已在 Phase 1D §4.1 落实）

⚠️ **决定性事实，避免后人重复挖洞**：

| 图标源 | Style 数 | 总图标数 | 共享文件数 | 实测跨 style 命中率 |
|------|---------|---------|-----------|---------------------|
| Phosphor | 6 (Thin/Light/Regular/Bold/Fill/Duotone) | 9072 | **3** | **~0.2%** |
| Tabler | 2 (Outline/Filled) | 7145 | 0 | 0%（不同名图标） |
| Remix | 2 (Line/Fill) | 3078 | 0 | 0%（坐标不同） |

**Phosphor 实测**：仅 `BatteryEmpty` / `BatteryVerticalEmpty` / `WifiNone` 三个图标在跨 weight 时 pathData 完全一致。其余 9069 个图标的不同 weight **坐标本身就不同**（不仅仅是 stroke-width 差异），是 Phosphor 设计的固有特性。

**为什么理论与实测差距如此之大**：

1. Phosphor 各 weight 由设计师独立绘制（视觉一致但顶点不同），而非用同一组路径加不同描边宽度。
2. Tabler outline 与 filled 是**不同图标集**，命名空间与渲染策略均不同，无跨 style 共享空间。
3. Remix Line/Fill 同名图标的 pathData 坐标不一致。

**Layer 1 实际价值**：

- 不在"跨 weight 去重率"，而在**架构正确性**（保证多 weight 图标源中**确实重复的图标**被识别）。
- 真正的体积节省机会在跨**别名/同形状**图标的去重，对应 [docs/06_innovation_canonical_hash_pool.md](./06_innovation_canonical_hash_pool.md)（待落地）。

**emit 模式说明**：Phosphor 多数图标走 Full 模式（`addPath` + 显式 PathStyle），shared 常量文件被生成但未被引用。Shared Path Pool 在使用 Template 模式（`addPathData` + 同 style 多 path）的图标源中才会完整生效。

### 1.3 设计目标

| 目标 | 验收标准 |
|------|---------|
| 跨 weight 去重（架构正确性） | 同名图标 pathData 跨 style 完全一致 → 必须共享；不一致 → 不强制合并 |
| 渲染一致性 | 优化前后 Paparazzi 截图 diff = 0 |
| R8 兼容性 | 共享常量不阻止 R8 裁剪未使用的图标 |
| 架构隔离 | 去重逻辑完全在 Rust（svg2compose）侧完成，generator:core 无变更 |
| 命中率 | **不设硬指标**：Phosphor 实测 0.2%（§1.2.1）。命中率由图标源固有特性决定，不是实现质量指标 |

## 2. 渲染风险分析与安全策略

### 2.1 高风险：Path 拆分导致的渲染异常（Layer 2 核心风险）

**问题描述**：若将一个完整的 Path 拆分成两段以复用共享子路径（如 `addPathData(_shared); addPathData(_specific)`），在 `ImageVector` 中等同于两个独立的 `<path>` 标签。

**后果**：

1. **半透明着色异常**：当 `tint` 的 alpha < 1 时，两个 path 的重叠区域颜色加深（alpha 混合叠加）。
2. **EvenOdd 填充规则异常**：`PathFillType.EvenOdd` 依赖单个 path 内部的环绕计数。拆分后环绕关系断裂，填充区域错误。
3. **抗锯齿边缘伪影**：两个相邻 path 的接缝处出现可见的 1px 间隙或重叠线。

**结论：Layer 2（跨图标的子路径提取）在当前 `ImageVector` 渲染模型下存在不可接受的渲染风险。**

### 2.2 中风险：相对坐标失效

**问题描述**：SVG 中的小写指令（`m`, `c`, `l` 等）是相对坐标，依赖上一条指令的结束位置。若对原始字符串做 n-gram 切分，切点之后包含相对坐标时，提取出的常量在不同前置坐标下渲染完全走样。

**当前项目的状态**：`svg2compose` 的 `compact.rs` 已实现相对坐标转换（`to_relative` 阶段）。但这意味着生成的 pathData 中**混合了绝对和相对指令**，直接做字符串级切分必然出错。

### 2.3 安全策略：仅实施 Layer 1，暂缓 Layer 2

| 层级 | 策略 | 风险等级 | 决策 |
|------|------|---------|------|
| **Layer 1** — 跨 weight 同名图标去重 | 比较完整 pathData 序列，相同则共享 | **低** | 实施 |
| **Layer 2** — 跨图标的子路径提取 | n-gram 切分 + 频次统计 | **高** | 暂缓 |

**Layer 1 安全的原因**：

- 不拆分任何 Path。同名图标的 pathData 序列**完全一致**时才共享，等价于"同一份数据的多个引用"。
- 比较粒度是**整个图标的 pathData 序列**（逐 path 按顺序比较字符串相等性），不做子串匹配。
- 差异的 path 独立生成，不强制合并。

**Layer 2 若未来要实施的前置条件**：

1. `svg2compose` 必须将**所有指令转换为绝对坐标**（消除 `to_relative` 阶段），然后再做 AST 级别的结构比对。
2. 子路径提取必须严格在**封闭图形边界**（`M` 到 `Z`）上切割，不能在开放路径中间断开。
3. 必须通过 Roborazzi 截图回归验证每个被提取的子路径在半透明 tint + EvenOdd 填充下无渲染异常。
4. 仅提取出现 ≥50 次的高频**完整封闭子图形**（如独立圆角矩形、独立外框），不做通用 n-gram。

## 3. Layer 1 架构设计

### 3.1 数据流

```
┌─────────────────────────────────────────────────────────────┐
│                    svg2compose (Rust)                        │
│                                                             │
│  ┌──────────────┐    ┌──────────────┐    ┌───────────────┐  │
│  │ usvg 解析    │───▶│ SvgDocument  │───▶│ path_dedup    │  │
│  │ (per SVG)    │    │ (per icon)   │    │ (cross-style) │  │
│  └──────────────┘    └──────────────┘    └───────┬───────┘  │
│                                                  │          │
│                                                  ▼          │
│                                          ┌───────────────┐  │
│                                          │ codegen.rs    │  │
│                                          │ (emit .kt)    │  │
│                                          └───────────────┘  │
└─────────────────────────────────────────────────────────────┘
```

### 3.2 path_dedup.rs 核心算法

```
输入：同一图标源的所有 style 的 ManifestEntry 列表
输出：共享路径表 (HashMap<String, SharedPathEntry>)

算法：
  1. 按图标名分组：grouped = entries.group_by(entry.icon_name)
  2. 对每组：
     a. 提取所有 style 的 pathData 序列
     b. 比较序列是否完全一致（逐条 path 字符串相等）
     c. 若一致：生成共享常量 key = "{source}_{style}_{iconName}_paths"
        记录 SharedPathEntry { key, pathData_list, styles }
     d. 若不一致：找出一致的 path 子集，生成部分共享
  3. 输出共享路径表
```

**部分共享策略**：若 6 个 weight 中有 4 个的第 1 条 path 相同，2 个不同：

```
Weight    Path[0]          Path[1]          Path[2]
Thin      "M12 21.35..."  "M5 12..."       "M9 21..."
Light     "M12 21.35..."  "M5 12..."       "M9 21..."
Regular   "M12 21.35..."  "M5 12..."       "M9 21..."
Bold      "M12 21.35..."  "M5 12..."       "M9 21..."
Fill      "M12 21.35..."  "M8 10..."       ← Path[1] 不同
Duotone   "M12 21.35..."  "M8 10..."       ← Path[1] 不同

→ Path[0] 共享（6/6 一致）
→ Path[1] 部分共享：group A (Thin/Light/Regular/Bold) + group B (Fill/Duotone)
→ Path[2] 共享（6/6 一致）
```

### 3.3 codegen.rs 变更

**当前输出**：

```kotlin
// icons-phosphor/.../thin/Heart.kt
val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_thin_heart != null) return _thin_heart!!
        _thin_heart = phosphorThinIcon("Heart") {
            addPathData("M12 21.35l-1.45-1.32C5.4 15.36...")
            addPathData("M5 12v7c0 1.105...")
            addPathData("M9 21v-6c0-1.105...")
        }
        return _thin_heart!!
    }
private var _thin_heart: ImageVector? = null
```

**优化后输出**：

```kotlin
// icons-phosphor/.../shared/HeartPaths.kt（自动生成）
@PublishedApi
internal val _heartPath0: String = "M12 21.35l-1.45-1.32C5.4 15.36..."
@PublishedApi
internal val _heartPath1: String = "M5 12v7c0 1.105..."
@PublishedApi
internal val _heartPath2: String = "M9 21v-6c0-1.105..."

// icons-phosphor/.../thin/Heart.kt
val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_thin_heart != null) return _thin_heart!!
        _thin_heart = phosphorThinIcon("Heart") {
            addPathData(_heartPath0)  // 引用共享常量
            addPathData(_heartPath1)
            addPathData(_heartPath2)
        }
        return _thin_heart!!
    }
private var _thin_heart: ImageVector? = null
```

**部分共享输出**：

```kotlin
// icons-phosphor/.../shared/HeartPaths.kt
@PublishedApi
internal val _heartPath0: String = "M12 21.35l-1.45-1.32C5.4 15.36..."
@PublishedApi
internal val _heartPath1_groupA: String = "M5 12v7c0 1.105..."
@PublishedApi
internal val _heartPath1_groupB: String = "M8 10v5c0 0.85..."
@PublishedApi
internal val _heartPath2: String = "M9 21v-6c0-1.105..."

// icons-phosphor/.../thin/Heart.kt（属于 groupA）
val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_thin_heart != null) return _thin_heart!!
        _thin_heart = phosphorThinIcon("Heart") {
            addPathData(_heartPath0)
            addPathData(_heartPath1_groupA)
            addPathData(_heartPath2)
        }
        return _thin_heart!!
    }
```

### 3.4 产物目录结构

```
icons-phosphor/src/main/kotlin/composeicons/phosphor/
├── PhosphorIcons.kt              # 容器对象（不变）
├── shared/                        # 新增：共享路径池
│   ├── HeartPaths.kt             # Heart 的 6 weight 共享 pathData
│   ├── HousePaths.kt             # House 的 6 weight 共享 pathData
│   └── ...                       # 约 9000 个共享文件
├── thin/
│   └── Heart.kt                  # 引用 shared/HeartPaths.kt
├── light/
│   └── Heart.kt                  # 引用 shared/HeartPaths.kt
├── regular/
│   └── Heart.kt                  # 引用 shared/HeartPaths.kt
└── ...                           # 6 weight × 9000 icons
```

### 3.5 R8 兼容性分析

**问题**：共享常量是 `internal val`，若某图标未被使用，其引用的共享常量是否残留？

**分析**：

- 共享常量位于 `shared/` 目录，是顶层 `val` getter。
- 若某图标未被使用 → 该图标的 `.kt` 文件中的 getter 和 backing var 被 R8 移除。
- 该 getter 是唯一引用 `shared/HeartPaths.kt` 中常量的地方 → R8 判定常量不可达 → 常量也被移除。
- **例外**：若同名图标的其他 weight 被使用，共享常量不会被移除（符合预期，因为仍有引用）。

**结论**：R8 裁剪行为正确。未使用的图标 → 共享常量也被移除，不会产生残留。

### 3.6 增量构建兼容性

当前 `GeneratorEngine` 使用 MD5 做增量缓存。共享路径池引入后：

| 场景 | 行为 |
|------|------|
| 图标 SVG 变更 | 该图标的 MD5 变更 → 重新生成所有 weight + 共享常量 |
| 共享常量变更 | 共享常量的 MD5 变更 → 引用它的所有 weight 文件也被标记为脏 |
| 新增图标 | 新图标的 MD5 未命中缓存 → 生成新共享常量 + 所有 weight |
| 删除图标 | 旧 .kt 文件不再出现在 manifest → 被 stale cleanup 删除 + 共享常量也删除 |

实现要点：共享常量文件也需要纳入 MD5 增量缓存体系。

## 4. 与现有架构的集成点

| 组件 | 变更范围 |
|------|---------|
| `svg2compose` (Rust) | **主要改动点**。新增 `path_dedup.rs` 模块，`codegen.rs` 输出共享常量 + 引用 |
| `generator:core` | 无变更。去重逻辑完全在 Rust 侧完成 |
| `icons-core` | 无变更。共享常量是各 `icons-*` 模块的 `internal` 实现细节 |
| `icons-*` 产物 | 目录结构新增 `shared/` 子目录；增量缓存需纳入共享常量 |

## 5. TDD 任务清单

状态约定：`[ ]` 未开始 / `[-]` 进行中 / `[x]` 已完成

### Phase 1 — Layer 1 跨 Weight 去重（核心）

#### 1A. Rust path_dedup 模块

- [x] `1.1` 创建 `path_dedup.rs` 模块，实现 `DedupEngine` 结构体
- [x] `1.2` 实现按图标名分组算法：`group_by_icon_name(entries: &[ManifestEntry]) -> HashMap<String, Vec<&ManifestEntry>>`
- [x] `1.3` 实现 pathData 序列比对：`paths_equal(a: &[String], b: &[String]) -> bool`
- [x] `1.4` 实现部分共享检测：`find_shared_groups(paths_map: &HashMap<Style, Vec<String>>) -> Vec<SharedGroup>`
- [x] `1.5` 单元测试：6 个 weight 的 Heart pathData 完全一致 → 输出 1 个共享常量
- [x] `1.6` 单元测试：6 个 weight 中 4 个一致、2 个不同 → 输出部分共享（groupA + groupB）
- [x] `1.7` 单元测试：6 个 weight 的 pathData 各不相同 → 无共享，各自独立
- [x] `1.8` 单元测试：单 weight 图标源（如 Lucide）→ 无共享，不报错

#### 1B. Rust codegen 集成

- [x] `2.1` `codegen.rs` 新增 `generate_shared_paths_file()` 函数：输出 `shared/XxxPaths.kt`
- [x] `2.2` `codegen.rs` 修改图标生成逻辑：若 pathData 命中共享池，生成引用而非内联字符串
- [x] `2.3` `codegen.rs` 处理部分共享：不同 group 的 path 引用不同的共享常量
- [x] `2.4` 单元测试：给定共享路径表，生成的 .kt 文件中 pathData 变为 `internal val` 引用
- [x] `2.5` 单元测试：给定部分共享路径表，不同 weight 引用正确的 group 常量
- [x] `2.6` 单元测试：无共享时，生成的 .kt 文件与当前行为完全一致（向后兼容）

#### 1C. 增量缓存兼容

- [x] `3.1` 共享常量文件纳入 MD5 增量缓存体系
- [x] `3.2` 共享常量变更时，引用它的图标文件也被标记为脏
- [x] `3.3` 单元测试：共享常量 MD5 变更 → 引用文件被重新生成

### Phase 1D — 集成验证

- [x] `4.1` 对 Phosphor 全量生成（9072 图标全部成功，3 个共享文件生成）
  - **注意**：Phosphor 的 6 种样式（Thin/Light/Regular/Bold/Fill/Duotone）pathData 坐标各不相同（不仅仅是 stroke-width），因此跨样式去重率极低（~0.2%，仅 BatteryEmpty/BatteryVerticalEmpty/WifiNone 三个图标有部分共享）。这是 Phosphor 的固有特性，非实现缺陷。
  - Phosphor 图标使用 Full 模式（addPath），共享常量文件已正确生成但未被引用。Shared Path Pool 在使用模板模式（addPathData）的多样式图标源中会完整生效。
- [x] `4.2` 验证生成产物可编译通过（Phosphor/Tabler/Remix 全部 compileReleaseKotlin 通过）
- [x] `4.3` Roborazzi 截图回归：优化前后图标渲染一致性（diff = 0）
  - **已修复（2026-05-09）**：问题原因是 `compose.ui.test.manifest` 使用 `testImplementation` 而非 `debugImplementation`，导致 `ComponentActivity` 未合并到 manifest。改为 `debugImplementation` 后，`recordRoborazziAllDebug` + `verifyRoborazziAllDebug` 均通过。
  - 当前覆盖 2 个代表性图标（Tabler AB、Lucide Activity），后续可按需扩展。
- [x] `4.4` APK 体积对比：`sample` 模块 zero/ten/hundred/all 四个 flavor 的体积可度量。
  - KSP scanner 已接入（plugin `io.github.jinghu-moon.composeicons.scanner`），生成 `icon-allowlist.pro`
  - APK 体积矩阵：zero=856KB / ten=969KB / hundred=970KB / all=2088KB
  - `reportApkSize` 任务生成 CSV 报告：`sample/build/reports/icons/apk-size.csv`
  - 注意：当前 all flavor 的 DemoIcons 为空列表，体积仅反映 baseline 框架开销
- [x] `4.5` 对 Tabler（单 weight）全量生成（6092 图标成功，无共享目录）
- [x] `4.6` 对 Remix（2 style）全量生成（3078 图标成功，Fill/Line pathData 不同，无共享）

### Phase 1E — 输出确定性加固（T2-01 / T2-04 / T2-06）

> 在 Layer 1 落地后，新增的 idempotency / 输出稳定性保证。源于发现：HashMap
> 迭代顺序 + `find_shared_groups` 内部 styles 收集顺序受输入顺序影响，导致
> 跨次运行字节级不一致 — 这会破坏下游 `GeneratorEngine` 的 MD5 增量缓存。

- [x] `5.1` `dedup_entries` 输出末尾按 `icon_name` 字典序排序（path_dedup.rs:84）
- [x] `5.2` `find_shared_groups` 内 `SharedGroup.styles` 字段全部 sort（path_dedup.rs:108, 132）
- [x] `5.3` 给 `IconDedupResult` / `SharedPathRef` 加 `PartialEq` derive（用于 idempotency 断言）
- [x] `5.4` 单元测试：相同输入跑两次 → 字节级一致（`test_dedup_entries_idempotent_same_input`）
- [x] `5.5` 单元测试：输入反向时输出仍语义等价（`test_dedup_entries_input_order_independent`）
- [x] `5.6` 单元测试：`build_lookup` 在 dedup → lookup 流水线下幂等（`test_pipeline_idempotent_full_round_trip`）
- [x] `5.7` 单元测试：`is_flat_paths_only` / `all_paths_same_style` / `extract_style` 内部 helper 直测（codegen.rs T2-06 段，13 个测试）
- [x] `5.8` 端到端测试：嵌套 group 强制 Full 模式（`test_nested_group_forces_full_mode`）

**T2 阶段 path_dedup 测试数**：12 → 19；codegen 测试数：16 → 29。

### Phase 2 — Layer 2 跨图标子路径提取（暂缓）

> 以下任务在 Phase 1 完成且验证通过后，根据 Phase 1 的实际收益决定是否启动。
> 启动前置条件见 §2.3。

- [ ] `5.1` `svg2compose` 新增 `absolute_only` 模式：禁用 `to_relative`，所有输出为绝对坐标
- [ ] `5.2` 实现封闭子图形检测：以 `M` ... `Z` 为边界提取独立子路径
- [ ] `5.3` 实现子路径结构比对（AST 级别，非字符串 n-gram）
- [ ] `5.4` 实现高频子路径提取（出现 ≥50 次的完整封闭子图形）
- [ ] `5.5` 半透明 tint + EvenOdd 填充渲染验证（逐个子路径的截图回归）
- [ ] `5.6` 全量生成 + 截图回归 + APK 体积验证

## 6. 风险与缓解

| 风险 | 影响 | 缓解措施 |
|------|------|---------|
| 共享常量文件数过多（~9000 个） | 构建时类加载开销 | 共享文件是 `internal val`，仅在同模块内联；R8 可内联常量字符串 |
| 部分共享的 group 划分过细 | 去重收益降低 | 设定阈值：仅当共享组 ≥3 个 weight 时才提取共享常量 |
| Phosphor 某些图标的 weight 间 path 确实不同 | 去重率不达预期 | 这是正常情况，不强制合并；保持独立生成 |
| Rust 编译时间增长 | `path_dedup` 增加计算量 | 仅对同名图标做比对，复杂度 O(n × styles)，n=9000 时可接受 |
| 增量缓存误判 | 共享常量变更未触发关联文件重新生成 | §1C 任务专门覆盖此场景 |
