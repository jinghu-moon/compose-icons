package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = lucideOutlineIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 7 7 17")
            addPathData("M17 17h-10v-10")
        }
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
