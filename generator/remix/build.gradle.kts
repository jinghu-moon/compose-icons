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
    implementation(libs.kotlinx.serialization.json)
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveSvg2Compose")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

tasks.register<JavaExec>("generateIcons") {
    dependsOn(":tools:resolveUsvg", "classes")
    group = "compose icons"
    mainClass.set("composeicons.generator.remix.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}
