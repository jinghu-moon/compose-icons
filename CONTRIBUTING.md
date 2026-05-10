# Contributing to compose-icons

欢迎参与！本项目目标是为 **Jetpack Compose (Android)** 提供高性能、R8 友好的图标库。

## 核心约束

在提交 PR 前，请先阅读：

- [docs/architecture.md](./docs/architecture.md) — 架构白皮书与设计红线
- [README.md](./README.md) — 使用方视角的定位与适用场景

**不可妥协的约束**（PR 会因此被拒）：

1. **零运行时开销**：不引入反射、全局注册表、SVG 解析逻辑
2. **R8 完美裁剪**：不提供"所有图标集合"的运行时集合（见 README ⚠️ 重要约束）
3. **图标库无关**：`generator-core` 不含任何特定图标源的判断逻辑
4. **仅 Android**：不做 Compose Multiplatform / Desktop / iOS

## 开发环境清理

本 repo 的 `.gitignore` 已排除所有构建产物、工具二进制、上游 SVG 副本等"本地残留"。它们不在版本控制内，但在你的工作副本中可能占据数百 MB 磁盘。

### 常见残留目录

| 目录/文件 | 来源 | 是否可安全删除 |
|---|---|---|
| `refer1/` | 迁移前的 SVG 参考副本（可达 370+ MB） | ✅ 随时可删 |
| `refer/` | 更早期的 SVG 参考（不一定存在） | ✅ 随时可删 |
| `upstream/` | Gradle `DownloadIconSourceTask` 的 git clone 目录 | ⚠️ 删除后重新跑 `generateIcons` 会触发重新 clone，耗时 |
| `tools/svg2compose.exe`（顶层） | 旧版二进制位置 | ✅ 删除；新版在 `tools/bin/svg2compose.exe` |
| `tools/usvg.exe`（顶层） | Phase 早期的独立 usvg 二进制 | ✅ 已合并进 svg2compose |
| `tools/bin/svg2compose(.exe)` | 当前有效的二进制 | ⚠️ 删除后需要重新 `cargo build --release` |
| `icons-remixicons/`、`icons-radixicons/` | 模块改名前残留（改名为 `icons-remix`/`icons-radix`） | ✅ 随时可删 |
| `icons-*/src/generated/` | svg2compose 生成的 Kotlin 文件 | ✅ 下次 `generateIcons` 会重建 |
| `icons-*/src/commonMain/` | 早期 KMP 布局的残留（现在用 `src/main/`） | ✅ 随时可删 |
| `build/`、`*/build/`、`bin/`、`*/bin/` | Gradle / IntelliJ 构建输出 | ✅ `./gradlew clean` |
| `.gradle/`、`.kotlin/` | Gradle / Kotlin compiler 缓存 | ✅ 清除后首次构建会较慢 |
| `web-preview/node_modules/`、`web-preview/dist/` | npm / Vite 产物 | ✅ 随时可删 |
| `.claude/`、`.serena/`、`.spec-workflow/` | 各类 MCP / agent 工具的本地配置 | ✅ 不影响构建 |
| `local.properties` | **你本地的** Android SDK 路径 | ❌ 保留（首次打开 Android Studio 会重建） |

### 一次性磁盘清理

先 dry-run 看清单，确认没有误伤再真删：

```bash
# 仅预览，不删除
git clean -fdX -n

# 排除建议保留的路径后真实清理
git clean -fdX \
  -e tools/bin \
  -e upstream \
  -e local.properties

# 进一步只清缓存、保留生成产物（温和模式）
./gradlew clean
```

`-X` 只删 `.gitignore` 列出的忽略文件，不会碰未跟踪的新代码。`-e <path>` 白名单保护路径。

### 完全重建工具链

```bash
# 1. 重建 Rust CLI
cd tools/svg2compose && cargo build --release
cp target/release/svg2compose(.exe) ../bin/

# 2. 重新下载所有上游 SVG 源
./gradlew :generator:tabler:generateIcons \
          :generator:lucide:generateIcons \
          ...

# 3. 构建 Android 库
./gradlew assembleDebug
```

## 新增图标源流程

详见 [docs/07_new_icon_library_integration_plan.md](./docs/07_new_icon_library_integration_plan.md)。简化路径：

1. 新建 `generator/<name>/` 模块（抄 `generator/iconoir/` 最简）
2. 新建 `icons-<name>/` 模块（抄 `icons-iconoir/`）
3. 在 `settings.gradle.kts`、`compose-icons-bom/build.gradle.kts`、`sample/build.gradle.kts` 登记
4. `./gradlew :generator:<name>:generateIcons` 验证
5. 跑 `./gradlew :sample:assembleDebug` 验证产物编译通过

## 测试要求

PR 必须通过：

```bash
./gradlew check                                              # 所有单元测试
./gradlew :sample:verifyRoborazziDebug                       # 视觉回归（如涉及 svg2compose 或 generator-core 改动）
cd tools/svg2compose && cargo test                           # Rust 侧测试（如涉及 svg2compose 改动）
./gradlew :tools:svg2compose:tests:verify_kotlin_syntax.sh   # 生成代码语法校验（本地可跑）
```

CI 会跑 `verify-codegen.yml` 的 4 层管线（Rust unit / snapshot / Kotlin syntax / rendering）。

## Commit 风格

- 清楚一句话标题，50 字以内
- 正文说明"为什么"而非"做了什么"（diff 自己会说做了什么）
- 影响范围涉及公共 API 时，更新 `CHANGELOG.md`

## 问题、讨论

- Bug / 功能请求：GitHub Issues
- 架构讨论：在 PR description 里标注 `[architecture]`，邀请 review
