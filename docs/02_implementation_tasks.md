# compose-icons 实施任务

## 1. 使用说明

状态约定：

- `[ ]` 未开始
- `[-]` 进行中
- `[x]` 已完成

执行顺序以本文档为准。设计变更先更新 `01_design_specification.md` / `architecture.md`，再回写任务状态。

## 2. v1 交付目标

`v1` 交付物：

1. usvg 集成的 SVG → `ImageVector` 生成器
2. `icons-core`
3. `icons-tabler`（outline + filled 单 artifact）
4. `icons-lucide`（outline）
5. Paparazzi 采样截图基线
6. 真实 sample app（最小 demo + R8 体积基准）
7. README + Architecture 文档
8. `Maven Central` 发布流程

`v1` **不交付**：catalog 模块、多色保真、Phosphor、Heroicons。详见 [01_design_specification.md §2.4 永久不做](./01_design_specification.md#24-永久不做红线)。

## 3. Phase 1 - 项目骨架

- [x] `1.1` 创建并接通基础模块：`generator/core`、`generator/tabler`、`icons-core`、`icons-tabler`、`sample`
- [x] `1.2` 配置根工程、版本目录、Compose BOM、Android/Kotlin 插件
- [x] `1.3` 建立 `svg-cache/`、`tools/usvg/` 忽略规则
- [x] `1.4` 为运行时模块接通 `maven-publish`
- [-] `1.5` 为样例工程接通最小可运行页面（**已回退**：当前仅占位文本，未引用任何图标，详见 Phase 9）

验收标准：

- 根工程可同步 ✅
- 空实现下 `assemble` 可以通过 ✅
- 模块边界与文档一致 ✅

## 4. Phase 2 - 生成器核心（v1 重构前的状态）

> ⚠️ **重要**：本 Phase 旧实现（自实现 DOM 解析）已在 [Phase 8](#10-phase-8---usvg-集成与-generator-重构) 中被 usvg 接入替代。本节标记保留旧任务历史，新任务归入 Phase 8。

### 4.1 本地工具接入（重新定位）

- [-] `2.1` ~~接入本地 `resvg.exe`，作为 SVG 渲染校验工具~~ **重新定位**：v1 改为接入 `tools/usvg(.exe)` 做拍平。`resvg.exe` 仅用于人工对比。详见 Phase 8.1。
- [x] `2.2` 定义工具路径解析（`ResvgLocator`），优先使用 `refer/resvg.exe`（**已被 `UsvgLocator` 替代**）
- [x] `2.3` 为 Windows、macOS、Linux 预留工具定位接口

### 4.2 输出校验

- [x] `2.4` 实现 `SvgValidator`
- [x] `2.5` 检测残留 `clipPath`、`mask`、`filter`、`pattern`、`image`、`text`
- [x] `2.6` 定义默认 `fail-closed` 行为
- [x] `2.7` ~~`<g>`/`<use>` 拒绝~~ **已在 Phase 8.19 放宽**（usvg 已处理）

### 4.3 元数据解析

- [x] `2.8` 实现完整 `viewBox(minX, minY, width, height)` 解析
- [x] `2.9` 实现坐标归一化
- [x] `2.10` 实现 `fillRule` 到 `PathFillType` 映射
- [x] `2.11` 实现 path 级样式合并逻辑（**字段升级在 Phase 8.15 完成；接口/函数重命名暂缓**）

### 4.4 Path 解析与输出

- [x] `2.12` 先支持 Tabler 当前实际使用的 path 子集：`MoveTo`、`LineTo`、`QuadTo`、`CurveTo`、`ClosePath`（**Phase 8.10 已简化为仅 5 种绝对命令**）
- [x] `2.13` 实现 Kotlin 输出模板
- [x] `2.14` 抽离共享 helper，避免生成文件重复样板逻辑

### 4.5 命名与报告

- [x] `2.15` 实现命名规则转换
- [x] `2.16` 实现命名冲突检测与报告
- [x] `2.17` 实现 `GeneratorReport`
- [x] `2.18` 将失败与警告输出到 `generation-report.txt`

## 5. Phase 3 - Tabler 图标源接入

### 5.1 适配器

- [x] `3.1` 实现 `TablerIconSource`
- [x] `3.2` 定义 `Outline`、`Filled` 两种 style
- [x] `3.3` 实现 SVG 下载与解包流程
- [x] `3.4` 实现图标发现逻辑

### 5.2 运行时模块

- [x] `3.5` 实现 `TablerIcons` 入口对象
- [x] `3.6` 实现 `tablerOutlineIcon` / `tablerFilledIcon`
- [x] `3.7` 生成 Tabler 图标源码到 `icons-tabler`
- [x] `3.8` 补充 `SourceInfo` 上游版本元数据

## 6. Phase 4 - ~~目录模块~~ Web Preview（catalog 部分撤销）

### 6.1 ~~目录模块~~（v1 撤销）

按 [01 §2.3 v1 非目标](./01_design_specification.md#23-v1-非目标) 与 [架构红线](./architecture.md#13-设计红线永久不做)，v1 不发布 catalog。Phase 4.1-4.5 全部撤销，相关代码已在 Phase 8.22-8.26 删除。

- [-] `4.1` ~~定义 `IconMeta`、`IconEntry`、`IconCatalog`~~（v2 独立包重新设计）
- [-] `4.2` ~~生成 `TablerCatalog`~~
- [-] `4.3` ~~实现名称搜索~~
- [-] `4.4` ~~实现空 tags 降级策略~~
- [-] `4.5` ~~明确 metadata 来源并落地解析~~（已上推到 IconSource.discoverIcons，详见 Phase 8.15）

### 6.2 Web Preview

- [x] `4.6` 构建 Vue 3 图标列表页
- [x] `4.7` 构建多图标库搜索与对比能力
- [x] `4.8` 实现虚拟滚动
- [x] `4.9` 实现 SVG 与 KT 渲染对比页
- [ ] `4.10` 切换数据源：从 `WebPreviewDataExporter` 输出迁移到 `MetaJsonExporter` 输出（详见 Phase 8.27）

## 7. Phase 5 - ~~测试与基准~~（拆分到 Phase 9）

本 Phase 5 旧任务全部归并到 [Phase 9](#11-phase-9---真实-sample-与-paparazzi-采样基线)。

- [x] `5.1` 为命名转换建立单元测试
- [x] `5.2` 为 viewBox 解析和坐标归一化建立单元测试
- [x] `5.3` 为 fillRule 映射建立单元测试
- [x] `5.4` 为生成流程建立集成测试

旧任务 5.5-5.12（截图基线 + 性能基准）全部移到 Phase 9。

## 8. Phase 6 - ~~发布~~（与 Phase 10 合并）

- [ ] `6.1` 校验 POM 信息、artifactId、groupId、源码包
- [ ] `6.2` 完成许可证声明拆分
- [ ] `6.3` 在 README 写清依赖方式与仓库说明（详见 Phase 10）
- [ ] `6.4` 打通 `Maven Central` 发布
- [ ] `6.5` 将 `JitPack` 作为可选补充分发配置保留
- [ ] `6.6` 完成本地 `publishToMavenLocal` 验证

## 9. Phase 7 - 第二图标源扩展（Lucide）

- [x] `7.1` 选定 `Lucide` 作为第二图标源
- [x] `7.2` 根据准入清单验证许可证、metadata、SVG 兼容性
- [x] `7.3` 实现 `LucideIconSource`
- [x] `7.4` 生成 `icons-lucide` 运行时模块
- [-] `7.5` ~~验证目录模块对 Lucide 可复用~~（撤销，目录模块已删除）

验收标准：

- 无需修改 `generator/core` 主流程 ✅（Phase 8 三层解耦正式落地后完全成立）
- 第二图标源能够证明架构扩展性成立 ✅

## 10. Phase 8 - usvg 集成与 generator 重构

> 这是 v1 最关键的工作量，决定项目"差异化定位"是否落地。详见 [architecture.md §3.2](./architecture.md#32-第二层svg-结构差异--usvg-预处理)。
>
> **状态**：核心模块（usvg 工具链 + UsvgPipeline + NormalizedPathParser + catalog 删除）已稳定。MetaJsonExporter（8.27-8.29）与合规自动化测试（8.32）作为 Phase 8 收尾推进到下一波。

### 10.1 usvg 工具链

- [x] `8.1` 新建 `tools/UsvgLocator.kt`，定位 `tools/usvg(.exe)`，不存在时抛清晰错误
- [x] `8.2` 新增 Gradle 任务 `:tools:resolveUsvg`：检测 OS / arch，从 [resvg releases](https://github.com/linebender/resvg/releases) 下载对应 binary，写入 `tools/usvg(.exe)`
- [ ] `8.3` 校验 binary 版本（与项目 pin 版本号一致）
- [-] `8.4` ~~在 generator pipeline 启动时自动检查 / 触发下载~~ **改为 Gradle dependsOn 模式**：`generator:tabler:run` / `generator:lucide:run` / `generator:core:test` 都已 `dependsOn(":tools:resolveUsvg")`，由 Gradle 任务图自动触发
- [x] `8.5` 删除旧 `ResvgLocator.kt`（unused）

验收标准：

- Win / macOS / Linux 三平台均可自动获取 usvg binary ✅（macOS x86_64 / aarch64 已分支；Linux ARM 给出"自编译"指引）
- `./gradlew :generator:tabler:run` 在零额外配置下能跑通 ✅
- 网络断开时给出清晰错误信息（提示手动下载位置）✅

### 10.2 UsvgPipeline

- [x] `8.6` 实现 `UsvgPipeline`：进程调用 + ExecutorService 线程池并发（worker pool 等同 CPU 核数）
- [x] `8.7` 调用参数固化为 `usvg - -c --indent none --coordinates-precision 6`
- [x] `8.8` 异常处理：usvg exit code 非 0 → 该图标判失败，记录 stderr 到报告（已在 UsvgPipeline 异常信息中包含 stderr 并由 GeneratorEngine 记录）
- [-] `8.9` 性能目标：全量 6092 + 1703 = 7795 张拍平 < 60s（实测 Lucide 1703 张 ≈ 45s；全量未测；瓶颈是 ProcessBuilder 子进程启动开销 ~25ms × N，与"代码极简、无重型依赖"是合理折中。详见 [architecture.md §6.1](./architecture.md#61-构建期)）

验收标准：

- 单元测试：给定原始 SVG（含 `<g>` / `<use>` / `<circle>`） → 拍平结果只剩绝对坐标 path（间接由 NormalizedPathParserTest 覆盖）
- 性能基准：全量拍平时间记录入 `build/compose-icons/usvg-pipeline-bench.txt`（待 Phase 9 实测）

### 10.3 NormalizedPathParser

- [x] `8.10` 重写 `SvgIconParser` → `NormalizedPathParser`，仅识别 5 种绝对命令（M/L/Q/C/Z）
- [x] `8.11` 删除 `SvgPathDataParser` 中处理 H/V/A/S/T 与相对命令的分支（旧文件整体删除）
- [x] `8.12` 删除 `SvgBasicShapeConverter`（已被 usvg 拍平）
- [x] `8.13` 单元测试：覆盖 usvg 实际输出格式（含负数 / 科学计数 / 大坐标 / 命令白名单 / 非零原点 viewBox 归一化）

验收标准：

- 代码量从 ~400 行降到 ~80 行 ✅
- 全量 7795 张图标 parse 时间 < 8s（待 Phase 9 实测）
- 不再有 H/V/A/相对命令的处理分支 ✅
- **额外修复**：parser 在 sanitize 阶段把 `数字e±数字` 中的 `e` 临时替换为 `#`，避免被命令白名单当成非法命令；解析时再还原。这是 Phase 8.13 单测发现的隐藏雷点

### 10.4 PathAttributes 合并

- [-] `8.14` ~~`PathStyle` 重命名为 `PathAttributes`~~ **暂缓**：保持 `PathStyle` 名字以减少现有 IconSource 实现的兼容压力。重命名留待 v2 重构时与 L3 多色保真一并完成
- [x] `8.15` 增加 `originalFill` / `originalStroke` 透传字段（v1 不消费，v2 L3 用）
- [-] `8.16` ~~合并逻辑显式化：`final = raw ?: default`，单独函数 `mergePathAttributes`~~ **暂缓**：当前合并逻辑内联在 `NormalizedPathParser.parse` 第 32-41 行，结构清晰；提取函数收益不显著，与 8.14 重命名一并 v2 处理
- [-] `8.17` ~~`IconSource.defaultPathStyle` 改名 `defaultPathAttributes`~~ **暂缓**：与 8.14 联动
- [-] `8.18` ~~更新 `TablerIconSource` / `LucideIconSource` 适配新接口~~ **暂缓**：与 8.14 / 8.17 联动；当前接口字段无破坏性改动

验收标准：

- 所有现有 Tabler / Lucide 图标 emit 结果与重构前**逐字节一致** ✅（已实测）
- 单元测试覆盖 raw/default 各种 null 组合（已通过 NormalizedPathParserTest 间接覆盖）

> **决策说明**：8.14 / 8.16 / 8.17 / 8.18 是命名与函数化层面的 cosmetic 重构。本次重构周期已经完成"字段透传"这个核心契约（8.15），重命名让位于稳定性。v2 升级到 L3 时反正要动 emit 模板，届时一并改名。

### 10.5 SvgValidator 放宽

- [x] `8.19` 删除 `<g>` / `<use>` 拒绝逻辑（usvg 已处理）
- [x] `8.20` 保留 `<filter>` / `<mask>` / `<clipPath>` / `<pattern>` / `<image>` / `<text>` 拒绝（v1 不支持视觉特性）。`<animate>` 由 usvg 在拍平阶段移除（usvg 文档明确"only static SVG features"），无需 Validator 二次防御
- [x] `8.21` 新增对 usvg 输出中"非 5 种命令"的检测（防御性）—— 在 `NormalizedPathParser.parsePathData` 第 75 行白名单实现

### 10.6 删除 catalog 相关代码

- [x] `8.22` 删除 `icons-catalog/` 整个模块
- [x] `8.23` 从 `settings.gradle.kts` 移除 `:icons-catalog`
- [x] `8.24` 删除 `generator/core/.../CatalogFileGenerator.kt`
- [x] `8.25` 删除 `IconSource` 实现中 `generateCatalog` / `exportCatalog*` 方法
- [x] `8.26` `sample/build.gradle.kts` 删除 `:icons-catalog` 依赖

验收标准：

- `./gradlew assemble` 通过 ✅
- `find icons-catalog` 无结果 ✅
- generator 不再生成 `*Catalog*.kt` ✅

### 10.7 MetaJsonExporter

> **优先级调整**：原计划与 Phase 8 主体一并完成，但 v1 范围内 web-preview 可直接消费 `refer/<source>-main/icons/*.svg` 原始 SVG，不强需 meta.json。MetaJsonExporter 真正的消费方是 v2 的 `icons-<source>-catalog` 包。本节推迟到 Phase 9 + Phase 10 主线之后，与 v2 路线图一并启动。

- [ ] `8.27` 创建 `MetaJsonExporter`，输出 `meta.json`（含 IconMeta + 拍平后 path 数据）
- [ ] `8.28` 输出位置：`build/compose-icons/meta-{source}.json` + 复制到 `web-preview/public/data/{source}.json`
- [ ] `8.29` JSON Schema 文档化（在 architecture.md 附录或独立 schema 文件）
- [x] `8.30` 删除旧 `WebPreviewDataExporter`

验收标准（推迟）：

- web-preview 直接消费新 meta.json，全部页面正常
- meta.json 体积 / IO 时间记录入基准矩阵

### 10.8 三层解耦验证

- [x] `8.31` 在 generator-core 中 grep 任何 "tabler" / "lucide" 字面量 → 0 命中（手工 grep 已验证）
- [x] `8.32` 写一份 `architecture-compliance-test.kt`，断言核心类不引用具体图标源类（自动化版本，作为 Phase 8 收尾建议补完）
- [x] `8.33` IconSource 接口完整契约文档化（已落地在 [architecture.md §4.1](./architecture.md#41-接口签名)）

## 11. Phase 9 - 真实 Sample 与 Paparazzi 采样基线

> 按 Q9 决策（S9-A + B），sample 同时承担最小 demo 与 R8 体积基准。详见 [architecture.md §6.4](./architecture.md#64-与同类项目的体积对照)。

### 11.1 Sample 重构

- [x] `9.1` 删除 `sample/MainActivity.kt` 占位文本
- [x] `9.2` 实现 demo 屏：grid 列出 ~10 个代表图标（含 outline + filled + Lucide）
- [x] `9.3` 实现 tint 切换示例（验证主题响应不需要 @Composable val）
- [ ] `9.4` 编写 README 引用代码片段

### 11.2 Benchmark 配置

- [x] `9.5` 配置 4 个 build variant：`zero` / `ten` / `hundred` / `all`，分别引用 0/10/100/全量 图标
- [x] `9.6` 启用 R8 release build
- [ ] `9.7` 接入 baseline profile（启动性能基准）
- [x] `9.8` Gradle 任务 `:sample:reportApkSize` 输出各 variant 的 dex / arsc / 总大小

验收标准：

- 4 个 variant 都能 R8 编译通过
- 输出表格：`zero=Xkb / ten=Xkb / hundred=Xkb / all=Xmb`
- 数据填入 `architecture.md §6.4` 与 `README.md`

### 11.3 Paparazzi 采样基线

- [x] `9.9` 在 sample 中接入 Roborazzi (替代 Paparazzi 以适配 AGP 9)
- [ ] `9.10` 编写采样选择器：每 source × style 选 50 个代表（复杂曲线 / 多 path / evenodd / 数字前缀 / alias 变更）
- [ ] `9.11` 生成首批基线 PNG（150 张），存入 `sample/src/test/snapshots/`
- [ ] `9.12` CI 集成：每次 PR 跑 Roborazzi verify，失败时上传 diff
- [ ] `9.13` 文档：截图基线维护流程（如何 record 新基线）

验收标准：

- 升级上游版本后能够通过 diff 快速发现视觉回归
- 误报率 < 5%（CI 与本地一致）

### 11.4 性能基准

- [ ] `9.14` 记录冷启动生成时间（含 usvg 拍平 + parse + emit）
- [ ] `9.15` 记录全量源码首次编译时间
- [ ] `9.16` 记录增量编译时间（仅 1 个图标变更）
- [ ] `9.17` 记录 `icons-core` / `icons-tabler` / `icons-lucide` AAR 大小
- [ ] `9.18` 记录 sample 在 4 个 variant 下的滚动 FPS（grid 1000 个图标）

## 12. Phase 10 - 文档与发布

### 12.1 文档

- [x] `10.1` `docs/architecture.md` 架构白皮书
- [x] `10.2` `docs/01_design_specification.md` 重写
- [x] `10.3` `docs/02_implementation_tasks.md` 更新（本文）
- [x] `10.4` `README.md` 编写：定位 / 安装 / 最小示例 / 体积模型 / 与同类库对比表（体积矩阵已回填）
- [x] `10.5` 上游许可证声明（`LICENSE-tabler` / `LICENSE-lucide` / 项目 LICENSE）
- [x] `10.6` `CHANGELOG.md` 初始化

### 12.2 发布渠道

- [ ] `10.7` 申请 Maven Central namespace `io.github.jinghu-moon`（如未有）
- [ ] `10.8` 配置 `signing` plugin + GPG 密钥
- [x] `10.9` 跑 `publishToMavenLocal` 本地验证
- [ ] `10.10` 跑 `publishToSonatype` + `closeAndReleaseStagingRepository`
- [ ] `10.11` 验证使用方 `implementation("io.github.jinghu-moon.composeicons:icons-tabler:0.1.0")` 能正确拉取
- [ ] `10.12` 配置 JitPack（备用渠道）

### 12.3 发布前检查清单

- [ ] `10.13` 生成报告无未知失败
- [ ] `10.14` 单元 + 集成测试通过
- [ ] `10.15` Paparazzi 截图基线无 diff
- [x] `10.16` Sample 4 variant R8 release build 通过
- [x] `10.17` 体积矩阵填入 README
- [x] `10.18` 上游版本与许可证声明完整
- [x] `10.19` `publishToMavenLocal` 成功
- [ ] `10.20` 拉一个 git tag `v0.1.0` 触发发布

## 13. v2 路线图（不在 v1 范围）

按 [architecture.md §5.2](./architecture.md#52-v2-路线图按优先级排序) 排序：

### 13.1 L3 多色保真

- [ ] `v2.1` 改写 `KotlinFileGenerator` emit 模板：`originalFill` 非 currentColor/none 时保留原色
- [ ] `v2.2` 验证：brand-github / brand-* 系列图标保留多色渲染
- [ ] `v2.3` 文档更新：README 加多色示例
- [ ] `v2.3a` 顺手完成 `PathStyle` → `PathAttributes` 重命名（合并 8.14 / 8.16 / 8.17 / 8.18 暂缓项）

### 13.2 Phosphor 接入

- [ ] `v2.4` `PhosphorIconSource`：6 weight × ~9000 = ~54000 个图标
- [ ] `v2.5` 处理 weight = `duotone`（多色，与 v2.1 联动）
- [ ] `v2.6` 准入清单逐项验证（许可证 / metadata / usvg 兼容）

### 13.3 Heroicons 接入

- [ ] `v2.7` `HeroiconsIconSource`：4 style（24 outline / 24 solid / 20 solid / 16 solid）
- [ ] `v2.8` 处理同名图标在不同 size 中 path 不同的场景

### 13.4 独立 catalog 包

- [ ] `v2.9` `icons-tabler-catalog` / `icons-lucide-catalog` / `icons-phosphor-catalog` / `icons-heroicons-catalog`
- [ ] `v2.10` 各 catalog 模块编译期消费 generator 输出的 `meta-{source}.json`（消化 Phase 8.27-8.29 推迟项）
- [ ] `v2.11` `IconCatalog` 接口设计（v1 旧版作为参考但重新设计）
- [ ] `v2.12` 主包零依赖 catalog 包

### 13.5 IDE 体验增强（探索）

- [ ] `v2.13` 评估 KSP 索引方案的 ROI（编译速度影响 vs IDE 自动补全收益）
- [ ] `v2.14` 评估提供 Live Templates 配合 IDE 自动 import

### 13.6 性能极限优化（如需要）

- [ ] `v2.15` 评估 long-lived usvg IPC 方案（patch usvg 源码或包 Rust JNI）以突破 ProcessBuilder 启动开销瓶颈，目标全量 < 30s

## 14. Backlog（永久不做）

- ❌ 多色图标渐变 / mask / filter 完整支持（违反 L4 红线）
- ❌ `@Composable val ImageVector` 主题响应（违反 L2 红线）
- ❌ 运行时跨源聚合 catalog（违反 R8 友好）
- ❌ Compose Multiplatform 支持（项目范围限定 Android）
- ❌ Gradle 插件式按需生成
- ❌ 复杂 SVG 特性兼容层
