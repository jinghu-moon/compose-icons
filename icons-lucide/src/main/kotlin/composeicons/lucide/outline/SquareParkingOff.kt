package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareParkingOff: ImageVector
    get() {
        if (_squareParkingOff != null) return _squareParkingOff!!
        _squareParkingOff = lucideOutlineIcon(
            name = "SquareParkingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.6 3.6C3.969 3.223 4.472 3.008 5 3h14c1.105 0 2 .895 2 2v14c-.002 .53-.214 1.037-.59 1.41")
            addPathData("M3 8.7v10.3c0 1.105 .895 2 2 2h10.3")
            addPathData("M2 2 22 22")
            addPathData("M13 13c1.657 0 3-1.343 3-3C16 8.343 14.657 7 13 7h-4v2")
            addPathData("M9 17v-2.3")
        }
        return _squareParkingOff!!
    }

private var _squareParkingOff: ImageVector? = null
