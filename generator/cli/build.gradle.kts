plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

application {
    mainClass.set("composeicons.generator.cli.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    implementation(project(":generator:tabler"))
    implementation(project(":generator:lucide"))
    implementation(project(":generator:phosphor"))
    implementation(project(":generator:remix"))
    implementation(project(":generator:radix"))
}
