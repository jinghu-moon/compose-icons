import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.vanniktech.maven.publish)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    compileOnly(libs.ksp.gradle.plugin)
    compileOnly(libs.android.gradle.plugin.api)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
    testImplementation(gradleTestKit())
}

gradlePlugin {
    plugins {
        create("composeIconsScanner") {
            id = "io.github.jinghu-moon.composeicons.scanner"
            implementationClass = "composeicons.scanner.plugin.ComposeIconsScannerPlugin"
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    coordinates(
        groupId = providers.gradleProperty("composeIconsGroup").get(),
        artifactId = "scanner-gradle-plugin",
        version = providers.gradleProperty("composeIconsVersion").get(),
    )

    configure(JavaLibrary(javadocJar = JavadocJar.Empty(), sourcesJar = true))

    pom {
        name.set("scanner-gradle-plugin")
        description.set("Gradle plugin for compose-icons: auto-configures KSP scanner dependency for R8/ProGuard tree-shaking of unused icons")
        url.set("https://github.com/jinghu-moon/compose-icons")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("jinghu-moon")
                name.set("Jinghu Moon")
                url.set("https://github.com/jinghu-moon")
            }
        }
        scm {
            url.set("https://github.com/jinghu-moon/compose-icons")
            connection.set("scm:git:git://github.com/jinghu-moon/compose-icons.git")
            developerConnection.set("scm:git:ssh://git@github.com/jinghu-moon/compose-icons.git")
        }
    }
}
