package composeicons.generator.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File
import kotlin.test.assertFailsWith

class NormalizedPathParserTest {

    private val parser = NormalizedPathParser()
    private val defaultStyle = PathStyle("none", "currentColor", 2f, "round", "round", null)

    private fun mockEntry(xml: String): Pair<SvgIconEntry, String> {
        return SvgIconEntry("test.svg", IconStyle("test", "test"), File(".")) to xml
    }

    @Test
    fun `parse handles negative numbers and scientific notation correctly`() {
        val (entry, xml) = mockEntry("""<svg viewBox="0 0 24 24"><path d="M-2.5 -3.7 L 1.5e-3 -4.2e2 Z"/></svg>""")
        val icon = parser.parse(entry, defaultStyle, xml)
        val path = icon.paths.first()
        assertEquals(3, path.commands.size)
        
        val move = path.commands[0]
        assertEquals('M', move.command)
        assertEquals(-2.5f, move.arguments[0])
        assertEquals(-3.7f, move.arguments[1])

        val line = path.commands[1]
        assertEquals('L', line.command)
        assertEquals(0.0015f, line.arguments[0], 0.0001f)
        assertEquals(-420f, line.arguments[1], 0.1f)
    }

    @Test
    fun `parse enforces white list of path commands`() {
        val (entry, xml) = mockEntry("""<svg viewBox="0 0 24 24"><path d="M 0 0 H 10 Z"/></svg>""")
        assertFailsWith<IllegalStateException> {
            parser.parse(entry, defaultStyle, xml)
        }
    }

    @Test
    fun `parse normalizes coordinates based on non-zero viewBox`() {
        val (entry, xml) = mockEntry("""<svg viewBox="-10 -10 24 24"><path d="M 0 0 L 10 10 Z"/></svg>""")
        val icon = parser.parse(entry, defaultStyle, xml)
        val path = icon.paths.first()
        
        val move = path.commands[0]
        assertEquals(10f, move.arguments[0])
        assertEquals(10f, move.arguments[1])
        
        val line = path.commands[1]
        assertEquals(20f, line.arguments[0])
        assertEquals(20f, line.arguments[1])
    }
}
