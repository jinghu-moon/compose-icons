package composeicons.generator.heroicons

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun HeroiconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "heroicons"
    displayName = "Heroicons"
    iconContainerName = "HeroiconsIcons"
    basePackage = "composeicons.heroicons"
    upstreamVersion = "main"

    style("Outline") {
        subdirectory = "24/outline"
        helperFunction = "heroiconsOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Solid") {
        subdirectory = "24/solid"
        helperFunction = "heroiconsSolidIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Mini") {
        subdirectory = "20/solid"
        helperFunction = "heroiconsMiniIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Micro") {
        subdirectory = "16/solid"
        helperFunction = "heroiconsMicroIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("src")
}
