package composeicons.scanner.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFailsWith

/**
 * Integration tests for ValidateIconTask using ProjectBuilder.
 *
 * Each test creates a Gradle project with pre-populated icon-usage.json
 * and GeneratorReport.json fixtures, then invokes the task's execute()
 * method directly.
 */
class ValidateIconTaskIntegrationTest {

    private fun createTestProject(): Pair<Project, File> {
        val projectDir = createTempDir(prefix = "validate-icon-test-")
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        return project to projectDir
    }

    private fun createTask(project: Project): ValidateIconTask {
        return project.tasks.create("validateIconReferences", ValidateIconTask::class.java)
    }

    /**
     * Create the icon-usage.json manifest in the KSP output directory.
     */
    private fun writeManifest(projectDir: File, icons: List<String>) {
        val dir = projectDir.resolve("build/generated/ksp/debug")
        dir.mkdirs()

        val iconEntries = icons.joinToString(",\n") { name ->
            val parts = name.split(".")
            val source = parts[0].removeSuffix("Icons").lowercase()
            """
                {
                    "source": "$source",
                    "style": "${parts[1]}",
                    "name": "${parts[2]}",
                    "file": "TestScreen.kt",
                    "line": 10,
                    "column": 8
                }
            """.trimIndent()
        }

        val manifest = """
            {
                "module": ":app",
                "generatedAt": "2026-05-07T10:00:00Z",
                "icons": [
                    $iconEntries
                ]
            }
        """

        dir.resolve("icon-usage.json").writeText(manifest)
    }

    /**
     * Create a GeneratorReport.json in the root project's web-preview/public/data/.
     * Uses explorerEntries with style info so the validation task can look up icons by style.
     */
    private fun writeGeneratorReport(project: Project, source: String, iconNames: List<String>, style: String = "Outline") {
        val dir = project.rootProject.file("web-preview/public/data")
        dir.mkdirs()

        val entriesJson = iconNames.joinToString(",") { name ->
            """{"name":"$name","style":"$style","kotlinPath":"$source/$style/$name.kt"}"""
        }
        val report = """
            {
                "source": "$source",
                "upstreamVersion": "1.0.0",
                "total": ${iconNames.size},
                "succeeded": ${iconNames.size},
                "explorerEntries": [$entriesJson],
                "iconNames": []
            }
        """

        dir.resolve("${source.lowercase()}-report.json").writeText(report)
    }

    // --- Tests ---

    @Test
    fun `valid icon references pass validation`() {
        val (project, projectDir) = createTestProject()
        try {
            writeManifest(projectDir, listOf("TablerIcons.Outline.Home", "TablerIcons.Outline.Settings"))
            writeGeneratorReport(project, "Tabler", listOf("Home", "Settings", "Activity"))

            val task = createTask(project)
            task.execute() // Should not throw
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `invalid icon references fail build with suggestions`() {
        val (project, projectDir) = createTestProject()
        try {
            writeManifest(projectDir, listOf("TablerIcons.Outline.Hme"))
            writeGeneratorReport(project, "Tabler", listOf("Home", "Ham", "Hash", "Settings"))

            val task = createTask(project)
            val ex = assertFailsWith<org.gradle.api.GradleException> {
                task.execute()
            }
            assertTrue(ex.message!!.contains("Invalid icon references found"))
            assertTrue(ex.message!!.contains("Hme"))
            assertTrue(ex.message!!.contains("Did you mean:"))
            assertTrue(ex.message!!.contains("Home"))
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `error includes file line and column`() {
        val (project, projectDir) = createTestProject()
        try {
            writeManifest(projectDir, listOf("TablerIcons.Outline.Hme"))
            writeGeneratorReport(project, "Tabler", listOf("Home"))

            val task = createTask(project)
            val ex = assertFailsWith<org.gradle.api.GradleException> {
                task.execute()
            }
            assertTrue(ex.message!!.contains("TestScreen.kt:10:8"))
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `multiple invalid references all reported`() {
        val (project, projectDir) = createTestProject()
        try {
            writeManifest(projectDir, listOf(
                "TablerIcons.Outline.Home",      // valid
                "TablerIcons.Outline.Hme",       // invalid — typo
                "LucideIcons.Outline.Activitty",  // invalid — typo
            ))
            writeGeneratorReport(project, "Tabler", listOf("Home", "Settings"))
            writeGeneratorReport(project, "Lucide", listOf("Activity", "Bell"))

            val task = createTask(project)
            val ex = assertFailsWith<org.gradle.api.GradleException> {
                task.execute()
            }
            assertTrue(ex.message!!.contains("Hme"))
            assertTrue(ex.message!!.contains("Activitty"))
            assertTrue(ex.message!!.contains("Home"))    // suggestion for Hme
            assertTrue(ex.message!!.contains("Activity")) // suggestion for Activitty
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `no manifest file skips validation gracefully`() {
        val (project, projectDir) = createTestProject()
        try {
            // No icon-usage.json created
            val task = createTask(project)
            task.execute() // Should not throw — skips gracefully
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `empty manifest skips validation`() {
        val (project, projectDir) = createTestProject()
        try {
            val dir = projectDir.resolve("build/generated/ksp/debug")
            dir.mkdirs()
            dir.resolve("icon-usage.json").writeText("""
                {
                    "module": ":app",
                    "generatedAt": "2026-05-07T10:00:00Z",
                    "icons": []
                }
            """)

            val task = createTask(project)
            task.execute() // Should not throw — skips gracefully
        } finally {
            projectDir.deleteRecursively()
        }
    }
}
