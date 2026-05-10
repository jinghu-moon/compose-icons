package composeicons.generator.tabler

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun TablerIconSource(
    upstreamVersion: String = "3.41.1",
    referRoot: File,
): IconSource {
    val aliasRegistry = TablerAliasRegistry.load(referRoot)

    return iconLibrary(referRoot) {
        name = "tabler"
        displayName = "TablerIcons"
        iconContainerName = "TablerIcons"
        basePackage = "composeicons.tabler"
        this.upstreamVersion = upstreamVersion

        style("Outline") {
            subdirectory = "outline"
            helperFunction = "tablerOutlineIcon"
            defaultPathStyle {
                fill = "none"; stroke = "currentColor"; strokeWidth = 2f
                strokeLineCap = "round"; strokeLineJoin = "round"
            }
        }
        style("Filled") {
            subdirectory = "filled"
            helperFunction = "tablerFilledIcon"
            defaultPathStyle { fill = "currentColor" }
        }

        discovery = subdirectories("icons")

        // Hook 1: 过滤 Alias
        hook { entries ->
            entries.filter { entry ->
                aliasRegistry.canonicalFileName(entry.style, entry.fileName) == entry.fileName
            }
        }

        // Hook 2: 解析元数据 (tags/category)
        hook { entries ->
            entries.map { entry ->
                val content = entry.file.readText()
                val tags = Regex("tags:\\s*\\[(.*?)\\]").find(content)?.groupValues?.get(1)
                    ?.split(",")?.map { it.trim() }?.filter { it.isNotEmpty() }?.toSet().orEmpty()
                val category = Regex("category:\\s*(.*?)\\s*\\n").find(content)?.groupValues?.get(1)?.trim()
                
                entry.copy(metadata = SvgMetadata(tags, category, null, null))
            }
        }
    }
}
