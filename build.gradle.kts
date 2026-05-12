plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
}

// ── Public API snapshot validation ────────────────────────────────────────────
// Generates a deterministic list of public ImageVector symbols per icons-* module.
// `./gradlew dumpApi`    → writes api-snapshots/<module>.txt
// `./gradlew checkApi`   → verifies api-snapshots/<module>.txt matches current source
//
// This replaces kotlinx-binary-compatibility-validator which has compatibility
// issues with AGP 9.x + Kotlin 2.3.x Android library modules.

tasks.register("dumpApi") {
    group = "verification"
    description = "Dump public API surface of all icons-* modules to api-snapshots/"
    notCompatibleWithConfigurationCache("inspects subprojects dynamically")

    doLast {
        val outDir = rootProject.layout.projectDirectory.dir("api-snapshots").asFile
        outDir.mkdirs()

        for (mod in rootProject.subprojects.filter { it.name.startsWith("icons-") }) {
            val srcDir = mod.layout.projectDirectory.dir("src/generated/kotlin").asFile
            if (!srcDir.exists()) continue

            val symbols = srcDir.walkTopDown()
                .filter { it.isFile && it.extension == "kt" && it.name != "Container.kt" }
                .flatMap { file ->
                    val pkg = srcDir.toPath().relativize(file.toPath()).toString()
                        .replace("\\", "/").removeSuffix(".kt").replace("/", ".")
                    file.readLines()
                        .map { it.trim() }
                        .filter { it.startsWith("val ") && it.contains(": ImageVector") }
                        .map { line ->
                            val name = line.removePrefix("val ").substringBefore(":").trim()
                            "$pkg.$name"
                        }
                }
                .sorted()
                .toList()

            val outFile = java.io.File(outDir, "${mod.name}.txt")
            outFile.writeText(symbols.joinToString("\n") + "\n")
            println("  ${mod.name}: ${symbols.size} public symbols → ${outFile.name}")
        }
    }
}

tasks.register("checkApi") {
    group = "verification"
    description = "Verify public API surface matches committed api-snapshots/"
    notCompatibleWithConfigurationCache("inspects subprojects dynamically")

    doLast {
        val snapshotDir = rootProject.layout.projectDirectory.dir("api-snapshots").asFile
        var hasErrors = false

        for (mod in rootProject.subprojects.filter { it.name.startsWith("icons-") }) {
            val srcDir = mod.layout.projectDirectory.dir("src/generated/kotlin").asFile
            if (!srcDir.exists()) continue

            val symbols = srcDir.walkTopDown()
                .filter { it.isFile && it.extension == "kt" && it.name != "Container.kt" }
                .flatMap { file ->
                    val pkg = srcDir.toPath().relativize(file.toPath()).toString()
                        .replace("\\", "/").removeSuffix(".kt").replace("/", ".")
                    file.readLines()
                        .map { it.trim() }
                        .filter { it.startsWith("val ") && it.contains(": ImageVector") }
                        .map { line ->
                            val name = line.removePrefix("val ").substringBefore(":").trim()
                            "$pkg.$name"
                        }
                }
                .sorted()
                .toList()

            val current = symbols.joinToString("\n")
            val snapshotFile = java.io.File(snapshotDir, "${mod.name}.txt")

            if (!snapshotFile.exists()) {
                println("  ${mod.name}: NO SNAPSHOT — run `./gradlew dumpApi` first")
                hasErrors = true
                continue
            }

            val expected = snapshotFile.readText().trimEnd()
            if (current != expected) {
                val added = symbols.filter { it !in expected.lines() }
                val removed = expected.lines().filter { it !in symbols }
                println("  ${mod.name}: API CHANGED (+${added.size} -${removed.size})")
                if (added.isNotEmpty()) added.take(5).forEach { println("    + $it") }
                if (removed.isNotEmpty()) removed.take(5).forEach { println("    - $it") }
                hasErrors = true
            } else {
                println("  ${mod.name}: OK (${symbols.size} symbols)")
            }
        }

        if (hasErrors) {
            throw GradleException("API surface mismatch. Run `./gradlew dumpApi` to update snapshots.")
        }
    }
}
