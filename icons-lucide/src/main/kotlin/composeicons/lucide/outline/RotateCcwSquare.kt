package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RotateCcwSquare: ImageVector
    get() {
        if (_rotateCcwSquare != null) return _rotateCcwSquare!!
        _rotateCcwSquare = lucideOutlineIcon(
            name = "RotateCcwSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 9v-2C20 5.895 19.105 5 18 5h-6")
            addPathData("M15 2 12 5l3 3")
            addPathData("M20 13v5c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-11C4 5.895 4.895 5 6 5h2")
        }
        return _rotateCcwSquare!!
    }

private var _rotateCcwSquare: ImageVector? = null
