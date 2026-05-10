package composeicons.generator.boxicons

import composeicons.generator.core.*
import java.io.File

class BoxiconsIconSource(private val referRoot: File) : IconSource {
    override val name = "boxicons"
    override val displayName = "Boxicons"
    override val iconContainerName = "BoxiconsIcons"
    override val upstreamVersion = "2.1.4"
    override val basePackage = "composeicons.boxicons"

    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Regular", subdirectory = "regular"),
        IconStyle(name = "Solid", subdirectory = "solid"),
        IconStyle(name = "Logos", subdirectory = "logos"),
    )

    // 目录名到源码子目录的映射
    private val dirMapping = mapOf(
        "Regular" to "basic",
        "Solid" to "filled",
        "Logos" to "brands",
    )

    override fun downloadSvg(outputDir: File) {}

    // Boxicons 通过目录区分变体，所有文件统一 bx- 前缀
    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsDir = referRoot.resolve("svg")
        return styles.flatMap { style ->
            val subPath = dirMapping[style.name]!!
            iconsDir.resolve(subPath)
                .listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }
                ?.sortedBy { it.name }
                ?.map { file ->
                    SvgIconEntry(fileName = file.name, style = style, file = file)
                }
                .orEmpty()
        }
    }

    // Boxicons 路径元素无 fill/stroke 属性，defaultPathStyle 决定渲染行为
    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Regular" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        "Solid" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        "Logos" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Regular" -> "boxiconsRegularIcon"
        "Solid" -> "boxiconsSolidIcon"
        "Logos" -> "boxiconsLogosIcon"
        else -> error("Unknown style: ${style.name}")
    }

    override fun svgSourceDir(referRoot: File): File = referRoot.resolve("svg")
}
