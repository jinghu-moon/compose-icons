import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":generator:core"))
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.kotlin.test)
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/tabler/tabler-icons.git")
    tagName.set("v${providers.gradleProperty("tablerVersion").get()}")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/tabler-icons"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from Tabler SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.tabler.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    val svgSource = rootProject.layout.projectDirectory.dir("upstream/tabler-icons")
    args.set(listOf(rootProject.projectDir.absolutePath, svgSource.asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/tabler-icons/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file(
        "tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""
    ))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-tabler/src/generated/kotlin/composeicons/tabler"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/tabler.json"))
}
