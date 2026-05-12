plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/twbs/icons.git")
    tagName.set("v1.11.3")
    upstreamDir.set("bootstrap-icons")
    sourceRootSubdir.set("icons")
}
