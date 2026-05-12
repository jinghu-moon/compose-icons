plugins {
    id("compose-icons-generator")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}

generator {
    repoUrl.set("https://github.com/simple-icons/simple-icons.git")
    tagName.set("v2.17.1")
    sourceRootSubdir.set("icons")
}
