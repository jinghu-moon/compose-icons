package composeicons.scanner.ksp

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class IconUsageManifestGroupingTest {

    private fun ref(source: String, style: String, name: String) = IconReference(
        source = source,
        style = style,
        name = name,
        file = "test.kt",
        line = 1,
        column = 1,
    )

    private fun manifest(vararg refs: IconReference) = IconUsageManifest(
        module = ":app",
        generatedAt = "2026-05-08T00:00:00Z",
        icons = refs.toList(),
    )

    // --- T1-02: groupBySource ---

    @Test
    fun `groupBySource - single source - one group`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Filled", "Heart"),
        )
        val grouped = m.groupBySource()
        assertEquals(1, grouped.size)
        assertEquals(2, grouped["tabler"]?.size)
    }

    @Test
    fun `groupBySource - multiple sources - one group per source`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("lucide", "Outline", "Activity"),
            ref("phosphor", "Bold", "Heart"),
        )
        val grouped = m.groupBySource()
        assertEquals(3, grouped.size)
        assertTrue(grouped.containsKey("tabler"))
        assertTrue(grouped.containsKey("lucide"))
        assertTrue(grouped.containsKey("phosphor"))
    }

    @Test
    fun `groupBySource - empty manifest - empty map`() {
        val m = manifest()
        assertEquals(emptyMap(), m.groupBySource())
    }

    // --- T1-02: groupBySourceStyle ---

    @Test
    fun `groupBySourceStyle - 3 sources x 2 styles - 6 groups`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Filled", "Heart"),
            ref("lucide", "Outline", "Activity"),
            ref("lucide", "Filled", "Star"),
            ref("phosphor", "Regular", "House"),
            ref("phosphor", "Bold", "Heart"),
        )
        val grouped = m.groupBySourceStyle()
        assertEquals(6, grouped.size)
        assertEquals(1, grouped[SourceStyle("tabler", "Outline")]?.size)
        assertEquals(1, grouped[SourceStyle("phosphor", "Bold")]?.size)
    }

    @Test
    fun `groupBySourceStyle - same source different style - separate groups`() {
        val m = manifest(
            ref("phosphor", "Thin", "Heart"),
            ref("phosphor", "Light", "Heart"),
            ref("phosphor", "Regular", "Heart"),
        )
        val grouped = m.groupBySourceStyle()
        assertEquals(3, grouped.size)
    }

    @Test
    fun `groupBySourceStyle - duplicate references preserved within group`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Outline", "Home"), // duplicate (different callsite)
        )
        val grouped = m.groupBySourceStyle()
        assertEquals(1, grouped.size)
        assertEquals(2, grouped[SourceStyle("tabler", "Outline")]?.size, "Grouping does not deduplicate")
    }

    // --- T1-02: keep rules from grouped manifest are still consistent ---

    @Test
    fun `keep rules count matches unique source-style-name triples`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Outline", "Heart"),
            ref("tabler", "Filled", "Heart"),
            ref("lucide", "Outline", "Activity"),
        )
        // 4 unique triples → 4 keep rules
        assertEquals(4, m.toR8KeepRules().size)
        // groupBySourceStyle should have 3 groups: (tabler,Outline) (tabler,Filled) (lucide,Outline)
        assertEquals(3, m.groupBySourceStyle().size)
    }

    @Test
    fun `usageSummary - reports source style and icon counts`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Filled", "Heart"),
            ref("lucide", "Outline", "Activity"),
        )
        val summary = m.usageSummary()
        assertEquals(2, summary.sourceCount)
        assertEquals(3, summary.sourceStyleCount)
        assertEquals(3, summary.uniqueIconCount)
    }

    @Test
    fun `usageSummary - deduplicates icons by triple`() {
        val m = manifest(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Outline", "Home"),
        )
        val summary = m.usageSummary()
        assertEquals(1, summary.sourceCount)
        assertEquals(1, summary.sourceStyleCount)
        assertEquals(1, summary.uniqueIconCount, "uniqueIconCount must dedupe")
    }
}
