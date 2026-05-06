package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ampersands: ImageVector
    get() {
        if (_ampersands != null) return _ampersands!!
        _ampersands = lucideOutlineIcon(
            name = "Ampersands",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 17C5 14 3 10 3 8 3 6.895 3.895 6 5 6c1.105 0 2 .895 2 2 0 2.5-5 2.5-5 6 0 1.7 1.3 3 3 3 2.8 0 5-2.2 5-5")
            addPathData("M22 17C17 14 15 10 15 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 2.5-5 2.5-5 6 0 1.7 1.3 3 3 3 2.8 0 5-2.2 5-5")
        }
        return _ampersands!!
    }

private var _ampersands: ImageVector? = null
