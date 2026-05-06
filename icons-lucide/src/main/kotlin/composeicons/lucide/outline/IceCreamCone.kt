package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamCone: ImageVector
    get() {
        if (_iceCreamCone != null) return _iceCreamCone!!
        _iceCreamCone = lucideOutlineIcon(
            name = "IceCreamCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 11l4.08 10.35c.157 .369 .519 .608 .92 .608 .401 0 .763-.239 .92-.608L17 11")
            addPathData("M17 7C17 4.239 14.761 2 12 2 9.239 2 7 4.239 7 7")
            addPathData("M17 7c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-10C5.895 11 5 10.105 5 9 5 7.895 5.895 7 7 7")
        }
        return _iceCreamCone!!
    }

private var _iceCreamCone: ImageVector? = null
