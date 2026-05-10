package composeicons.scanner.ksp

import kotlinx.serialization.Serializable

/**
 * A detected icon reference in source code.
 * Example: `TablerIcons.Outline.Home` → source=tabler, style=Outline, name=Home
 */
@Serializable
data class IconReference(
    val source: String,
    val style: String,
    val name: String,
    val file: String,
    val line: Int,
    val column: Int,
)

/**
 * Warning about dynamic icon usage that may be affected by R8 tree-shaking.
 */
data class DynamicReferenceWarning(
    val source: String,
    val style: String,
    val file: String,
    val line: Int,
    val column: Int,
    val message: String,
)

/**
 * KSP output manifest — all icon references found in a module.
 */
@Serializable
data class IconUsageManifest(
    val module: String,
    val generatedAt: String,
    val icons: List<IconReference>,
)

/**
 * (source, style) pair used as a grouping key for diagnostics and reports.
 */
data class SourceStyle(val source: String, val style: String)

/**
 * Aggregated usage statistics for diagnostic reports.
 */
data class UsageSummary(
    val sourceCount: Int,
    val sourceStyleCount: Int,
    val uniqueIconCount: Int,
)

/**
 * Group all references by their icon source (e.g. "tabler", "lucide").
 * Duplicate references are preserved within each group (each callsite is one entry).
 */
fun IconUsageManifest.groupBySource(): Map<String, List<IconReference>> =
    icons.groupBy { it.source }

/**
 * Group all references by (source, style) pair. Duplicates preserved per callsite.
 */
fun IconUsageManifest.groupBySourceStyle(): Map<SourceStyle, List<IconReference>> =
    icons.groupBy { SourceStyle(it.source, it.style) }

/**
 * Compute aggregate usage statistics. Icons are deduplicated by (source, style, name)
 * so multiple callsites of the same icon count once.
 */
fun IconUsageManifest.usageSummary(): UsageSummary {
    val unique = icons.distinctBy { Triple(it.source, it.style, it.name) }
    return UsageSummary(
        sourceCount = unique.map { it.source }.distinct().size,
        sourceStyleCount = unique.map { SourceStyle(it.source, it.style) }.distinct().size,
        uniqueIconCount = unique.size,
    )
}
