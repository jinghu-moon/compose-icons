package composeicons.generator.core

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

object GeneratorReportWriter {

    private val json = Json {
        prettyPrint = false
        encodeDefaults = true
        ignoreUnknownKeys = true
    }

    fun write(reportDir: File, report: GeneratorReport) {
        reportDir.mkdirs()
        
        // Write human readable report
        val output = reportDir.resolve("generation-report.txt")
        output.writeText(buildString {
            appendLine("=== compose-icons Generation Report ===")
            appendLine("Source: ${report.source} v${report.upstreamVersion}")
            appendLine(
                "Total: ${report.total} | Succeeded: ${report.succeeded} | Failed: ${report.failed.size} | Warnings: ${report.warnings.size}",
            )

            if (report.failed.isNotEmpty()) {
                appendLine()
                appendLine("--- Failed ---")
                report.failed.forEach { failed ->
                    appendLine("  ${failed.style.lowercase()}/${failed.fileName} : ${failed.reason}")
                }
            }
        })

        // Write JSON manifest for Explorer
        val manifestFileName = "${report.source.lowercase()}.json"
        val manifestFile = reportDir.resolve(manifestFileName)
        manifestFile.writeText(json.encodeToString(report))

        // Update global registry
        updateRegistry(reportDir, report.source, manifestFileName)
    }

    private fun updateRegistry(reportDir: File, sourceName: String, fileName: String) {
        val registryFile = reportDir.resolve("libraries.json")
        val registry = if (registryFile.exists()) {
            try {
                json.decodeFromString<List<LibraryEntry>>(registryFile.readText()).toMutableList()
            } catch (e: Exception) {
                mutableListOf()
            }
        } else {
            mutableListOf()
        }

        if (registry.none { it.id == sourceName.lowercase() }) {
            registry.add(LibraryEntry(id = sourceName.lowercase(), file = fileName))
            registryFile.writeText(json.encodeToString(registry.sortedBy { it.id }))
        }
    }
}

@kotlinx.serialization.Serializable
data class LibraryEntry(val id: String, val file: String)
