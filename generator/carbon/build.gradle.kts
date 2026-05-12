plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/carbon-design-system/carbon.git")
    tagName.set("v11.107.1")
    sparsePaths.set(listOf("packages/icons/src/svg"))
    sourceRootSubdir.set("packages/icons/src/svg/32")
}
