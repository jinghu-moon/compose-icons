package composeicons.generator.radix

import composeicons.generator.core.GeneratorConfig
import composeicons.generator.core.GeneratorEngine
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val radixReferRoot = args.getOrNull(1)?.let(::File) ?: projectRoot.resolve("refer/Radix-Icons-main")
    val source = RadixIconSource(referRoot = radixReferRoot)

    val config = GeneratorConfig(
        sourceRootDir = radixReferRoot.resolve("packages/radix-icons/icons"),
        outputDir = projectRoot.resolve("icons-radix/src/generated/kotlin/composeicons/radix"),
        reportDir = projectRoot.resolve("web-preview/public/data"),
    )

    println("Starting Radix Icons generation...")
    GeneratorEngine(projectRoot).generate(config, source)
}
