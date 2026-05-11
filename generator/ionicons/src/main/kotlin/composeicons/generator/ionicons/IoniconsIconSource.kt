package composeicons.generator.ionicons

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun IoniconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "ionicons"
    displayName = "Ionicons"
    iconContainerName = "IoniconsIcons"
    basePackage = "composeicons.ionicons"
    upstreamVersion = "main"

    style("Filled") { subdirectory = "filled"; helperFunction = "ioniconsFilledIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Outline") {
        subdirectory = "outline"
        helperFunction = "ioniconsOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 32f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Sharp") { subdirectory = "sharp"; helperFunction = "ioniconsSharpIcon"; defaultPathStyle { fill = "currentColor" } }

    discovery = suffixBased("src/svg") {
        match("Outline", "-outline")
        match("Sharp", "-sharp")
        default("Filled")
    }
}
