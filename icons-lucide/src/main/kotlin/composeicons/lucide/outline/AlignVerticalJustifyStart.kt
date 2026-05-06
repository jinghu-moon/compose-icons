package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalJustifyStart: ImageVector
    get() {
        if (_alignVerticalJustifyStart != null) return _alignVerticalJustifyStart!!
        _alignVerticalJustifyStart = lucideOutlineIcon(
            name = "AlignVerticalJustifyStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-2c0-1.105 .895-2 2-2Z")
            addPathData("M9 6h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 12 7 11.105 7 10v-2C7 6.895 7.895 6 9 6Z")
            addPathData("M2 2h20")
        }
        return _alignVerticalJustifyStart!!
    }

private var _alignVerticalJustifyStart: ImageVector? = null
