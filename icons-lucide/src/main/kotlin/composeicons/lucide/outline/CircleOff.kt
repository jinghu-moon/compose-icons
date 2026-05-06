package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleOff: ImageVector
    get() {
        if (_circleOff != null) return _circleOff!!
        _circleOff = lucideOutlineIcon(
            name = "CircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2 22 22")
            addPathData("M8.35 2.69c3.7-1.445 7.904-.563 10.712 2.246 2.808 2.81 3.686 7.015 2.238 10.714")
            addPathData("M19.08 19.08c-3.91 3.91-10.25 3.91-14.16 0C1.01 15.17 1.01 8.83 4.92 4.92")
        }
        return _circleOff!!
    }

private var _circleOff: ImageVector? = null
