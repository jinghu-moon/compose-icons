package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BringToFront: ImageVector
    get() {
        if (_bringToFront != null) return _bringToFront!!
        _bringToFront = lucideOutlineIcon(
            name = "BringToFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C8.895 16 8 15.105 8 14v-4C8 8.895 8.895 8 10 8Z")
            addPathData("M4 10C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2h4c1.105 0 2 .895 2 2")
            addPathData("M14 20c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2")
        }
        return _bringToFront!!
    }

private var _bringToFront: ImageVector? = null
