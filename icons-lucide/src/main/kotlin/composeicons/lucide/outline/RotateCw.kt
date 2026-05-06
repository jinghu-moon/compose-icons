package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RotateCw: ImageVector
    get() {
        if (_rotateCw != null) return _rotateCw!!
        _rotateCw = lucideOutlineIcon(
            name = "RotateCw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c2.52 0 4.93 1 6.74 2.74L21 8")
            addPathData("M21 3v5h-5")
        }
        return _rotateCw!!
    }

private var _rotateCw: ImageVector? = null
