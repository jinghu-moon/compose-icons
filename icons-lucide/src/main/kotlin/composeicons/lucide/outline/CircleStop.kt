package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleStop: ImageVector
    get() {
        if (_circleStop != null) return _circleStop!!
        _circleStop = lucideOutlineIcon(
            name = "CircleStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M10 9h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 15 9 14.552 9 14v-4C9 9.448 9.448 9 10 9Z")
        }
        return _circleStop!!
    }

private var _circleStop: ImageVector? = null
