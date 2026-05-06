package composeicons.generator.lucide

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val referLucideRoot = projectRoot.resolve("refer/lucide-main")
    val outputDir = projectRoot.resolve("icons-lucide/src/main/kotlin/composeicons/lucide")
    val reportDir = projectRoot.resolve("web-preview/public/data")

    val source = LucideIconSource(referRoot = referLucideRoot)
    val engine = GeneratorEngine(projectRoot = projectRoot)
    val report = engine.generate(
        config = GeneratorConfig(
            sourceRootDir = referLucideRoot.resolve("icons"),
            outputDir = outputDir,
            reportDir = reportDir,
        ),
        source = source,
    )

    println("compose-icons lucide generator")
    println("source=${report.source}")
    println("upstreamVersion=${report.upstreamVersion}")
    println("total=${report.total}")
    println("succeeded=${report.succeeded}")
    println("failed=${report.failed.size}")
    println("warnings=${report.warnings.size}")
}
