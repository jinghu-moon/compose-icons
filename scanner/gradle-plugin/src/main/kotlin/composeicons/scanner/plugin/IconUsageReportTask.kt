package composeicons.scanner.plugin

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * Gradle task that generates an icon usage report from the KSP-generated manifest.
 *
 * Outputs:
 * - Console: human-readable usage table
 * - File: `build/reports/icon-usage.json`
 */
abstract class IconUsageReportTask : DefaultTask() {

    @TaskAction
    fun execute() {
        val buildDir = project.layout.buildDirectory.get().asFile
        val kspOutputDir = buildDir.resolve("generated/ksp/debug")
        val manifestFile = findManifestFile(kspOutputDir)

        if (manifestFile == null) {
            logger.lifecycle("No icon-usage.json found — no icon references detected.")
            return
        }

        val json = Json { ignoreUnknownKeys = true; prettyPrint = true }
        val manifest = json.decodeFromString<IconUsageManifest>(manifestFile.readText())

        // Load available icon counts
        val availableCounts = loadAvailableIconCounts()

        // Group by source
        val bySource = manifest.icons.groupBy { it.source }

        // Print console report
        val moduleName = manifest.module
        println()
        println("Icon Usage Report ($moduleName)")
        println("─".repeat(50))
        println("%-10s %-10s %5s %10s %8s".format("Source", "Style", "Used", "Available", "Coverage"))
        println("─".repeat(50))

        var totalUsed = 0
        for ((source, icons) in bySource.toSortedMap()) {
            val byStyle = icons.groupBy { it.style }
            for ((style, styleIcons) in byStyle.toSortedMap()) {
                val used = styleIcons.size
                val available = availableCounts[source]?.get(style) ?: availableCounts[source]?.values?.sum() ?: 0
                val coverage = if (available > 0) String.format("%.1f%%", used * 100.0 / available) else "N/A"
                println("%-10s %-10s %5d %10d %8s".format(source, style, used, available, coverage))
                totalUsed += used
            }
        }
        println("─".repeat(50))
        println("Total: $totalUsed icons")
        println("Estimated APK contribution: ~${totalUsed * 900 / 1024} KB (uncompressed, before R8)")
        println()

        // Write JSON report
        val reportDir = buildDir.resolve("reports")
        reportDir.mkdirs()
        val reportFile = reportDir.resolve("icon-usage.json")

        val report = IconUsageReport(
            modules = listOf(
                ModuleReport(
                    name = moduleName,
                    icons = manifest.icons.map { IconSummary(it.source, it.style, it.name) },
                    summary = ModuleSummary(
                        total = totalUsed,
                        bySource = bySource.mapValues { it.value.size },
                    ),
                )
            ),
            globalSummary = GlobalSummary(
                total = totalUsed,
                estimatedApkBytes = totalUsed * 900,
            ),
        )

        reportFile.writeText(json.encodeToString(report))
        logger.lifecycle("Report written to: ${reportFile.absolutePath}")
    }

    private fun findManifestFile(kspDir: File): File? {
        val candidates = listOf(
            kspDir.resolve("icon-usage.json"),
            kspDir.resolve("resources/icon-usage.json"),
        )
        return candidates.firstOrNull { it.exists() }
            ?: kspDir.walkTopDown().firstOrNull { it.name == "icon-usage.json" }
    }

    /**
     * Load available icon counts from GeneratorReport.json.
     * Returns: Map<source, Map<style, count>>
     */
    private fun loadAvailableIconCounts(): Map<String, Map<String, Int>> {
        val result = mutableMapOf<String, MutableMap<String, Int>>()
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
                        sourceMap[entry.style] = (sourceMap[entry.style] ?: 0) + 1
                    }

                    if (report.iconNames.isNotEmpty() && report.explorerEntries.isEmpty()) {
                        sourceMap[source] = report.iconNames.size
                    }
                } catch (_: Exception) { /* skip malformed files */ }
            }
        }
        return result
    }
}

@kotlinx.serialization.Serializable
data class IconUsageReport(
    val modules: List<ModuleReport>,
    val globalSummary: GlobalSummary,
)

@kotlinx.serialization.Serializable
data class ModuleReport(
    val name: String,
    val icons: List<IconSummary>,
    val summary: ModuleSummary,
)

@kotlinx.serialization.Serializable
data class IconSummary(
    val source: String,
    val style: String,
    val name: String,
)

@kotlinx.serialization.Serializable
data class ModuleSummary(
    val total: Int,
    val bySource: Map<String, Int>,
)

@kotlinx.serialization.Serializable
data class GlobalSummary(
    val total: Int,
    val estimatedApkBytes: Int,
)
