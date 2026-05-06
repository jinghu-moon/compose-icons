package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockAlert: ImageVector
    get() {
        if (_clockAlert != null) return _clockAlert!!
        _clockAlert = lucideOutlineIcon(
            name = "ClockAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v6l4 2")
            addPathData("M20 12v5")
            addPathData("M20 21h.01")
            addPathData("M21.25 8.2C19.707 4.439 16.041 1.987 11.976 1.996 7.911 2.005 4.256 4.473 2.73 8.241c-1.526 3.768-.62 8.084 2.293 10.92 2.913 2.836 7.252 3.626 10.977 1.999")
        }
        return _clockAlert!!
    }

private var _clockAlert: ImageVector? = null
