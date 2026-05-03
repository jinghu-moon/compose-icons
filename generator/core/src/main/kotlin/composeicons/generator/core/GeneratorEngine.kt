package composeicons.generator.core

import composeicons.generator.core.json.SvgDocument
import java.io.File
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

class GeneratorEngine(
    private val projectRoot: File,
    private val pipeline: UsvgPipeline = UsvgPipeline(projectRoot.resolve("tools/svg2compose.exe")),
) {
    private val kotlinFileGenerator = KotlinFileGenerator()

    /** Each batch processes at most this many SVGs in one CLI call. */
    private val batchSize = 200

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
            val index: Int,
            val entry: SvgIconEntry,
            val kotlinName: String,
            val currentHash: String,
            val targetFile: File,
            val rawSvg: String,
        )

        val pending = mutableListOf<PendingEntry>()
        val cachedFiles = mutableSetOf<File>()

        discovered.forEachIndexed { i, entry ->
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
                    pending += PendingEntry(i, entry, kotlinName, currentHash, targetFile, rawSvg)
                }
            }
        }

        // Phase 2: Process batches in parallel
        if (pending.isNotEmpty()) {
            val batches = pending.chunked(batchSize)
            val executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())

            val futures = batches.map { batch ->
                executor.submit {
                    val batchInput = batch.map { pe ->
                        "${pe.index}_${pe.entry.fileName}" to pe.rawSvg
                    }

                    try {
                        val batchResult = pipeline.processBatch(batchInput)

                        batch.forEach { pe ->
                            val key = "${pe.index}_${pe.entry.fileName}"
                            val doc = batchResult[key]

                            if (doc == null) {
                                failed += FailedIcon(
                                    fileName = pe.entry.fileName,
                                    style = pe.entry.style.name,
                                    reason = "svg2compose returned no result for this file",
                                )
                                return@forEach
                            }

                            kotlinFileGenerator.writeIconFileFromDoc(
                                doc = doc,
                                fileName = pe.entry.fileName,
                                styleName = pe.entry.style.name,
                                subdirectory = pe.entry.style.subdirectory,
                                baseOutputDir = outputDir,
                                basePackage = source.basePackage,
                                iconContainerName = source.iconContainerName,
                                helperFunctionName = source.helperFunctionName(pe.entry.style),
                            )

                            explorerEntries += ExplorerEntry(
                                name = pe.kotlinName,
                                style = pe.entry.style.name,
                                kotlinPath = "${source.basePackage}.${pe.entry.style.subdirectory}.${pe.kotlinName}",
                                viewBox = ExplorerViewBox(
                                    doc.viewBox.x.toFloat(),
                                    doc.viewBox.y.toFloat(),
                                    doc.viewBox.width.toFloat(),
                                    doc.viewBox.height.toFloat(),
                                ),
                                paths = emptyList(),
                                hash = pe.currentHash,
                            )
                            succeeded.incrementAndGet()
                            synchronized(generatedFiles) { generatedFiles.add(pe.targetFile) }
                        }
                    } catch (error: Exception) {
                        batch.forEach { pe ->
                            failed += FailedIcon(
                                fileName = pe.entry.fileName,
                                style = pe.entry.style.name,
                                reason = "Batch processing failed: ${error.message ?: error::class.java.simpleName}",
                            )
                        }
                    }
                }
            }

            futures.forEach { it.get() }
            executor.shutdown()
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
