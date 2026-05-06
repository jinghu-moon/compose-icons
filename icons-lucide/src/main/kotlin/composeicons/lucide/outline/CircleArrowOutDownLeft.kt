package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleArrowOutDownLeft: ImageVector
    get() {
        if (_circleArrowOutDownLeft != null) return _circleArrowOutDownLeft!!
        _circleArrowOutDownLeft = lucideOutlineIcon(
            name = "CircleArrowOutDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10")
            addPathData("M2 22 12 12")
            addPathData("M8 22h-6v-6")
        }
        return _circleArrowOutDownLeft!!
    }

private var _circleArrowOutDownLeft: ImageVector? = null
