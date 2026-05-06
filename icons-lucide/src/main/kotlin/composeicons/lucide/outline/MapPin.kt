package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = lucideOutlineIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c0 4.993-5.539 10.193-7.399 11.799-.356 .268-.846 .268-1.202 0C9.539 20.193 4 14.993 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
