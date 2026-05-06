package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerUpLeft: ImageVector
    get() {
        if (_cornerUpLeft != null) return _cornerUpLeft!!
        _cornerUpLeft = lucideOutlineIcon(
            name = "CornerUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20v-7C20 10.791 18.209 9 16 9h-12")
            addPathData("M9 14 4 9 9 4")
        }
        return _cornerUpLeft!!
    }

private var _cornerUpLeft: ImageVector? = null
