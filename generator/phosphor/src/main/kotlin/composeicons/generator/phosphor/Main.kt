package composeicons.generator.phosphor

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = if (args.isNotEmpty()) File(args[0]) else File(".")
    val engine = GeneratorEngine(projectRoot)
    
    val phosphorReferRoot = projectRoot.resolve("refer/phosphor-icons-master")
    val source = PhosphorIconSource(referRoot = phosphorReferRoot)
    
    val config = GeneratorConfig(
        sourceRootDir = phosphorReferRoot,
        outputDir = projectRoot.resolve("icons-phosphor/src/main/kotlin"),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )
    
    println("Starting Phosphor Icons generation...")
    val report = engine.generate(config, source)
    println("Generation finished!")
    println("Total: ${report.total}")
    println("Succeeded: ${report.succeeded}")
    println("Failed: ${report.failed.size}")
    
    if (report.failed.isNotEmpty()) {
        println("Failed icons:")
        report.failed.take(10).forEach { 
            println("  - ${it.style}/${it.fileName}: ${it.reason}")
        }
    }
}
