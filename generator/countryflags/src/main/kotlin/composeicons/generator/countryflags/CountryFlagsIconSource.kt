package composeicons.generator.countryflags

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun CountryFlagsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "countryflags"
    displayName = "Country Flags"
    iconContainerName = "CountryFlags"
    basePackage = "composeicons.countryflags"
    upstreamVersion = "v1.2.10"

    style("Regular") {
        subdirectory = ""
        helperFunction = "countryFlagsRegularIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = flat("svg")
}
