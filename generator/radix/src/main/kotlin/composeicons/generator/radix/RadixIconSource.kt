package composeicons.generator.radix

import composeicons.generator.core.*
import java.io.File

class RadixIconSource(private val referRoot: File) : IconSource {
    override val name = "radixicons"
    override val displayName = "Radix Icons"
    override val iconContainerName = "RadixIcons"
    override val upstreamVersion = "1.3.0"
    override val basePackage = "composeicons.radix"

    override val styles = listOf(
        IconStyle("Regular", "regular")
    )

    override fun downloadSvg(outputDir: File) {
        // Already available in refer/
    }

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
        val iconsRoot = referRoot.resolve("packages/radix-icons/icons")
        if (!iconsRoot.exists()) return emptyList()
        
        return iconsRoot.listFiles { file -> file.extension == "svg" }?.map { file ->
            SvgIconEntry(
                fileName = file.nameWithoutExtension,
                style = styles[0],
                file = file,
                metadata = SvgMetadata.EMPTY
            )
        } ?: emptyList()
    }

    override fun defaultPathStyle(style: IconStyle) = PathStyle(
        fill = "currentColor",
        stroke = null,
        strokeWidth = null,
        strokeLineCap = null,
        strokeLineJoin = null,
        fillRule = "nonzero"
    )

    override fun helperFunctionName(style: IconStyle) = "radixIcon"

    override fun svgSourceDir(referRoot: File): File =
        referRoot.resolve("packages/radix-icons/icons")
}
