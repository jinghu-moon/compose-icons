package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MountainSnow: ImageVector
    get() {
        if (_mountainSnow != null) return _mountainSnow!!
        _mountainSnow = lucideOutlineIcon(
            name = "MountainSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3l4 8L17 6l5 15h-20L8 3Z")
            addPathData("M4.14 15.08C6.76 13.51 9.38 13.65 12 15.5c2.74 1.94 5.49 2 8.23 .19")
        }
        return _mountainSnow!!
    }

private var _mountainSnow: ImageVector? = null
