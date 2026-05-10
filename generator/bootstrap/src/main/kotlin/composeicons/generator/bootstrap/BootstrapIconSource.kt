package composeicons.generator.bootstrap

import composeicons.generator.core.*
import java.io.File

class BootstrapIconSource(private val referRoot: File) : IconSource {
    override val name = "bootstrap"
    override val displayName = "Bootstrap Icons"
    override val iconContainerName = "BootstrapIcons"
    override val upstreamVersion = "v1.11.3"
    override val basePackage = "composeicons.bootstrap"

    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Regular", subdirectory = "regular"),
        IconStyle(name = "Fill", subdirectory = "fill"),
    )

    override fun downloadSvg(outputDir: File) {}

    // Bootstrap Icons 使用扁平目录，通过后缀 -fill.svg 区分变体
    // 跳过 -half.svg 变体（仅 15 个，收益低）
    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsDir = referRoot.resolve("icons")
        val allFiles = iconsDir.listFiles { f ->
            f.isFile && f.extension.equals("svg", ignoreCase = true)
        }?.sortedBy { it.name } ?: return emptyList()

        return allFiles.mapNotNull { file ->
            val style = when {
                file.name.endsWith("-fill.svg") -> styles.find { it.name == "Fill" }
                file.name.endsWith("-half.svg") -> null  // 跳过 half 变体
                else -> styles.find { it.name == "Regular" }
            } ?: return@mapNotNull null

            SvgIconEntry(fileName = file.name, style = style, file = file)
        }
    }

    // Bootstrap SVG 根元素已声明 fill="currentColor"，这里作为路径级后备值
    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Regular" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        "Fill" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Regular" -> "bootstrapRegularIcon"
        "Fill" -> "bootstrapFillIcon"
        else -> error("Unknown style: ${style.name}")
    }

    override fun svgSourceDir(referRoot: File): File = referRoot.resolve("icons")
}
