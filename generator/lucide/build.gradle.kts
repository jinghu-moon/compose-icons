plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/lucide-icons/lucide.git")
    tagName.set("v0.265.0")
    sourceRootSubdir.set("icons")
}
