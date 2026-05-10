plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    compileOnly(libs.ksp.gradle.plugin)
    compileOnly(libs.android.gradle.plugin.api)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
    testImplementation(gradleTestKit())
}

gradlePlugin {
    plugins {
        create("composeIconsScanner") {
            id = "io.github.jinghu-moon.composeicons.scanner"
            implementationClass = "composeicons.scanner.plugin.ComposeIconsScannerPlugin"
        }
    }
}
