package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleCheckBig: ImageVector
    get() {
        if (_circleCheckBig != null) return _circleCheckBig!!
        _circleCheckBig = lucideOutlineIcon(
            name = "CircleCheckBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.801 10c.941 4.619-1.471 9.267-5.788 11.157C11.695 23.047 6.643 21.666 3.888 17.841 1.133 14.017 1.423 8.788 4.584 5.291 7.744 1.794 12.917 .979 17 3.335")
            addPathData("M9 11l3 3L22 4")
        }
        return _circleCheckBig!!
    }

private var _circleCheckBig: ImageVector? = null
