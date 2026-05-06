package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = lucideOutlineIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 14l4 4-4 4")
            addPathData("M18 2l4 4-4 4")
            addPathData("M2 18h1.973c1.312 .009 2.545-.626 3.3-1.7L12.727 7.7C13.482 6.626 14.715 5.991 16.027 6h5.973")
            addPathData("M2 6h1.972c1.521-.011 2.916 .842 3.6 2.2")
            addPathData("M22 18h-6.041c-1.331-.014-2.568-.688-3.3-1.8l-.359-.45")
        }
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
