package composeicons.generator.core

import java.io.File

/**
 * 单库生成入口。每个图标库模块的 Main.kt 只需一行：
 * ```
 * fun main(args: Array<String>) = generatorMain(args) { referRoot -> MyIconSource(referRoot) }
 * ```
 *
 * 参数约定：
 * - args[0] — 项目根目录 (projectRoot)
 * - args[1] — SVG 源目录 (referRoot)，由 DownloadIconSourceTask 提供
 *
 * 注意：downloadSvg() 不在此处调用。
 * SVG 源文件的获取由 Gradle 侧的 DownloadIconSourceTask 负责。
 */
fun generatorMain(
    args: Array<String>,
    sourceFactory: (referRoot: File) -> IconSource,
) {
    val projectRoot = args.firstOrNull()?.let(::File)
        ?: File(System.getProperty("user.dir"))
    val referRoot = args.getOrNull(1)?.let(::File)
        ?: error("请通过 args[1] 传入 SVG 源目录（referRoot）")

    val source = sourceFactory(referRoot)
    val report = runGeneration(projectRoot, referRoot, source)
    printGenerationSummary(report)
}

/**
 * 可复用的生成调用。
 *
 * 被 [generatorMain]（单库入口）以及 `:generator:cli`（全库聚合入口）共用，
 * 避免在 CLI 中重复编排 config 构造逻辑。
 *
 * 输出路径规则：
 * - **模块根**：`icons-$moduleSlug/` — 其中 `moduleSlug` 取自 `source.basePackage` 的最后一段。
 *   例如 `composeicons.foo` → `foo`，对应 `icons-foo` 模块。
 *   这里**不**用 `source.name`，因为部分图标源的 `name` 带 `icons` 后缀
 *   （如 `"fooicons"`），那是用于 web-preview JSON 文件名的标识符，
 *   与 Android 模块名（`icons-foo`）不一致。
 * - **Kotlin 包路径**：`$basePackage.replace('.', '/')`。
 * - **报告目录**：`web-preview/public/data`（文件名由 GeneratorReportWriter 根据 `source.name` 决定）。
 */
fun runGeneration(
    projectRoot: File,
    referRoot: File,
    source: IconSource,
): GeneratorReport {
    val engine = GeneratorEngine(projectRoot)
    val svgSourceDir = source.svgSourceDir(referRoot)

    val moduleSlug = source.basePackage.substringAfterLast('.')
    val packagePath = source.basePackage.replace('.', '/')

    val config = GeneratorConfig(
        sourceRootDir = svgSourceDir,
        outputDir = projectRoot.resolve("icons-$moduleSlug/src/generated/kotlin/$packagePath"),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )

    return engine.generate(config, source)
}

/**
 * 打印单次生成的摘要到标准输出。
 *
 * 被 [generatorMain] 和 CLI 聚合入口共用。
 */
fun printGenerationSummary(report: GeneratorReport) {
    println("compose-icons [${report.source}] generation complete")
    println("  version     = ${report.upstreamVersion}")
    println("  total       = ${report.total}")
    println("  succeeded   = ${report.succeeded}")
    println("  failed      = ${report.failed.size}")
    println("  warnings    = ${report.warnings.size}")

    if (report.failed.isNotEmpty()) {
        println("  first 10 failures:")
        report.failed.take(10).forEach {
            println("    - ${it.style}/${it.fileName}: ${it.reason}")
        }
    }
}
