package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) return _arrowLeftRight!!
        _arrowLeftRight = lucideOutlineIcon(
            name = "ArrowLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3 4 7l4 4")
            addPathData("M4 7h16")
            addPathData("M16 21l4-4L16 13")
            addPathData("M20 17h-16")
        }
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
