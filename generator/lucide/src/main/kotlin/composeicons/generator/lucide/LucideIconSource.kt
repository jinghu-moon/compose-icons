package composeicons.generator.lucide

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun LucideIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "lucide"
    displayName = "Lucide"
    iconContainerName = "LucideIcons"
    basePackage = "composeicons.lucide"
    upstreamVersion = "main"

    style("Regular") {
        helperFunction = "lucideIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 2f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }

    discovery = flat("icons")
}
