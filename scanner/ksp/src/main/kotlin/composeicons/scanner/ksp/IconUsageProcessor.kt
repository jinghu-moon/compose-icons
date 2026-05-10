package composeicons.scanner.ksp

import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * KSP2 SymbolProcessor that scans all Kotlin source files for icon references
 * and writes an `icon-usage.json` manifest.
 */
class IconUsageProcessor(
    private val environment: SymbolProcessorEnvironment,
) : SymbolProcessor {

    private val scanner = IconReferenceScanner()
    private var processed = false

    override fun process(resolver: Resolver): List<KSAnnotated> {
        if (processed) return emptyList()
        processed = true

        val logger = environment.logger
        val moduleName = environment.options["composeicons.module"] ?: ":unknown"

        val allReferences = mutableListOf<IconReference>()
        val allWarnings = mutableListOf<DynamicReferenceWarning>()

        // Path A: explicit sourceDirs option (legacy / power-user override).
        val sourceDirs = environment.options["composeicons.sourceDirs"]?.split(";") ?: emptyList()
        if (sourceDirs.isNotEmpty()) {
            for (sourceDir in sourceDirs) {
                val dir = java.io.File(sourceDir)
                if (!dir.isDirectory) continue
                dir.walkTopDown()
                    .filter { it.extension == "kt" }
                    .forEach { file ->
                        val relativePath = dir.toPath().relativize(file.toPath()).toString()
                            .replace('\\', '/')
                        val sourceText = file.readText()
                        allReferences += scanner.scanReferences(sourceText, relativePath)
                        allWarnings += scanner.scanDynamicWarnings(sourceText, relativePath)
                    }
            }
        } else {
            // Path B: zero-config — read from KSP's resolver. This is the
            // default path so that consumers don't need to configure
            // `composeicons.sourceDirs` manually.
            resolver.getAllFiles().forEach { ksFile ->
                val filePath = ksFile.filePath
                val file = java.io.File(filePath)
                if (!file.exists() || file.extension != "kt") return@forEach
                val sourceText = runCatching { file.readText() }.getOrNull() ?: return@forEach
                val relativePath = file.name // KSFile.fileName already contains a stable identifier
                allReferences += scanner.scanReferences(sourceText, relativePath)
                allWarnings += scanner.scanDynamicWarnings(sourceText, relativePath)
            }
        }

        // Report warnings
        for (warning in allWarnings) {
            logger.warn(warning.message)
        }

        // Deduplicate references (same icon referenced multiple times)
        val deduped = allReferences.distinctBy { Triple(it.source, it.style, it.name) }

        // Write manifest
        val manifest = IconUsageManifest(
            module = moduleName,
            generatedAt = java.time.Instant.now().toString(),
            icons = deduped.sortedBy { "${it.source}/${it.style}/${it.name}" },
        )

        val json = Json { prettyPrint = true; encodeDefaults = true }
        try {
            val fileObject = environment.codeGenerator.createNewFile(
                dependencies = Dependencies.ALL_FILES,
                packageName = "",
                fileName = "icon-usage",
                extensionName = "json",
            )
            fileObject.write(json.encodeToString(manifest).toByteArray())
            fileObject.close()
        } catch (e: Exception) {
            logger.warn("IconScanner: Failed to write icon-usage.json: ${e.message}")
        }

        return emptyList()
    }
}

/**
 * KSP2 SymbolProcessorProvider — entry point for the processor.
 */
class IconUsageProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return IconUsageProcessor(environment)
    }
}
