package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveUpLeft: ImageVector
    get() {
        if (_moveUpLeft != null) return _moveUpLeft!!
        _moveUpLeft = lucideOutlineIcon(
            name = "MoveUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11v-6h6")
            addPathData("M5 5 19 19")
        }
        return _moveUpLeft!!
    }

private var _moveUpLeft: ImageVector? = null
