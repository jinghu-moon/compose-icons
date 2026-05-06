package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Laugh: ImageVector
    get() {
        if (_laugh != null) return _laugh!!
        _laugh = lucideOutlineIcon(
            name = "Laugh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M18 13c-.493 2.918-3.041 5.041-6 5C9.041 18.041 6.493 15.918 6 13h12Z")
            addPathData("M9 9h.01")
            addPathData("M15 9h.01")
        }
        return _laugh!!
    }

private var _laugh: ImageVector? = null
