plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "composeicons.test"
    compileSdk = 36

    defaultConfig {
        minSdk = 23
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":icons-core"))
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
}
