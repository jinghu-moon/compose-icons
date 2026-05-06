package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EggOff: ImageVector
    get() {
        if (_eggOff != null) return _eggOff!!
        _eggOff = lucideOutlineIcon(
            name = "EggOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2 22 22")
            addPathData("M20 14.347v-.347C20 8 16 2 12 2 10.922 2 9.843 2.436 8.843 3.19")
            addPathData("M6.206 6.21C4.871 8.4 4 11.2 4 14c-0 3.496 2.27 6.588 5.606 7.634 3.336 1.046 6.965-.196 8.962-3.066")
        }
        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
