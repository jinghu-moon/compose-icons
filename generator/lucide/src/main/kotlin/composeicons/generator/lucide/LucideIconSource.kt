package composeicons.generator.lucide

import composeicons.generator.core.IconNameMapper
import composeicons.generator.core.IconSource
import composeicons.generator.core.IconStyle
import composeicons.generator.core.ParsedSvgIcon
import composeicons.generator.core.PathStyle
import composeicons.generator.core.SvgIconEntry
import composeicons.generator.core.SvgMetadata
import java.io.File

class LucideIconSource(
    override val upstreamVersion: String = "main",
    private val referRoot: File,
) : IconSource {

    override val name: String = "lucide"
    override val displayName: String = "LucideIcons"
    override val iconContainerName: String = "LucideIcons"
    override val basePackage: String = "composeicons.lucide"
    override val styles: List<IconStyle> = listOf(
        IconStyle(name = "Outline", subdirectory = "outline"),
    )

    override fun downloadSvg(outputDir: File) {
        outputDir.mkdirs()
    }

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val effectiveDir = if (svgDir.exists()) svgDir else referRoot.resolve("icons")
        return effectiveDir
            .listFiles { file -> file.isFile && file.extension.equals("svg", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?.map { file ->
                SvgIconEntry(
                    fileName = file.name,
                    style = styles.single(),
                    file = file,
                    metadata = SvgMetadata.EMPTY,
                )
            }
            .orEmpty()
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle = PathStyle(
        fill = "none",
        stroke = "currentColor",
        strokeWidth = 2f,
        strokeLineCap = "round",
        strokeLineJoin = "round",
        fillRule = null,
    )

    override fun helperFunctionName(style: IconStyle): String = "lucideOutlineIcon"
}
