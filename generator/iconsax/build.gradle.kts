plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/saade/blade-iconsax.git")
    tagName.set("v1.2.2")
    sourceRootSubdir.set("resources/svg")
}
