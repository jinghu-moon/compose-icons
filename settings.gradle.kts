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

// V1.1 扩展图标库
include(":generator:simpleicons")
include(":icons-simpleicons")
include(":generator:mdi")
include(":icons-mdi")
include(":generator:carbon")
include(":icons-carbon")
include(":generator:octicons")
include(":icons-octicons")
include(":generator:iconsax")
include(":icons-iconsax")

// V1.2 国旗图标库
include(":generator:circleflags")
include(":icons-circleflags")
include(":generator:flagicons")
include(":icons-flagicons")
include(":generator:countryflags")
include(":icons-countryflags")
