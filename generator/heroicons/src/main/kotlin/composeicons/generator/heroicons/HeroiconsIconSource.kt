package composeicons.generator.heroicons

import composeicons.generator.core.*
import java.io.File

class HeroiconsIconSource(private val referRoot: File) : IconSource {
    override val name = "heroicons"
    override val displayName = "Heroicons"
    override val iconContainerName = "HeroiconsIcons"
    override val upstreamVersion = "v2.2.0"
    override val basePackage = "composeicons.heroicons"

    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Solid16", subdirectory = "solid16"),
        IconStyle(name = "Solid20", subdirectory = "solid20"),
        IconStyle(name = "Outline", subdirectory = "outline"),
        IconStyle(name = "Solid", subdirectory = "solid"),
    )

    // 尺寸目录到变体的映射
    private val dirMapping = mapOf(
        "Solid16" to "16/solid",
        "Solid20" to "20/solid",
        "Outline" to "24/outline",
        "Solid"   to "24/solid",
    )

    override fun downloadSvg(outputDir: File) {}

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val srcDir = referRoot.resolve("src")
        return styles.flatMap { style ->
            val subPath = dirMapping[style.name]!!
            srcDir.resolve(subPath)
                .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
                ?.sortedBy { it.name }
                ?.map { file ->
                    SvgIconEntry(fileName = file.name, style = style, file = file)
                }
                .orEmpty()
        }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Outline" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 1.5f,
            strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        else -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Solid16" -> "heroiconsSolid16Icon"
        "Solid20" -> "heroiconsSolid20Icon"
        "Outline" -> "heroiconsOutlineIcon"
        "Solid"   -> "heroiconsSolidIcon"
        else -> error("Unknown style: ${style.name}")
    }

    override fun svgSourceDir(referRoot: File): File = referRoot.resolve("src")
}
