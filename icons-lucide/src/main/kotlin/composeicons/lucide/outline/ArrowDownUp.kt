package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownUp: ImageVector
    get() {
        if (_arrowDownUp != null) return _arrowDownUp!!
        _arrowDownUp = lucideOutlineIcon(
            name = "ArrowDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16l4 4 4-4")
            addPathData("M7 20v-16")
            addPathData("M21 8 17 4 13 8")
            addPathData("M17 4v16")
        }
        return _arrowDownUp!!
    }

private var _arrowDownUp: ImageVector? = null
