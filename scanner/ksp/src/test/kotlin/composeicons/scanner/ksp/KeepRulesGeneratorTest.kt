package composeicons.scanner.ksp

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KeepRulesGeneratorTest {

    private fun ref(source: String, style: String, name: String) = IconReference(
        source = source,
        style = style,
        name = name,
        file = "test.kt",
        line = 1,
        column = 1,
    )

    // --- T1-01: keepRules derived field ---

    @Test
    fun `single reference produces one keep rule`() {
        val rules = toR8KeepRules(listOf(ref("tabler", "Outline", "Home")))
        assertEquals(
            listOf("-keep class composeicons.tabler.outline.HomeKt { *; }"),
            rules,
        )
    }

    @Test
    fun `duplicate references are deduplicated`() {
        val rules = toR8KeepRules(
            listOf(
                ref("tabler", "Outline", "Home"),
                ref("tabler", "Outline", "Home"),
                ref("tabler", "Outline", "Home"),
            )
        )
        assertEquals(1, rules.size)
    }

    @Test
    fun `multiple unique triples each produce one rule`() {
        val rules = toR8KeepRules(
            listOf(
                ref("tabler", "Outline", "Home"),
                ref("tabler", "Filled", "Heart"),
                ref("lucide", "Outline", "Activity"),
            )
        )
        assertEquals(3, rules.size)
        // Sorted alphabetically for deterministic output
        assertEquals("-keep class composeicons.lucide.outline.ActivityKt { *; }", rules[0])
        assertEquals("-keep class composeicons.tabler.filled.HeartKt { *; }", rules[1])
        assertEquals("-keep class composeicons.tabler.outline.HomeKt { *; }", rules[2])
    }

    @Test
    fun `style maps to lowercase package, name keeps PascalCase`() {
        val rules = toR8KeepRules(listOf(ref("phosphor", "Duotone", "AirTrafficControl")))
        assertEquals(
            "-keep class composeicons.phosphor.duotone.AirTrafficControlKt { *; }",
            rules[0],
        )
    }

    @Test
    fun `empty input returns empty list`() {
        assertEquals(emptyList(), toR8KeepRules(emptyList()))
    }

    @Test
    fun `output is deterministic across runs`() {
        val refs = listOf(
            ref("tabler", "Outline", "Home"),
            ref("phosphor", "Bold", "Heart"),
            ref("lucide", "Outline", "Activity"),
        )
        val a = toR8KeepRules(refs)
        val b = toR8KeepRules(refs.reversed())
        assertEquals(a, b, "Order of input must not affect output")
    }

    @Test
    fun `IconUsageManifest extension delegates correctly`() {
        val manifest = IconUsageManifest(
            module = ":app",
            generatedAt = "2026-05-08T00:00:00Z",
            icons = listOf(
                ref("tabler", "Outline", "Home"),
                ref("tabler", "Filled", "Heart"),
            ),
        )
        val rules = manifest.toR8KeepRules()
        assertEquals(2, rules.size)
        assertTrue(rules.contains("-keep class composeicons.tabler.outline.HomeKt { *; }"))
        assertTrue(rules.contains("-keep class composeicons.tabler.filled.HeartKt { *; }"))
    }

    @Test
    fun `all five known icon sources produce valid package names`() {
        val rules = toR8KeepRules(
            listOf(
                ref("tabler", "Outline", "Home"),
                ref("lucide", "Outline", "Activity"),
                ref("phosphor", "Regular", "Heart"),
                ref("remix", "Line", "ArrowLeft"),
                ref("radix", "Regular", "Accessibility"),
            )
        )
        assertEquals(5, rules.size)
        rules.forEach {
            assertTrue(it.startsWith("-keep class composeicons."))
            assertTrue(it.endsWith("Kt { *; }"))
        }
    }

    // ============================================================
    // T1-04R — KeepRuleStrategy variants
    // ============================================================

    private val sampleRefs = listOf(
        ref("tabler", "Outline", "Home"),
        ref("lucide", "Outline", "Activity"),
    )

    @Test
    fun `strategy NONE returns empty list regardless of input size`() {
        val rules = toR8KeepRules(sampleRefs, KeepRuleStrategy.NONE)
        assertTrue(rules.isEmpty(), "NONE strategy must produce zero rules")
    }

    @Test
    fun `strategy AGGRESSIVE matches legacy behavior with star-semicolon`() {
        val rules = toR8KeepRules(sampleRefs, KeepRuleStrategy.AGGRESSIVE)
        assertEquals(2, rules.size)
        assertEquals("-keep class composeicons.lucide.outline.ActivityKt { *; }", rules[0])
        assertEquals("-keep class composeicons.tabler.outline.HomeKt { *; }", rules[1])
    }

    @Test
    fun `strategy MEMBERS keeps file class with only getter members`() {
        val rules = toR8KeepRules(sampleRefs, KeepRuleStrategy.MEMBERS)
        assertEquals(2, rules.size)

        // Multi-line rule per icon: -keep class … { public static *** get*(…); }
        val home = rules.first { "HomeKt" in it }
        assertTrue("-keep class composeicons.tabler.outline.HomeKt {" in home)
        assertTrue("public static *** get*(...);" in home, "MEMBERS rule must restrict to getters")
        assertTrue(home.endsWith("}"))
        assertFalse("{ *; }" in home, "MEMBERS rule must NOT use the wildcard form")
    }

    @Test
    fun `strategy MEMBERS preserves dedup + sort guarantees`() {
        val refs = listOf(
            ref("tabler", "Outline", "Home"),
            ref("tabler", "Outline", "Home"), // duplicate
            ref("lucide", "Outline", "Activity"),
            ref("phosphor", "Bold", "Heart"),
        )
        val rules = toR8KeepRules(refs, KeepRuleStrategy.MEMBERS)
        assertEquals(3, rules.size, "duplicates removed even under MEMBERS")
        // Sorted: lucide < phosphor < tabler
        assertTrue("composeicons.lucide" in rules[0])
        assertTrue("composeicons.phosphor" in rules[1])
        assertTrue("composeicons.tabler" in rules[2])
    }

    @Test
    fun `default strategy is AGGRESSIVE for backward compatibility`() {
        // Existing call sites without explicit strategy must keep producing
        // `{ *; }` rules to avoid silently changing behavior in CI.
        val implicitDefault = toR8KeepRules(sampleRefs)
        val explicitAggressive = toR8KeepRules(sampleRefs, KeepRuleStrategy.AGGRESSIVE)
        assertEquals(explicitAggressive, implicitDefault)
    }

    @Test
    fun `manifest extension propagates strategy parameter`() {
        val manifest = IconUsageManifest(
            module = ":app",
            generatedAt = "2026-05-08T00:00:00Z",
            icons = sampleRefs,
        )
        assertTrue(manifest.toR8KeepRules(KeepRuleStrategy.NONE).isEmpty())
        assertEquals(2, manifest.toR8KeepRules(KeepRuleStrategy.MEMBERS).size)
        assertEquals(2, manifest.toR8KeepRules(KeepRuleStrategy.AGGRESSIVE).size)
    }
}
