package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareArrowOutUpRight: ImageVector
    get() {
        if (_squareArrowOutUpRight != null) return _squareArrowOutUpRight!!
        _squareArrowOutUpRight = lucideOutlineIcon(
            name = "SquareArrowOutUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 13v6c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h6")
            addPathData("M21 3l-9 9")
            addPathData("M15 3h6v6")
        }
        return _squareArrowOutUpRight!!
    }

private var _squareArrowOutUpRight: ImageVector? = null
