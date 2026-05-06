plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("composeicons.generator.lucide.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveSvg2Compose")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

tasks.register<JavaExec>("generateIcons") {
    dependsOn(":tools:resolveUsvg", "classes")
    group = "compose icons"
    mainClass.set("composeicons.generator.lucide.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}
