package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Undo: ImageVector
    get() {
        if (_undo != null) return _undo!!
        _undo = lucideOutlineIcon(
            name = "Undo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v6h6")
            addPathData("M21 17C21 12.029 16.971 8 12 8 9.785 8.002 7.649 8.821 6 10.3L3 13")
        }
        return _undo!!
    }

private var _undo: ImageVector? = null
