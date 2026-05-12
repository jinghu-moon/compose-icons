package composeicons.generator.octicons

import composeicons.generator.core.IconSource
import composeicons.generator.core.SvgIconEntry
import composeicons.generator.core.manifest.iconLibrary
import composeicons.generator.core.manifest.custom
import composeicons.generator.core.manifest.toIconStyle
import java.io.File

fun OcticonsSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "octicons"
    displayName = "Octicons"
    iconContainerName = "OcticonsIcons"
    basePackage = "composeicons.octicons"
    upstreamVersion = "19.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "octiconsIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Fill") {
        subdirectory = "fill"
        helperFunction = "octiconsFillIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    // 自定义发现：过滤 -24.svg 文件，按 -fill 区分风格
    discovery = custom("icons") { dir ->
        val defaultStyle = allStyles.find { it.name == "Default" }!!
        val fillStyle = allStyles.find { it.name == "Fill" }!!

        dir.listFiles { f -> f.name.endsWith("-24.svg") }
            ?.map { file ->
                val baseName = file.nameWithoutExtension.removeSuffix("-24")
                val isFill = baseName.endsWith("-fill")
                val iconName = if (isFill) baseName.removeSuffix("-fill") else baseName
                val style = if (isFill) fillStyle else defaultStyle
                
                SvgIconEntry(
                    fileName = "$iconName.svg",
                    style = style.toIconStyle(),
                    file = file,
                    rawFileName = file.name
                )
            } ?: emptyList()
    }
}
