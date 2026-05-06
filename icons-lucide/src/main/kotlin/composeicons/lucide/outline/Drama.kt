package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drama: ImageVector
    get() {
        if (_drama != null) return _drama!!
        _drama = lucideOutlineIcon(
            name = "Drama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 11h.01")
            addPathData("M14 6h.01")
            addPathData("M18 6h.01")
            addPathData("M6.5 13.1h.01")
            addPathData("M22 5c0 9-4 12-6 12C14 17 10 14 10 5 10 3 12 2 16 2c4 0 6 1 6 3")
            addPathData("M17.4 9.9c-.8 .8-2 .8-2.8 0")
            addPathData("M10.1 7.1C9 7.2 7.7 7.7 6 8.6c-3.5 2-4.7 3.9-3.7 5.6 4.5 7.8 9.5 8.4 11.2 7.4 .9-.5 1.9-2.1 1.9-4.7")
            addPathData("M9.1 16.5c.3-1.1 1.4-1.7 2.4-1.4")
        }
        return _drama!!
    }

private var _drama: ImageVector? = null
