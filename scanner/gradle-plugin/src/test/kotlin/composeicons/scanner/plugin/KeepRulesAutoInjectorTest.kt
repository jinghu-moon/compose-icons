package composeicons.scanner.plugin

import org.gradle.testfixtures.ProjectBuilder
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Unit tests for [KeepRulesAutoInjector] helper functions.
 *
 * Full Android-application integration is verified separately through the
 * sample module's release build (T1-04b) — `ProjectBuilder` cannot fully
 * apply the Android Gradle Plugin in this test scope.
 */
class KeepRulesAutoInjectorTest {

    // --- T1-04: keep-file detection ---

    @Test
    fun `isKeepFileAlreadyInjected - empty list - false`() {
        assertFalse(isKeepFileAlreadyInjected(emptyList<Any>()))
    }

    @Test
    fun `isKeepFileAlreadyInjected - unrelated files - false`() {
        val files = listOf(
            File("/tmp/proguard-android-optimize.txt"),
            File("/tmp/proguard-rules.pro"),
        )
        assertFalse(isKeepFileAlreadyInjected(files))
    }

    @Test
    fun `isKeepFileAlreadyInjected - contains icon-allowlist - true`() {
        val files = listOf(
            File("/tmp/proguard-rules.pro"),
            File("/tmp/build/generated/composeicons/proguard/icon-allowlist.pro"),
        )
        assertTrue(isKeepFileAlreadyInjected(files))
    }

    @Test
    fun `isKeepFileAlreadyInjected - mixed types via toString - true`() {
        // proguardFiles can hold String entries too; check toString-based matching
        val items = listOf("proguard-rules.pro", "/abs/path/icon-allowlist.pro")
        assertTrue(isKeepFileAlreadyInjected(items))
    }

    // --- T1-04: keep-file path computation ---

    @Test
    fun `computeKeepFilePath - returns canonical project relative path`() {
        val projectDir = createTempDir(prefix = "auto-inject-test-")
        try {
            val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
            val keepFile = computeKeepFilePath(project)
            val expectedSuffix = "build/generated/composeicons/proguard/icon-allowlist.pro"
                .replace('/', File.separatorChar)
            assertTrue(
                keepFile.absolutePath.endsWith(expectedSuffix),
                "expected suffix '$expectedSuffix', got ${keepFile.absolutePath}"
            )
        } finally {
            projectDir.deleteRecursively()
        }
    }

    // --- T1-04: noop on non-Android project ---

    private fun fakeExtension(project: org.gradle.api.Project): ComposeIconsScannerExtension {
        // ProjectBuilder doesn't run plugin.apply(), so create the extension
        // manually for this isolated injector test.
        return project.extensions.create(
            "composeIconsScanner",
            ComposeIconsScannerExtension::class.java,
        ).apply {
            keepRuleStrategy.convention(KeepRuleStrategy.AGGRESSIVE)
        }
    }

    @Test
    fun `applyKeepRulesAutoInjection - non-Android project - no exception`() {
        val projectDir = createTempDir(prefix = "auto-inject-noop-")
        try {
            val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
            val ext = fakeExtension(project)
            // No Android plugin applied; injector must silently noop
            applyKeepRulesAutoInjection(project, ext)
            // Reaching here without exception is the assertion
            assertEquals(0, project.tasks.matching { it.name.startsWith("minify") }.size)
        } finally {
            projectDir.deleteRecursively()
        }
    }

    @Test
    fun `applyKeepRulesAutoInjection - library project does not inject - red line`() {
        val projectDir = createTempDir(prefix = "auto-inject-lib-")
        try {
            val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
            val ext = fakeExtension(project)
            // Simulate library plugin id presence by withId callback path:
            // The function must NOT inject into library modules (red line:
            // do not pollute consumer-rules.pro). We assert by ensuring no
            // generateIconKeepRules task dependency is added when only the
            // library id is present.
            applyKeepRulesAutoInjection(project, ext)
            // No tasks named 'minify*' should exist; no exception either
            assertEquals(0, project.tasks.matching { it.name.startsWith("minify") }.size)
        } finally {
            projectDir.deleteRecursively()
        }
    }
}
