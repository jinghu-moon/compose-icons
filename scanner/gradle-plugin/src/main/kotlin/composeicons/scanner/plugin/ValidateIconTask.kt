package composeicons.scanner.plugin

import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * Gradle task that validates icon references from the KSP-generated manifest
 * against the available icons from GeneratorReport.json.
 *
 * Fails the build if any referenced icon does not exist, with spelling suggestions.
 */
abstract class ValidateIconTask : DefaultTask() {

    @TaskAction
    fun execute() {
        val buildDir = project.layout.buildDirectory.get().asFile
        val kspOutputDir = buildDir.resolve("generated/ksp/debug")
        val manifestFile = findManifestFile(kspOutputDir)

        if (manifestFile == null) {
            logger.lifecycle("No icon-usage.json found — skipping validation (no icon references detected).")
            return
        }

        val json = Json { ignoreUnknownKeys = true }
        val manifest = json.decodeFromString<IconUsageManifest>(manifestFile.readText())

        if (manifest.icons.isEmpty()) {
            logger.lifecycle("No icon references found — nothing to validate.")
            return
        }

        // Load available icons from GeneratorReport.json files on the classpath
        val availableIcons = loadAvailableIcons()

        if (availableIcons.isEmpty()) {
            logger.warn("No GeneratorReport.json found in dependencies — cannot validate icon references.")
            return
        }

        // Validate each referenced icon
        val invalidRefs = mutableListOf<InvalidReference>()
        for (icon in manifest.icons) {
            val sourceIcons = availableIcons[icon.source]
            if (sourceIcons == null) {
                invalidRefs += InvalidReference(
                    icon = icon,
                    suggestions = emptyList(),
                )
                continue
            }
            val styleIcons = sourceIcons[icon.style]
            if (styleIcons == null || icon.name !in styleIcons) {
                val candidates = styleIcons ?: sourceIcons.values.flatten().toSet()
                val suggestions = Levenshtein.suggest(icon.name, candidates)
                invalidRefs += InvalidReference(icon = icon, suggestions = suggestions.map { it.first })
            }
        }

        if (invalidRefs.isNotEmpty()) {
            val message = buildString {
                appendLine("Invalid icon references found:")
                appendLine()
                for (ref in invalidRefs) {
                    appendLine("  ${ref.icon.source}Icons.${ref.icon.style}.${ref.icon.name} (${ref.icon.file}:${ref.icon.line}:${ref.icon.column})")
                    if (ref.suggestions.isNotEmpty()) {
                        appendLine("    Did you mean: ${ref.suggestions.joinToString(", ")} ?")
                    }
                    appendLine()
                }
            }
            throw GradleException(message)
        }

        logger.lifecycle("All ${manifest.icons.size} referenced icons are valid.")
    }

    private fun findManifestFile(kspDir: File): File? {
        // KSP writes icon-usage.json to the KSP output directory
        val candidates = listOf(
            kspDir.resolve("icon-usage.json"),
            kspDir.resolve("resources/icon-usage.json"),
        )
        return candidates.firstOrNull { it.exists() }
            ?: kspDir.walkTopDown().firstOrNull { it.name == "icon-usage.json" }
    }

    /**
     * Load available icon names from GeneratorReport.json files bundled in dependencies.
     * Returns: Map<source, Map<style, Set<name>>>
     */
    private fun loadAvailableIcons(): Map<String, Map<String, Set<String>>> {
        val result = mutableMapOf<String, MutableMap<String, MutableSet<String>>>()

        // Search for GeneratorReport.json in the project's dependency classpath
        // These are typically in web-preview/public/data/ or bundled as resources
        val reportDirs = listOf(
            project.rootProject.file("web-preview/public/data"),
            project.file("web-preview/public/data"),
        )

        for (reportDir in reportDirs) {
            if (!reportDir.isDirectory) continue
            reportDir.listFiles()?.filter { it.extension == "json" && it.name != "libraries.json" }?.forEach { file ->
                try {
                    val json = Json { ignoreUnknownKeys = true }
                    val report = json.decodeFromString<GeneratorReportDto>(file.readText())
                    val source = report.source.lowercase()
                    val sourceMap = result.getOrPut(source) { mutableMapOf() }

                    for (entry in report.explorerEntries) {
                        val styleMap = sourceMap.getOrPut(entry.style) { mutableSetOf() }
                        styleMap.add(entry.name)
                    }

                    // Also use iconNames if available (faster than iterating entries)
                    if (report.iconNames.isNotEmpty() && report.explorerEntries.isEmpty()) {
                        val styleName = report.source // fallback: use source name as style
                        val styleMap = sourceMap.getOrPut(styleName) { mutableSetOf() }
                        styleMap.addAll(report.iconNames)
                    }
                } catch (e: Exception) {
                    logger.warn("Failed to parse ${file.name}: ${e.message}")
                }
            }
        }

        return result
    }

    private data class InvalidReference(
        val icon: IconReference,
        val suggestions: List<String>,
    )
}
