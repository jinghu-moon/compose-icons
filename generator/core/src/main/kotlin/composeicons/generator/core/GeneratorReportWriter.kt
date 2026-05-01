package composeicons.generator.core

import java.io.File

object GeneratorReportWriter {

    fun write(reportDir: File, report: GeneratorReport) {
        reportDir.mkdirs()
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

            if (report.warnings.isNotEmpty()) {
                appendLine()
                appendLine("--- Warnings ---")
                report.warnings.forEach { warning ->
                    appendLine("  ${warning.style.lowercase()}/${warning.fileName} : ${warning.message}")
                }
            }
        })
    }
}

