package composeicons.generator.core

import java.io.File
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratorEngineIntegrationTest {

    private val projectRoot: File
        get() {
            val fromEnv = System.getenv("COMPOSE_ICONS_PROJECT_ROOT")
            return if (fromEnv != null) File(fromEnv)
                   else File(System.getProperty("user.dir")).let { if (it.name == "core") it.parentFile?.parentFile else it } ?: File(System.getProperty("user.dir"))
        }


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

        val projectRoot = this.projectRoot
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

        val projectRoot = this.projectRoot
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
        val projectRoot = this.projectRoot
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svgFile = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/accessibility.svg")
        val outputDir = Files.createTempDirectory("accessibility-test-").toFile().apply { deleteOnExit() }

        val results = pipeline.generateViaManifest(
            entries = listOf(ManifestEntry(
                svg = svgFile.absolutePath,
                kotlin_name = "Accessibility",
                style_name = "Regular",
                subdirectory = "regular",
                helper = "radixIcon",
            )),
            basePackage = "composeicons.radix",
            iconContainer = "RadixIcons",
            outputDir = outputDir,
        )

        assertTrue(results.isNotEmpty(), "accessibility.svg should produce a result")
    }

    @Test
    fun testPanelLeftSvgSkipsMaskedPaths() {
        val projectRoot = this.projectRoot
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svgFile = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/panel-left.svg")
        val outputDir = Files.createTempDirectory("panel-left-test-").toFile().apply { deleteOnExit() }

        val results = pipeline.generateViaManifest(
            entries = listOf(ManifestEntry(
                svg = svgFile.absolutePath,
                kotlin_name = "PanelLeft",
                style_name = "Regular",
                subdirectory = "regular",
                helper = "radixIcon",
            )),
            basePackage = "composeicons.radix",
            iconContainer = "RadixIcons",
            outputDir = outputDir,
        )

        assertTrue(results.isNotEmpty(), "panel-left.svg should produce a result")
    }

    @Test
    fun testBorderTopSvgHandlesTransform() {
        val projectRoot = this.projectRoot
        val pipeline = UsvgPipeline(defaultSvg2ComposePath(projectRoot))
        val svgFile = File(projectRoot, "refer/Radix-Icons-main/packages/radix-icons/icons/border-top.svg")
        val outputDir = Files.createTempDirectory("border-top-test-").toFile().apply { deleteOnExit() }

        val results = pipeline.generateViaManifest(
            entries = listOf(ManifestEntry(
                svg = svgFile.absolutePath,
                kotlin_name = "BorderTop",
                style_name = "Regular",
                subdirectory = "regular",
                helper = "radixIcon",
            )),
            basePackage = "composeicons.radix",
            iconContainer = "RadixIcons",
            outputDir = outputDir,
        )

        assertTrue(results.isNotEmpty(), "border-top.svg should produce a result")
    }
}
