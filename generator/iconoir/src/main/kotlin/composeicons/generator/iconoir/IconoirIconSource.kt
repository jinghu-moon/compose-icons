package composeicons.generator.iconoir

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun IconoirIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "iconoir"
    displayName = "Iconoir"
    iconContainerName = "IconoirIcons"
    basePackage = "composeicons.iconoir"
    upstreamVersion = "main"

    style("Regular") {
        subdirectory = "regular"
        helperFunction = "iconoirRegularIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Solid") {
        subdirectory = "solid"
        helperFunction = "iconoirSolidIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("icons")
}
