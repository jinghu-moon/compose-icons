package composeicons.generator.radix

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun RadixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "radixicons"
    displayName = "Radix Icons"
    iconContainerName = "RadixIcons"
    basePackage = "composeicons.radix"
    upstreamVersion = "1.3.0"

    style("Regular") {
        helperFunction = "radixIcon"
        defaultPathStyle {
            fill = "currentColor"; fillRule = "nonzero"
        }
    }
    discovery = flat("packages/radix-icons/icons")
}
