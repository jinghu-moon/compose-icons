import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

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

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/lucide-icons/lucide.git")
    tagName.set("")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/lucide"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from local Lucide SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.lucide.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    args.set(listOf(rootProject.projectDir.absolutePath, rootProject.layout.projectDirectory.dir("upstream/lucide").asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/lucide/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file("tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-lucide/src/generated/kotlin/composeicons/lucide"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/lucide.json"))
}
