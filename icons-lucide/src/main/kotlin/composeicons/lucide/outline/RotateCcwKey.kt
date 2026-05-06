package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RotateCcwKey: ImageVector
    get() {
        if (_rotateCcwKey != null) return _rotateCcwKey!!
        _rotateCcwKey = lucideOutlineIcon(
            name = "RotateCcwKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v6")
            addPathData("M12 9h2")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 9.484 3.008 7.068 3.99 5.26 5.74L3 8")
            addPathData("M3 3v5h5")
            addPathData("M14 15c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _rotateCcwKey!!
    }

private var _rotateCcwKey: ImageVector? = null
