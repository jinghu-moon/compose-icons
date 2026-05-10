import composeicons.gradle.GenerateIconsTask
import composeicons.gradle.DownloadIconSourceTask

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

application {
    mainClass.set("composeicons.generator.radix.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    implementation(libs.kotlinx.serialization.json)
}

tasks.named<JavaExec>("run") {
    dependsOn(":tools:resolveSvg2Compose")
    workingDir = rootProject.projectDir
    args(rootProject.projectDir.absolutePath)
}

val downloadIcons by tasks.registering(DownloadIconSourceTask::class) {
    repoUrl.set("https://github.com/radix-ui/icons.git")
    tagName.set("@radix-ui/react-icons@1.3.0")
    targetDir.set(rootProject.layout.projectDirectory.dir("upstream/radix-icons"))
}

tasks.register<GenerateIconsTask>("generateIcons") {
    group = "compose icons"
    description = "Generate Compose icons from local Radix SVG sources."
    dependsOn(":tools:resolveSvg2Compose", "classes", downloadIcons)

    mainClass.set("composeicons.generator.radix.MainKt")
    generatorClasspath.from(sourceSets["main"].runtimeClasspath)
    args.set(listOf(rootProject.projectDir.absolutePath, rootProject.layout.projectDirectory.dir("upstream/radix-icons").asFile.absolutePath))
    sourceRootDir.set(rootProject.layout.projectDirectory.dir("upstream/radix-icons/packages/radix-icons/icons"))
    workingDir.set(rootProject.projectDir)
    svg2ComposeBinary.set(rootProject.layout.projectDirectory.file("tools/bin/svg2compose" + if (System.getProperty("os.name").lowercase().contains("win")) ".exe" else ""))
    outputDir.set(rootProject.layout.projectDirectory.dir("icons-radix/src/generated/kotlin/composeicons/radix"))
    reportFile.set(rootProject.layout.projectDirectory.file("web-preview/public/data/radixicons.json"))
}
