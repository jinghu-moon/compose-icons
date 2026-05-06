package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bubbles: ImageVector
    get() {
        if (_bubbles != null) return _bubbles!!
        _bubbles = lucideOutlineIcon(
            name = "Bubbles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.001 15.085c.459-.162 .968-.091 1.366 .19 .397 .281 .634 .738 .633 1.225")
            addPathData("M22 8.5C22 10.433 20.433 12 18.5 12 16.567 12 15 10.433 15 8.5 15 6.567 16.567 5 18.5 5 20.433 5 22 6.567 22 8.5Z")
            addPathData("M13 16.5C13 19.538 10.538 22 7.5 22 4.462 22 2 19.538 2 16.5 2 13.462 4.462 11 7.5 11 10.538 11 13 13.462 13 16.5Z")
            addPathData("M10 4.5C10 5.881 8.881 7 7.5 7 6.119 7 5 5.881 5 4.5 5 3.119 6.119 2 7.5 2 8.881 2 10 3.119 10 4.5Z")
        }
        return _bubbles!!
    }

private var _bubbles: ImageVector? = null
