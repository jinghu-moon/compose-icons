package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUp10: ImageVector
    get() {
        if (_arrowUp10 != null) return _arrowUp10!!
        _arrowUp10 = lucideOutlineIcon(
            name = "ArrowUp10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8 7 4l4 4")
            addPathData("M7 4v16")
            addPathData("M17 10v-6h-2")
            addPathData("M15 10h4")
            addPathData("M17 14h0c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h0c-1.105 0-2-.895-2-2v-2c0-1.105 .895-2 2-2Z")
        }
        return _arrowUp10!!
    }

private var _arrowUp10: ImageVector? = null
