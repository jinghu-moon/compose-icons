package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleParkingOff: ImageVector
    get() {
        if (_circleParkingOff != null) return _circleParkingOff!!
        _circleParkingOff = lucideOutlineIcon(
            name = "CircleParkingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.656 7h.344c.849 0 1.658 .36 2.227 .99 .569 .63 .844 1.472 .757 2.317")
            addPathData("M13 13h-4")
            addPathData("M19.071 19.071c-3.905 3.905-10.236 3.905-14.141 0C1.025 15.166 1.025 8.835 4.93 4.93")
            addPathData("M2 2 22 22")
            addPathData("M8.357 2.687c3.7-1.447 7.905-.567 10.714 2.242 2.809 2.809 3.689 7.015 2.242 10.714")
            addPathData("M9 17v-8")
        }
        return _circleParkingOff!!
    }

private var _circleParkingOff: ImageVector? = null
