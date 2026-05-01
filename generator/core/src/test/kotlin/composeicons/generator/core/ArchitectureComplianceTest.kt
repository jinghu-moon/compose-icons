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

        val forbiddenKeywords = listOf("tabler", "lucide")

        actualSrcDir.walkTopDown()
            .filter { it.extension == "kt" }
            .forEach { file ->
                val content = file.readText().lowercase()
                forbiddenKeywords.forEach { keyword ->
                    if (content.contains(keyword)) {
                        fail("File ${file.path} contains forbidden keyword '$keyword'. generator-core must be decoupled from specific icon sources.")
                    }
                }
            }
    }
}
