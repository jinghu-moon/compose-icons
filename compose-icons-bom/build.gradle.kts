plugins {
    `java-platform`
    alias(libs.plugins.vanniktech.maven.publish)
}

dependencies {
    constraints {
        api(project(":icons-core"))
        api(project(":icons-tabler"))
        api(project(":icons-lucide"))
        api(project(":icons-phosphor"))
        api(project(":icons-radix"))
        api(project(":icons-remix"))
        api(project(":icons-heroicons"))
        api(project(":icons-iconoir"))
        api(project(":icons-ionicons"))
        api(project(":icons-bootstrap"))
        api(project(":icons-boxicons"))
    }
}

mavenPublishing {
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL)
    coordinates(
        groupId = "io.github.jinghu-moon.composeicons",
        artifactId = "compose-icons-bom",
        version = providers.gradleProperty("composeIconsVersion").get()
    )
}
