package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Share2: ImageVector
    get() {
        if (_share2 != null) return _share2!!
        _share2 = lucideOutlineIcon(
            name = "Share2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5c0 1.657-1.343 3-3 3C16.343 8 15 6.657 15 5 15 3.343 16.343 2 18 2c1.657 0 3 1.343 3 3Z")
            addPathData("M9 12c0 1.657-1.343 3-3 3C4.343 15 3 13.657 3 12 3 10.343 4.343 9 6 9c1.657 0 3 1.343 3 3Z")
            addPathData("M21 19c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M8.59 13.51l6.83 3.98")
            addPathData("M15.41 6.51 8.59 10.49")
        }
        return _share2!!
    }

private var _share2: ImageVector? = null
