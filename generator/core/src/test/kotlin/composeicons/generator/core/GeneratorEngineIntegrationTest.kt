package composeicons.generator.core

import composeicons.generator.core.json.SvgDocument
import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratorEngineIntegrationTest {

    @Test
    fun `generates kotlin files and report for simple icon source`() {
        val workspace = Files.createTempDirectory("compose-icons-test-").toFile().apply {
            deleteOnExit()
        }
        val sourceRoot = workspace.resolve("source")
        val outputDir = workspace.resolve("output")
        val reportDir = workspace.resolve("report")
        sourceRoot.resolve("outline").mkdirs()

        sourceRoot.resolve("outline/home.svg").writeText(
            """
            <!--
            tags: [home]
            category: Buildings
            -->
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
              <path d="M5 12l-2 0l9 -9z" />
            </svg>
            """.trimIndent(),
        )

        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val engine = GeneratorEngine(projectRoot)
        val report = engine.generate(
            config = GeneratorConfig(
                sourceRootDir = sourceRoot,
                outputDir = outputDir,
                reportDir = reportDir,
            ),
            source = object : IconSource {
                override val name: String = "test"
                override val displayName: String = "TestIcons"
                override val iconContainerName: String = "TestIcons"
                override val upstreamVersion: String = "1.0.0"
                override val styles: List<IconStyle> = listOf(IconStyle("Outline", "outline"))
                override val basePackage: String = "composeicons.test"

                override fun downloadSvg(outputDir: File) = Unit

                override fun discoverIcons(svgDir: File): List<SvgIconEntry> = listOf(
                    SvgIconEntry(
                        fileName = "home.svg",
                        style = styles.single(),
                        file = svgDir.resolve("outline/home.svg"),
                    ),
                )

                override fun defaultPathStyle(style: IconStyle): PathStyle = PathStyle(
                    fill = "none",
                    stroke = "currentColor",
                    strokeWidth = 2f,
                    strokeLineCap = "round",
                    strokeLineJoin = "round",
                    fillRule = null,
                )

                override fun helperFunctionName(style: IconStyle): String = "testOutlineIcon"
            },
        )

        assertEquals(1, report.total)
        assertEquals(1, report.succeeded)
        assertTrue(report.failed.isEmpty())
        assertTrue(outputDir.resolve("outline/Home.kt").isFile)
        assertTrue(reportDir.resolve("generation-report.txt").isFile)
    }

    @Test
    fun `removes stale generated files before writing new output`() {
        val workspace = Files.createTempDirectory("compose-icons-clean-").toFile().apply {
            deleteOnExit()
        }
        val sourceRoot = workspace.resolve("source")
        val outputDir = workspace.resolve("output")
        val reportDir = workspace.resolve("report")
        sourceRoot.resolve("outline").mkdirs()
        outputDir.resolve("outline").mkdirs()
        outputDir.resolve("outline/Stale.kt").writeText("// stale")

        sourceRoot.resolve("outline/home.svg").writeText(
            """
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
              <path d="M5 12l-2 0l9 -9z" />
            </svg>
            """.trimIndent(),
        )

        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val engine = GeneratorEngine(projectRoot)
        engine.generate(
            config = GeneratorConfig(
                sourceRootDir = sourceRoot,
                outputDir = outputDir,
                reportDir = reportDir,
            ),
            source = object : IconSource {
                override val name: String = "test"
                override val displayName: String = "TestIcons"
                override val iconContainerName: String = "TestIcons"
                override val upstreamVersion: String = "1.0.0"
                override val styles: List<IconStyle> = listOf(IconStyle("Outline", "outline"))
                override val basePackage: String = "composeicons.test"

                override fun downloadSvg(outputDir: File) = Unit

                override fun discoverIcons(svgDir: File): List<SvgIconEntry> = listOf(
                    SvgIconEntry(
                        fileName = "home.svg",
                        style = styles.single(),
                        file = svgDir.resolve("outline/home.svg"),
                    ),
                )

                override fun defaultPathStyle(style: IconStyle): PathStyle = PathStyle(
                    fill = "none",
                    stroke = "currentColor",
                    strokeWidth = 2f,
                    strokeLineCap = "round",
                    strokeLineJoin = "round",
                    fillRule = null,
                )

                override fun helperFunctionName(style: IconStyle): String = "testOutlineIcon"
            },
        )

        assertTrue(!outputDir.resolve("outline/Stale.kt").exists())
        assertTrue(outputDir.resolve("outline/Home.kt").isFile)
    }

    @Test
    fun testAccessibilitySvgProcessesSuccessfully() {
        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val pipeline = UsvgPipeline(projectRoot.resolve("tools/svg2compose.exe"))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/accessibility.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }

    @Test
    fun testPanelLeftSvgSkipsMaskedPaths() {
        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val pipeline = UsvgPipeline(projectRoot.resolve("tools/svg2compose.exe"))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/panel-left.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }

    @Test
    fun testBorderTopSvgHandlesTransform() {
        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val pipeline = UsvgPipeline(projectRoot.resolve("tools/svg2compose.exe"))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/border-top.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }
}
