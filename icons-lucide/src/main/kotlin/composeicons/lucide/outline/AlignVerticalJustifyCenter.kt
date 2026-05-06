package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalJustifyCenter: ImageVector
    get() {
        if (_alignVerticalJustifyCenter != null) return _alignVerticalJustifyCenter!!
        _alignVerticalJustifyCenter = lucideOutlineIcon(
            name = "AlignVerticalJustifyCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-2c0-1.105 .895-2 2-2Z")
            addPathData("M9 2h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 8 7 7.105 7 6v-2C7 2.895 7.895 2 9 2Z")
            addPathData("M2 12h20")
        }
        return _alignVerticalJustifyCenter!!
    }

private var _alignVerticalJustifyCenter: ImageVector? = null
