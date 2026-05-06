# SVG 路径压缩模块设计文档

## 1. 背景与动机

### 1.1 问题

usvg 将所有 SVG 路径归一化为绝对坐标 + 5 种命令（`M`/`L`/`Q`/`C`/`Z`），并以 `{:.3}` 精度输出。这导致路径字符串存在大量冗余：

```
原始 SVG:   M12 8v4
usvg 输出:  M 12.000 8.000 L 12.000 12.000
```

**影响链路：**
- JSON 中间协议体积膨胀（web 预览、explorer 数据）
- Kotlin 源码体积膨胀（`parseSvgPathData("M 12.000 8.000 L 12.000 12.000")`）
- Web 预览可读性差

### 1.2 目标

在 svg2compose 流水线中增加路径压缩环节，将 usvg 输出的冗余路径字符串压缩为最紧凑的 SVG 路径表示。

**预期压缩效果（基于 Tabler Icons 采样）：**

| 指标 | 压缩前 | 压缩后 | 降幅 |
|------|--------|--------|------|
| 平均路径长度 | ~80 字符 | ~30 字符 | ~60% |
| JSON 总体积 | ~15 MB | ~8 MB | ~45% |
| Kotlin 源码行均字符 | 120 | 60 | ~50% |

### 1.3 非目标

- 不修改 `tiny_skia_path::Path` 内部数据结构
- 不处理 usvg 不输出的命令类型（`A`/`S`/`T`/`H`/`V`、相对命令）
- 不做几何级优化（曲线合并、弧线近似等，这些由 usvg 上游完成）
- 不引入外部依赖（oxvg_path、svag 等）

### 1.4 参考实现

本模块参考 [oxvg_path](https://github.com/noahbald/oxvg)（SVGO 的 Rust 移植）的 4 阶段流水线架构，但大幅简化——只处理 usvg 输出的 5 种命令子集。

---

## 2. 架构设计

### 2.1 在 svg2compose 流水线中的位置

```
原始 SVG 文件
    │
    ▼
usvg::Tree::from_str()          ← 解析 + 归一化（A→C, S→C, H→L, V→L, 相对→绝对）
    │
    ▼
path_data_to_string()            ← 现有：遍历 tiny_skia_path，输出 "M 12.000 8.000 L ..."
    │
    ▼
compact_path()                   ← 新增：路径压缩
    │
    ▼
PathNode.d                       ← 存入协议结构，供 JSON 输出和 Kotlin codegen 使用
```

### 2.2 模块结构

```
tools/svg2compose/src/
├── main.rs
├── converter.rs          ← 修改：调用 compact_path
├── protocol.rs
├── codegen.rs
├── manifest.rs
└── compact.rs            ← 新增模块
    ├── pub fn compact_path(d: &str) -> String
    ├── fn parse_commands(d: &str) -> Vec<RawCommand>
    ├── fn to_relative(cmds: &[RawCommand]) -> Vec<OptCommand>
    ├── fn apply_hv_shorthand(cmds: &mut Vec<OptCommand>)
    ├── fn format_path(cmds: &[OptCommand]) -> String
    ├── fn format_number(v: f64) -> String
    ├── fn needs_space(prev: &str, curr: &str) -> bool
    └── mod tests
```

### 2.3 核心类型

```rust
/// 解析后的原始命令（保持 usvg 输出的绝对坐标）
enum RawCommand {
    M { x: f64, y: f64 },
    L { x: f64, y: f64 },
    Q { x1: f64, y1: f64, x: f64, y: f64 },
    C { x1: f64, y1: f64, x2: f64, y2: f64, x: f64, y: f64 },
    Z,
}

/// 优化后的命令（可能是绝对或相对，可能是简写）
enum OptCommand {
    M { x: f64, y: f64 },           // 首命令，始终绝对
    L { x: f64, y: f64 },           // 绝对 LineTo
    l { dx: f64, dy: f64 },         // 相对 LineTo
    h { dx: f64 },                  // 水平简写
    v { dy: f64 },                  // 垂直简写
    Q { x1: f64, y1: f64, x: f64, y: f64 },
    q { dx1: f64, dy1: f64, dx: f64, dy: f64 },
    C { x1: f64, y1: f64, x2: f64, y2: f64, x: f64, y: f64 },
    c { dx1: f64, dy1: f64, dx2: f64, dy2: f64, dx: f64, dy: f64 },
    Z,
}

/// 路径游标，用于绝对→相对转换
struct Cursor {
    x: f64,
    y: f64,
}
```

### 2.4 4 阶段流水线

```rust
pub fn compact_path(d: &str) -> String {
    let raw = parse_commands(d);         // 阶段 0：解析
    let mut opt = to_relative(&raw);     // 阶段 1：绝对→相对
    apply_hv_shorthand(&mut opt);        // 阶段 2：H/V 简写
    let mixed = pick_shortest(&opt);     // 阶段 3：逐命令选最短表示
    format_path(&mixed)                  // 阶段 4：序列化（数字压缩 + 空格省略 + 命令省略）
}
```

---

## 3. 各阶段详细设计

### 3.0 阶段 0：解析（parse_commands）

将 `path_data_to_string` 输出的格式化字符串解析为 `RawCommand` 列表。

**输入格式固定：** usvg 输出总是 `M x y L x y Q x1 y1 x y C x1 y1 x2 y2 x y Z`，命令间用空格分隔，坐标保留 3 位小数。

```rust
fn parse_commands(d: &str) -> Vec<RawCommand> {
    let mut cmds = Vec::new();
    let tokens: Vec<&str> = d.split_whitespace().collect();
    let mut i = 0;
    while i < tokens.len() {
        match tokens[i] {
            "M" => { cmds.push(RawCommand::M { x: parse_f64(tokens[i+1]), y: parse_f64(tokens[i+2]) }); i += 3; }
            "L" => { cmds.push(RawCommand::L { x: parse_f64(tokens[i+1]), y: parse_f64(tokens[i+2]) }); i += 3; }
            "Q" => { /* 4 坐标 */ i += 5; }
            "C" => { /* 6 坐标 */ i += 7; }
            "Z" => { cmds.push(RawCommand::Z); i += 1; }
            _ => { /* 容错：跳过未知 token */ i += 1; }
        }
    }
    cmds
}
```

**复杂度：** ~30 行。

### 3.1 阶段 1：绝对→相对（to_relative）

维护 `Cursor`，将 `L`/`Q`/`C` 的绝对坐标转换为相对偏移。`M` 保持绝对（SVG 规范要求首命令为绝对 `M`）。

```rust
fn to_relative(cmds: &[RawCommand]) -> Vec<OptCommand> {
    let mut cursor = Cursor { x: 0.0, y: 0.0 };
    let mut result = Vec::new();
    for cmd in cmds {
        match cmd {
            RawCommand::M { x, y } => {
                result.push(OptCommand::M { x: *x, y: *y });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::L { x, y } => {
                result.push(OptCommand::l { dx: x - cursor.x, dy: y - cursor.y });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::Q { x1, y1, x, y } => {
                result.push(OptCommand::q {
                    dx1: x1 - cursor.x, dy1: y1 - cursor.y,
                    dx: x - cursor.x, dy: y - cursor.y,
                });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::C { x1, y1, x2, y2, x, y } => {
                result.push(OptCommand::c {
                    dx1: x1 - cursor.x, dy1: y1 - cursor.y,
                    dx2: x2 - cursor.x, dy2: y2 - cursor.y,
                    dx: x - cursor.x, dy: y - cursor.y,
                });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::Z => {
                result.push(OptCommand::Z);
                // 注意：Z 不重置 cursor（usvg 不输出多子路径）
            }
        }
    }
    result
}
```

**复杂度：** ~40 行。

### 3.2 阶段 2：H/V 简写（apply_hv_shorthand）

将 `l dx 0` 替换为 `h dx`，将 `l 0 dy` 替换为 `v dy`。

```rust
fn apply_hv_shorthand(cmds: &mut Vec<OptCommand>) {
    for cmd in cmds.iter_mut() {
        if let OptCommand::l { dx, dy } = cmd {
            if dy.abs() < f64::EPSILON {
                *cmd = OptCommand::h { dx: *dx };
            } else if dx.abs() < f64::EPSILON {
                *cmd = OptCommand::v { dy: *dy };
            }
        }
    }
}
```

**复杂度：** ~15 行。

### 3.3 阶段 3：逐命令选最短表示（pick_shortest）

对每个 `l`/`q`/`c` 命令，比较绝对和相对两种表示的字符串长度，取短的。参考 oxvg_path 的 `convert::mixed`。

```rust
fn pick_shortest(cmds: &[OptCommand]) -> Vec<OptCommand> {
    let mut cursor = Cursor { x: 0.0, y: 0.0 };
    let mut result = Vec::new();
    for cmd in cmds {
        match cmd {
            OptCommand::M { x, y } => {
                result.push(OptCommand::M { x: *x, y: *y });
                cursor = Cursor { x: *x, y: *y };
            }
            OptCommand::l { dx, dy } => {
                let abs_str = format!("L {} {}", cursor.x + dx, cursor.y + dy);
                let rel_str = format!("l {} {}", dx, dy);
                if abs_str.len() <= rel_str.len() {
                    result.push(OptCommand::L { x: cursor.x + dx, y: cursor.y + dy });
                } else {
                    result.push(OptCommand::l { dx: *dx, dy: *dy });
                }
                cursor.x += dx;
                cursor.y += dy;
            }
            // h/v 直接保留（已经是最短的单坐标命令）
            OptCommand::h { dx } => { result.push(OptCommand::h { dx: *dx }); cursor.x += dx; }
            OptCommand::v { dy } => { result.push(OptCommand::v { dy: *dy }); cursor.y += dy; }
            // Q/q, C/c 同理比较
            OptCommand::Z => { result.push(OptCommand::Z); }
            _ => { result.push(cmd.clone()); }
        }
    }
    result
}
```

**复杂度：** ~50 行。注意：这里的 `format!` 只用于长度比较，最终序列化在阶段 4 完成。可用数字位数估算替代 `format!` 以提升性能。

### 3.4 阶段 4：序列化（format_path）

最终输出，包含 3 个子逻辑：数字压缩、命令字母省略、空格省略。

#### 3.4.1 数字格式化

```rust
fn format_number(v: f64) -> String {
    if v.abs() < f64::EPSILON {
        return "0".to_string();
    }
    if v.fract().abs() < 1e-9 {
        // 整数
        return format!("{}", v as i64);
    }
    // 保留必要小数位，去尾零
    let s = format!("{:.3}", v);
    let s = s.trim_end_matches('0').trim_end_matches('.');
    // 去前导零：0.5 → .5，-0.5 → -.5
    if s.starts_with("0.") {
        return s[1..].to_string();  // ".5"
    }
    if s.starts_with("-0.") {
        return format!("-{}", &s[2..]);  // "-.5"
    }
    s.to_string()
}
```

#### 3.4.2 空格省略

```rust
fn needs_space(prev_end: char, curr_start: char) -> bool {
    // 两个数字字符之间需要空格
    if prev_end.is_ascii_digit() && curr_start.is_ascii_digit() {
        return true;
    }
    // 前一个以数字结尾，后一个以 '.' 开头（如 "5.3" 会被误读）
    if prev_end.is_ascii_digit() && curr_start == '.' {
        return true;
    }
    // 其他情况（负号 '-'、小数点 '.'）可当隐式分隔符
    false
}
```

#### 3.4.3 命令字母省略

```rust
fn format_path(cmds: &[OptCommand]) -> String {
    let mut out = String::new();
    let mut prev_cmd: Option<char> = None;

    for cmd in cmds {
        let (letter, args) = match cmd {
            OptCommand::M { x, y } => (Some('M'), vec![*x, *y]),
            OptCommand::L { x, y } => {
                // M 后的 L 可省略
                if prev_cmd == Some('M') { (None, vec![*x, *y]) }
                else { (Some('L'), vec![*x, *y]) }
            }
            OptCommand::l { dx, dy } => (Some('l'), vec![*dx, *dy]),
            OptCommand::h { dx } => (Some('h'), vec![*dx]),
            OptCommand::v { dy } => (Some('v'), vec![*dy]),
            // Q/q, C/c 同理
            OptCommand::Z => (Some('Z'), vec![]),
        };

        // 命令字母省略：同类型连续时省略
        let need_letter = match letter {
            Some(c) => {
                if let Some(prev) = prev_cmd {
                    // M 后的 L 省略已在上面处理
                    // 同类型命令省略：l l → l, c c → c
                    c != prev
                } else {
                    true
                }
            }
            None => false,  // 已在上面标记为省略
        };

        if need_letter {
            if let Some(c) = letter {
                if !out.is_empty() && needs_space(out.chars().last().unwrap(), c) {
                    out.push(' ');
                }
                out.push(c);
                prev_cmd = Some(c);
            }
        }

        // 输出坐标
        for (i, &v) in args.iter().enumerate() {
            let s = format_number(v);
            if i > 0 || need_letter {
                let prev_end = out.chars().last().unwrap_or(' ');
                if needs_space(prev_end, s.chars().next().unwrap()) {
                    out.push(' ');
                }
            }
            out.push_str(&s);
        }
    }
    out
}
```

**阶段 4 总复杂度：** ~80 行。

---

## 4. 集成方案

### 4.1 converter.rs 改动

仅需在两个函数中各加一行调用：

```rust
// convert_path
fn convert_path(path: &usvg::Path) -> Option<PathNode> {
    // ...
    let d = path_data_to_string(path.data(), abs_transform);
    let d = compact_path(&d);  // ← 新增
    // ...
}

// convert_path_with_opacity
fn convert_path_with_opacity(path: &usvg::Path, group_opacity: f64) -> Option<PathNode> {
    // ...
    let d = path_data_to_string(path.data(), abs_transform);
    let d = compact_path(&d);  // ← 新增
    // ...
}
```

### 4.2 全链路生效

压缩后的 `PathNode.d` 自动流入：

| 下游消费者 | 改动 | 效果 |
|-----------|------|------|
| JSON 输出（web 预览） | 无 | `d` 字段已是压缩格式 |
| Kotlin codegen | 无 | `parseSvgPathData("M12 8v4")` |
| Manifest result JSON | 无 | 路径数据自动压缩 |

### 4.3 不需要改动的文件

- `protocol.rs` — `PathNode.d` 仍是 `String`，类型不变
- `codegen.rs` — 仍用 `path.d`，格式已压缩
- `manifest.rs` — 无变化
- `main.rs` — 无变化
- Kotlin 端所有代码 — 无变化

---

## 5. 测试策略

### 5.1 测试分层

```
┌─────────────────────────────────────────────┐
│  第 5 层：端到端回归                           │
│  真实图标路径 → compact_path → usvg 重解析对比  │
├─────────────────────────────────────────────┤
│  第 4 层：集成测试                             │
│  convert_tree → JSON → 验证 d 字段压缩        │
├─────────────────────────────────────────────┤
│  第 3 层：流水线测试                           │
│  完整字符串输入 → compact_path → 期望输出       │
├─────────────────────────────────────────────┤
│  第 2 层：阶段测试                             │
│  to_relative / apply_hv / pick_shortest      │
├─────────────────────────────────────────────┤
│  第 1 层：单元测试                             │
│  format_number / needs_space / parse_commands │
└─────────────────────────────────────────────┘
```

### 5.2 测试用例清单

#### 第 1 层：单元测试

**format_number:**

| 输入 | 期望输出 | 说明 |
|------|----------|------|
| `12.0` | `"12"` | 整数检测 |
| `0.5` | `".5"` | 去前导零 |
| `-0.5` | `"-.5"` | 负数去前导零 |
| `12.340` | `"12.34"` | 去尾零 |
| `0.0` | `"0"` | 零值 |
| `100.0` | `"100"` | 多位整数 |
| `0.010` | `".01"` | 保留有效小数 |
| `12.000` | `"12"` | usvg 标准输出 |

**needs_space:**

| prev_end | curr_start | 期望 | 说明 |
|----------|------------|------|------|
| `'2'` | `'8'` | `true` | 两正整数 |
| `'2'` | `'-'` | `false` | 负号当分隔符 |
| `'.5'` | `'.3'` | `false` | 小数点当分隔符 |
| `'2'` | `'.'` | `true` | 数字后跟小数点 |
| `'0'` | `'5'` | `true` | 零后跟正数 |

**parse_commands:**

| 输入 | 期望 | 说明 |
|------|------|------|
| `"M 12.000 8.000"` | `[M(12,8)]` | 单个 M |
| `"M 0.000 0.000 L 1.000 2.000"` | `[M(0,0), L(1,2)]` | M + L |
| `"M 0 0 Z"` | `[M(0,0), Z]` | 闭合路径 |

#### 第 2 层：阶段测试

**to_relative:**

| 输入 | 期望输出 | 说明 |
|------|----------|------|
| `M(12,8), L(12,12)` | `M(12,8), l(0,4)` | 纯垂直 |
| `M(0,0), L(3,4)` | `M(0,0), l(3,4)` | 斜线 |
| `M(10,20), L(25,30)` | `M(10,20), l(15,10)` | 相对偏移 |

**apply_hv_shorthand:**

| 输入 | 期望输出 | 说明 |
|------|----------|------|
| `l(0, 4)` | `v(4)` | 纯垂直 |
| `h(10, 0)` | `h(10)` | 纯水平 |
| `l(3, 4)` | `l(3, 4)` | 斜线不变 |

#### 第 3 层：流水线测试（compact_path 端到端）

| 输入 | 期望输出 | 验证点 |
|------|----------|--------|
| `"M 12.000 8.000 L 12.000 12.000"` | `"M12 8v4"` | H/V + 数字压缩 + 命令省略 |
| `"M 12.000 16.000 L 12.010 16.000"` | `"M12 16h.01"` | H/V + 去前导零 |
| `"M 3.000 3.000 L 21.000 21.000"` | `"M3 3 21 21"` | M 后 L 省略 |
| `"M 0.000 0.000 Q 10.000 20.000 30.000 40.000"` | `"M0 0q10 20 30 40"` | Q 相对转换 |
| `"M 0.000 0.000 C 1.000 2.000 3.000 4.000 5.000 6.000"` | `"M0 0c1 2 3 4 5 6"` | C 相对转换 |
| `"M 12.000 2.000 L 22.000 12.000 L 12.000 22.000 L 2.000 12.000 Z"` | `"M12 2 22 12 12 22 2 12Z"` | 多段 L + Z |
| `"M 5.000 5.000 L 5.000 5.000"` | `"M5 5h0"` | 零长度线段 |

#### 第 4 层：集成测试

从 `convert_tree` 到 JSON 输出，验证 `PathNode.d` 字段已是压缩格式。

#### 第 5 层：端到端回归

随机取 Tabler Icons 10 个图标，执行：
1. 原始 SVG → usvg → `path_data_to_string` → `compact_path` → 压缩路径
2. 压缩路径 → usvg 重解析 → 渲染对比
3. 验证视觉一致性（路径等价）

---

## 6. TDD 开发任务清单

### 阶段 A：基础设施

| # | 任务 | 测试先行 | 代码实现 | 验收标准 |
|---|------|----------|----------|----------|
| A1 | 创建 `compact.rs` 模块骨架 | 编译通过的空模块 | `pub fn compact_path(d: &str) -> String { d.to_string() }` | `cargo test` 通过 |
| A2 | `format_number` 单元测试 | 编写 8 个测试用例（见 5.2） | 实现 `format_number` | 全部通过 |

### 阶段 B：解析与基础转换

| # | 任务 | 测试先行 | 代码实现 | 验收标准 |
|---|------|----------|----------|----------|
| B1 | `parse_commands` 单元测试 | 编写 3 个测试用例 | 实现 `parse_commands` | 全部通过 |
| B2 | `to_relative` 阶段测试 | 编写 3 个测试用例 | 实现 `to_relative` + `Cursor` | 全部通过 |
| B3 | `needs_space` 单元测试 | 编写 5 个测试用例 | 实现 `needs_space` | 全部通过 |

### 阶段 C：核心优化

| # | 任务 | 测试先行 | 代码实现 | 验收标准 |
|---|------|----------|----------|----------|
| C1 | `apply_hv_shorthand` 测试 | 编写 3 个测试用例 | 实现 `apply_hv_shorthand` | 全部通过 |
| C2 | `format_path` 测试（命令省略） | 编写隐式命令测试 | 实现命令字母省略逻辑 | 全部通过 |
| C3 | `format_path` 测试（空格省略） | 编写空格省略测试 | 实现空格省略逻辑 | 全部通过 |

### 阶段 D：端到端流水线

| # | 任务 | 测试先行 | 代码实现 | 验收标准 |
|---|------|----------|----------|----------|
| D1 | `compact_path` 端到端测试 | 编写 7 个测试用例（见 5.2 第 3 层） | 串联 4 阶段流水线 | 全部通过 |
| D2 | `pick_shortest` 测试 | 编写绝对更短的用例 | 实现 `pick_shortest` | 全部通过 |

### 阶段 E：集成与回归

| # | 任务 | 测试先行 | 代码实现 | 验收标准 |
|---|------|----------|----------|----------|
| E1 | 集成测试 | 编写 converter 集成测试 | 在 `converter.rs` 中调用 `compact_path` | `d` 字段已压缩 |
| E2 | 端到端回归 | 取 10 个 Tabler 图标路径 | 无额外代码 | usvg 重解析等价 |
| E3 | 性能基准 | 编写 bench 测试 | 无额外代码 | 单路径 < 1μs |

### 开发顺序

```
A1 → A2 → B1 → B2 → B3 → C1 → C2 → C3 → D1 → D2 → E1 → E2 → E3
 └──── 纯函数，无外部依赖，可独立开发和测试 ────┘
```

所有任务在 `tools/svg2compose/` 项目内完成，不涉及其他模块改动（E1 除外，仅加两行调用）。

---

## 7. 风险与缓解

| 风险 | 概率 | 影响 | 缓解措施 |
|------|------|------|----------|
| 压缩后路径被 Compose 运行时拒绝 | 低 | 高 | E2 回归测试覆盖；`parseSvgPathData` 接受任意合法 SVG 路径 |
| 浮点精度丢失导致渲染差异 | 低 | 中 | 使用 `f64` 全程计算，仅最终格式化时截断；E2 视觉回归 |
| `pick_shortest` 中 `format!` 性能开销 | 低 | 低 | 每图标仅 1-5 条路径，E3 基准验证 |
| 边界情况：空路径、单命令路径 | 中 | 低 | A-D 阶段测试覆盖 |
