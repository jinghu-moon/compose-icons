package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowOutUpLeft: ImageVector
    get() {
        if (_squareArrowOutUpLeft != null) return _squareArrowOutUpLeft!!
        _squareArrowOutUpLeft = lucideOutlineIcon(
            name = "SquareArrowOutUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3h6c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-6")
            addPathData("M3 3l9 9")
            addPathData("M3 9v-6h6")
        }
        return _squareArrowOutUpLeft!!
    }

private var _squareArrowOutUpLeft: ImageVector? = null
