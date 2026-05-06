package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerRightUp: ImageVector
    get() {
        if (_cornerRightUp != null) return _cornerRightUp!!
        _cornerRightUp = lucideOutlineIcon(
            name = "CornerRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9 15 4l5 5")
            addPathData("M4 20h7c2.209 0 4-1.791 4-4v-12")
        }
        return _cornerRightUp!!
    }

private var _cornerRightUp: ImageVector? = null
