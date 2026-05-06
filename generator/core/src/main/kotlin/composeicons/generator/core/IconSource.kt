package composeicons.generator.core

import java.io.File

interface IconSource {
    val name: String
    val displayName: String
    val iconContainerName: String
    val upstreamVersion: String
    val styles: List<IconStyle>
    val basePackage: String

    fun downloadSvg(outputDir: File)

    fun discoverIcons(svgDir: File): List<SvgIconEntry>

    fun defaultPathStyle(style: IconStyle): PathStyle

    fun helperFunctionName(style: IconStyle): String
}

data class IconStyle(
    val name: String,
    val subdirectory: String,
)

data class SvgIconEntry(
    val fileName: String,
    val style: IconStyle,
    val file: File,
    val metadata: SvgMetadata = SvgMetadata.EMPTY,
)

data class ViewBox(
    val minX: Float,
    val minY: Float,
    val width: Float,
    val height: Float,
)

data class PathStyle(
    val fill: String?,
    val stroke: String?,
    val strokeWidth: Float?,
    val strokeLineCap: String?,
    val strokeLineJoin: String?,
    val fillRule: String?,
    val alpha: Float = 1.0f,
    val originalFill: String? = null,
    val originalStroke: String? = null,
)

data class SvgMetadata(
    val tags: Set<String>,
    val category: String?,
    val version: String?,
    val unicode: String?,
) {
    companion object {
        val EMPTY = SvgMetadata(emptySet(), null, null, null)
    }
}

