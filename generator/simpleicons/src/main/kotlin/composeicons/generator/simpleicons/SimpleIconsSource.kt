package composeicons.generator.simpleicons

import composeicons.generator.core.IconNameMapper
import composeicons.generator.core.IconSource
import composeicons.generator.core.manifest.iconLibrary
import composeicons.generator.core.manifest.flat
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File

fun SimpleIconsSource(referRoot: File): IconSource {
    val colorMap = loadBrandColors(referRoot)

    return iconLibrary(referRoot) {
        name = "simpleicons"
        displayName = "Simple Icons"
        iconContainerName = "SimpleIcons"
        basePackage = "composeicons.simpleicons"
        upstreamVersion = "16.x"

        iconColors = colorMap

        style("Default") {
            helperFunction = "simpleIcon"
            defaultPathStyle { fill = "currentColor" }
        }

        discovery = flat("icons")
    }
}

/**
 * 从 simple-icons.json 读取品牌色，扫描 SVG `<title>` 匹配 JSON title，
 * 构建 kotlinIconName → hex color 映射。
 */
private fun loadBrandColors(referRoot: File): Map<String, String> {
    val jsonFile = referRoot.resolve("data/simple-icons.json")
    if (!jsonFile.exists()) return emptyMap()

    val titleToHex: Map<String, String> = try {
        val array = Json.parseToJsonElement(jsonFile.readText()).jsonArray
        buildMap {
            for (element in array) {
                val obj = element.jsonObject
                val title = obj["title"]?.jsonPrimitive?.content ?: continue
                val hex = obj["hex"]?.jsonPrimitive?.content ?: continue
                put(title.lowercase(), hex)
            }
        }
    } catch (_: Exception) {
        return emptyMap()
    }

    val titleRegex = Regex("""<title>([^<]+)</title>""")

    return referRoot.resolve("icons")
        .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
        .orEmpty()
        .mapNotNull { file ->
            val content = file.readText()
            val match = titleRegex.find(content) ?: return@mapNotNull null
            val title = match.groupValues[1].lowercase()
            val hex = titleToHex[title] ?: return@mapNotNull null
            val kotlinName = IconNameMapper.toKotlinName(file.name)
            kotlinName to hex
        }
        .toMap()
}
