package composeicons.generator.bootstrap

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun BootstrapIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "bootstrap"
    displayName = "Bootstrap Icons"
    iconContainerName = "BootstrapIcons"
    basePackage = "composeicons.bootstrap"
    upstreamVersion = "v1.11.3"

    style("Regular") { subdirectory = "regular"; helperFunction = "bootstrapRegularIcon"; defaultPathStyle { fill = "currentColor" } }
    style("Fill")    { subdirectory = "fill";    helperFunction = "bootstrapFillIcon";    defaultPathStyle { fill = "currentColor" } }

    discovery = suffixBased("icons") {
        match("Fill", "-fill")
        exclude("-half")
        default("Regular")
    }
}
