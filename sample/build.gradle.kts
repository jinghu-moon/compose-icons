plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.roborazzi)
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
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.activity.compose)
    debugImplementation(libs.compose.ui.tooling)

    // Screenshot testing (Roborazzi + Robolectric)
    testImplementation(libs.junit4)
    testImplementation(libs.robolectric)
    testImplementation(libs.roborazzi)
    testImplementation(libs.roborazzi.compose)
    testImplementation(libs.roborazzi.junit)
    testImplementation(libs.compose.ui.test.junit4)
    testImplementation(libs.compose.ui.test.manifest)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.runner)
    testImplementation(libs.androidx.test.ext.junit)
}

// Aggregate APK size report across all 4 flavor-release variants
val flavorVariants = listOf("zero", "ten", "hundred", "all")

tasks.register("reportApkSize") {
    dependsOn(flavorVariants.map { "assemble${it.replaceFirstChar { c -> c.uppercase() }}Release" })

    doLast {
        val outputsDir = layout.buildDirectory.get().asFile.resolve("outputs/apk")
        if (!outputsDir.exists()) {
            println("APK output dir not found: ${outputsDir.absolutePath}")
            return@doLast
        }

        println("=== APK Size Report ===")
        flavorVariants.forEach { variant ->
            val apkDir = outputsDir.resolve("${variant}/release")
            val apk = apkDir.listFiles()?.firstOrNull { it.name.endsWith(".apk") }
            if (apk != null && apk.exists()) {
                val sizeKb = apk.length() / 1024
                val sizeMb = sizeKb / 1024.0
                println(String.format("%-8s = %d KB (%.2f MB)", variant, sizeKb, sizeMb))
            } else {
                println(String.format("%-8s = NOT FOUND in %s", variant, apkDir.absolutePath))
            }
        }
        println("=======================")
    }
}
