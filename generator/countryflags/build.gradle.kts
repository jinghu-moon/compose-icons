plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/hampusborgos/country-flags.git")
    tagName.set("v1.2.10")
    sourceRootSubdir.set("svg")
}
