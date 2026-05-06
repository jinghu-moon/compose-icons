package composeicons.generator.radix

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val config = GeneratorConfig.create(projectRoot, "radix", "refer/Radix-Icons-main")
    val source = RadixIconSource(referRoot = config.sourceRootDir)
    
    println("Starting Radix Icons generation...")
    GeneratorEngine(projectRoot).generate(config, source)
}
