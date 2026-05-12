package composeicons.generator.flagicons

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun FlagIconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "flagicons"
    displayName = "Flag Icons"
    iconContainerName = "FlagIcons"
    basePackage = "composeicons.flagicons"
    upstreamVersion = "v7.5.0"

    style("1x1") {
        subdirectory = "1x1"
        sourcePath = "1x1"
        helperFunction = "flagIcons1x1Icon"
        defaultPathStyle { fill = "currentColor" }
    }

    style("4x3") {
        subdirectory = "4x3"
        sourcePath = "4x3"
        helperFunction = "flagIcons4x3Icon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("flags")
}
