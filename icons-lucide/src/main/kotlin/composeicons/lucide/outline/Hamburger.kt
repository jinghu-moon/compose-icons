package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = lucideOutlineIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16h-8C2.895 16 2 15.105 2 14c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4.25")
            addPathData("M5 12C3.895 12 3 11.105 3 10 3 6.134 7.029 3 12 3c4.971 0 9 3.134 9 7 0 1.105-.895 2-2 2")
            addPathData("M5 16c-1.105 0-2 .895-2 2 0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3 0-1.105-.895-2-2-2q0 0 0 0")
            addPathData("M6.67 12l6.13 4.6c.884 .663 2.137 .484 2.8-.4L18.75 12")
        }
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
