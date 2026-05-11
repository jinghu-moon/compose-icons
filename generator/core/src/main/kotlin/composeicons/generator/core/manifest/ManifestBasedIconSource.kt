package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

class ManifestBasedIconSource(
    private val manifest: LibraryManifest,
    private val referRoot: File,
) : IconSource {
    override val name: String = manifest.name
    override val displayName: String = manifest.displayName
    override val iconContainerName: String = manifest.iconContainerName
    override val upstreamVersion: String = manifest.upstreamVersion
    override val basePackage: String = manifest.basePackage
    override val styles: List<IconStyle> = manifest.styles.map { it.toIconStyle() }

    override fun downloadSvg(outputDir: File) {}  // no-op, Gradle handles

    override fun discoverIcons(@Suppress("UNUSED_PARAMETER") svgDir: File): List<SvgIconEntry> {
        // 使用 referRoot 而非 svgDir：策略内部会 resolve(subdir) 构建完整路径，
        // svgDir 已是 svgSourceDir() 解析后的子目录，传入会导致双重嵌套。
        val raw = manifest.discovery.discover(referRoot, manifest.styles)
        return manifest.hooks.fold(raw) { acc, hook -> hook.transform(acc) }
    }

    override fun defaultPathStyle(style: IconStyle): PathStyle =
        manifest.styles.find { it.name == style.name }?.defaultPathStyle
            ?: error("Unknown style: ${style.name}")

    override fun helperFunctionName(style: IconStyle): String =
        manifest.styles.find { it.name == style.name }?.helperFunction
            ?: error("Unknown style: ${style.name}")

    override fun svgSourceDir(referRoot: File): File =
        manifest.discovery.resolvedSourceDir(referRoot)
}
