import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    id("compose-icons-generator")
}

dependencies {
    implementation(project(":generator:core"))
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/iconoir-icons/iconoir.git")
    tagName.set("main")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/iconoir"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from Iconoir SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.iconoir.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    val svgSource = rootProject.layout.projectDirectory.dir("upstream/iconoir")
    args.set(listOf(rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/iconoir/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file(
        "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
    ))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-iconoir/src/generated/kotlin/composeicons/iconoir"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/iconoir.json"))
}
