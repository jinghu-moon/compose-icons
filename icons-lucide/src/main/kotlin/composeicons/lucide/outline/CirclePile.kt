package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CirclePile: ImageVector
    get() {
        if (_circlePile != null) return _circlePile!!
        _circlePile = lucideOutlineIcon(
            name = "CirclePile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M14 5c0 1.105-.895 2-2 2C10.895 7 10 6.105 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M18 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M22 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M6 19c0 1.105-.895 2-2 2C2.895 21 2 20.105 2 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M10 12c0 1.105-.895 2-2 2C6.895 14 6 13.105 6 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _circlePile!!
    }

private var _circlePile: ImageVector? = null
