plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.roborazzi)
    alias(libs.plugins.ksp)
    id("io.github.jinghu-moon.composeicons.scanner")
}

android {
    namespace = "composeicons.sample"
    compileSdk = 36

    defaultConfig {
        applicationId = "composeicons.sample"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    flavorDimensions += "icons"
    productFlavors {
        create("zero") { dimension = "icons" }
        create("ten") { dimension = "icons" }
        create("hundred") { dimension = "icons" }
        create("all") {
            dimension = "icons"
            proguardFiles("proguard-rules-all.pro")
        }
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(project(":icons-tabler"))
    implementation(project(":icons-lucide"))
    implementation(project(":icons-phosphor"))
    implementation(project(":icons-radix"))
    implementation(project(":icons-remix"))
    implementation(project(":icons-heroicons"))
    implementation(project(":icons-iconoir"))
    implementation(project(":icons-ionicons"))
    implementation(project(":icons-bootstrap"))
    implementation(project(":icons-boxicons"))
    implementation(project(":icons-simpleicons"))
    implementation(project(":icons-mdi"))
    implementation(project(":icons-carbon"))
    implementation(project(":icons-octicons"))
    implementation(project(":icons-iconsax"))
    implementation(project(":icons-circleflags"))
    implementation(project(":icons-flagicons"))
    implementation(project(":icons-countryflags"))
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.activity.compose)
    debugImplementation(libs.compose.ui.tooling)
    implementation(libs.profileinstaller)

    // Screenshot testing (Roborazzi + Robolectric)
    testImplementation(libs.junit4)
    testImplementation(libs.robolectric)
    testImplementation(libs.roborazzi)
    testImplementation(libs.roborazzi.compose)
    testImplementation(libs.roborazzi.junit)
    testImplementation(libs.compose.ui.test.junit4)
    debugImplementation(libs.compose.ui.test.manifest)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.runner)
    testImplementation(libs.androidx.test.ext.junit)
}

// Aggregate APK size report across all 4 flavor-release variants
val flavorVariants = listOf("zero", "ten", "hundred", "all")

tasks.register("reportApkSize") {
    dependsOn(flavorVariants.map { "assemble${it.replaceFirstChar { c -> c.uppercase() }}Release" })

    doLast {
        val buildDir = layout.buildDirectory.get().asFile
        println("=== APK Size Report ===")
        val rows = mutableListOf("variant,bytes,kb")
        flavorVariants.forEach { variant ->
            val dir = buildDir.resolve("outputs/apk/${variant}/release")
            val apk = dir.listFiles()?.firstOrNull { it.name.endsWith(".apk") }
            if (apk != null && apk.exists()) {
                val bytes = apk.length()
                val sizeKb = bytes / 1024
                val sizeMb = sizeKb / 1024.0
                println(String.format("%-8s = %d KB (%.2f MB)", variant, sizeKb, sizeMb))
                rows.add("$variant,$bytes,$sizeKb")
            } else {
                println(String.format("%-8s = NOT FOUND in %s", variant, dir.absolutePath))
                rows.add("$variant,0,0")
            }
        }
        println("=======================")
        val csv = layout.buildDirectory.file("reports/icons/apk-size.csv").get().asFile
        csv.parentFile.mkdirs()
        csv.writeText(rows.joinToString("\n") + "\n")
        println("CSV: ${csv.absolutePath}")
    }
}

// T1-09: dump per-variant R8 keep allowlists to a stable, git-trackable
// location so a baseline diff catches accidental drift in references.
//
// Output goes to `sample/baseline/icon-keep-rules/` (NOT under build/) so
// the baseline can be committed and `git diff` after rerunning the task
// surfaces any change in references.
tasks.register("dumpIconKeepRules") {
    group = "compose-icons"
    description = "Copy per-variant icon-allowlist.pro files to baseline/icon-keep-rules/ for git-tracked baselines"

    val variantBases = flavorVariants.map { "${it}Release" }
    dependsOn(variantBases.map { v ->
        "generateIconKeepRules${v.replaceFirstChar { c -> c.uppercase() }}"
    })

    doLast {
        val buildDir = layout.buildDirectory.get().asFile
        val dst = layout.projectDirectory.dir("baseline/icon-keep-rules").asFile
        dst.mkdirs()
        variantBases.forEach { variant ->
            val srcFile = buildDir.resolve("generated/composeicons/proguard/$variant/icon-allowlist.pro")
            val dstFile = dst.resolve("$variant-keep.pro")
            if (srcFile.exists()) {
                // Strip absolute paths from `# Source:` comment so baselines
                // are stable across machines (Windows/Linux, CI vs local, …).
                val sanitized = srcFile.readLines().joinToString("\n") { line ->
                    if (line.startsWith("# Source: ")) "# Source: <ksp manifest for $variant>"
                    else line
                }
                dstFile.writeText(sanitized + "\n")
                println("dumped: $variant → ${dstFile.absolutePath}")
            } else {
                dstFile.writeText("# Source missing for $variant\n")
                println("missing source for $variant")
            }
        }
    }
}
