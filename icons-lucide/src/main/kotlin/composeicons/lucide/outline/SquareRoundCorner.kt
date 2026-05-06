package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareRoundCorner: ImageVector
    get() {
        if (_squareRoundCorner != null) return _squareRoundCorner!!
        _squareRoundCorner = lucideOutlineIcon(
            name = "SquareRoundCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11C21 6.582 17.418 3 13 3")
            addPathData("M21 15v4c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h4")
        }
        return _squareRoundCorner!!
    }

private var _squareRoundCorner: ImageVector? = null
