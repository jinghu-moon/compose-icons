package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = lucideOutlineIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M9.17 14.83c1.563 1.561 4.094 1.56 5.656-.002 1.561-1.562 1.561-4.094 0-5.656C13.264 7.61 10.733 7.609 9.17 9.17")
        }
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
