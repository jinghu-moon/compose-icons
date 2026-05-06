package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleArrowOutUpRight: ImageVector
    get() {
        if (_circleArrowOutUpRight != null) return _circleArrowOutUpRight!!
        _circleArrowOutUpRight = lucideOutlineIcon(
            name = "CircleArrowOutUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2")
            addPathData("M22 2 12 12")
            addPathData("M16 2h6v6")
        }
        return _circleArrowOutUpRight!!
    }

private var _circleArrowOutUpRight: ImageVector? = null
