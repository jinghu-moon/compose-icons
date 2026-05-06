package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = lucideOutlineIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 18v-12C14 4.895 13.105 4 12 4h-8C2.895 4 2 4.895 2 6v11c0 .552 .448 1 1 1h2")
            addPathData("M15 18h-6")
            addPathData("M19 18h2c.552 0 1-.448 1-1v-3.65c-0-.227-.078-.447-.22-.624L18.3 8.376C18.111 8.139 17.824 8 17.52 8h-3.52")
            addPathData("M19 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 18c0 1.105-.895 2-2 2C5.895 20 5 19.105 5 18c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _truck!!
    }

private var _truck: ImageVector? = null
