package composeicons.scanner.plugin

import kotlinx.serialization.Serializable

/**
 * KSP output manifest — mirrors [composeicons.scanner.ksp.IconUsageManifest]
 * but declared locally to avoid cross-module dependency.
 */
@Serializable
data class IconUsageManifest(
    val module: String,
    val generatedAt: String,
    val icons: List<IconReference>,
)

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
 * DTO for GeneratorReport.json — subset needed for validation.
 */
@Serializable
data class GeneratorReportDto(
    val source: String,
    val upstreamVersion: String = "",
    val total: Int = 0,
    val succeeded: Int = 0,
    val explorerEntries: List<ExplorerEntryDto> = emptyList(),
    val iconNames: List<String> = emptyList(),
)

@Serializable
data class ExplorerEntryDto(
    val name: String,
    val style: String,
    val kotlinPath: String = "",
)

/**
 * Strategy for shaping R8 keep rules. Mirrors
 * `composeicons.scanner.ksp.KeepRuleStrategy` — keep both copies in sync.
 *
 * See the ksp-side enum docs for the trade-off between safety and dex size.
 */
enum class KeepRuleStrategy {
    NONE,
    MEMBERS,
    AGGRESSIVE,
}

/**
 * Convert icon references into deduplicated, sorted R8 keep rules under the
 * given [strategy].
 *
 * Mirrors `composeicons.scanner.ksp.toR8KeepRules` — keep both copies in sync.
 * The plugin module avoids depending on scanner-ksp at runtime, so the function
 * is duplicated by design (acceptable per existing mirror pattern in this file).
 *
 * Default strategy is [KeepRuleStrategy.AGGRESSIVE] for backward compatibility.
 */
fun toR8KeepRules(
    refs: Iterable<IconReference>,
    strategy: KeepRuleStrategy = KeepRuleStrategy.AGGRESSIVE,
): List<String> {
    if (strategy == KeepRuleStrategy.NONE) return emptyList()
    return refs
        .map { ref ->
            val pkg = "composeicons.${ref.source}.${ref.style.lowercase()}"
            val cls = "$pkg.${ref.name}Kt"
            when (strategy) {
                KeepRuleStrategy.NONE -> error("NONE handled at higher level")
                KeepRuleStrategy.AGGRESSIVE -> "-keep class $cls { *; }"
                KeepRuleStrategy.MEMBERS ->
                    "-keep class $cls { public static *** get*(...); }"
            }
        }
        .distinct()
        .sorted()
}
