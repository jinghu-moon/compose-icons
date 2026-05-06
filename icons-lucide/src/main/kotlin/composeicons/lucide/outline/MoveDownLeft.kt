package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveDownLeft: ImageVector
    get() {
        if (_moveDownLeft != null) return _moveDownLeft!!
        _moveDownLeft = lucideOutlineIcon(
            name = "MoveDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-6v-6")
            addPathData("M19 5 5 19")
        }
        return _moveDownLeft!!
    }

private var _moveDownLeft: ImageVector? = null
