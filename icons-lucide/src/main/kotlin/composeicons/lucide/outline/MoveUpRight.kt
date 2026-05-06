package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveUpRight: ImageVector
    get() {
        if (_moveUpRight != null) return _moveUpRight!!
        _moveUpRight = lucideOutlineIcon(
            name = "MoveUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5h6v6")
            addPathData("M19 5 5 19")
        }
        return _moveUpRight!!
    }

private var _moveUpRight: ImageVector? = null
