pluginManagement {
    includeBuild("scanner/gradle-plugin")
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
include(":compose-icons-bom")
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
include(":scanner:ksp")
include(":benchmark")
include(":demo")

// 新增图标库
include(":generator:heroicons")
include(":icons-heroicons")
include(":generator:iconoir")
include(":icons-iconoir")
include(":generator:ionicons")
include(":icons-ionicons")
include(":generator:bootstrap")
include(":icons-bootstrap")
include(":generator:boxicons")
include(":icons-boxicons")
