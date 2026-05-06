package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleArrowLeft: ImageVector
    get() {
        if (_circleArrowLeft != null) return _circleArrowLeft!!
        _circleArrowLeft = lucideOutlineIcon(
            name = "CircleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M12 8 8 12l4 4")
            addPathData("M16 12h-8")
        }
        return _circleArrowLeft!!
    }

private var _circleArrowLeft: ImageVector? = null
