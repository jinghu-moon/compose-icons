package composeicons.scanner.plugin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LevenshteinTest {

    @Test
    fun `identical strings have distance 0`() {
        assertEquals(0, Levenshtein.distance("Home", "Home"))
    }

    @Test
    fun `single character difference has distance 1`() {
        assertEquals(1, Levenshtein.distance("Home", "Hme"))
    }

    @Test
    fun `insertion has distance 1`() {
        assertEquals(1, Levenshtein.distance("Home", "Homes"))
    }

    @Test
    fun `complete difference equals longer length`() {
        assertEquals(3, Levenshtein.distance("abc", "xyz"))
    }

    @Test
    fun `empty string distance equals other length`() {
        assertEquals(4, Levenshtein.distance("", "Home"))
        assertEquals(4, Levenshtein.distance("Home", ""))
    }

    @Test
    fun `suggest returns closest matches`() {
        val candidates = listOf("Home", "Ham", "Hash", "Settings", "Activity")
        val suggestions = Levenshtein.suggest("Hme", candidates, count = 3)

        assertTrue(suggestions.isNotEmpty())
        assertEquals("Home", suggestions[0].first)
        assertEquals(1, suggestions[0].second)
    }

    @Test
    fun `suggest filters out distant matches`() {
        val candidates = listOf("Home", "Settings", "Activity", "Accessibility")
        val suggestions = Levenshtein.suggest("Hme", candidates, count = 3)

        // "Settings", "Activity", "Accessibility" are too far from "Hme"
        assertTrue(suggestions.all { it.first == "Home" || it.second <= 3 })
    }

    @Test
    fun `suggest handles case insensitive matching`() {
        val candidates = listOf("Home", "home", "HOME")
        val suggestions = Levenshtein.suggest("home", candidates, count = 3)
        assertEquals(3, suggestions.size)
    }

    @Test
    fun `suggest returns empty for no close matches`() {
        val candidates = listOf("Accessibility", "Settings", "Activity")
        val suggestions = Levenshtein.suggest("ZZZZZ", candidates, count = 3)
        assertTrue(suggestions.isEmpty())
    }
}
