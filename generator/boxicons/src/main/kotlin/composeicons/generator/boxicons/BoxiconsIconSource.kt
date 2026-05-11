package composeicons.generator.boxicons

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun BoxiconsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "boxicons"
    displayName = "Boxicons"
    iconContainerName = "BoxiconsIcons"
    basePackage = "composeicons.boxicons"
    upstreamVersion = "2.1.4"

    style("Regular") { subdirectory = "basic";  helperFunction = "boxiconsRegularIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Solid")   { subdirectory = "filled"; helperFunction = "boxiconsSolidIcon";   defaultPathStyle { fill = "currentColor" } }
    style("Logos")   { subdirectory = "brands"; helperFunction = "boxiconsLogosIcon";   defaultPathStyle { fill = "currentColor" } }

    discovery = subdirectories("svg")
}
