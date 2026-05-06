package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RotateCcw: ImageVector
    get() {
        if (_rotateCcw != null) return _rotateCcw!!
        _rotateCcw = lucideOutlineIcon(
            name = "RotateCcw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 9.484 3.009 7.069 3.991 5.26 5.74L3 8")
            addPathData("M3 3v5h5")
        }
        return _rotateCcw!!
    }

private var _rotateCcw: ImageVector? = null
