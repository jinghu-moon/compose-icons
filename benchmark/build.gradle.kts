plugins {
    id("com.android.test")
}

android {
    namespace = "composeicons.benchmark"
    compileSdk = 36

    defaultConfig {
        minSdk = 28
        targetSdk = 36
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        // Macrobenchmark requires running against release apps
        create("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    targetProjectPath = ":sample"
    experimentalProperties["android.experimental.self-instrumenting"] = true

    flavorDimensions += "icons"
    productFlavors {
        create("zero") { dimension = "icons" }
        create("ten") { dimension = "icons" }
        create("hundred") { dimension = "icons" }
        create("all") { dimension = "icons" }
    }
}

dependencies {
    implementation(libs.androidx.test.core)
    implementation(libs.androidx.test.runner)
    implementation(libs.androidx.test.ext.junit)
    implementation(libs.uiautomator)
    implementation(libs.benchmark.macro.junit4)
    implementation(libs.benchmark.junit4)

    // Required for IconLoadingBenchmark to access TablerIcons
    implementation(project(":icons-tabler"))
}
