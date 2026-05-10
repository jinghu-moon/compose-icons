package composeicons.generator.phosphor

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun PhosphorIconSource(
    upstreamVersion: String = "2.1.0",
    referRoot: File,
): IconSource = iconLibrary(referRoot) {
    name = "phosphor"
    displayName = "PhosphorIcons"
    iconContainerName = "PhosphorIcons"
    basePackage = "composeicons.phosphor"
    this.upstreamVersion = upstreamVersion

    style("Thin") {
        helperFunction = "phosphorThinIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 8f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Light") {
        helperFunction = "phosphorLightIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 12f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Regular") {
        helperFunction = "phosphorRegularIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 16f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Bold") {
        helperFunction = "phosphorBoldIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 24f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Fill") {
        helperFunction = "phosphorFillIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Duotone") {
        helperFunction = "phosphorDuotoneIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 16f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }

    discovery = suffixBased("public/assets/phosphor.iconjar/icons") {
        match("Thin", "-thin")
        match("Light", "-light")
        match("Bold", "-bold")
        match("Fill", "-fill")
        match("Duotone", "-duotone")
        default("Regular")
    }
}
