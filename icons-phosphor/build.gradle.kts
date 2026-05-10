import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.vanniktech.maven.publish)
}

android {
    namespace = "composeicons.phosphor"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    sourceSets {
        getByName("main") {
            kotlin.srcDir("src/generated/kotlin")
        }
    }
}

dependencies {
    api(project(":icons-core"))
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    coordinates(
        groupId = providers.gradleProperty("composeIconsGroup").get(),
        artifactId = "icons-phosphor",
        version = providers.gradleProperty("composeIconsVersion").get(),
    )

    configure(
        AndroidSingleVariantLibrary(
            variant = "release",
            sourcesJar = true,
            publishJavadocJar = true,
        )
    )

    pom {
        name.set("icons-phosphor")
        description.set("Phosphor Icons (6 styles) for Jetpack Compose - generated via svg2compose pipeline")
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
