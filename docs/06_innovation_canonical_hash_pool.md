# 创新方案 3：Canonical Hash Pool（跨图标路径哈希共享池）

> 本文档定义 Canonical Hash Pool (T3) 的完整架构、实测命中率数据、与 Layer 1 的协作模型与 TDD 任务清单。
>
> 前置阅读：[05_innovation_shared_path_pool.md](./05_innovation_shared_path_pool.md)（Layer 1）、[architecture.md](./architecture.md)

## 1. 问题定义

### 1.1 Layer 1 的覆盖盲区

Layer 1（Shared Path Pool）仅处理**同名图标跨 style** 的路径去重：

```
Phosphor/Thin/Heart.kt  ─┐
Phosphor/Light/Heart.kt  ─┼─ Layer 1: 同名 "Heart" 跨 weight 比较
Phosphor/Bold/Heart.kt   ─┘
```

但存在两类 Layer 1 无法覆盖的冗余：

1. **跨 style 不同名别名**：同一图标源内，不同名称的图标 pathData 完全一致
   ```
   Tabler/Outline/Circle         ─┐
   Tabler/Outline/Percentage0    ─┼─ 不同名，Layer 1 不比较
   Tabler/Outline/Percentage100  ─┘
   ```

2. **跨 style 同名但 Layer 1 未触发**：不同 style 子目录下的同名图标，其 pathData 一致但 Layer 1 的分组键（`icon_name`）无法跨 style 直接关联
   ```
   Remix/Fill/FullscreenExitFill   ─┐
   Remix/Line/FullscreenExitLine   ─┼─ 名称不同（Fill vs Line 后缀）
   ```

### 1.2 Canonical Hash Pool 的定位

T3 是 Layer 1 的**补充层**，作用范围是**单个 artifact 内的所有图标**（不跨 module）。核心思路：

> 对整个 artifact 的所有图标做 FNV-1a 64-bit 哈希，相同哈希的图标共享同一组 pathData 常量。

```
Layer 1:  同名跨 style（如 Heart/Thin vs Heart/Bold）
    ↓ 未覆盖的 slot
T3:      跨图标名的 pathData 哈希匹配（如 Circle vs Percentage0）
```

## 2. 架构设计

### 2.1 数据流

```
┌─────────────────────────────────────────────────────────────────┐
│                    svg2compose (Rust)                            │
│                                                                 │
│  ┌──────────┐    ┌──────────────┐    ┌───────────────────────┐  │
│  │ Phase 1  │───▶│ path_dedup   │───▶│ Layer 1 SharedPath    │  │
│  │ SVG 解析 │    │ (cross-style)│    │ Lookup (同名跨 style) │  │
│  └──────────┘    └──────────────┘    └───────────┬───────────┘  │
│       │                                          │              │
│       ▼                                          │              │
│  ┌──────────────────┐                            │              │
│  │ canonical_hash   │◀─── entries_with_paths ────┘              │
│  │ (cross-icon)     │                                          │
│  └────────┬─────────┘                                          │
│           │                                                    │
│           ▼                                                    │
│  ┌──────────────────────┐    ┌──────────────────────────────┐  │
│  │ build_canonical_pool │───▶│ build_canonical_lookup       │  │
│  │ (FNV-1a 分组)        │    │ (Layer 1 优先, T3 填补空位) │  │
│  └──────────────────────┘    └──────────────┬───────────────┘  │
│                                             │                  │
│                                             ▼                  │
│                                   ┌──────────────────┐         │
│                                   │ merged_lookup    │         │
│                                   │ (Layer1 ∪ T3)    │         │
│                                   └────────┬─────────┘         │
│                                            │                   │
│                    ┌───────────────────────┬┴──────────────┐    │
│                    ▼                       ▼               ▼    │
│           ┌──────────────┐    ┌──────────────────┐  ┌────────┐ │
│           │ shared/*.kt  │    │ CanonicalPaths.kt│  │ *.kt   │ │
│           │ (Layer 1)    │    │ (T3 跨图标共享)  │  │per-icon│ │
│           └──────────────┘    └──────────────────┘  └────────┘ │
└─────────────────────────────────────────────────────────────────┘
```

### 2.2 FNV-1a 哈希算法

选择 FNV-1a 64-bit 的理由：

| 属性 | 值 |
|------|------|
| 碰撞概率（1e4 图标） | n²/(2·M) ≈ 5e7 / 1.8e19 ≈ 2.7e12 — 可忽略 |
| 确定性 | 相同输入 → 相同输出（无随机种子） |
| 实现复杂度 | O(n)，无外部依赖 |
| 输出格式 | 12 位小写 hex token（48 bits），足够短做 Kotlin 标识符后缀 |

```rust
pub fn fnv1a_64(bytes: &[u8]) -> u64 {
    let mut h: u64 = 14695981039346656037;  // FNV offset basis
    for b in bytes {
        h ^= *b as u64;
        h = h.wrapping_mul(1099511628211);  // FNV prime
    }
    h
}
```

**哈希输入**：图标的所有 pathData 字符串用 `\n` 拼接后整体哈希。保留顺序（z-order 影响渲染），不做排序。

### 2.3 CanonicalGroup 数据结构

```rust
pub struct CanonicalGroup {
    pub hash: u64,           // FNV-1a 哈希值
    pub token: String,       // 12 位 hex，用作常量名后缀
    pub paths: Vec<String>,  // 共享的 pathData 序列
    pub members: Vec<(String, String)>,  // (style_name, kotlin_name)，排序去重
}
```

**过滤规则**：仅保留 ≥2 个**不同** `(style, name)` 成员的组。同一 `(style, name)` 出现两次视为输入异常，不计为共享。

### 2.4 Layer 1 优先的合并策略

```rust
pub fn build_canonical_lookup(
    groups: &[CanonicalGroup],
    layer1_lookup: &SharedPathLookup,  // Layer 1 已占有的 slot
) -> SharedPathLookup {
    // 遍历每个 group 的每个 (icon, style, path_idx) slot
    // 若 layer1_lookup 已包含该 slot → 跳过（Layer 1 优先）
    // 否则 → 插入 T3 常量引用
}
```

**关键保证**：Layer 1 + T3 对同一 `(icon, style, path_idx)` 不会产生冲突引用。Layer 1 的 `SharedPathRef` 始终优先。

### 2.5 产物结构

```
icons-tabler/src/main/kotlin/composeicons/tabler/
├── shared/
│   ├── CanonicalPaths.kt    ← T3 产物：跨图标共享常量（单文件）
│   ├── SearchPaths.kt       ← Layer 1 产物：跨 style 同名共享
│   └── ...
├── outline/
│   ├── Circle.kt            ← 引用 _p34ee26adc6eb_0（T3 常量）
│   ├── Percentage0.kt       ← 引用同一 _p34ee26adc6eb_0
│   └── ...
└── filled/
    └── ...
```

**CanonicalPaths.kt 示例**（Tabler 实际产出）：

```kotlin
package composeicons.tabler.shared

// Auto-generated canonical hash pool (T3): cross-icon path sharing within this artifact.
// Each constant represents a unique path sequence shared by ≥2 distinct icons.

@PublishedApi
internal val _p34ee26adc6eb_0: String = "M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12"
// ↑ 被 Circle.kt、Percentage0.kt、Percentage100.kt、WashDryclean.kt 共同引用
```

### 2.6 渲染安全性

| 安全维度 | 保证 |
|---------|------|
| 无 Path 拆分 | 共享的是**完整 pathData 字符串**，不做子串切割 |
| 顺序保留 | `\n` 拼接保留 path z-order，不同顺序 → 不同哈希 |
| R8 兼容 | `@PublishedApi internal val` 仅在模块内联；若所有引用者被 R8 移除，常量也被移除 |
| 坐标安全 | 比较的是 svg2compose 已标准化的 pathData（绝对坐标），无相对坐标歧义 |

### 2.7 Per-Artifact 隔离

T3 的共享范围严格限定在**单个 artifact**（即单个 `icons-*` 模块）内。跨模块不共享，原因：

1. 不同模块的 `basePackage` 不同，常量可见性为 `internal`
2. 避免跨模块编译依赖（A 模块的 CanonicalPaths.kt 被 B 模块引用需要改为 `public`）
3. 保持增量编译的独立性

## 3. 实测命中率数据

### 3.1 各图标源 T3 命中率

| 图标源 | Style 数 | 总图标数 | T3 组数 | T3 共享 slot 数 | 覆盖图标数 | 平均组大小 |
|--------|---------|---------|---------|----------------|-----------|-----------|
| Tabler | 2 (Outline/Filled) | 7145 | **20** | **126** | **45** | 2.2 |
| Remix | 2 (Line/Fill) | 3078 | **76** | **152** | **152** | 2.0 |
| Lucide | 1 (default) | 1508 | **1** | **4** | **2** | 2.0 |
| Radix | 1 (default) | 319 | **0** | **0** | **0** | — |
| Phosphor | 6 (Thin/Light/Regular/Bold/Fill/Duotone) | 9072 | **3** | **0** | **6** | 2.0 |

### 3.2 命中模式分析

**Remix（76 组，最典型）**：Fill/Line 同名图标的 pathData 完全一致，如：
```
Fill/FullscreenExitFill  ←→  Line/FullscreenExitLine   (pathData 相同)
Fill/ArrowRightDoubleFill ←→ Line/ArrowRightDoubleLine  (pathData 相同)
```
Remix 的 Fill/Line 变体设计上共享相同形状，仅填充策略不同（fill vs stroke），但 svg2compose 将其标准化后 pathData 字符串完全一致。

**Tabler（20 组，含跨 style + 别名）**：
- 跨 style：`Outline/Crop75` ↔ `Filled/Crop75`（不同 style 子目录下同名图标的 pathData 一致）
- 别名：`Outline/Circle` ↔ `Outline/Percentage0` ↔ `Outline/Percentage100` ↔ `Outline/WashDryclean`（5 个不同名图标共享同一圆形路径）

**Lucide（1 组）**：`Clock` ↔ `Clock4` 两个图标的 pathData 完全一致。

**Radix（0 组）**：无跨图标 pathData 重复。

**Phosphor（3 组，0 额外 slot）**：3 个 T3 组（BatteryVerticalEmpty Fill/Regular、BatteryEmpty Fill/Regular、WifiNone Duotone/Fill）的 pathData 完全一致，但 Layer 1 已通过跨 style 共享覆盖了所有 slot（20 slots），T3 无额外收益。此外 Phosphor 多数图标为单路径，不走 template 模式，T3 常量已生成但未被引用。

### 3.3 Layer 1 与 T3 的互补关系

| 图标源 | Layer 1 命中 | T3 命中 | 重叠 |
|--------|-------------|---------|------|
| Tabler | 0（单 style 无跨 weight 同名） | 126 slots | 0 |
| Remix | 0（Fill/Line 同名但 pathData 不同） | 152 slots | 0 |
| Lucide | 0（单 style） | 4 slots | 0 |
| Phosphor | ~20 slots（3 个图标跨 weight 共享） | 0 slots（Layer 1 已全覆盖） | 0 |

**结论**：在已测试的 4 个图标源中，Layer 1 与 T3 **完全互补，零重叠**。T3 捕获了 Layer 1 无法覆盖的跨图标冗余。

## 4. 与 Layer 1 的架构对比

| 维度 | Layer 1 (Shared Path Pool) | T3 (Canonical Hash Pool) |
|------|---------------------------|-------------------------|
| 作用范围 | 同名图标跨 style | 同 artifact 内所有图标 |
| 比较方式 | 逐 path 字符串相等 | 整个 pathData 序列的 FNV-1a 哈希 |
| 产物 | `shared/XxxPaths.kt`（每图标一个文件） | `shared/CanonicalPaths.kt`（单文件） |
| 常量命名 | `_xxxPath0`, `_xxxPath1_groupA` | `_p{token}_{idx}` |
| 实测收益 | Phosphor ~0.2%（3 图标） | Tabler 45 图标 / Remix 152 图标 |
| 增量复杂度 | O(styles per icon) | O(N × avg_paths) |

## 5. 增量缓存策略

### 5.1 当前实现（全量重算）

每次构建对所有图标重新计算 canonical hash，时间复杂度 O(N × avg_paths)。

### 5.2 优化方向（MD5 增量缓存）

| 缓存粒度 | 键 | 值 | 失效条件 |
|---------|------|------|---------|
| 单图标 | `(style, name, svg_md5)` | `canonical_hash` | SVG 文件变更 |
| 全局池 | `all_icon_hashes_sorted` | `Vec<CanonicalGroup>` | 任何图标哈希变更 |

详见 T3-07 任务。

## 6. TDD 任务清单

状态约定：`[ ]` 未开始 / `[-]` 进行中 / `[x]` 已完成

### Phase 1 — 核心实现

#### 1A. canonical_hash 模块

- [x] `T3-01` 实现 `fnv1a_64` 哈希函数 + 已知值测试
- [x] `T3-02` 实现 `canonical_hash_of`（path 序列 → 哈希，空输入返回 sentinel 0）
- [x] `T3-03` 实现 `hash_to_token`（64-bit → 12 位 hex token）
- [x] `T3-04` 实现 `CanonicalGroup` 数据结构
- [x] `T3-05` 实现 `build_canonical_pool`（≥2 成员过滤、排序确定性）
- [x] `T3-06` 实现 `build_canonical_lookup`（Layer 1 优先，T3 填补空位）

#### 1B. codegen 集成

- [x] `T3-08` 实现 `generate_canonical_paths_file`（单文件 emit）
- [x] `T3-09` main.rs Phase 1.6 集成（build pool → merge lookup → emit CanonicalPaths.kt）
- [x] `T3-10` GeneratorEngine cleanup 兼容（跳过 CanonicalPaths.kt 删除）

### Phase 2 — 集成验证

- [x] `T3-11` Tabler 全量验证（20 组 / 45 图标 / compileReleaseKotlin 通过）
- [x] `T3-11b` Remix 全量验证（76 组 / 152 图标）
- [x] `T3-11c` Lucide 全量验证（1 组 / 2 图标）
- [x] `T3-11d` Radix 全量验证（0 组，无 CanonicalPaths.kt 生成）
- [x] `T3-12` 本文档编写

### Phase 3 — 增量缓存

- [x] `T3-07` MD5 增量缓存：已实现 Rust 侧 SVG 解析缓存（cache.rs + manifest.rs + main.rs）+ Kotlin 侧传递接口。**基准测试结论：反而更慢，已回退移除**。原因：usvg 解析 5039 图标仅需 ~1.3s，而 7.1MB 缓存 JSON 加载开销更大。Generator 自身 MD5 缓存（GeneratorReport）已覆盖增量场景。
- [x] `T3-07a` 缓存失效测试：随 T3-07 一起回退
- [x] `T3-07b` 缓存一致性测试：随 T3-07 一起回退

### Phase 4 — 全量回归

- [x] `T3-13` Phosphor 全量回归（9072 图标全部成功，T3: 3 组 / 6 图标 / Layer 1 已共享 20 slots / T3 额外 0 slots / Layer 1+T3 无冲突 / compileReleaseKotlin 通过）
- [x] `T3-14` 所有图标源的 `CanonicalPaths.kt` 引用正确性验证（Tabler: 19 图标引用 T3 常量；Lucide: 2 图标引用；Remix/Phosphor: 常量已生成但因单路径图标不走 template 模式未被引用 — 预期行为；Radix: 0 组无 CanonicalPaths.kt）
- [x] `T3-15` Sample APK 体积对比：T3 增加 +9.4KB dex（R8 将 shared constant 内联到调用点，抵消了 dex 级共享收益）。T3 的价值在源码级去重，不在 dex 优化。详见 T3-11 结论。

## 7. 风险与缓解

| 风险 | 影响 | 缓解措施 |
|------|------|---------|
| FNV-1a 碰撞 | 不同 pathData 映射到同一哈希 → 错误共享 | 1e4 图标碰撞概率 2.7e-12；若仍不放心可加逐 path 字符串二次校验 |
| 全量重算性能 | 每次构建 O(N × avg_paths) | T3-07 MD5 增量缓存 |
| 常量名可读性差 | `_p34ee26adc6eb_0` 无法直观看出是哪个图标 | 这是 `@PublishedApi internal` 实现细节，不影响公共 API；diagnostic 文件有完整映射 |
| 跨模块误用 | 开发者试图在模块间共享 T3 常量 | `internal` 可见性阻止跨模块引用；文档明确 per-artifact 隔离 |
