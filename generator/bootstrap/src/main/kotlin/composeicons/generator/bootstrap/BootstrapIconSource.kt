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

    style("Regular") {
        helperFunction = "bootstrapIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Fill") {
        helperFunction = "bootstrapIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = suffixBased("icons") {
        match("Fill", "-fill")
        default("Regular")
    }
}
