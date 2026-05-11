package composeicons.generator.heroicons

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun HeroiconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "heroicons"
    displayName = "Heroicons"
    iconContainerName = "HeroiconsIcons"
    basePackage = "composeicons.heroicons"
    upstreamVersion = "v2.2.0"

    style("Solid16") {
        subdirectory = "solid16"
        sourcePath = "16/solid"
        helperFunction = "heroiconsSolid16Icon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Solid20") {
        subdirectory = "solid20"
        sourcePath = "20/solid"
        helperFunction = "heroiconsSolid20Icon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Outline") {
        subdirectory = "outline"
        sourcePath = "24/outline"
        helperFunction = "heroiconsOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Solid") {
        subdirectory = "solid"
        sourcePath = "24/solid"
        helperFunction = "heroiconsSolidIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("src")
}
