pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "compose-icons"

include(":generator:core")
include(":generator:tabler")
include(":generator:lucide")
include(":icons-core")
include(":icons-tabler")
include(":icons-lucide")
include(":icons-phosphor")
include(":tools")
include(":sample")
include(":generator:phosphor")
include(":generator:remix")
include(":icons-remix")
include(":generator:radix")
include(":icons-radix")
include(":generator:cli")
