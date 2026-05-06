package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MouseRight: ImageVector
    get() {
        if (_mouseRight != null) return _mouseRight!!
        _mouseRight = lucideOutlineIcon(
            name = "MouseRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7.318v2.682")
            addPathData("M19 10v5c0 3.866-3.134 7-7 7C8.134 22 5 18.866 5 15v-6C5 5.473 7.608 2.485 11 2")
            addPathData("M19 4c0 1.105-.895 2-2 2C15.895 6 15 5.105 15 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _mouseRight!!
    }

private var _mouseRight: ImageVector? = null
