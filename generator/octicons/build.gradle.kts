plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/primer/octicons.git")
    tagName.set("v19.25.0")
    sourceRootSubdir.set("icons")
}
