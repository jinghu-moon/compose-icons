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
    mainClass.set("composeicons.generator.phosphor.MainKt")
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
    repoUrl.set("https://github.com/phosphor-icons/homepage.git")
    tagName.set("")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/phosphor-homepage"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from local Phosphor SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.phosphor.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    args.set(listOf(rootProject.projectDir.absolutePath, rootProject.layout.projectDirectory.dir("upstream/phosphor-homepage").asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/phosphor-homepage/public/assets/phosphor.iconjar/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file("tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-phosphor/src/generated/kotlin/composeicons/phosphor"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/phosphor.json"))
}
