plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/iconoir-icons/iconoir.git")
    tagName.set("v7.11.0")
    sourceRootSubdir.set("icons")
}
