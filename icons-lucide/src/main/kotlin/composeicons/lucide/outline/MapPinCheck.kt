package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinCheck: ImageVector
    get() {
        if (_mapPinCheck != null) return _mapPinCheck!!
        _mapPinCheck = lucideOutlineIcon(
            name = "MapPinCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.43 12.935C19.787 11.968 20 10.98 20 10 20 5.582 16.418 2 12 2 7.582 2 4 5.582 4 10c0 4.993 5.539 10.193 7.399 11.799 .356 .268 .846 .268 1.202 0 .275-.238 .546-.481 .813-.728")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M16 18l2 2 4-4")
        }
        return _mapPinCheck!!
    }

private var _mapPinCheck: ImageVector? = null
