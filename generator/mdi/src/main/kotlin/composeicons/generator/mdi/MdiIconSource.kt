package composeicons.generator.mdi

import composeicons.generator.core.IconSource
import composeicons.generator.core.manifest.iconLibrary
import composeicons.generator.core.manifest.suffixBased
import java.io.File

fun MdiIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "mdi"
    displayName = "Material Design Icons"
    iconContainerName = "MdiIcons"
    basePackage = "composeicons.mdi"
    upstreamVersion = "7.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "mdiIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Outline") {
        subdirectory = "outline"
        helperFunction = "mdiOutlineIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = suffixBased("svg") {
        match("Outline", "-outline")
        default("Default")
    }
}
