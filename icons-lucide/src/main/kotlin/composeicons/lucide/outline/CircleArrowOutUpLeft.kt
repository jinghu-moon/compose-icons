package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleArrowOutUpLeft: ImageVector
    get() {
        if (_circleArrowOutUpLeft != null) return _circleArrowOutUpLeft!!
        _circleArrowOutUpLeft = lucideOutlineIcon(
            name = "CircleArrowOutUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8v-6h6")
            addPathData("M2 2 12 12")
            addPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12")
        }
        return _circleArrowOutUpLeft!!
    }

private var _circleArrowOutUpLeft: ImageVector? = null
