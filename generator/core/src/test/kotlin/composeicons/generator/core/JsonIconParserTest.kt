package composeicons.generator.core

import composeicons.generator.core.json.*
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class JsonIconParserTest {

    private val json = Json { ignoreUnknownKeys = true }

    @Test
    fun parseSinglePathNode_fromMockJson() {
        val input = """
        {
            "view_box": {"x": 0, "y": 0, "width": 24, "height": 24},
            "nodes": [{
                "type": "path",
                "d": "M 0 0 L 24 24 Z",
                "fill": {"color": "#000000", "opacity": 1.0, "rule": "nonzero"}
            }]
        }
        """.trimIndent()

        val doc = json.decodeFromString<SvgDocument>(input)
        assertEquals(1, doc.nodes.size)

        val node = doc.nodes[0] as JsonPathNode
        assertEquals("#000000", node.fill?.color)
        assertEquals("M 0 0 L 24 24 Z", node.d)
    }

    @Test
    fun parseGroupNodeWithClipPath_fromMockJson() {
        val input = """
        {
            "view_box": {"x": 0, "y": 0, "width": 15, "height": 15},
            "nodes": [{
                "type": "group",
                "opacity": 0.5,
                "clip_path": "M 0 0 L 10 0 L 10 10 Z",
                "children": [{
                    "type": "path",
                    "d": "M 1 1 L 9 9 Z"
                }]
            }]
        }
        """.trimIndent()

        val doc = json.decodeFromString<SvgDocument>(input)
        val group = doc.nodes[0] as JsonGroupNode

        assertEquals(0.5, group.opacity, 0.01)
        assertNotNull(group.clipPath)
        assertEquals(1, group.children.size)
    }

    @Test
    fun parseSealedNodeTypes_roundTrip() {
        val doc = SvgDocument(
            viewBox = ViewBox(0.0, 0.0, 24.0, 24.0),
            nodes = listOf(
                JsonPathNode(d = "M 0 0 Z"),
                JsonGroupNode(
                    opacity = 0.8,
                    children = listOf(JsonPathNode(d = "M 10 10 Z"))
                ),
            ),
        )

        val serialized = json.encodeToString(SvgDocument.serializer(), doc)
        val deserialized = json.decodeFromString<SvgDocument>(serialized)

        assertEquals(doc.nodes.size, deserialized.nodes.size)
        assertEquals(
            (doc.nodes[0] as JsonPathNode).d,
            (deserialized.nodes[0] as JsonPathNode).d
        )
    }
}
