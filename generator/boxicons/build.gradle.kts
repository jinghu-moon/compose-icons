import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":generator:core"))
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/box-icons/boxicons-core.git")
    tagName.set("main")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/boxicons"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from Boxicons SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.boxicons.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    val svgSource = rootProject.layout.projectDirectory.dir("upstream/boxicons")
    args.set(listOf(rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/boxicons/svg"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file(
        "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
    ))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-boxicons/src/generated/kotlin/composeicons/boxicons"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/boxicons.json"))
}
