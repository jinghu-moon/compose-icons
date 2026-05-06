package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStop: ImageVector
    get() {
        if (_squareStop != null) return _squareStop!!
        _squareStop = lucideOutlineIcon(
            name = "SquareStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M10 9h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 15 9 14.552 9 14v-4C9 9.448 9.448 9 10 9Z")
        }
        return _squareStop!!
    }

private var _squareStop: ImageVector? = null
