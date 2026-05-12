plugins {
    id("compose-icons-generator")
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}

generator {
    repoUrl.set("https://github.com/tabler/tabler-icons.git")
    tagName.set("v${providers.gradleProperty("tablerVersion").get()}")
    upstreamDir.set("tabler-icons")
    sourceRootSubdir.set("icons")
}
