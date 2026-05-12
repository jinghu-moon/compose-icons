plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/lipis/flag-icons.git")
    tagName.set("v7.5.0")
    sourceRootSubdir.set("flags")
}
