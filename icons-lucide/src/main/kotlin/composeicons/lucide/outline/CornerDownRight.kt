package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerDownRight: ImageVector
    get() {
        if (_cornerDownRight != null) return _cornerDownRight!!
        _cornerDownRight = lucideOutlineIcon(
            name = "CornerDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 10l5 5-5 5")
            addPathData("M4 4v7c0 2.209 1.791 4 4 4h12")
        }
        return _cornerDownRight!!
    }

private var _cornerDownRight: ImageVector? = null
