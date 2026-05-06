package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = lucideOutlineIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 17v-10h10")
            addPathData("M17 17 7 7")
        }
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
