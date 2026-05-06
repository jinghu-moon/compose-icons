package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerRightDown: ImageVector
    get() {
        if (_cornerRightDown != null) return _cornerRightDown!!
        _cornerRightDown = lucideOutlineIcon(
            name = "CornerRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15l5 5 5-5")
            addPathData("M4 4h7c2.209 0 4 1.791 4 4v12")
        }
        return _cornerRightDown!!
    }

private var _cornerRightDown: ImageVector? = null
