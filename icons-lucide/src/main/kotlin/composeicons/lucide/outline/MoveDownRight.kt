package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveDownRight: ImageVector
    get() {
        if (_moveDownRight != null) return _moveDownRight!!
        _moveDownRight = lucideOutlineIcon(
            name = "MoveDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 13v6h-6")
            addPathData("M5 5 19 19")
        }
        return _moveDownRight!!
    }

private var _moveDownRight: ImageVector? = null
