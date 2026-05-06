package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowRightExit: ImageVector
    get() {
        if (_squareArrowRightExit != null) return _squareArrowRightExit!!
        _squareArrowRightExit = lucideOutlineIcon(
            name = "SquareArrowRightExit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h11")
            addPathData("M17 16l4-4L17 8")
            addPathData("M21 6.344v-1.344C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-1.344")
        }
        return _squareArrowRightExit!!
    }

private var _squareArrowRightExit: ImageVector? = null
