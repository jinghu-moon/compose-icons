plugins {
    id("compose-icons-generator")
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}

generator {
    repoUrl.set("https://github.com/radix-ui/icons.git")
    tagName.set("@radix-ui/react-icons@1.3.0")
    upstreamDir.set("radix-icons")
    sourceRootSubdir.set("packages/radix-icons/icons")
    reportName.set("radixicons")
}
