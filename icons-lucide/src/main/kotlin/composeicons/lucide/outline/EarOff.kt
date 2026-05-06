package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EarOff: ImageVector
    get() {
        if (_earOff != null) return _earOff!!
        _earOff = lucideOutlineIcon(
            name = "EarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18.5C6 20.433 7.567 22 9.5 22 11.433 22 13 20.433 13 18.5c0-1.57 .92-2.52 2.04-3.46")
            addPathData("M6 8.5C6 7.75 6.13 7.03 6.36 6.36")
            addPathData("M8.8 3.15c1.989-1.377 4.577-1.536 6.719-.412C17.661 3.861 19.002 6.081 19 8.5c0 1.63-.44 2.81-1.09 3.76")
            addPathData("M12.5 6C13.881 6 15 7.119 15 8.5M10 13c.786-.002 1.498-.463 1.82-1.18")
            addPathData("M2 2 22 22")
        }
        return _earOff!!
    }

private var _earOff: ImageVector? = null
