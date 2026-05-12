plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/HatScripts/circle-flags.git")
    tagName.set("v2.8.0")
    sourceRootSubdir.set("flags")
}
