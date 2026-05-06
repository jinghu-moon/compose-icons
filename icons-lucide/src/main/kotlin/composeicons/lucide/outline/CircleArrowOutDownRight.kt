package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleArrowOutDownRight: ImageVector
    get() {
        if (_circleArrowOutDownRight != null) return _circleArrowOutDownRight!!
        _circleArrowOutDownRight = lucideOutlineIcon(
            name = "CircleArrowOutDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10")
            addPathData("M22 22 12 12")
            addPathData("M22 16v6h-6")
        }
        return _circleArrowOutDownRight!!
    }

private var _circleArrowOutDownRight: ImageVector? = null
