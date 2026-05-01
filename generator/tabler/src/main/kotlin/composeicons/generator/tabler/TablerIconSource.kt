package composeicons.generator.tabler

import composeicons.generator.core.IconSource
import composeicons.generator.core.IconStyle
import composeicons.generator.core.PathStyle
import composeicons.generator.core.SvgIconEntry
import composeicons.generator.core.IconNameMapper
import composeicons.generator.core.ParsedSvgIcon
import composeicons.generator.core.SvgMetadata
import java.io.File

class TablerIconSource(
    override val upstreamVersion: String = "3.41.1",
    private val referRoot: File,
) : IconSource {
    private val aliasRegistry: TablerAliasRegistry = TablerAliasRegistry.load(referRoot)

    override val name: String = "tabler"
    override val displayName: String = "TablerIcons"
    override val iconContainerName: String = "TablerIcons"
    override val basePackage: String = "composeicons.tabler"
    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Outline", subdirectory = "outline"),
        IconStyle(name = "Filled", subdirectory = "filled"),
    )

    override fun downloadSvg(outputDir: File) {
        outputDir.mkdirs()
    }

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val effectiveDir = if (svgDir.exists()) svgDir else referRoot.resolve("icons")
        return styles.flatMap { style ->
            effectiveDir
                .resolve(style.subdirectory)
                .listFiles { file -> file.isFile && file.extension.equals("svg", ignoreCase = true) }
                ?.sortedBy { it.name }
                ?.mapNotNull { file ->
                    val canonicalFileName = aliasRegistry.canonicalFileName(style, file.name)
                    if (canonicalFileName != file.name) {
                        null
                    } else {
                        file
                    }
                }
                ?.map { file ->
                    val content = file.readText()
                    val tags = mutableSetOf<String>()
                    var category: String? = null
                    
                    Regex("tags:\\s*\\[(.*?)\\]").find(content)?.let { matchResult ->
                        val tagsStr = matchResult.groupValues[1]
                        tags.addAll(tagsStr.split(",").map { it.trim() }.filter { it.isNotEmpty() })
                    }
            
                    Regex("category:\\s*(.*?)\\s*\\n").find(content)?.let { matchResult ->
                        category = matchResult.groupValues[1].trim()
                    }

                    SvgIconEntry(
                        fileName = file.name,
                        style = style,
                        file = file,
                        metadata = SvgMetadata(tags, category, null, null),
                    )
                }
                .orEmpty()
        }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Outline" -> PathStyle(
            fill = "none",
            stroke = "currentColor",
            strokeWidth = 2f,
            strokeLineCap = "round",
            strokeLineJoin = "round",
            fillRule = null,
        )
        "Filled" -> PathStyle(
            fill = "currentColor",
            stroke = null,
            strokeWidth = null,
            strokeLineCap = null,
            strokeLineJoin = null,
            fillRule = null,
        )
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Outline" -> "tablerOutlineIcon"
        "Filled" -> "tablerFilledIcon"
        else -> error("Unknown style: ${style.name}")
    }
}
