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
        api(project(":icons-simpleicons"))
        api(project(":icons-mdi"))
        api(project(":icons-carbon"))
        api(project(":icons-octicons"))
        api(project(":icons-iconsax"))
        api(project(":icons-circleflags"))
        api(project(":icons-flagicons"))
        api(project(":icons-countryflags"))
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
