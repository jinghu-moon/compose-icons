package composeicons.generator.core

import composeicons.generator.core.json.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class KotlinFileGeneratorTest {

    private val generator = KotlinFileGenerator()

    @Test
    fun testFlatPathNodeGeneratesAddPath() {
        val doc = SvgDocument(
            viewBox = ViewBox(0.0, 0.0, 24.0, 24.0),
            nodes = listOf(JsonPathNode(d = "M 0 0 L 24 24 Z")),
        )
        val output = generator.generate(doc)
        assertTrue(output.contains("addPath("))
    }

    @Test
    fun testGroupNodeGeneratesGroupBlock() {
        val doc = SvgDocument(
            viewBox = ViewBox(0.0, 0.0, 24.0, 24.0),
            nodes = listOf(
                JsonGroupNode(
                    children = listOf(JsonPathNode(d = "M 0 0 Z"))
                )
            ),
        )
        val output = generator.generate(doc)
        assertTrue(output.contains("group("))
        assertTrue(output.contains("addPath("))
    }

    @Test
    fun testGroupWithClipPathGeneratesClipPathParam() {
        val doc = SvgDocument(
            viewBox = ViewBox(0.0, 0.0, 24.0, 24.0),
            nodes = listOf(
                JsonGroupNode(
                    clipPath = "M 0 0 L 20 0 L 20 20 Z",
                    children = listOf(JsonPathNode(d = "M 0 0 Z"))
                )
            ),
        )
        val output = generator.generate(doc)
        assertTrue(output.contains("clipPathData ="))
    }

    @Test
    fun testNestedGroupsGenerateNestedClosures() {
        val doc = SvgDocument(
            viewBox = ViewBox(0.0, 0.0, 24.0, 24.0),
            nodes = listOf(
                JsonGroupNode(
                    children = listOf(
                        JsonGroupNode(
                            children = listOf(JsonPathNode(d = "M 0 0 Z"))
                        )
                    )
                )
            ),
        )
        val output = generator.generate(doc)
        val groupCount = output.split("group(").size - 1
        assertEquals(2, groupCount)
    }
}
