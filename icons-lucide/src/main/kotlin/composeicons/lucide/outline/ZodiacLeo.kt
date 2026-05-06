package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) return _zodiacLeo!!
        _zodiacLeo = lucideOutlineIcon(
            name = "ZodiacLeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16C10 12 7 11.5 7 8 7 5.239 9.239 3 12 3c2.761 0 5 2.239 5 5 0 3.466-3 6.196-3 10 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M10 16c0 1.657-1.343 3-3 3C5.343 19 4 17.657 4 16 4 14.343 5.343 13 7 13c1.657 0 3 1.343 3 3Z")
        }
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
