package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowOutDownRight: ImageVector
    get() {
        if (_squareArrowOutDownRight != null) return _squareArrowOutDownRight!!
        _squareArrowOutDownRight = lucideOutlineIcon(
            name = "SquareArrowOutDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11v-6C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h6")
            addPathData("M21 21 12 12")
            addPathData("M21 15v6h-6")
        }
        return _squareArrowOutDownRight!!
    }

private var _squareArrowOutDownRight: ImageVector? = null
