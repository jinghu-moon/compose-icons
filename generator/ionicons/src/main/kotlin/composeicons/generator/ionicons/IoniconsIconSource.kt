package composeicons.generator.ionicons

import composeicons.generator.core.*
import java.io.File

class IoniconsIconSource(private val referRoot: File) : IconSource {
    override val name = "ionicons"
    override val displayName = "Ionicons"
    override val iconContainerName = "IoniconsIcons"
    override val upstreamVersion = "main"
    override val basePackage = "composeicons.ionicons"

    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Filled", subdirectory = "filled"),
        IconStyle(name = "Outline", subdirectory = "outline"),
        IconStyle(name = "Sharp", subdirectory = "sharp"),
    )

    override fun downloadSvg(outputDir: File) {}

    // Ionicons 使用扁平目录，通过文件名后缀区分变体
    // filled 没有后缀（直接为 {name}.svg），outline 为 {name}-outline.svg，sharp 为 {name}-sharp.svg
    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsDir = referRoot.resolve("src/svg")
        val allFiles = iconsDir.listFiles { f ->
            f.isFile && f.extension.equals("svg", ignoreCase = true)
        }?.sortedBy { it.name } ?: return emptyList()

        return allFiles.mapNotNull { file ->
            val style = when {
                file.name.endsWith("-outline.svg") -> styles.find { it.name == "Outline" }
                file.name.endsWith("-sharp.svg") -> styles.find { it.name == "Sharp" }
                else -> styles.find { it.name == "Filled" }
            } ?: return@mapNotNull null

            SvgIconEntry(fileName = file.name, style = style, file = file)
        }
    }

    // Ionicons 使用 512x512 viewBox，outline 的 stroke-width 为 32
    override fun defaultPathStyle(style: IconStyle): PathStyle = when (style.name) {
        "Outline" -> PathStyle(fill = "none", stroke = "currentColor", strokeWidth = 32f,
            strokeLineCap = "round", strokeLineJoin = "round", fillRule = null)
        "Sharp" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        "Filled" -> PathStyle(fill = "currentColor", stroke = null, strokeWidth = null,
            strokeLineCap = null, strokeLineJoin = null, fillRule = null)
        else -> error("Unknown style: ${style.name}")
    }

    override fun helperFunctionName(style: IconStyle): String = when (style.name) {
        "Filled" -> "ioniconsFilledIcon"
        "Outline" -> "ioniconsOutlineIcon"
        "Sharp" -> "ioniconsSharpIcon"
        else -> error("Unknown style: ${style.name}")
    }

    override fun svgSourceDir(referRoot: File): File = referRoot.resolve("src/svg")
}
