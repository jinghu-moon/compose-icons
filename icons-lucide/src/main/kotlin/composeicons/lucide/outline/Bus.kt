package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = lucideOutlineIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6v6")
            addPathData("M15 6v6")
            addPathData("M2 12h19.6")
            addPathData("M18 18h3c0 0 .5-1.7 .8-2.8C21.9 14.8 22 14.4 22 14c0-.4-.1-.8-.2-1.2l-1.4-5C20.1 6.8 19.1 6 18 6h-14C2.895 6 2 6.895 2 8v10h3")
            addPathData("M9 18c0 1.105-.895 2-2 2C5.895 20 5 19.105 5 18c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 18h5")
            addPathData("M18 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _bus!!
    }

private var _bus: ImageVector? = null
