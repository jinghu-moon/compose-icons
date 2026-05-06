package composeicons.generator.remix

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    
    println("Using project root: ${projectRoot.absolutePath}")
    val engine = GeneratorEngine(projectRoot)
    
    val remixReferRoot = projectRoot.resolve("refer/RemixIcon-master")
    val source = RemixIconSource(referRoot = remixReferRoot)
    
    val config = GeneratorConfig(
        sourceRootDir = remixReferRoot,
        outputDir = projectRoot.resolve("icons-remix/src/main/kotlin/composeicons/remix"),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )
    
    println("Starting Remix Icons generation...")
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
