package composeicons.generator.core

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.contains
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Files

class GeneratorIntegrationTest {

    @Test
    fun `radix icons normalize to 24x24`() {
        val workspace = Files.createTempDirectory("compose-icons-test-").toFile().apply { deleteOnExit() }
        val sourceRoot = workspace.resolve("source")
        val outputDir = workspace.resolve("output")
        val reportDir = workspace.resolve("report")
        sourceRoot.resolve("outline").mkdirs()

        // Radix icon raw size is usually 15x15
        sourceRoot.resolve("outline/activity-log.svg").writeText(
            """
            <svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path d="M7.5 0.875C7.5 0.529822 7.77982 0.25 8.125 0.25H11.5C11.8452 0.25 12.125 0.529822 12.125 0.875V3.375C12.125 3.72018 11.8452 4 11.5 4H8.125C7.77982 4 7.5 3.72018 7.5 3.375V0.875Z" fill="currentColor"/>
            </svg>
            """.trimIndent(),
        )

        val fromEnv = System.getenv("COMPOSE_ICONS_PROJECT_ROOT")
        val projectRoot = if (fromEnv != null) File(fromEnv)
                          else File(System.getProperty("user.dir")).let { if (it.name == "core") it.parentFile?.parentFile else it } ?: File(System.getProperty("user.dir"))
        val engine = GeneratorEngine(projectRoot)

        val source = object : IconSource {
            override val name: String = "radix"
            override val displayName: String = "Radix Icons"
            override val iconContainerName: String = "RadixIcons"
            override val upstreamVersion: String = "1.3.0"
            override val styles: List<IconStyle> = listOf(IconStyle("Outline", "outline"))
            override val basePackage: String = "composeicons.radix"

            override fun downloadSvg(outputDir: File) = Unit
            override fun discoverIcons(svgDir: File): List<SvgIconEntry> = listOf(
                SvgIconEntry(
                    fileName = "activity-log.svg",
                    style = styles.single(),
                    file = svgDir.resolve("outline/activity-log.svg"),
                ),
            )
            override fun defaultPathStyle(style: IconStyle): PathStyle = PathStyle(
                fill = "none", stroke = null, strokeWidth = 0f,
                strokeLineCap = "butt", strokeLineJoin = "miter", fillRule = "nonzero",
            )
            override fun helperFunctionName(style: IconStyle): String = "radixIcon"
        }

        val config = GeneratorConfig(
            sourceRootDir = sourceRoot,
            outputDir = outputDir,
            reportDir = reportDir,
            normalizeSize = 24.0,
        )

        val report = engine.generate(config, source)

        // Verify output size
        assertThat(report.succeeded).isEqualTo(1)
        
        // Verify viewBox normalized to 24x24
        assertAll {
            report.explorerEntries.forEach { entry ->
                assertThat(entry.viewBox.width).isEqualTo(24.0f)
                assertThat(entry.viewBox.height).isEqualTo(24.0f)
            }
        }
    }

    @Test
    fun `bom module constrains all icon versions`() {
        val fromEnv = System.getenv("COMPOSE_ICONS_PROJECT_ROOT")
        val projectRoot = if (fromEnv != null) File(fromEnv)
                          else File(System.getProperty("user.dir")).let { if (it.name == "core") it.parentFile?.parentFile else it } ?: File(System.getProperty("user.dir"))
        val bomFile = projectRoot.resolve("compose-icons-bom/build.gradle.kts")
        
        if (!bomFile.exists()) {
            return // Skip if running in isolated test module without root context
        }

        val bom = bomFile.readText()
        assertAll {
            assertThat(bom).contains("icons-core")
            assertThat(bom).contains("icons-tabler")
            assertThat(bom).contains("icons-lucide")
            assertThat(bom).contains("icons-radix")
            assertThat(bom).contains("icons-phosphor")
            assertThat(bom).contains("icons-remix")
        }
    }
}
