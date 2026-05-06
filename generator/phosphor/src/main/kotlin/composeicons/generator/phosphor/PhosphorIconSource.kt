package composeicons.generator.phosphor

import composeicons.generator.core.IconSource
import composeicons.generator.core.IconStyle
import composeicons.generator.core.PathStyle
import composeicons.generator.core.SvgIconEntry
import composeicons.generator.core.SvgMetadata
import java.io.File

class PhosphorIconSource(
    override val upstreamVersion: String = "2.1.0",
    private val referRoot: File,
) : IconSource {

    override val name: String = "phosphor"
    override val displayName: String = "PhosphorIcons"
    override val iconContainerName: String = "PhosphorIcons"
    override val basePackage: String = "composeicons.phosphor"
    
    // Phosphor 有 6 种风格
    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Thin", subdirectory = "thin"),
        IconStyle(name = "Light", subdirectory = "light"),
        IconStyle(name = "Regular", subdirectory = "regular"),
        IconStyle(name = "Bold", subdirectory = "bold"),
        IconStyle(name = "Fill", subdirectory = "fill"),
        IconStyle(name = "Duotone", subdirectory = "duotone"),
    )

    override fun downloadSvg(outputDir: File) {
        // 使用 refer 目录
    }

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsDir = referRoot.resolve("public/assets/phosphor.iconjar/icons")
        if (!iconsDir.exists()) {
            error("Phosphor icons directory not found at ${iconsDir.absolutePath}")
        }

        val allSvgFiles = iconsDir.listFiles { file ->
            file.isFile && file.extension.equals("svg", ignoreCase = true)
        } ?: return emptyList()

        return allSvgFiles.mapNotNull { file ->
            val fileName = file.name
            val style = when {
                fileName.endsWith("-thin.svg") -> styles.find { it.name == "Thin" }
                fileName.endsWith("-light.svg") -> styles.find { it.name == "Light" }
                fileName.endsWith("-bold.svg") -> styles.find { it.name == "Bold" }
                fileName.endsWith("-fill.svg") -> styles.find { it.name == "Fill" }
                fileName.endsWith("-duotone.svg") -> styles.find { it.name == "Duotone" }
                else -> styles.find { it.name == "Regular" }
            } ?: return@mapNotNull null

            val cleanName = when (style.name) {
                "Regular" -> fileName
                else -> fileName.replace("-${style.name.lowercase()}.svg", ".svg")
            }

            SvgIconEntry(
                fileName = cleanName,
                style = style,
                file = file,
                metadata = SvgMetadata.EMPTY
            )
        }.sortedBy { it.fileName + it.style.name }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Thin" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 8f, strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Light" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 12f, strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Regular" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 16f, strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Bold" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 24f, strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Fill" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null, strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        "Duotone" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 16f, strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Thin" -> "phosphorThinIcon"
        "Light" -> "phosphorLightIcon"
        "Regular" -> "phosphorRegularIcon"
        "Bold" -> "phosphorBoldIcon"
        "Fill" -> "phosphorFillIcon"
        "Duotone" -> "phosphorDuotoneIcon"
        else -> error("Unknown style: ${style.name}")
    }
}
