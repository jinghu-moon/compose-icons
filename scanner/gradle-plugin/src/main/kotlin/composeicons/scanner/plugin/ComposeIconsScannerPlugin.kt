package composeicons.scanner.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Gradle plugin that provides compile-time icon usage scanning for compose-icons consumers.
 *
 * Usage (one line):
 * ```
 * plugins {
 *     id("io.github.jinghu-moon.composeicons.scanner")
 * }
 * ```
 *
 * The plugin automatically:
 * 1. Applies the KSP plugin (if available on the buildscript classpath)
 * 2. Injects the scanner-ksp processor dependency
 * 3. Registers `validateIconReferences` and `iconUsageReport` tasks
 */
class ComposeIconsScannerPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        // 0. Create DSL extension first (needed by injector + task config)
        val extension = target.extensions.create(
            "composeIconsScanner",
            ComposeIconsScannerExtension::class.java,
        )
        // Default DSL strategy = NONE: do not inject any keep rules unless
        // the consumer opts in. Empirically (sample APK matrix), AGGRESSIVE
        // costs ~27 KB dex over R8's default reachability analysis on a
        // project that has not written defensive `-keep …**` wildcards.
        // Allow CLI override via `-Pcomposeicons.scanner.strategy=NONE|MEMBERS|AGGRESSIVE`
        // for A/B benchmarking without modifying build.gradle.kts.
        val cliStrategy = (target.findProperty("composeicons.scanner.strategy") as? String)
            ?.uppercase()
            ?.let { runCatching { KeepRuleStrategy.valueOf(it) }.getOrNull() }
        extension.keepRuleStrategy.convention(cliStrategy ?: KeepRuleStrategy.NONE)

        // 1. Apply KSP plugin if not already applied
        val kspApplied = try {
            if (!target.plugins.hasPlugin("com.google.devtools.ksp")) {
                target.plugins.apply("com.google.devtools.ksp")
            }
            true
        } catch (e: Exception) {
            target.logger.warn(
                "ComposeIconsScanner: KSP plugin not found on buildscript classpath. " +
                    "Add `id(\"com.google.devtools.ksp\") version \"...\"` to your root build.gradle.kts. " +
                    "Validation and report tasks will still be available."
            )
            false
        }

        // 2. Auto-inject KSP processor dependency (only if KSP is available)
        if (kspApplied) {
            // Prefer a same-build project dependency when the scanner-ksp
            // module is available (internal sample modules); fall back to
            // the published Maven coordinate for external consumers.
            val internalKspProject = target.rootProject.findProject(SCANNER_KSP_PROJECT_PATH)
            val kspDependency: Any = if (internalKspProject != null) {
                target.dependencies.project(mapOf("path" to SCANNER_KSP_PROJECT_PATH))
            } else {
                val version = ComposeIconsScannerPlugin::class.java
                    .getPackage()?.implementationVersion ?: SCANNER_VERSION
                "io.github.jinghu-moon.composeicons:scanner-ksp:$version"
            }
            target.dependencies.add("ksp", kspDependency)
        }

        // 3. Register tasks (always available, even without KSP)
        target.tasks.register("validateIconReferences", ValidateIconTask::class.java) { task ->
            task.group = "compose-icons"
            task.description = "Validates that all referenced icons exist in their respective icon sources"
            if (kspApplied) {
                task.dependsOn("kspDebugKotlin")
            }
        }

        target.tasks.register("iconUsageReport", IconUsageReportTask::class.java) { task ->
            task.group = "compose-icons"
            task.description = "Generates an icon usage report for this module"
            if (kspApplied) {
                task.dependsOn("kspDebugKotlin")
            }
        }

        target.tasks.register("generateIconKeepRules", GenerateIconKeepRulesTask::class.java) { task ->
            task.group = "compose-icons"
            task.description = "Generates an R8 keep allowlist from referenced icons " +
                "(build/generated/composeicons/proguard/icon-allowlist.pro)"
            // Use a Provider-based FileTree so the directory may be absent
            // without breaking task validation (KSP may not have run yet).
            val kspDirProvider = target.layout.buildDirectory.dir("generated/ksp/debug")
            task.kspManifestFiles.from(
                kspDirProvider.map { dir ->
                    if (dir.asFile.isDirectory) {
                        target.fileTree(dir).matching { it.include("**/icon-usage.json") }
                    } else {
                        target.files()
                    }
                }
            )
            task.outputFile.set(
                target.layout.buildDirectory.file("generated/composeicons/proguard/icon-allowlist.pro")
            )
            task.keepRuleStrategy.set(extension.keepRuleStrategy)
            if (kspApplied) {
                task.dependsOn("kspDebugKotlin")
            }
        }

        // T1-04: auto-inject the generated keep file into Android application
        // modules' proguardFiles. Library and non-Android modules are noop.
        applyKeepRulesAutoInjection(target, extension)
    }

    companion object {
        /** Fallback version when not running from a published artifact. */
        private const val SCANNER_VERSION = "0.1.0-SNAPSHOT"

        /** Internal Gradle path of the scanner-ksp module. */
        private const val SCANNER_KSP_PROJECT_PATH = ":scanner:ksp"
    }
}
