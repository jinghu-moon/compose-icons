package composeicons.generator.iconoir

import composeicons.generator.core.*
import java.io.File

class IconoirIconSource(private val referRoot: File) : IconSource {
    override val name = "iconoir"
    override val displayName = "Iconoir"
    override val iconContainerName = "IconoirIcons"
    override val upstreamVersion = "main"
    override val basePackage = "composeicons.iconoir"

    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Regular", subdirectory = "regular"),
        IconStyle(name = "Solid", subdirectory = "solid"),
    )

    override fun downloadSvg(outputDir: File) {}

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsDir = referRoot.resolve("icons")
        return styles.flatMap { style ->
            iconsDir.resolve(style.subdirectory)
                .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
                ?.sortedBy { it.name }
                ?.map { file ->
                    SvgIconEntry(fileName = file.name, style = style, file = file)
                }
                .orEmpty()
        }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Regular" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 1.5f,
            strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Solid" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Regular" -> "iconoirRegularIcon"
        "Solid" -> "iconoirSolidIcon"
        else -> error("Unknown style: ${style.name}")
    }

    override fun svgSourceDir(referRoot: File): File = referRoot.resolve("icons")
}
