package composeicons.generator.cli

import composeicons.generator.bootstrap.BootstrapIconSource
import composeicons.generator.boxicons.BoxiconsIconSource
import composeicons.generator.core.IconSource
import composeicons.generator.core.printGenerationSummary
import composeicons.generator.core.runGeneration
import composeicons.generator.heroicons.HeroiconsIconSource
import composeicons.generator.iconoir.IconoirIconSource
import composeicons.generator.ionicons.IoniconsIconSource
import composeicons.generator.lucide.LucideIconSource
import composeicons.generator.phosphor.PhosphorIconSource
import composeicons.generator.radix.RadixIconSource
import composeicons.generator.remix.RemixIconSource
import composeicons.generator.tabler.TablerIconSource
import java.io.File

/**
 * 全库聚合生成器 CLI。
 *
 * 用法：
 * ```
 * ./gradlew :generator:cli:run                    # 生成全部 10 个库
 * ./gradlew :generator:cli:run --args="tabler"    # 只生成 Tabler
 * ./gradlew :generator:cli:run --args=". tabler"  # 显式指定 projectRoot 为当前目录
 * ```
 *
 * 等价于分别跑 `./gradlew :generator:<lib>:run` 十次，但省去了重复启动 JVM 的开销。
 * 注意：CLI 路径不经过 Gradle 的 `DownloadIconSourceTask`，需要 `upstream/` 目录已存在。
 * 推荐在跑 CLI 前先执行 `./gradlew :generator:tabler:run :generator:lucide:run ...` 中任一任务
 * （或 CI 的生成流水线），触发 upstream 目录下载。
 *
 * 参数约定（通过 `--args="..."` 传入）：
 * - args[0]: 可选 `projectRoot`，默认为当前工作目录（"."）
 * - args[1]: 可选 `libName`（"all" | "tabler" | "lucide" | ...），默认 "all"
 */
fun main(args: Array<String>) {
    val projectRoot = args.getOrNull(0)?.let(::File)
        ?: File(System.getProperty("user.dir"))
    val selected = args.getOrNull(1)?.lowercase() ?: "all"

    // 每个条目对应一个 :generator:<lib> 模块：
    //   - name           — 库的短名（与 icons-<name> 模块一致）
    //   - upstreamSubdir — DownloadIconSourceTask 在 upstream/ 下的目标目录（与各 generator/<name>/build.gradle.kts 的 targetDir 保持一致）
    //   - factory        — 从 upstream 目录构造 IconSource 的工厂 lambda
    //
    // 注意：这里用 lambda 而不是 `::TablerIconSource` 构造器引用，因为 Tabler/Lucide/Phosphor
    // 的主构造器签名是 `(upstreamVersion: String = default, referRoot: File)`，带默认参数的
    // 构造器引用无法单参数调用。统一用 lambda + 命名参数 `referRoot = it` 避开歧义。
    val generators: List<GeneratorEntry> = listOf(
        GeneratorEntry("tabler",    "upstream/tabler-icons")        { TablerIconSource(referRoot = it) },
        GeneratorEntry("lucide",    "upstream/lucide")              { LucideIconSource(referRoot = it) },
        GeneratorEntry("phosphor",  "upstream/phosphor-homepage")   { PhosphorIconSource(referRoot = it) },
        GeneratorEntry("radix",     "upstream/radix-icons")         { RadixIconSource(referRoot = it) },
        GeneratorEntry("remix",     "upstream/remix-icon")          { RemixIconSource(referRoot = it) },
        GeneratorEntry("heroicons", "upstream/heroicons")           { HeroiconsIconSource(referRoot = it) },
        GeneratorEntry("iconoir",   "upstream/iconoir")             { IconoirIconSource(referRoot = it) },
        GeneratorEntry("ionicons",  "upstream/ionicons")            { IoniconsIconSource(referRoot = it) },
        GeneratorEntry("bootstrap", "upstream/bootstrap-icons")     { BootstrapIconSource(referRoot = it) },
        GeneratorEntry("boxicons",  "upstream/boxicons")            { BoxiconsIconSource(referRoot = it) },
    )

    val targets = if (selected == "all") {
        generators
    } else {
        val match = generators.singleOrNull { it.name == selected }
        if (match == null) {
            System.err.println(
                "Unknown library: '$selected'. Available: all, ${generators.joinToString(", ") { it.name }}"
            )
            kotlin.system.exitProcess(1)
        }
        listOf(match)
    }

    println("compose-icons CLI — generating ${targets.size} ${if (targets.size == 1) "library" else "libraries"}")
    println("projectRoot = ${projectRoot.absolutePath}")
    println()

    var failedLibs = 0
    val totalStart = System.currentTimeMillis()

    for (entry in targets) {
        val referRoot = projectRoot.resolve(entry.upstreamSubdir)
        if (!referRoot.exists()) {
            System.err.println(
                "[${entry.name}] ERROR: upstream directory not found: ${referRoot.absolutePath}"
            )
            System.err.println(
                "  Run `./gradlew :generator:${entry.name}:generateIcons` first, or any individual " +
                    "generator task that triggers DownloadIconSourceTask."
            )
            failedLibs++
            continue
        }

        val source = entry.factory(referRoot)
        val libStart = System.currentTimeMillis()
        runCatching {
            val report = runGeneration(projectRoot, referRoot, source)
            printGenerationSummary(report)
            println("  duration    = ${System.currentTimeMillis() - libStart}ms")
            println()
        }.onFailure { e ->
            System.err.println("[${entry.name}] FAILED after ${System.currentTimeMillis() - libStart}ms: ${e.message}")
            e.printStackTrace(System.err)
            failedLibs++
            println()
        }
    }

    val totalDuration = System.currentTimeMillis() - totalStart
    println("═".repeat(60))
    println("compose-icons CLI finished in ${totalDuration}ms")
    println("  succeeded   = ${targets.size - failedLibs}/${targets.size}")
    println("  failed      = $failedLibs")

    if (failedLibs > 0) {
        kotlin.system.exitProcess(1)
    }
}

private data class GeneratorEntry(
    val name: String,
    val upstreamSubdir: String,
    val factory: (File) -> IconSource,
)
