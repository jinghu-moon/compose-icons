package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareSquare: ImageVector
    get() {
        if (_squareSquare != null) return _squareSquare!!
        _squareSquare = lucideOutlineIcon(
            name = "SquareSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M9 8h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-6C8 8.448 8.448 8 9 8Z")
        }
        return _squareSquare!!
    }

private var _squareSquare: ImageVector? = null
