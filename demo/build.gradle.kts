plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "composeicons.demo"
    compileSdk = 36

    defaultConfig {
        applicationId = "composeicons.demo"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":icons-tabler"))
    implementation(project(":icons-lucide"))
    implementation(project(":icons-phosphor"))
    implementation(project(":icons-remix"))
    implementation(project(":icons-radix"))
    implementation(project(":icons-heroicons"))
    implementation(project(":icons-iconoir"))
    implementation(project(":icons-ionicons"))
    implementation(project(":icons-bootstrap"))
    implementation(project(":icons-boxicons"))

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.material3)
    implementation(libs.activity.compose)
    implementation(libs.kotlinx.serialization.json)
    debugImplementation(libs.compose.ui.tooling)
}

// --- Copy icon metadata JSON to assets ---

tasks.register("copyIconData") {
    val srcDirPath = rootProject.file("web-preview/public/data").absolutePath
    val dstDirPath = file("src/main/assets/data").absolutePath
    inputs.dir(rootProject.file("web-preview/public/data"))
    outputs.dir(file("src/main/assets/data"))
    doLast {
        val srcDir = File(srcDirPath)
        val dstDir = File(dstDirPath)
        dstDir.mkdirs()
        srcDir.listFiles { f -> f.extension == "json" }?.forEach { f ->
            f.copyTo(File(dstDir, f.name), overwrite = true)
        }
    }
}

// --- Generate IconRegistry.kt from JSON metadata ---

tasks.register("generateIconRegistry") {
    val dataDirPath = rootProject.file("web-preview/public/data").absolutePath
    val outputFilePath = file("src/main/kotlin/composeicons/demo/IconRegistry.kt").absolutePath
    inputs.dir(rootProject.file("web-preview/public/data"))
    outputs.file(file("src/main/kotlin/composeicons/demo/IconRegistry.kt"))
    doLast {
        val dataDir = File(dataDirPath)
        val outputFile = File(outputFilePath)

        // Per-library: container -> (styles: Map<styleName, Pair<objectRef, subpackage?>>)
        val libConfig: Map<String, Pair<String, Map<String, Pair<String, String?>>>> = mapOf(
            "tabler" to ("TablerIcons" to mapOf(
                "Outline" to ("Outline" to "outline"), "Filled" to ("Filled" to "filled"),
            )),
            "lucide" to ("LucideIcons" to mapOf("Outline" to ("Outline" to null))),
            "phosphor" to ("PhosphorIcons" to mapOf(
                "Thin" to ("Thin" to "thin"), "Light" to ("Light" to "light"),
                "Regular" to ("Regular" to "regular"), "Bold" to ("Bold" to "bold"),
                "Fill" to ("Fill" to "fill"), "Duotone" to ("Duotone" to "duotone"),
            )),
            "remixicons" to ("RemixIcons" to mapOf(
                "Fill" to ("Fill" to "fill"), "Line" to ("Line" to "line"),
            )),
            "radixicons" to ("RadixIcons" to mapOf("Regular" to ("Regular" to null))),
            "heroicons" to ("HeroiconsIcons" to mapOf(
                "Solid16" to ("Solid16" to "solid16"), "Solid20" to ("Solid20" to "solid20"),
                "Outline" to ("Outline" to "outline"), "Solid" to ("Solid" to "solid"),
            )),
            "iconoir" to ("IconoirIcons" to mapOf(
                "Regular" to ("Regular" to "regular"), "Solid" to ("Solid" to "solid"),
            )),
            "ionicons" to ("IoniconsIcons" to mapOf(
                "Filled" to ("Filled" to "filled"), "Outline" to ("Outline" to "outline"), "Sharp" to ("Sharp" to "sharp"),
            )),
            "bootstrap" to ("BootstrapIcons" to mapOf(
                "Regular" to ("Regular" to "regular"), "Fill" to ("Fill" to "fill"),
            )),
            "boxicons" to ("BoxiconsIcons" to mapOf(
                "Regular" to ("Regular" to "basic"), "Solid" to ("Solid" to "filled"),
                "Logos" to ("Logos" to "brands"),
            )),
        )

        val basePackages = mapOf(
            "tabler" to "composeicons.tabler", "lucide" to "composeicons.lucide",
            "phosphor" to "composeicons.phosphor", "remixicons" to "composeicons.remix",
            "radixicons" to "composeicons.radix", "heroicons" to "composeicons.heroicons",
            "iconoir" to "composeicons.iconoir", "ionicons" to "composeicons.ionicons",
            "bootstrap" to "composeicons.bootstrap", "boxicons" to "composeicons.boxicons",
        )

        // Extract top-level JSON objects from array using brace-depth tracking
        fun parseTopLevelObjects(text: String): List<String> {
            val results = mutableListOf<String>()
            val start = text.indexOf("[{")
            if (start < 0) return results
            var i = start + 1
            while (i < text.length) {
                while (i < text.length && text[i] != '{') i++
                if (i >= text.length) break
                val objStart = i
                var depth = 0
                while (i < text.length) {
                    if (text[i] == '{') depth++
                    else if (text[i] == '}') { depth--; if (depth == 0) break }
                    i++
                }
                if (depth == 0) results.add(text.substring(objStart, i + 1))
                i++
            }
            return results
        }

        val nameRegex = Regex(""""name"\s*:\s*"([^"]+)"""")
        val styleRegex = Regex(""""style"\s*:\s*"([^"]+)"""")
        val kotlinPathRegex = Regex(""""kotlinPath"\s*:\s*"([^"]+)"""")
        val sourceRegex = Regex(""""source"\s*:\s*"([^"]+)"""")

        // source -> (imports set, put() lines)
        val entriesBySource = LinkedHashMap<String, Pair<MutableSet<String>, MutableList<String>>>()
        val seenPaths = mutableSetOf<String>()

        val jsonFiles = dataDir.listFiles()?.filter { it.extension == "json" && it.name != "libraries.json" } ?: emptyList()
        for (file in jsonFiles) {
            val text = file.readText()
            val source = sourceRegex.find(text)?.groupValues?.get(1) ?: continue
            val cfg = libConfig[source] ?: continue
            val container = cfg.first
            val styles = cfg.second
            val basePkg = basePackages[source] ?: continue

            val (srcImports, srcEntries) = entriesBySource.getOrPut(source) {
                Pair(mutableSetOf(), mutableListOf())
            }

            for (obj in parseTopLevelObjects(text).reversed()) {
                val name = nameRegex.find(obj)?.groupValues?.get(1) ?: continue
                val style = styleRegex.find(obj)?.groupValues?.get(1) ?: continue
                val kotlinPath = kotlinPathRegex.find(obj)?.groupValues?.get(1) ?: continue
                if (!seenPaths.add(kotlinPath)) continue
                val styleCfg = styles[style] ?: continue
                val objRef = styleCfg.first
                val subpkg = styleCfg.second

                val iconPkg = if (subpkg != null) "$basePkg.$subpkg" else basePkg
                srcImports.add("import $iconPkg.*")
                srcImports.add("import $basePkg.$container")

                srcEntries.add("    put(\"$kotlinPath\", $container.$objRef.$name)")
            }
        }

        // Generate one file per library (split large libraries into chunks)
        val srcDir = outputFile.parentFile
        val allFnNames = mutableListOf<String>()
        val chunkSize = 1500

        for ((source, pair) in entriesBySource) {
            val (srcImports, srcEntries) = pair
            val capSource = source.replaceFirstChar { it.uppercase() }
            val importStatements = srcImports.sorted().joinToString("\n")
            val chunks = srcEntries.chunked(chunkSize)

            if (chunks.size == 1) {
                // Single file, single function
                val fnName = "register${capSource}Icons"
                allFnNames.add(fnName)
                val libFile = srcDir.resolve("Registry${capSource}.kt")
                libFile.writeText(
                    """
                    |package composeicons.demo
                    |
                    |import androidx.compose.ui.graphics.vector.ImageVector
                    |$importStatements
                    |
                    |fun $fnName(): Map<String, ImageVector> = buildMap {
                    |${chunks[0].joinToString("\n")}
                    |}
                    """.trimMargin()
                )
            } else {
                // Multiple files: Registry<Source>0.kt, Registry<Source>1.kt, ...
                for ((idx, chunk) in chunks.withIndex()) {
                    val fnName = "register${capSource}Icons${idx}"
                    allFnNames.add(fnName)
                    val libFile = srcDir.resolve("Registry${capSource}${idx}.kt")
                    libFile.writeText(
                        """
                        |package composeicons.demo
                        |
                        |import androidx.compose.ui.graphics.vector.ImageVector
                        |$importStatements
                        |
                        |fun $fnName(): Map<String, ImageVector> = buildMap {
                        |${chunk.joinToString("\n")}
                        |}
                        """.trimMargin()
                    )
                }
            }
        }

        // Generate main IconRegistry.kt
        val mergeCalls = allFnNames.joinToString("\n") { fn ->
            "        putAll($fn())"
        }

        outputFile.parentFile.mkdirs()
        outputFile.writeText(
            """
            |package composeicons.demo
            |
            |import androidx.compose.ui.graphics.vector.ImageVector
            |
            |object IconRegistry {
            |    private val icons: Map<String, ImageVector> by lazy {
            |        buildMap {
            |$mergeCalls
            |        }
            |    }
            |
            |    fun get(kotlinPath: String): ImageVector? = icons[kotlinPath]
            |    fun allKeys(): Set<String> = icons.keys
            |    fun size(): Int = icons.size
            |}
            """.trimMargin()
        )
        val totalEntries = entriesBySource.values.sumOf { it.second.size }
        println("Generated IconRegistry.kt with $totalEntries icons in ${entriesBySource.size} libraries")
    }
}

tasks.named("preBuild") {
    dependsOn("copyIconData", "generateIconRegistry")
}
