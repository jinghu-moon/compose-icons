package composeicons.generator.tabler

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val referTablerRoot = projectRoot.resolve("refer/tabler-icons-main")
    val outputDir = projectRoot.resolve("icons-tabler/src/main/kotlin")
    val reportDir = projectRoot.resolve("web-preview/public/data")

    val source = TablerIconSource(referRoot = referTablerRoot)
    val engine = GeneratorEngine(projectRoot = projectRoot)
    val report = engine.generate(
        config = GeneratorConfig(
            sourceRootDir = referTablerRoot.resolve("icons"),
            outputDir = outputDir,
            reportDir = reportDir,
        ),
        source = source,
    )

    println("compose-icons generator scaffold")
    println("source=${report.source}")
    println("upstreamVersion=${report.upstreamVersion}")
    println("total=${report.total}")
    println("succeeded=${report.succeeded}")
    println("failed=${report.failed.size}")
    println("warnings=${report.warnings.size}")
}
