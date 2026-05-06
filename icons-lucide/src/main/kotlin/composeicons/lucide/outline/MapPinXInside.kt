package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinXInside: ImageVector
    get() {
        if (_mapPinXInside != null) return _mapPinXInside!!
        _mapPinXInside = lucideOutlineIcon(
            name = "MapPinXInside",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c0 4.993-5.539 10.193-7.399 11.799-.356 .268-.846 .268-1.202 0C9.539 20.193 4 14.993 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8")
            addPathData("M14.5 7.5l-5 5")
            addPathData("M9.5 7.5l5 5")
        }
        return _mapPinXInside!!
    }

private var _mapPinXInside: ImageVector? = null
