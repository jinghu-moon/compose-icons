package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlipVertical2: ImageVector
    get() {
        if (_flipVertical2 != null) return _flipVertical2!!
        _flipVertical2 = lucideOutlineIcon(
            name = "FlipVertical2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3 12 8 7 3h10")
            addPathData("M17 21 12 16 7 21h10")
            addPathData("M4 12h-2")
            addPathData("M10 12h-2")
            addPathData("M16 12h-2")
            addPathData("M22 12h-2")
        }
        return _flipVertical2!!
    }

private var _flipVertical2: ImageVector? = null
