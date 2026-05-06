package composeicons.generator.core

import java.io.File
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicInteger

internal fun defaultSvg2ComposePath(projectRoot: File): File {
    val isWindows = System.getProperty("os.name").lowercase().contains("win")
    val ext = if (isWindows) ".exe" else ""
    return projectRoot.resolve("tools/bin/svg2compose$ext")
}

class GeneratorEngine(
    private val projectRoot: File,
    private val pipeline: UsvgPipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot)),
) {
    fun generate(config: GeneratorConfig, source: IconSource): GeneratorReport {
        val discovered = source.discoverIcons(config.sourceRootDir)

        val outputDir = config.outputDir
        outputDir.mkdirs()

        val oldReport = GeneratorReportReader.read(config.reportDir, source.name)
        val oldEntries = oldReport?.explorerEntries?.associateBy { it.style to it.name } ?: emptyMap()

        val generatedFiles = mutableSetOf<File>()
        val failed = ConcurrentLinkedQueue<FailedIcon>()
        val warnings = ConcurrentLinkedQueue<IconWarning>()
        val succeeded = AtomicInteger(0)
        val explorerEntries = ConcurrentLinkedQueue<ExplorerEntry>()

        if (discovered.isEmpty()) {
            return GeneratorReport(source.name, source.upstreamVersion, 0, 0, emptyList(), emptyList(), emptyList())
        }

        val collisions = IconNameCollisionDetector.detect(discovered)
        collisions.forEach { collision ->
            collision.entries.forEach { entry ->
                warnings += IconWarning(
                    fileName = entry.fileName,
                    style = entry.style.name,
                    message = "Name collision: ${collision.kotlinName}. This might cause unexpected overwriting.",
                )
            }
        }

        // Phase 1: Collect entries that need processing (skip cached)
        data class PendingEntry(
            val entry: SvgIconEntry,
            val kotlinName: String,
            val currentHash: String,
            val targetFile: File,
        )

        val pending = mutableListOf<PendingEntry>()
        val cachedFiles = mutableSetOf<File>()

        discovered.forEach { entry ->
            val kotlinName = IconNameMapper.toKotlinName(entry.fileName)
            val targetFile = outputDir.resolve(entry.style.subdirectory).resolve("$kotlinName.kt")
            val currentHash = entry.file.calculateMd5()
            val oldEntry = oldEntries[entry.style.name to kotlinName]

            if (oldEntry != null && oldEntry.hash == currentHash && targetFile.exists()) {
                explorerEntries += oldEntry
                succeeded.incrementAndGet()
                cachedFiles.add(targetFile)
            } else {
                val rawSvg = entry.file.readText()
                val validationWarnings = SvgValidator.validate(rawSvg)
                if (validationWarnings.isNotEmpty()) {
                    failed += FailedIcon(
                        fileName = entry.fileName,
                        style = entry.style.name,
                        reason = validationWarnings.joinToString("; "),
                    )
                } else {
                    pending += PendingEntry(entry, kotlinName, currentHash, targetFile)
                }
            }
        }

        // Phase 2: Build manifest and call Rust CLI (per-icon file mode)
        if (pending.isNotEmpty()) {
            val manifestEntries = pending.map { pe ->
                ManifestEntry(
                    svg = pe.entry.file.absolutePath,
                    kotlin_name = pe.kotlinName,
                    style_name = pe.entry.style.name,
                    subdirectory = pe.entry.style.subdirectory,
                    helper = source.helperFunctionName(pe.entry.style),
                )
            }

            try {
                val iconResults = pipeline.generateViaManifest(
                    entries = manifestEntries,
                    basePackage = source.basePackage,
                    iconContainer = source.iconContainerName,
                    outputDir = outputDir,
                )

                pending.forEach { pe ->
                    val key = "${pe.entry.style.subdirectory}/${pe.kotlinName}"
                    val iconResult = iconResults[key]

                    if (iconResult == null) {
                        failed += FailedIcon(
                            fileName = pe.entry.fileName,
                            style = pe.entry.style.name,
                            reason = "svg2compose returned no result for this file",
                        )
                    } else {
                        explorerEntries += ExplorerEntry(
                            name = pe.kotlinName,
                            style = pe.entry.style.name,
                            kotlinPath = "${source.basePackage}.${pe.entry.style.subdirectory}.${pe.kotlinName}",
                            viewBox = ExplorerViewBox(
                                iconResult.viewBox.min_x.toFloat(),
                                iconResult.viewBox.min_y.toFloat(),
                                iconResult.viewBox.width.toFloat(),
                                iconResult.viewBox.height.toFloat(),
                            ),
                            paths = iconResult.paths.map { p ->
                                ExplorerPathNode(
                                    fill = p.fill,
                                    stroke = p.stroke,
                                    strokeWidth = p.strokeWidth?.toFloat(),
                                    strokeLineCap = p.strokeLineCap,
                                    strokeLineJoin = p.strokeLineJoin,
                                    fillRule = p.fillRule,
                                    alpha = p.alpha.toFloat(),
                                    d = p.d,
                                )
                            },
                            hash = pe.currentHash,
                        )
                        succeeded.incrementAndGet()
                        generatedFiles.add(pe.targetFile)
                    }
                }
            } catch (error: Exception) {
                pending.forEach { pe ->
                    failed += FailedIcon(
                        fileName = pe.entry.fileName,
                        style = pe.entry.style.name,
                        reason = "Manifest generation failed: ${error.message ?: error::class.java.simpleName}",
                    )
                }
            }
        }

        generatedFiles.addAll(cachedFiles)

        val report = GeneratorReport(
            source = source.name,
            upstreamVersion = source.upstreamVersion,
            total = discovered.size,
            succeeded = succeeded.get(),
            failed = failed.toList().sortedBy { it.fileName },
            warnings = warnings.toList().sortedBy { it.fileName },
            explorerEntries = explorerEntries.toList().sortedBy { it.name },
        )
        GeneratorReportWriter.write(config.reportDir, report)

        // Cleanup: delete .kt files that are no longer generated
        source.styles.forEach { style ->
            val styleDir = outputDir.resolve(style.subdirectory)
            if (styleDir.exists()) {
                styleDir.listFiles()?.filter { it.extension == "kt" }?.forEach { file ->
                    if (!generatedFiles.contains(file)) {
                        file.delete()
                    }
                }
            }
        }

        println("Generation finished: ${succeeded.get()} succeeded, ${failed.size} failed.")
        return report
    }
}
