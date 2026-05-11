package composeicons.generator.phosphor

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun PhosphorIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "phosphor"
    displayName = "PhosphorIcons"
    iconContainerName = "PhosphorIcons"
    basePackage = "composeicons.phosphor"
    upstreamVersion = "2.1.0"

    style("Thin")    { subdirectory = "thin";    helperFunction = "phosphorThinIcon";    defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 8f;  strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Light")   { subdirectory = "light";   helperFunction = "phosphorLightIcon";   defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 12f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Regular") { subdirectory = "regular"; helperFunction = "phosphorRegularIcon"; defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 16f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Bold")    { subdirectory = "bold";    helperFunction = "phosphorBoldIcon";    defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 24f; strokeLineCap = "round"; strokeLineJoin = "round" } }
    style("Fill")    { subdirectory = "fill";    helperFunction = "phosphorFillIcon";    defaultPathStyle { fill = "currentColor" } }
    style("Duotone") { subdirectory = "duotone"; helperFunction = "phosphorDuotoneIcon"; defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 16f; strokeLineCap = "round"; strokeLineJoin = "round" } }

    discovery = suffixBased("public/assets/phosphor.iconjar/icons") {
        match("Thin", "-thin")
        match("Light", "-light")
        match("Bold", "-bold")
        match("Fill", "-fill")
        match("Duotone", "-duotone")
        default("Regular")
    }
}
