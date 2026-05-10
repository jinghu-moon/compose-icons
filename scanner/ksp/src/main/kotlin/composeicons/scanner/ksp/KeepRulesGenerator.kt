package composeicons.scanner.ksp

/**
 * Strategy for shaping R8 keep rules emitted from icon usage data.
 *
 * Each strategy trades **safety against R8 over-shrinking** for
 * **dex/metadata footprint**. Empirically (see README §"APK 体积模型"):
 *
 * - [NONE] — no rules emitted. Rely entirely on R8's default reachability
 *   analysis (top-level Kotlin val getters are statically reachable from
 *   any `Icon(TablerIcons.Outline.Home, …)` call site, so R8 finds them
 *   without help). **Smallest dex** in projects that have NOT written
 *   defensive `-keep class composeicons.*.**` wildcards.
 *
 * - [MEMBERS] — `-keep class …Kt { public static *** get*(…); }`. Pins
 *   the file class + getter signatures only, leaves Compose-generated
 *   lambdas / `$stable` / metadata up to R8 to shrink as it sees fit.
 *   **Middle ground**: safer than NONE if upstream code ever invokes
 *   getters via reflection or via constants table; smaller than AGGRESSIVE
 *   because metadata is shrinkable.
 *
 * - [AGGRESSIVE] — `-keep class …Kt { *; }`. Pins everything in the file
 *   class. Useful when consumers are migrating away from a hand-written
 *   `-keep class composeicons.tabler.** { *; }` wildcard and want the
 *   allowlist to fully replace it. **Largest dex** because synthetic
 *   members and metadata can no longer be removed by R8.
 */
enum class KeepRuleStrategy {
    NONE,
    MEMBERS,
    AGGRESSIVE,
}

/**
 * Generates R8/ProGuard `-keep` rules from icon references.
 *
 * Each generated icon resides in a top-level Kotlin file at:
 * `composeicons/{source}/{style.lowercase()}/{Name}.kt` → JVM file-class `{Name}Kt`.
 *
 * Output is deduplicated and alphabetically sorted for deterministic builds.
 */

/**
 * Convert a flat collection of [IconReference] into a sorted, deduplicated list of
 * R8 keep rules under the given [strategy].
 *
 * Default strategy is [KeepRuleStrategy.AGGRESSIVE] for backward compatibility
 * with existing call sites that predate the strategy parameter.
 */
fun toR8KeepRules(
    refs: Iterable<IconReference>,
    strategy: KeepRuleStrategy = KeepRuleStrategy.AGGRESSIVE,
): List<String> {
    if (strategy == KeepRuleStrategy.NONE) return emptyList()
    return refs
        .map { it.toKeepRule(strategy) }
        .distinct()
        .sorted()
}

/**
 * Manifest extension: produce keep rules for all icons recorded in this manifest.
 */
fun IconUsageManifest.toR8KeepRules(
    strategy: KeepRuleStrategy = KeepRuleStrategy.AGGRESSIVE,
): List<String> = toR8KeepRules(icons, strategy)

private fun IconReference.toKeepRule(strategy: KeepRuleStrategy): String {
    val pkg = "composeicons.$source.${style.lowercase()}"
    val className = "$pkg.${name}Kt"
    return when (strategy) {
        KeepRuleStrategy.NONE -> error("NONE handled at higher level")
        KeepRuleStrategy.AGGRESSIVE -> "-keep class $className { *; }"
        KeepRuleStrategy.MEMBERS ->
            // Single-line for stable diff & easier comparison.
            "-keep class $className { public static *** get*(...); }"
    }
}
