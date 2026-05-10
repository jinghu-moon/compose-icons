import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":generator:core"))
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/ionic-team/ionicons.git")
    tagName.set("main")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/ionicons"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from Ionicons SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.ionicons.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    val svgSource = rootProject.layout.projectDirectory.dir("upstream/ionicons")
    args.set(listOf(rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/ionicons/src/svg"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file(
        "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
    ))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-ionicons/src/generated/kotlin/composeicons/ionicons"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/ionicons.json"))
}
