package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalJustifyEnd: ImageVector
    get() {
        if (_alignVerticalJustifyEnd != null) return _alignVerticalJustifyEnd!!
        _alignVerticalJustifyEnd = lucideOutlineIcon(
            name = "AlignVerticalJustifyEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 18 5 17.105 5 16v-2c0-1.105 .895-2 2-2Z")
            addPathData("M9 2h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 8 7 7.105 7 6v-2C7 2.895 7.895 2 9 2Z")
            addPathData("M2 22h20")
        }
        return _alignVerticalJustifyEnd!!
    }

private var _alignVerticalJustifyEnd: ImageVector? = null
