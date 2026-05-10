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

    override fun discoverIcons(svgDir: File): List<SvgIconEntry> {
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
