plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

application {
    mainClass.set("composeicons.generator.radix.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveUsvg")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

tasks.register<JavaExec>("generateIcons") {
    dependsOn(":tools:resolveUsvg", "classes")
    group = "compose icons"
    mainClass.set("composeicons.generator.radix.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}
