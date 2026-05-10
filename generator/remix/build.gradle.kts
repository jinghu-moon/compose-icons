import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    id("org.jetbrains.kotlin.jvm")
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    implementation(project(":generator:core"))
    implementation(libs.kotlinx.serialization.json)
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/Remix-Design/RemixIcon.git")
    tagName.set("v4.2.0")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/remix-icon"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from Remix SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.remix.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    val svgSource = rootProject.layout.projectDirectory.dir("upstream/remix-icon")
    args.set(listOf(rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath))
    sourceRootDir.set(svgSource)
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file(
        "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
    ))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-remix/src/generated/kotlin/composeicons/remix"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/remixicons.json"))
}
