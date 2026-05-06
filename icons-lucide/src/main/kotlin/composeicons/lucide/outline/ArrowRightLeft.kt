package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowRightLeft: ImageVector
    get() {
        if (_arrowRightLeft != null) return _arrowRightLeft!!
        _arrowRightLeft = lucideOutlineIcon(
            name = "ArrowRightLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3l4 4-4 4")
            addPathData("M20 7h-16")
            addPathData("M8 21 4 17 8 13")
            addPathData("M4 17h16")
        }
        return _arrowRightLeft!!
    }

private var _arrowRightLeft: ImageVector? = null
