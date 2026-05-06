package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Building2: ImageVector
    get() {
        if (_building2 != null) return _building2!!
        _building2 = lucideOutlineIcon(
            name = "Building2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h4")
            addPathData("M10 8h4")
            addPathData("M14 21v-3c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v3")
            addPathData("M6 10h-2c-1.105 0-2 .895-2 2v7c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-10C22 7.895 21.105 7 20 7h-2")
            addPathData("M6 21v-16C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v16")
        }
        return _building2!!
    }

private var _building2: ImageVector? = null
