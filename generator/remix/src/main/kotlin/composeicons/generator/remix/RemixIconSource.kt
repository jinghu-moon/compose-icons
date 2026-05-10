package composeicons.generator.remix

import composeicons.generator.core.*
import composeicons.generator.core.SvgMetadata
import composeicons.generator.core.manifest.*
import kotlinx.serialization.json.*
import java.io.File

fun RemixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "remixicons"
    displayName = "Remix Icon"
    iconContainerName = "RemixIcons"
    basePackage = "composeicons.remix"
    upstreamVersion = "4.2.0"

    style("Fill") {
        helperFunction = "remixIcon"
        defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" }
    }
    style("Line") {
        helperFunction = "remixIcon"
        defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" }
    }

    discovery = treeWalk("icons") {
        match("Fill", "-fill")
        match("Line", "-line")
    }

    // Hook: �?tags.json 加载元数�?    hook { entries ->
        val tagsFile = referRoot.resolve("tags.json")
        if (!tagsFile.exists()) return@hook entries

        val json = Json.parseToJsonElement(tagsFile.readText()).jsonObject
        val metaMap = mutableMapOf<String, SvgMetadata>()
        
        json.forEach { (category, icons) ->
            if (icons is JsonObject) {
                icons.forEach { (name, tagsStr) ->
                    val tags = tagsStr.jsonPrimitive.content.split(",").map { it.trim() }.toSet()
                    metaMap[name] = SvgMetadata(tags, category, null, null)
                }
            }
        }

        entries.map { entry ->
            val baseName = entry.fileName.removeSuffix(".svg").removeSuffix("-fill").removeSuffix("-line")
            entry.copy(metadata = metaMap[baseName] ?: SvgMetadata.EMPTY)
        }
    }
}
