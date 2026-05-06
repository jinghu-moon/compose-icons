# svg2compose 验证层级

本文档描述了 svg2compose 的四个验证层级，确保硬编码的 Kotlin 代码生成模板正确无误。

## 验证层级概览

| 层级 | 类型 | 频率 | 成本 | 覆盖内容 |
|------|------|------|------|----------|
| 1 | 单元测试 | 每次提交 | 低 | 代码逻辑正确性 |
| 2 | 快照测试 | 每次提交 | 低 | 输出格式一致性 |
| 3 | 语法验证 | 每次提交 | 中 | 生成代码的基本正确性 |
| 4 | 渲染验证 | 每周/发布前 | 高 | 视觉正确性 |

## 层级 1: 单元测试

**目的**: 验证 Rust 代码的逻辑正确性

**运行命令**:
```bash
cd tools/svg2compose
cargo test --lib
```

**测试内容**:
- JSON 协议序列化/反序列化
- SVG 转换逻辑 (converter.rs)
- Kotlin 代码生成逻辑 (codegen.rs)
- 边界情况处理

**示例测试**:
```rust
#[test]
fn test_generate_path_node() {
    let doc = SvgDocument { /* ... */ };
    let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");
    assert!(kt.contains("package composeicons.test.regular"));
    assert!(kt.contains("addPath("));
}
```

## 层级 2: 快照测试

**目的**: 确保生成的 Kotlin 代码与预期完全一致

**运行命令**:
```bash
cd tools/svg2compose
cargo test --test snapshot_test
```

**测试内容**:
- 完整 .kt 文件输出对比
- 包声明、导入语句、属性定义
- addPath/group 调用格式
- 颜色、坐标格式

**快照文件位置**:
```
tests/snapshots/
├── SinglePath.kt
├── GroupWithClip.kt
├── PathWithTransform.kt
└── MaskPanel.kt
```

**更新快照**:
```bash
# 生成新的快照
./target/release/svg2compose --manifest tests/test-manifest.json --output-dir tests/snapshots

# 或者手动编辑快照文件
```

## 层级 3: 语法验证

**目的**: 验证生成的 Kotlin 代码具有正确的基本结构

**运行命令**:
```bash
bash tests/verify_kotlin_syntax.sh [output_dir]
```

**验证内容**:
- ✓ 包声明存在
- ✓ 导入语句存在
- ✓ ImageVector 属性存在
- ✓ addPath 调用存在
- ✓ parseSvgPathData 调用存在
- ✓ 私有缓存变量存在
- ✓ 大括号平衡
- ✓ 颜色格式正确

**示例输出**:
```
=== Kotlin Syntax Verification ===
Found 4 Kotlin files

  ✓ regular/SinglePath.kt
  ✓ regular/GroupWithClip.kt
  ✓ regular/PathWithTransform.kt
  ✓ regular/MaskPanel.kt

=== Verification Complete ===
All checks passed!
```

## 层级 4: 渲染验证

**目的**: 验证生成的图标能正确渲染

**运行命令**:
```bash
# 录制基线截图
./gradlew :sample:recordRoborazziDebug

# 验证截图一致性
./gradlew :sample:verifyRoborazziDebug
```

**测试内容**:
- 图标视觉正确性
- 像素级回归测试
- 跨平台渲染一致性

**截图位置**:
```
sample/src/test/snapshots/
├── tabler_outline_ab.png
├── lucide_outline_activity.png
└── ...
```

## 完整验证流程

### 开发阶段

```bash
# 1. 运行单元测试
cargo test --lib

# 2. 运行快照测试
cargo test --test snapshot_test

# 3. 生成测试文件并验证语法
cargo build --release
./target/release/svg2compose --manifest tests/test-manifest.json --output-dir test-icons
bash tests/verify_kotlin_syntax.sh test-icons
```

### CI 阶段

GitHub Actions 会自动运行所有验证层级：

```yaml
# .github/workflows/verify-codegen.yml
- name: Layer 1 - Rust Unit Tests
  run: cargo test --lib

- name: Layer 2 - Snapshot Tests
  run: cargo test --test snapshot_test

- name: Layer 3 - Kotlin Syntax Verification
  run: bash tests/verify_kotlin_syntax.sh test-icons
```

### 发布前

```bash
# 运行完整验证套件
bash tests/run_all_verifications.sh
```

## 添加新测试

### 添加新的快照测试

1. 创建新的 SVG 测试夹具:
```bash
# tests/fixtures/new_icon.svg
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
  <path d="M 12 2 L 22 22 L 2 22 Z" fill="#000000"/>
</svg>
```

2. 生成快照:
```bash
./target/release/svg2compose --input tests/fixtures/new_icon.svg > tests/snapshots/NewIcon.kt
```

3. 添加测试:
```rust
// tests/snapshot_test.rs
#[test]
fn test_new_icon_snapshot() {
    generate_and_compare("new_icon.svg", "NewIcon", "NewIcon.kt");
}
```

### 添加新的语法验证规则

编辑 `tests/verify_kotlin_syntax.sh`:

```bash
# Check 10: New validation rule
if ! grep -q "newPattern" "$file"; then
    echo "ERROR: Missing newPattern in $rel_path"
    ERRORS=$((ERRORS + 1))
fi
```

## 故障排除

### 快照测试失败

```bash
# 查看差异
diff tests/snapshots/SinglePath.kt test-icons/regular/SinglePath.kt

# 更新快照
cp test-icons/regular/SinglePath.kt tests/snapshots/SinglePath.kt
```

### 语法验证失败

```bash
# 运行详细验证
bash tests/verify_kotlin_syntax.sh test-icons 2>&1 | grep ERROR

# 检查生成的文件
cat test-icons/regular/SinglePath.kt
```

### 渲染验证失败

```bash
# 查看失败的截图
ls -la sample/src/test/snapshots/

# 重新录制基线
./gradlew :sample:recordRoborazziDebug
```

## 最佳实践

1. **每次修改 codegen.rs 都运行快照测试**
2. **快照文件应该提交到 Git**
3. **CI 应该运行层级 1-3**
4. **发布前运行完整验证套件**
5. **渲染验证失败时检查 SVG 转换逻辑**

## 相关文件

- `codegen.rs` - Kotlin 代码生成逻辑
- `converter.rs` - SVG 转换逻辑
- `tests/snapshot_test.rs` - 快照测试
- `tests/verify_kotlin_syntax.sh` - 语法验证脚本
- `tests/run_all_verifications.sh` - 完整验证套件
- `.github/workflows/verify-codegen.yml` - CI 配置
