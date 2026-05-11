import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.vanniktech.maven.publish)
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    compileOnly(libs.ksp.api)
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
    testImplementation(libs.ksp.api)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    coordinates(
        groupId = providers.gradleProperty("composeIconsGroup").get(),
        artifactId = "scanner-ksp",
        version = providers.gradleProperty("composeIconsVersion").get(),
    )

    configure(JavaLibrary(javadocJar = JavadocJar.Empty(), sourcesJar = true))

    pom {
        name.set("scanner-ksp")
        description.set("KSP processor for compose-icons: scans @Composable icon functions and generates R8/ProGuard keep rules for tree-shaking")
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
