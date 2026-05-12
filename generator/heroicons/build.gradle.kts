plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/tailwindlabs/heroicons.git")
    tagName.set("v2.2.0")
    sourceRootSubdir.set("src")
}
