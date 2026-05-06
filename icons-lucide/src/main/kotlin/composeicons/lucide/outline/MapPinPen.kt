package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinPen: ImageVector
    get() {
        if (_mapPinPen != null) return _mapPinPen!!
        _mapPinPen = lucideOutlineIcon(
            name = "MapPinPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.97 9.304C17.599 5.036 13.932 1.817 9.652 2.004 5.371 2.19 1.998 5.716 2 10c0 4.69 4.887 9.562 7.022 11.468")
            addPathData("M21.378 16.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-4.01 4.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
            addPathData("M13 10c0 1.657-1.343 3-3 3C8.343 13 7 11.657 7 10 7 8.343 8.343 7 10 7c1.657 0 3 1.343 3 3Z")
        }
        return _mapPinPen!!
    }

private var _mapPinPen: ImageVector? = null
