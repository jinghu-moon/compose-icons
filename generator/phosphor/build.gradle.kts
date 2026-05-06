plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("composeicons.generator.phosphor.MainKt")
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
    dependsOn(":tools:resolveUsvg", "classes")
    group = "compose icons"
    mainClass.set("composeicons.generator.phosphor.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}
