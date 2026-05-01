package composeicons.generator.core

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class IconNameCollisionDetectorTest {

    @Test
    fun `detects collisions inside same style`() {
        val outline = IconStyle(name = "Outline", subdirectory = "outline")
        val collisions = IconNameCollisionDetector.detect(
            listOf(
                SvgIconEntry("view-360.svg", outline, File("view-360.svg")),
                SvgIconEntry("view360.svg", outline, File("view360.svg")),
            ),
        )

        assertEquals(1, collisions.size)
        assertEquals("View360", collisions.single().kotlinName)
    }

    @Test
    fun `does not mark same kotlin name in different styles as collision`() {
        val collisions = IconNameCollisionDetector.detect(
            listOf(
                SvgIconEntry("home.svg", IconStyle("Outline", "outline"), File("outline-home.svg")),
                SvgIconEntry("home.svg", IconStyle("Filled", "filled"), File("filled-home.svg")),
            ),
        )

        assertEquals(0, collisions.size)
    }
}

