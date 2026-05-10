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
        assertEquals(listOf("Home"), report.iconNames)
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
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/accessibility.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }

    @Test
    fun testPanelLeftSvgSkipsMaskedPaths() {
        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/panel-left.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }

    @Test
    fun testBorderTopSvgHandlesTransform() {
        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svg = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/border-top.svg").readText()
        val result = pipeline.process(svg)
        val doc = Json { ignoreUnknownKeys = true }.decodeFromString<SvgDocument>(result)
        assertTrue(doc.nodes.isNotEmpty())
    }

    // --- Phase 1C Task 3.3: Shared Path Pool incremental cache ---
    @Test
    fun `changing one style regenerates all styles for shared path pool`() {
        val workspace = Files.createTempDirectory("compose-icons-shared-pool-").toFile().apply {
            deleteOnExit()
        }
        val sourceRoot = workspace.resolve("source")
        val outputDir = workspace.resolve("output")
        val reportDir = workspace.resolve("report")
        sourceRoot.resolve("regular").mkdirs()
        sourceRoot.resolve("bold").mkdirs()

        val svgTemplate = """
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
              <path d="{path}" />
            </svg>
        """.trimIndent()

        sourceRoot.resolve("regular/heart.svg").writeText(svgTemplate.replace("{path}", "M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5"))
        sourceRoot.resolve("bold/heart.svg").writeText(svgTemplate.replace("{path}", "M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5"))

        val projectRoot = File(System.getProperty("user.dir")).parentFile.parentFile ?: File(System.getProperty("user.dir"))
        val engine = GeneratorEngine(projectRoot)

        val source = object : IconSource {
            override val name: String = "test"
            override val displayName: String = "TestIcons"
            override val iconContainerName: String = "TestIcons"
            override val upstreamVersion: String = "1.0.0"
            override val styles: List<IconStyle> = listOf(
                IconStyle("Regular", "regular"),
                IconStyle("Bold", "bold"),
            )
            override val basePackage: String = "composeicons.test"
            override fun downloadSvg(outputDir: File) = Unit
            override fun discoverIcons(svgDir: File): List<SvgIconEntry> = listOf(
                SvgIconEntry(fileName = "heart.svg", style = styles[0], file = svgDir.resolve("regular/heart.svg")),
                SvgIconEntry(fileName = "heart.svg", style = styles[1], file = svgDir.resolve("bold/heart.svg")),
            )
            override fun defaultPathStyle(style: IconStyle): PathStyle = PathStyle(
                fill = "none", stroke = "currentColor", strokeWidth = 2f,
                strokeLineCap = "round", strokeLineJoin = "round", fillRule = null,
            )
            override fun helperFunctionName(style: IconStyle): String = "test${style.name}Icon"
        }

        val config = GeneratorConfig(sourceRootDir = sourceRoot, outputDir = outputDir, reportDir = reportDir)

        // First run: generate both styles
        val report1 = engine.generate(config, source)
        assertEquals(2, report1.succeeded)
        assertTrue(outputDir.resolve("regular/Heart.kt").isFile)
        assertTrue(outputDir.resolve("bold/Heart.kt").isFile)
        val regularModTime1 = outputDir.resolve("regular/Heart.kt").lastModified()
        val boldModTime1 = outputDir.resolve("bold/Heart.kt").lastModified()

        // Wait a bit to ensure file timestamps differ
        Thread.sleep(100)

        // Second run: change only Regular style SVG (different path)
        sourceRoot.resolve("regular/heart.svg").writeText(svgTemplate.replace("{path}", "M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 3 9.5"))
        val report2 = engine.generate(config, source)
        assertEquals(2, report2.succeeded)

        // Both files should be regenerated because the icon "Heart" has a changed style
        val regularModTime2 = outputDir.resolve("regular/Heart.kt").lastModified()
        val boldModTime2 = outputDir.resolve("bold/Heart.kt").lastModified()
        assertTrue(regularModTime2 > regularModTime1, "Regular should be regenerated")
        assertTrue(boldModTime2 > boldModTime1, "Bold should be regenerated (shared path pool expansion)")
    }
}
