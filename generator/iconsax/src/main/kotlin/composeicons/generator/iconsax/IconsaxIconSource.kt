package composeicons.generator.iconsax

import composeicons.generator.core.IconSource
import composeicons.generator.core.manifest.iconLibrary
import composeicons.generator.core.manifest.prefixBased
import java.io.File

fun IconsaxSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "iconsax"
    displayName = "Iconsax"
    iconContainerName = "IconsaxIcons"
    basePackage = "composeicons.iconsax"
    upstreamVersion = "1.0"

    style("Linear") {
        subdirectory = "linear"
        helperFunction = "iconsaxLinearIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Outline") {
        subdirectory = "outline"
        helperFunction = "iconsaxOutlineIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Broken") {
        subdirectory = "broken"
        helperFunction = "iconsaxBrokenIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Bold") {
        subdirectory = "bold"
        helperFunction = "iconsaxBoldIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Bulk") {
        subdirectory = "bulk"
        helperFunction = "iconsaxBulkIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("TwoTone") {
        subdirectory = "twotone"
        helperFunction = "iconsaxTwoToneIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }

    discovery = prefixBased("resources/svg") {
        match("Bold", "bol-")
        match("Broken", "bro-")
        match("Bulk", "bul-")
        match("Linear", "lin-")
        match("Outline", "out-")
        match("TwoTone", "twt-")
    }
}
