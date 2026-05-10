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
    mainClass.set("composeicons.generator.tabler.MainKt")
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
    repoUrl.set("https://github.com/tabler/tabler-icons.git")
    tagName.set("v3.41.1")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/tabler-icons"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from local Tabler SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.tabler.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    args.set(listOf(rootProject.projectDir.absolutePath, rootProject.layout.projectDirectory.dir("upstream/tabler-icons").asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/tabler-icons/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file("tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-tabler/src/generated/kotlin/composeicons/tabler"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/tabler.json"))
}
