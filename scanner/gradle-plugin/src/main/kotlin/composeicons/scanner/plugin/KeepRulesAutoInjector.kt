package composeicons.scanner.plugin

import com.android.build.api.variant.AndroidComponentsExtension
import org.gradle.api.Project
import java.io.File

/**
 * T1-04 — Auto-injects an R8 keep allowlist into every Android **application**
 * variant's `proguardFiles`.
 *
 * Disable for benchmarking with `-Pcomposeicons.scanner.injectKeepRules=false`.
 *
 * Behavior contract:
 * - Application modules: a `generateIconKeepRules<Variant>` task is registered
 *   per variant. Each task reads its own variant's KSP `icon-usage.json` and
 *   writes a per-variant `icon-allowlist.pro`. The provider is added to
 *   `variant.proguardFiles` so Gradle infers downstream task dependencies
 *   (R8, Lint, mergeProguardFiles, …) automatically.
 * - Library modules: **noop** (red line: never pollute a library's own
 *   `consumer-rules.pro`; libraries have no view of which icons the
 *   downstream application actually references).
 * - Non-Android modules: noop (the `generateIconKeepRules` task registered
 *   by `ComposeIconsScannerPlugin` itself remains usable as a fallback).
 *
 * Type-safe AGP access is via `compileOnly(libs.android.gradle.plugin.api)`,
 * so this code only loads when AGP is on the buildscript classpath.
 */
fun applyKeepRulesAutoInjection(target: Project, extension: ComposeIconsScannerExtension) {
    if (target.findProperty("composeicons.scanner.injectKeepRules") == "false") {
        target.logger.lifecycle(
            "composeicons-scanner: keep-rule auto-injection disabled via -Pcomposeicons.scanner.injectKeepRules=false"
        )
        return
    }
    target.plugins.withId("com.android.application") {
        wireApplicationKeepRules(target, extension)
    }
    // Intentionally no `withId("com.android.library")` block —
    // libraries do not auto-inject keep rules (see red line above).
}

private fun wireApplicationKeepRules(target: Project, extension: ComposeIconsScannerExtension) {
    val androidComponents = target.extensions.findByType(AndroidComponentsExtension::class.java) ?: return

    androidComponents.onVariants { variant ->
        val variantName = variant.name
        val capitalized = variantName.replaceFirstChar { it.uppercase() }
        val taskName = "generateIconKeepRules$capitalized"

        val keepRulesTask =
            target.tasks.register(taskName, GenerateIconKeepRulesTask::class.java) { task ->
                task.group = "compose-icons"
                task.description = "Generate R8 keep allowlist for $variantName"

                // Direct file references — `@InputFiles ConfigurableFileCollection`
                // accepts paths that do not yet exist. Avoids eagerly invoking
                // `.isDirectory` on a build-dir that KSP hasn't populated yet.
                task.kspManifestFiles.from(
                    target.layout.buildDirectory.file(
                        "generated/ksp/$variantName/resources/icon-usage.json"
                    ),
                    target.layout.buildDirectory.file(
                        "generated/ksp/$variantName/icon-usage.json"
                    ),
                )
                task.outputFile.set(
                    target.layout.buildDirectory.file(
                        "generated/composeicons/proguard/$variantName/icon-allowlist.pro"
                    )
                )
                // Strategy comes from the DSL extension; per-variant tasks
                // share the project-level configuration.
                task.keepRuleStrategy.set(extension.keepRuleStrategy)

                // Lazy task-name dependency: Gradle resolves it at task-graph
                // time, so KSP not having registered yet at this point is OK.
                task.dependsOn("ksp${capitalized}Kotlin")
            }

        // Lazy provider: Gradle automatically derives dependsOn for every
        // downstream task that consumes variant.proguardFiles.
        variant.proguardFiles.add(keepRulesTask.flatMap { it.outputFile })
    }
}

/**
 * Path of the generic (non-variant) keep allowlist used by non-Android
 * fallback module configuration:
 * `build/generated/composeicons/proguard/icon-allowlist.pro`.
 */
internal fun computeKeepFilePath(project: Project): File =
    project.layout.buildDirectory
        .file("generated/composeicons/proguard/icon-allowlist.pro")
        .get()
        .asFile

/**
 * Detect whether the given collection (of File / String / etc.) already
 * references the icon allowlist. Uses string matching on `toString()` so
 * it works with whatever types AGP places in `proguardFiles`.
 */
internal fun isKeepFileAlreadyInjected(items: Iterable<*>): Boolean =
    items.any { it.toString().contains("icon-allowlist.pro") }
