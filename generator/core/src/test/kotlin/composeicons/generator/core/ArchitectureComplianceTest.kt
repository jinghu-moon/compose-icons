package composeicons.generator.core

import java.io.File
import kotlin.test.Test
import kotlin.test.fail

class ArchitectureComplianceTest {

    @Test
    fun `generator-core should not depend on specific icon libraries`() {
        // Tests are typically launched with cwd = generator/core, but Gradle
        // composite builds or IDE integrations can place us elsewhere.
        // Probe both candidates and fail-loud if neither resolves.
        val cwdRelative = File("src/main/kotlin")
        val rootRelative = File("generator/core/src/main/kotlin")
        val actualSrcDir = when {
            cwdRelative.exists() -> cwdRelative
            rootRelative.exists() -> rootRelative
            else -> error(
                "ArchitectureComplianceTest cannot locate generator/core source. " +
                    "Tried: ${cwdRelative.absolutePath} and ${rootRelative.absolutePath}. " +
                    "Set the test working directory to generator/core/ or the project root."
            )
        }

        val forbiddenKeywords = listOf(
            "tabler", "lucide", "phosphor", "radix", "remix",
            "heroicons", "iconoir", "ionicons", "bootstrap", "boxicons",
        )

        actualSrcDir.walkTopDown()
            .filter { it.extension == "kt" }
            .forEach { file ->
                val codeLines = file.readLines()
                    .filter { !it.trimStart().startsWith("//") && !it.trimStart().startsWith("/**") && !it.trimStart().startsWith("*") }
                val codeContent = codeLines.joinToString("\n").lowercase()
                forbiddenKeywords.forEach { keyword ->
                    if (codeContent.contains(keyword)) {
                        fail("File ${file.path} contains forbidden keyword '$keyword' in code (not comments). generator-core must be decoupled from specific icon sources.")
                    }
                }
            }
    }
}
