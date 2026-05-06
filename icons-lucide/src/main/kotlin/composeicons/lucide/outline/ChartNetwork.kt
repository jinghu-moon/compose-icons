package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) return _chartNetwork!!
        _chartNetwork = lucideOutlineIcon(
            name = "ChartNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.11 7.664l1.78 2.672")
            addPathData("M14.162 12.788l-3.324 1.424")
            addPathData("M20 4 13.94 5.515")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M14 6c0 1.105-.895 2-2 2C10.895 8 10 7.105 10 6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M18 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M11 15c0 1.105-.895 2-2 2C7.895 17 7 16.105 7 15c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
