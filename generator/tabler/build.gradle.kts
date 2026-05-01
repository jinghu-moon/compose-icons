plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("composeicons.generator.tabler.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveUsvg")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

tasks.register<JavaExec>("generateIcons") {
    dependsOn(":tools:resolveUsvg")
    group = "compose icons"
    description = "Generate Compose icons from local Tabler SVG sources."
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("composeicons.generator.tabler.MainKt")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}
