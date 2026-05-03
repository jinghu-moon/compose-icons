package composeicons.generator.core

import kotlinx.serialization.json.Json
import java.io.File

object GeneratorReportReader {
    private val json = Json {
        prettyPrint = true
        encodeDefaults = true
        ignoreUnknownKeys = true
    }

    fun read(reportDir: File, sourceName: String): GeneratorReport? {
        val manifestFile = reportDir.resolve("${sourceName.lowercase()}.json")
        if (!manifestFile.exists()) return null
        
        return try {
            json.decodeFromString<GeneratorReport>(manifestFile.readText())
        } catch (e: Exception) {
            null
        }
    }
}
