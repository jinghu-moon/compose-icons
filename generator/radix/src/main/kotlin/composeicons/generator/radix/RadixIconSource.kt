package composeicons.generator.radix

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun RadixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "radix"
    displayName = "Radix Icons"
    iconContainerName = "RadixIcons"
    basePackage = "composeicons.radix"
    upstreamVersion = "main"

    style("Regular") {
        helperFunction = "radixIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = flat("packages/radix-ui-icons/icons")
}
