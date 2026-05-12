plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/box-icons/boxicons-core.git")
    // box-icons/boxicons-core has no tags; using main as fallback
    tagName.set("main")
    sourceRootSubdir.set("svg")
}
