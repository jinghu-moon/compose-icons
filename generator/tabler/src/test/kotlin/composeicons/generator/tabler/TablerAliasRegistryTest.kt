package composeicons.generator.tabler

import composeicons.generator.core.IconStyle
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TablerAliasRegistryTest {

    @Test
    fun `loads canonical mappings from aliases json`() {
        val referRoot = Files.createTempDirectory("tabler-alias-registry-").toFile().apply {
            deleteOnExit()
        }
        referRoot.resolve("aliases.json").writeText(
            """
            {
              "outline": {
                "2fa": "auth-2fa",
                "360-view": "view-360-number"
              },
              "filled": {
                "message-circle-2": "message-circle"
              }
            }
            """.trimIndent(),
        )

        val registry = TablerAliasRegistry.load(referRoot)
        assertEquals("auth-2fa.svg", registry.canonicalFileName(IconStyle("Outline", "outline"), "2fa.svg"))
        assertEquals("view-360-number.svg", registry.canonicalFileName(IconStyle("Outline", "outline"), "360-view.svg"))
        assertEquals("message-circle.svg", registry.canonicalFileName(IconStyle("Filled", "filled"), "message-circle-2.svg"))
        assertTrue(
            "2fa.svg" in registry.aliasesFor(
                style = IconStyle("Outline", "outline"),
                canonicalFileName = "auth-2fa.svg",
            ),
        )
    }
}

