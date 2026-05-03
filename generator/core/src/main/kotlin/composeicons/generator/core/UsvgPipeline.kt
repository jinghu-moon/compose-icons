package composeicons.generator.core

import composeicons.generator.core.json.SvgDocument
import kotlinx.serialization.json.Json
import java.io.File

class UsvgPipeline(
    private val svg2ComposeExecutable: File,
) {
    private val jsonParser = Json { ignoreUnknownKeys = true }

    fun process(rawSvg: String): String {
        val cleanedSvg = cleanSvg(rawSvg)
        val inputFile = File.createTempFile("input-", ".svg")

        try {
            inputFile.writeText(cleanedSvg)

            val process = ProcessBuilder(
                svg2ComposeExecutable.absolutePath,
                "--input", inputFile.absolutePath,
            )
                .redirectErrorStream(true)
                .start()

            val output = process.inputStream.bufferedReader().use { it.readText() }
            val exitCode = process.waitFor()

            if (exitCode != 0) {
                throw RuntimeException("svg2compose failed with exit code $exitCode: $output")
            }

            return output
        } finally {
            inputFile.delete()
        }
    }

    fun processBatch(
        entries: List<Pair<String, String>>,
    ): Map<String, SvgDocument> {
        if (entries.isEmpty()) return emptyMap()

        val tempDir = File.createTempFile("svg2compose-batch-", "")
        tempDir.delete()
        tempDir.mkdirs()

        val outputFile = File.createTempFile("batch-result-", ".json")

        try {
            entries.forEach { (key, rawSvg) ->
                val cleaned = cleanSvg(rawSvg)
                File(tempDir, "$key.svg").writeText(cleaned)
            }

            val process = ProcessBuilder(
                svg2ComposeExecutable.absolutePath,
                "--input-dir", tempDir.absolutePath,
                "--output", outputFile.absolutePath,
            )
                .redirectErrorStream(true)
                .start()

            val stderr = process.inputStream.bufferedReader().use { it.readText() }
            val exitCode = process.waitFor()

            if (exitCode != 0) {
                throw RuntimeException("svg2compose batch failed with exit code $exitCode: $stderr")
            }

            val resultText = outputFile.readText()
            return jsonParser.decodeFromString<Map<String, SvgDocument>>(resultText)
        } finally {
            tempDir.deleteRecursively()
            outputFile.delete()
        }
    }

    companion object {
        private val SVG_TAG_REGEX = Regex("<svg.*</svg>", RegexOption.DOT_MATCHES_ALL)
    }

    private fun cleanSvg(rawSvg: String): String =
        SVG_TAG_REGEX.find(rawSvg)?.value ?: rawSvg
}
