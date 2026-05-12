plugins {
    id("compose-icons-generator")
}

generator {
    repoUrl.set("https://github.com/Templarian/MaterialDesign-SVG.git")
    tagName.set("v7.4.47")
    sourceRootSubdir.set("svg")
}
