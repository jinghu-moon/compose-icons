package composeicons.generator.cli

import composeicons.generator.core.*
import composeicons.generator.tabler.TablerIconSource
import composeicons.generator.lucide.LucideIconSource
import composeicons.generator.phosphor.PhosphorIconSource
import composeicons.generator.remix.RemixIconSource
import composeicons.generator.radix.RadixIconSource
import java.io.File

fun main(args: Array<String>) {
    val projectRoot = args.firstOrNull()?.let(::File) ?: File(System.getProperty("user.dir"))
    val engine = GeneratorEngine(projectRoot)
    
    val sources = mapOf(
        "tabler" to { TablerIconSource(referRoot = projectRoot.resolve("refer/tabler-icons-master")) },
        "lucide" to { LucideIconSource(referRoot = projectRoot.resolve("refer/lucide-master")) },
        "phosphor" to { PhosphorIconSource(referRoot = projectRoot.resolve("refer/phosphor-icons-master")) },
        "remix" to { RemixIconSource(referRoot = projectRoot.resolve("refer/RemixIcon-master")) },
        "radix" to { RadixIconSource(referRoot = projectRoot.resolve("refer/Radix-Icons-main")) }
    )

    val target = args.firstOrNull()?.lowercase() ?: "all"

    if (target == "all") {
        println("Generating ALL libraries...")
        sources.forEach { (name, sourceFactory) ->
            runGenerator(engine, projectRoot, name, sourceFactory())
        }
    } else if (sources.containsKey(target)) {
        runGenerator(engine, projectRoot, target, sources[target]!!())
    } else {
        println("Unknown library: $target. Available: ${sources.keys.joinToString()}")
    }
}

private fun runGenerator(engine: GeneratorEngine, projectRoot: File, name: String, source: IconSource) {
    println("\n[${source.displayName}] Starting generation...")
    val config = GeneratorConfig.create(
        projectRoot = projectRoot,
        libName = name,
        referPath = "refer/${getReferDir(name)}"
    )
    val startTime = System.currentTimeMillis()
    val report = engine.generate(config, source)
    val duration = System.currentTimeMillis() - startTime
    println("[${source.displayName}] Finished in ${duration}ms (Succeeded: ${report.succeeded}/${report.total})")
}

private fun getReferDir(name: String) = when(name) {
    "tabler" -> "tabler-icons-main/icons"
    "lucide" -> "lucide-main/icons"
    "phosphor" -> "phosphor-icons-master"
    "remix" -> "RemixIcon-master"
    "radix" -> "Radix-Icons-main"
    else -> name
}
