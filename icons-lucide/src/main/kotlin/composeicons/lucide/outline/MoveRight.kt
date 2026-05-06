package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveRight: ImageVector
    get() {
        if (_moveRight != null) return _moveRight!!
        _moveRight = lucideOutlineIcon(
            name = "MoveRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8l4 4-4 4")
            addPathData("M2 12h20")
        }
        return _moveRight!!
    }

private var _moveRight: ImageVector? = null
