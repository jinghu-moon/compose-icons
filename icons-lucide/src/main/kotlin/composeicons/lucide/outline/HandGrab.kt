package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = lucideOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 11.5v-2.5C18 7.895 17.105 7 16 7c-1.105 0-2 .895-2 2v1.4")
            addPathData("M14 10v-2C14 6.895 13.105 6 12 6c-1.105 0-2 .895-2 2v2")
            addPathData("M10 9.9v-.9C10 7.895 9.105 7 8 7 6.895 7 6 7.895 6 9v5")
            addPathData("M6 14C6 12.895 5.105 12 4 12c-1.105 0-2 .895-2 2")
            addPathData("M18 11c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3c0 4.418-3.582 8-8 8h-4C5.582 22 2 18.418 2 14c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
        }
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
