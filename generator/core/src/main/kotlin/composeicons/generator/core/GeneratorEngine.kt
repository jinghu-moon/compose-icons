package composeicons.generator.core

import java.io.File
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicInteger

fun defaultSvg2ComposePath(projectRoot: File): File {
    val isWindows = System.getProperty("os.name").lowercase().contains("win")
    val ext = if (isWindows) ".exe" else ""
    return projectRoot.resolve("tools/bin/svg2compose$ext")
}

class GeneratorEngine(
    private val projectRoot: File,
    private val pipeline: UsvgPipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot)),
) {
    companion object {
        private val pathTagRegex = Regex("""<path(?=[^>]*\s*d=)""", RegexOption.IGNORE_CASE)

        /**
         * 向 SVG 的 <path> 标签注入 fill 属性，替换 currentColor 为品牌色。
         * 仅在 <path> 尚无显式 fill 属性时注入。
         */
        fun injectBrandColor(svgContent: String, hexColor: String): String {
            return pathTagRegex.replace(svgContent) { match ->
                val tag = match.value
                if (tag.contains("fill=", ignoreCase = true)) tag
                else """<path fill="#$hexColor""""
            }
        }
    }
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
            return GeneratorReport(source.name, source.upstreamVersion, 0, 0, emptyList(), emptyList(), emptyList(), emptyList())
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

        // Phase 1.5: Detect case-insensitive collision with container name
        // On case-insensitive file systems (Windows), SimpleIcons.kt and Simpleicons.kt
        // produce the same class file name, causing one to overwrite the other.
        // Rename the icon by appending "Icon" to avoid the collision.
        val containerName = source.iconContainerName
        pending.forEachIndexed { index, pe ->
            if (pe.kotlinName.equals(containerName, ignoreCase = true)) {
                val renamed = pe.kotlinName + "Icon"
                val newTarget = outputDir.resolve(pe.entry.style.subdirectory).resolve("$renamed.kt")
                warnings += IconWarning(
                    fileName = pe.entry.fileName,
                    style = pe.entry.style.name,
                    message = "Renamed '${pe.kotlinName}' -> '$renamed' to avoid collision with container '$containerName' on case-insensitive file systems.",
                )
                pending[index] = pe.copy(kotlinName = renamed, targetFile = newTarget)
            }
        }

        // Phase 2: Build manifest and call Rust CLI (per-icon file mode)
        if (pending.isNotEmpty()) {
            val tempSvgFiles = mutableListOf<File>()
            val manifestEntries = pending.map { pe ->
                val brandColor = source.iconColors[pe.kotlinName]
                val svgPath = if (brandColor != null) {
                    val tmp = File.createTempFile("svg-color-", ".svg")
                    tmp.deleteOnExit()
                    tmp.writeText(injectBrandColor(pe.entry.file.readText(), brandColor))
                    tempSvgFiles.add(tmp)
                    tmp.absolutePath
                } else {
                    pe.entry.file.absolutePath
                }
                ManifestEntry(
                    svg = svgPath,
                    kotlin_name = pe.kotlinName,
                    style_name = pe.entry.style.name,
                    subdirectory = pe.entry.style.subdirectory,
                    helper = source.helperFunctionName(pe.entry.style),
                    md5 = pe.currentHash,
                )
            }

            try {
                val iconResults = pipeline.generateViaManifest(
                    entries = manifestEntries,
                    basePackage = source.basePackage,
                    iconContainer = source.iconContainerName,
                    outputDir = outputDir,
                    normalizeSize = source.normalizeSize ?: config.normalizeSize,
                )

                pending.forEach { pe ->
                    val key = if (pe.entry.style.subdirectory.isEmpty()) pe.kotlinName
                        else "${pe.entry.style.subdirectory}/${pe.kotlinName}"
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
                            kotlinPath = if (pe.entry.style.subdirectory.isEmpty()) "${source.basePackage}.${pe.kotlinName}"
                                else "${source.basePackage}.${pe.entry.style.subdirectory}.${pe.kotlinName}",
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
                                    fillAlpha = p.fillAlpha.toFloat(),
                                    strokeAlpha = p.strokeAlpha.toFloat(),
                                    d = p.d,
                                )
                            },
                            hash = pe.currentHash,
                            clipPath = iconResult.clipPath,
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
            } finally {
                tempSvgFiles.forEach { it.delete() }
            }
        }

        generatedFiles.addAll(cachedFiles)

        val sortedEntries = explorerEntries.toList().sortedBy { it.name }
        val report = GeneratorReport(
            source = source.name,
            upstreamVersion = source.upstreamVersion,
            total = discovered.size,
            succeeded = succeeded.get(),
            failed = failed.toList().sortedBy { it.fileName },
            warnings = warnings.toList().sortedBy { it.fileName },
            explorerEntries = sortedEntries,
            iconNames = sortedEntries.map { it.name },
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
