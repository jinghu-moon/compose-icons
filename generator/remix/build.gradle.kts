plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

application {
    mainClass.set("composeicons.generator.remix.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
}
