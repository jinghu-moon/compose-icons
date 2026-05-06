package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LifeBuoy: ImageVector
    get() {
        if (_lifeBuoy != null) return _lifeBuoy!!
        _lifeBuoy = lucideOutlineIcon(
            name = "LifeBuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M4.93 4.93 9.17 9.17")
            addPathData("M14.83 9.17 19.07 4.93")
            addPathData("M14.83 14.83l4.24 4.24")
            addPathData("M9.17 14.83 4.93 19.07")
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
        }
        return _lifeBuoy!!
    }

private var _lifeBuoy: ImageVector? = null
