package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowOutDownLeft: ImageVector
    get() {
        if (_squareArrowOutDownLeft != null) return _squareArrowOutDownLeft!!
        _squareArrowOutDownLeft = lucideOutlineIcon(
            name = "SquareArrowOutDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21h6c1.105 0 2-.895 2-2v-14C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v6")
            addPathData("M3 21l9-9")
            addPathData("M9 21h-6v-6")
        }
        return _squareArrowOutDownLeft!!
    }

private var _squareArrowOutDownLeft: ImageVector? = null
