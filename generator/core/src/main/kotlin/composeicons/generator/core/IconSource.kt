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

    /**
     * 返回精确�?SVG 文件扫描根目录�?     *
     * 用于 GeneratorConfig.sourceRootDir �?Gradle @InputDirectory 缓存键，
     * 确保只追踪真正的 SVG 源文件，避免 README、LICENSE 等无关文件变更触发重新生成�?     *
     * 默认实现直接返回 referRoot，各实现可覆写以返回更精确的子目录�?     */
    fun svgSourceDir(referRoot: File): File = referRoot
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
    /**
     * 磁盘原始文件名，用于 AliasFilterHook 比对。
     *
     * Flat / Subdirectories 策略下 = file.name（与 fileName 相同）。
     * SuffixBased 策略下 = file.name（含 style 后缀），而 fileName 已剥离后缀。
     *
     * 测试等场景可省略，默认回退到 fileName。
     */
    val rawFileName: String = "",
) {
    /** 生产代码应显式传入 rawFileName；测试可省略（回退到 fileName）。 */
    val effectiveRawFileName: String get() = rawFileName.ifEmpty { fileName }
}

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

