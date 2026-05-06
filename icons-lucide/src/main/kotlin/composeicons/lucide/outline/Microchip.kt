package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Microchip: ImageVector
    get() {
        if (_microchip != null) return _microchip!!
        _microchip = lucideOutlineIcon(
            name = "Microchip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h4")
            addPathData("M10 17h4")
            addPathData("M10 7h4")
            addPathData("M18 12h2")
            addPathData("M18 18h2")
            addPathData("M18 6h2")
            addPathData("M4 12h2")
            addPathData("M4 18h2")
            addPathData("M4 6h2")
            addPathData("M8 2h8c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-8C6.895 22 6 21.105 6 20v-16C6 2.895 6.895 2 8 2Z")
        }
        return _microchip!!
    }

private var _microchip: ImageVector? = null
