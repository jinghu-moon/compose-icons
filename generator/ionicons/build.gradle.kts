plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/ionic-team/ionicons.git")
    tagName.set("v8.0.13")
    sourceRootSubdir.set("src/svg")
}
