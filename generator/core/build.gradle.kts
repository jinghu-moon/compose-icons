plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testImplementation(libs.assertk)
}

tasks.test {
    useJUnitPlatform()
}

sourceSets {
    create("integrationTest") {
        kotlin.srcDir("src/integrationTest/kotlin")
        resources.srcDir("src/integrationTest/resources")
        
        // Inherit from main and test
        compileClasspath += sourceSets["main"].output + sourceSets["test"].output + configurations["testCompileClasspath"]
        runtimeClasspath += output + compileClasspath + configurations["testRuntimeClasspath"]
    }
}

val integrationTestImplementation by configurations.getting {
    extendsFrom(configurations["testImplementation"])
}
val integrationTestRuntimeOnly by configurations.getting {
    extendsFrom(configurations["testRuntimeOnly"])
}

tasks.register("integrationTest", Test::class) {
    description = "Runs integration tests."
    group = "verification"
    
    useJUnitPlatform()
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath
    mustRunAfter(tasks.test)
    
    dependsOn(":tools:resolveSvg2Compose")
}

tasks.check {
    dependsOn(tasks.named("integrationTest"))
}

abstract class UpdateR8BaselinesTask : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val apkReleaseDir: DirectoryProperty

    @get:OutputDirectory
    abstract val baselineDir: DirectoryProperty

    @get:Input
    abstract val flavors: ListProperty<String>

    @TaskAction
    fun execute() {
        val baselineDir = baselineDir.asFile.get()
        baselineDir.mkdirs()

        for (flavor in flavors.get()) {
            val apkDir = apkReleaseDir.asFile.get().resolve(flavor).resolve("release")
            val apk = apkDir.listFiles()?.firstOrNull { it.name.endsWith(".apk") }
            if (apk != null && apk.exists()) {
                baselineDir.resolve("tabler-$flavor.txt").writeText(apk.length().toString())
                logger.lifecycle("Updated baseline for $flavor flavor: ${apk.length()} bytes")
            } else {
                logger.warn("Could not find $flavor flavor APK to update baseline")
            }
        }
    }
}

tasks.register<UpdateR8BaselinesTask>("updateR8Baselines") {
    group = "compose-icons benchmark"
    description = "Update R8 APK size baselines from built release APKs."
    dependsOn(":sample:assembleAllRelease", ":sample:assembleZeroRelease")

    apkReleaseDir.set(rootProject.layout.projectDirectory.dir("sample/build/outputs/apk"))
    baselineDir.set(rootProject.layout.projectDirectory.dir("generator/core/src/test/baselines/r8-size"))
    flavors.set(listOf("all", "zero"))
}
