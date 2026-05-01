package composeicons.generator.core

import java.io.File
import java.util.concurrent.Executors
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicInteger

class GeneratorEngine(
    private val projectRoot: File,
) {
    private val kotlinFileGenerator = KotlinFileGenerator()

    fun generate(config: GeneratorConfig, source: IconSource): GeneratorReport {
        val usvgLocator = UsvgLocator(projectRoot)
        val usvgExecutable = usvgLocator.resolve()
        val pipeline = UsvgPipeline(usvgExecutable)
        val discovered = source.discoverIcons(config.sourceRootDir)
        val parser = NormalizedPathParser()
        val failed = ConcurrentLinkedQueue<FailedIcon>()
        val warnings = ConcurrentLinkedQueue<IconWarning>()
        val succeeded = AtomicInteger(0)
        val collisions = IconNameCollisionDetector.detect(discovered)
        val expectedFileNamesByStyle = discovered
            .groupBy { entry -> entry.style.subdirectory }
            .mapValues { (_, entries) ->
                entries.map { entry -> "${IconNameMapper.toKotlinName(entry.fileName)}.kt" }.toSet()
            }

        collisions.forEach { collision ->
            collision.entries.forEach { entry ->
                failed += FailedIcon(
                    fileName = entry.fileName,
                    style = entry.style.name,
                    reason = "Kotlin name collision: ${collision.kotlinName}",
                )
            }
        }
        val blockedEntries = collisions.flatMap { it.entries }.toSet()

        // Discover all existing files
        val outputDir = config.outputDir
        outputDir.mkdirs()
        
        // Delete all old generated icon files to clean up
        source.styles.forEach { style ->
            val styleDir = outputDir.resolve(style.subdirectory)
            if (styleDir.exists()) {
                styleDir.listFiles()?.filter { it.extension == "kt" }?.forEach { it.delete() }
            }
        }
        
        val executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
        
        val futures = discovered.map { entry ->
            executor.submit {
                if (entry in blockedEntries) {
                    return@submit
                }
                val rawText = entry.file.readText()
                val flattenedSvg = try {
                    pipeline.flatten(rawText)
                } catch (error: Exception) {
                    failed += FailedIcon(
                        fileName = entry.fileName,
                        style = entry.style.name,
                        reason = "usvg flatten failed: ${error.message ?: error::class.java.simpleName}",
                    )
                    return@submit
                }
                
                val validationWarnings = SvgValidator.validate(flattenedSvg)
                if (validationWarnings.isNotEmpty()) {
                    failed += FailedIcon(
                        fileName = entry.fileName,
                        style = entry.style.name,
                        reason = validationWarnings.joinToString(),
                    )
                    return@submit
                }

                try {
                    val parsedIcon = parser.parse(
                        entry = entry,
                        defaultPathStyle = source.defaultPathStyle(entry.style),
                        flattenedSvg = flattenedSvg,
                    )
                    kotlinFileGenerator.writeIconFile(
                        parsedIcon = parsedIcon,
                        baseOutputDir = config.outputDir,
                        basePackage = source.basePackage,
                        iconContainerName = source.iconContainerName,
                        helperFunctionName = source.helperFunctionName(entry.style),
                    )
                    succeeded.incrementAndGet()
                } catch (error: Exception) {
                    failed += FailedIcon(
                        fileName = entry.fileName,
                        style = entry.style.name,
                        reason = error.message ?: error::class.java.simpleName,
                    )
                }
            }
        }
        
        futures.forEach { it.get() }
        executor.shutdown()

        return GeneratorReport(
            source = source.displayName,
            upstreamVersion = source.upstreamVersion,
            total = discovered.size,
            succeeded = succeeded.get(),
            failed = failed.toList(),
            warnings = warnings.toList() + collisions.map { collision ->
                val files = collision.entries.joinToString { entry ->
                    "${entry.style.name.lowercase()}/${entry.fileName}"
                }
                IconWarning(
                    fileName = collision.kotlinName,
                    style = "*",
                    message = "Name collision for ${collision.kotlinName}: $files",
                )
            }
        ).also { report ->
            GeneratorReportWriter.write(config.reportDir, report)
        }
    }
}
