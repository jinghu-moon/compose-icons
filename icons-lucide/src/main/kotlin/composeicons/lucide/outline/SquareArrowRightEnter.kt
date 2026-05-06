package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowRightEnter: ImageVector
    get() {
        if (_squareArrowRightEnter != null) return _squareArrowRightEnter!!
        _squareArrowRightEnter = lucideOutlineIcon(
            name = "SquareArrowRightEnter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16l4-4L10 8")
            addPathData("M3 12h11")
            addPathData("M3 8v-3C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-3")
        }
        return _squareArrowRightEnter!!
    }

private var _squareArrowRightEnter: ImageVector? = null
