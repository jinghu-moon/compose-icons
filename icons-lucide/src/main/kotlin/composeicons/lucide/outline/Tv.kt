package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tv: ImageVector
    get() {
        if (_tv != null) return _tv!!
        _tv = lucideOutlineIcon(
            name = "Tv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 2 12 7 7 2")
            addPathData("M4 7h16c1.105 0 2 .895 2 2v11c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-11C2 7.895 2.895 7 4 7Z")
        }
        return _tv!!
    }

private var _tv: ImageVector? = null
