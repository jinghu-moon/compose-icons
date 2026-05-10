package composeicons.generator.remix

import composeicons.generator.core.SvgMetadata
import kotlinx.serialization.json.*
import java.io.File

object RemixMetadataParser {
    /**
     * 从 tags.json 加载元数据映射。
     * key 为图标名 (不含扩展名)，value 为对应的元数据。
     */
    fun load(tagsFile: File): Map<String, SvgMetadata> {
        if (!tagsFile.exists()) return emptyMap()
        
        return try {
            val json = Json.parseToJsonElement(tagsFile.readText()).jsonObject
            val metaMap = mutableMapOf<String, SvgMetadata>()
            
            json.forEach { (category, icons) ->
                if (icons is JsonObject) {
                    icons.forEach { (name, tagsStr) ->
                        val tags = tagsStr.jsonPrimitive.content
                            .split(",")
                            .map { it.trim() }
                            .filter { it.isNotEmpty() }
                            .toSet()
                        metaMap[name] = SvgMetadata(tags, category, null, null)
                    }
                }
            }
            metaMap
        } catch (e: Exception) {
            System.err.println("Warning: Failed to parse Remix tags.json: ${e.message}")
            emptyMap()
        }
    }
}
