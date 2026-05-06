package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleCircle: ImageVector
    get() {
        if (_rectangleCircle != null) return _rectangleCircle!!
        _rectangleCircle = lucideOutlineIcon(
            name = "RectangleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4v16h-11C2.448 20 2 19.552 2 19v-14C2 4.448 2.448 4 3 4Z")
            addPathData("M22 12c0 4.418-3.582 8-8 8C9.582 20 6 16.418 6 12 6 7.582 9.582 4 14 4c4.418 0 8 3.582 8 8Z")
        }
        return _rectangleCircle!!
    }

private var _rectangleCircle: ImageVector? = null
