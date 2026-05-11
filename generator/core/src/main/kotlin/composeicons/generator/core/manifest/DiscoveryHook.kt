package composeicons.generator.core.manifest

import composeicons.generator.core.*

fun interface DiscoveryHook {
    fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry>
}

/** 过滤 alias SVG（Tabler aliases.json 场景）。 */
class AliasFilterHook(private val aliases: Set<String>) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.filter { it.effectiveRawFileName !in aliases }
}

/** 用外部元数据富化每个 entry。key 为 fileName.removeSuffix(".svg")。 */
class MetadataEnricherHook(
    private val metadataBy: Map<String, SvgMetadata>,
) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.map { entry ->
            val key = entry.fileName.removeSuffix(".svg")
            entry.copy(metadata = metadataBy[key] ?: SvgMetadata.EMPTY)
        }
}
