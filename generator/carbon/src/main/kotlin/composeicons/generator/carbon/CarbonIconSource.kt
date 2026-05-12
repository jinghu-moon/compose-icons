package composeicons.generator.carbon

import composeicons.generator.core.IconSource
import composeicons.generator.core.manifest.iconLibrary
import composeicons.generator.core.manifest.suffixBased
import java.io.File

fun CarbonSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "carbon"
    displayName = "Carbon Icons"
    iconContainerName = "CarbonIcons"
    basePackage = "composeicons.carbon"
    upstreamVersion = "11.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "carbonIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Filled") {
        subdirectory = "filled"
        helperFunction = "carbonFilledIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    // 只取 32px 目录作为源
    discovery = suffixBased("packages/icons/src/svg/32") {
        match("Filled", "--filled")
        default("Default")
    }

    normalizeSize = 24.0  // 32px -> 24dp
}
