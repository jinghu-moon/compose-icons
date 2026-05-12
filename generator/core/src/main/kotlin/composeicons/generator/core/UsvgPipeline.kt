package composeicons.generator.core

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
     * Manifest mode: Rust CLI generates .kt files directly.
     * Returns icon result (viewBox + paths) per successfully processed icon.
     */
    fun generateViaManifest(
        entries: List<ManifestEntry>,
        basePackage: String,
        iconContainer: String,
        outputDir: File,
        normalizeSize: Double? = null,
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

            val cmd = mutableListOf(
                svg2ComposeExecutable.absolutePath,
                "--manifest", manifestFile.absolutePath,
                "--output-dir", outputDir.absolutePath,
                "--result", resultFile.absolutePath,
            )
            if (normalizeSize != null) {
                cmd.add("--normalize-size")
                cmd.add(normalizeSize.toString())
            }

            val process = ProcessBuilder(cmd)
                .start()

            val stdout = process.inputStream.bufferedReader().use { it.readText() }
            val stderr = process.errorStream.bufferedReader().use { it.readText() }
            val exitCode = process.waitFor()

            if (exitCode != 0) {
                throw RuntimeException("svg2compose manifest failed with exit code $exitCode: $stderr\n$stdout")
            }

            // Surface diagnostic stderr so it does not get silently swallowed
            // when the process succeeds.
            if (stderr.isNotBlank()) {
                System.err.print(stderr)
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
    val md5: String? = null,
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
    @SerialName("fill_alpha") val fillAlpha: Double = 1.0,
    @SerialName("stroke_alpha") val strokeAlpha: Double = 1.0,
)

@Serializable
data class IconResult(
    @SerialName("view_box") val viewBox: ResultViewBox,
    val paths: List<ResultPathNode> = emptyList(),
    @SerialName("clip_path") val clipPath: String? = null,
)
