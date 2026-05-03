package composeicons.generator.core

import composeicons.generator.core.json.SvgDocument
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

class UsvgPipeline(
    private val svg2ComposeExecutable: File,
) {
    private val jsonParser = Json { ignoreUnknownKeys = true }

    /**
     * Single SVG → JSON (legacy, kept for integration tests).
     */
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

    /**
     * Manifest mode: Rust CLI generates .kt files directly.
     * Returns icon result (viewBox + paths) per successfully processed icon.
     */
    fun generateViaManifest(
        entries: List<ManifestEntry>,
        basePackage: String,
        iconContainer: String,
        outputDir: File,
    ): Map<String, IconResult> {
        if (entries.isEmpty()) return emptyMap()

        val manifestFile = File.createTempFile("svg2compose-manifest-", ".json")
        val resultFile = File.createTempFile("svg2compose-result-", ".json")

        try {
            val manifest = Svg2ComposeManifest(
                base_package = basePackage,
                icon_container = iconContainer,
                icons = entries,
            )
            manifestFile.writeText(jsonParser.encodeToString(manifest))

            val process = ProcessBuilder(
                svg2ComposeExecutable.absolutePath,
                "--manifest", manifestFile.absolutePath,
                "--output-dir", outputDir.absolutePath,
                "--result", resultFile.absolutePath,
            )
                .redirectErrorStream(true)
                .start()

            val stderr = process.inputStream.bufferedReader().use { it.readText() }
            val exitCode = process.waitFor()

            if (exitCode != 0) {
                throw RuntimeException("svg2compose manifest failed with exit code $exitCode: $stderr")
            }

            return if (resultFile.exists()) {
                jsonParser.decodeFromString<Map<String, IconResult>>(resultFile.readText())
            } else {
                emptyMap()
            }
        } finally {
            manifestFile.delete()
            resultFile.delete()
        }
    }

    companion object {
        private val SVG_TAG_REGEX = Regex("<svg.*</svg>", RegexOption.DOT_MATCHES_ALL)
    }

    private fun cleanSvg(rawSvg: String): String =
        SVG_TAG_REGEX.find(rawSvg)?.value ?: rawSvg
}

// --- Manifest data classes (serialized to JSON for Rust CLI) ---

@Serializable
data class Svg2ComposeManifest(
    val base_package: String,
    val icon_container: String,
    val icons: List<ManifestEntry>,
)

@Serializable
data class ManifestEntry(
    val svg: String,
    val kotlin_name: String,
    val style_name: String,
    val subdirectory: String,
    val helper: String,
)

@Serializable
data class ResultViewBox(
    val min_x: Double,
    val min_y: Double,
    val width: Double,
    val height: Double,
)

@Serializable
data class ResultPathNode(
    val d: String,
    val fill: String? = null,
    val stroke: String? = null,
    @SerialName("stroke_width") val strokeWidth: Double? = null,
    @SerialName("stroke_line_cap") val strokeLineCap: String? = null,
    @SerialName("stroke_line_join") val strokeLineJoin: String? = null,
    @SerialName("fill_rule") val fillRule: String? = null,
    val alpha: Double = 1.0,
)

@Serializable
data class IconResult(
    @SerialName("view_box") val viewBox: ResultViewBox,
    val paths: List<ResultPathNode> = emptyList(),
)
