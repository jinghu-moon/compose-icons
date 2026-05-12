plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/phosphor-icons/core.git")
    tagName.set("v2.1.0")
    upstreamDir.set("phosphor-homepage")
}
