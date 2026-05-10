package composeicons.scanner.ksp

/**
 * Regex-based scanner that detects icon references and dynamic usage patterns
 * in Kotlin source code.
 *
 * Matches:
 * - Direct icon access: `TablerIcons.Outline.Home` → (tabler, Outline, Home)
 * - Dynamic style usage: `val x = TablerIcons.Outline` → WARNING
 */
class IconReferenceScanner(
    private val knownSources: Set<String> = DEFAULT_SOURCES,
) {
    /**
     * Regex matching `{Source}Icons.{Style}.{Name}` — three-part property access.
     * Group 1 = Style (e.g., "Outline")
     * Group 2 = Name (e.g., "Home")
     */
    private val iconAccessPattern: Regex = run {
        val sources = knownSources.joinToString("|")
        Regex("""\b(?:$sources)\w*Icons\.(\w+)\.(\w+)""")
    }

    /**
     * Regex matching two-part access: `{Source}Icons.{Style}`.
     * Group 1 = full match of `{Source}Icons.{Style}` (e.g., "TablerIcons.Outline")
     */
    private val twoPartPattern: Regex = run {
        val sources = knownSources.joinToString("|")
        Regex("""\b((?:$sources)\w*Icons\.(\w+))""")
    }

    private val knownStyles = setOf(
        // Tabler / Lucide
        "Outline", "Filled",
        // Phosphor
        "Thin", "Light", "Regular", "Bold", "Fill", "Duotone",
        // Remix
        "Line",
        // Generic
        "Default", "Small", "Large",
    )

    /**
     * Scan source text and return all direct icon references.
     */
    fun scanReferences(sourceText: String, fileName: String): List<IconReference> {
        val results = mutableListOf<IconReference>()
        val lines = sourceText.lines()

        for ((lineIndex, line) in lines.withIndex()) {
            for (match in iconAccessPattern.findAll(line)) {
                val fullMatch = match.value
                val sourcePart = fullMatch.substringBefore(".")
                val source = normalizeSource(sourcePart)
                val style = match.groupValues[1]
                val name = match.groupValues[2]
                val column = match.range.first + 1

                results += IconReference(
                    source = source,
                    style = style,
                    name = name,
                    file = fileName,
                    line = lineIndex + 1,
                    column = column,
                )
            }
        }
        return results
    }

    /**
     * Scan source text for dynamic icon references (Style objects used as values).
     *
     * Uses a two-phase approach:
     * 1. Collect all three-part icon access ranges (e.g., `TablerIcons.Outline.Home`)
     * 2. Scan for two-part patterns, excluding those that overlap with three-part accesses
     */
    fun scanDynamicWarnings(sourceText: String, fileName: String): List<DynamicReferenceWarning> {
        val results = mutableListOf<DynamicReferenceWarning>()
        val lines = sourceText.lines()

        for ((lineIndex, line) in lines.withIndex()) {
            // Phase 1: Collect ranges of three-part icon accesses on this line
            val threePartRanges = iconAccessPattern.findAll(line)
                .map { it.range }
                .toSet()

            // Phase 2: Scan for two-part patterns
            for (match in twoPartPattern.findAll(line)) {
                val style = match.groupValues[2]
                if (style !in knownStyles) continue

                // Skip if this two-part match overlaps with a three-part access
                val overlapsThreePart = threePartRanges.any { range ->
                    match.range.first >= range.first && match.range.first <= range.last
                }
                if (overlapsThreePart) continue

                val sourcePart = match.groupValues[1].substringBefore(".")
                val source = normalizeSource(sourcePart)
                val column = match.range.first + 1

                // Skip import statements
                if (line.trimStart().startsWith("import ")) continue

                // Skip object declarations: `object Outline`
                if (Regex("""\bobject\s+$style\b""").containsMatchIn(line)) continue

                // Detect assignment or parameter usage
                val isAssignment = Regex("""\bval\s+\w+\s*=\s*.*${Regex.escape(match.value)}""").containsMatchIn(line)
                val isParameter = Regex("""\bfun\s+\w+\s*\([^)]*${Regex.escape(match.value)}""").containsMatchIn(line)
                val isReturn = Regex("""\breturn\s+${Regex.escape(match.value)}""").containsMatchIn(line)

                if (isAssignment || isParameter || isReturn) {
                    results += DynamicReferenceWarning(
                        source = source,
                        style = style,
                        file = fileName,
                        line = lineIndex + 1,
                        column = column,
                        message = "IconScanner: 检测到 $source.$style 被作为值使用 ($fileName:${lineIndex + 1})\n" +
                            "   该图标可能在 R8 阶段被意外裁剪。建议直接引用具体图标属性。",
                    )
                }
            }
        }
        return results
    }

    private fun normalizeSource(raw: String): String = raw
        .removeSuffix("Icons")
        .lowercase()

    companion object {
        val DEFAULT_SOURCES = setOf("Tabler", "Lucide", "Phosphor", "Remix", "Radix")
    }
}
