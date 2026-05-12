plugins {
    id("compose-icons-generator")
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}

generator {
    repoUrl.set("https://github.com/Remix-Design/RemixIcon.git")
    tagName.set("v4.2.0")
    upstreamDir.set("remix-icon")
}
