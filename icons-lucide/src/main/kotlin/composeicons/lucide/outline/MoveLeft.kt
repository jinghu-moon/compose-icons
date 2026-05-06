package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveLeft: ImageVector
    get() {
        if (_moveLeft != null) return _moveLeft!!
        _moveLeft = lucideOutlineIcon(
            name = "MoveLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8 2 12l4 4")
            addPathData("M2 12h20")
        }
        return _moveLeft!!
    }

private var _moveLeft: ImageVector? = null
