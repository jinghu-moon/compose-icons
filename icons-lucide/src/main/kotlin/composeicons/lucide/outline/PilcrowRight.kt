package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PilcrowRight: ImageVector
    get() {
        if (_pilcrowRight != null) return _pilcrowRight!!
        _pilcrowRight = lucideOutlineIcon(
            name = "PilcrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3v11")
            addPathData("M10 9h-3C5.343 9 4 7.657 4 6 4 4.343 5.343 3 7 3h8")
            addPathData("M14 3v11")
            addPathData("M18 14l4 4h-20")
            addPathData("M22 18l-4 4")
        }
        return _pilcrowRight!!
    }

private var _pilcrowRight: ImageVector? = null
