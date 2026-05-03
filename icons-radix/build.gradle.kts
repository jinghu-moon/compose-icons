plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":icons-core"))
                implementation("androidx.compose.ui:ui:1.6.1")
                implementation("androidx.compose.ui:ui-graphics:1.6.1")
                implementation("androidx.compose.ui:ui-unit:1.6.1")
            }
        }
    }
}
