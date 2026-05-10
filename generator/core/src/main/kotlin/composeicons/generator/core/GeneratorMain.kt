package composeicons.generator.core

import java.io.File

/**
 * 通用的生成器入口函数。
 *
 * 所有图标库的 Main.kt 只需一行调用即可：
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
    val engine = GeneratorEngine(projectRoot)

    // 使用 IconSource 声明的精确 SVG 子目录作为扫描根
    val svgSourceDir = source.svgSourceDir(referRoot)

    val config = GeneratorConfig(
        sourceRootDir = svgSourceDir,
        outputDir = projectRoot.resolve(
            "icons-${source.name}/src/generated/kotlin/composeicons/${source.name}"
        ),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )

    val report = engine.generate(config, source)

    println("compose-icons [${source.displayName}] generation complete")
    println("  source      = ${report.source}")
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
