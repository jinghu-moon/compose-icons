package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = lucideOutlineIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 6v14c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-14")
            addPathData("M3 6h18")
            addPathData("M8 6v-2C8 2.895 8.895 2 10 2h4c1.105 0 2 .895 2 2v2")
        }
        return _trash!!
    }

private var _trash: ImageVector? = null
