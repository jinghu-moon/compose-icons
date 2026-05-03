package composeicons.generator.remix

import composeicons.generator.core.*
import kotlinx.serialization.json.*
import java.io.File

class RemixIconSource(private val referRoot: File) : IconSource {
    override val name = "remixicons"
    override val displayName = "Remix Icon"
    override val iconContainerName = "RemixIcons"
    override val upstreamVersion = "4.2.0"
    override val basePackage = "composeicons.remix"

    override val styles = listOf(
        IconStyle("Fill", "fill"),
        IconStyle("Line", "line")
    )

    private val tagsMap: Map<String, Pair<String, Set<String>>> by lazy {
        val tagsFile = referRoot.resolve("tags.json")
        if (!tagsFile.exists()) return@lazy emptyMap()
        
        val json = Json.parseToJsonElement(tagsFile.readText()).jsonObject
        val result = mutableMapOf<String, Pair<String, Set<String>>>()
        
        json.forEach { (category, icons) ->
            if (icons is JsonObject) {
                icons.jsonObject.forEach { (name, tagsStr) ->
                    val tags = tagsStr.jsonPrimitive.content.split(",").map { it.trim() }.toSet()
                    result[name] = category to tags
                }
            }
        }
        result
    }

    override fun downloadSvg(outputDir: File) {
        // Already available in refer/
    }

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsRoot = referRoot.resolve("icons")
        val result = mutableListOf<SvgIconEntry>()
        
        iconsRoot.walkTopDown().filter { it.extension == "svg" }.forEach { file ->
            val fileName = file.nameWithoutExtension
            val style = when {
                fileName.endsWith("-fill") -> styles[0]
                fileName.endsWith("-line") -> styles[1]
                else -> null
            }
            
            if (style != null) {
                // Remove suffix for lookup and clean name
                val baseName = fileName.removeSuffix("-fill").removeSuffix("-line")
                val metaInfo = tagsMap[baseName]
                
                result.add(SvgIconEntry(
                    fileName = fileName,
                    style = style,
                    file = file,
                    metadata = SvgMetadata(
                        tags = metaInfo?.second ?: emptySet(),
                        category = metaInfo?.first,
                        version = null,
                        unicode = null
                    )
                ))
            }
        }
        return result
    }

    override fun defaultPathStyle(style: IconStyle) = PathStyle(
        fill = "currentColor",
        stroke = null,
        strokeWidth = null,
        strokeLineCap = null,
        strokeLineJoin = null,
        fillRule = "nonzero"
    )

    override fun helperFunctionName(style: IconStyle) = "remixIcon"
}
