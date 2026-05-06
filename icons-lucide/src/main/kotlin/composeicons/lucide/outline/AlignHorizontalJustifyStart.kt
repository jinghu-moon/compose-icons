package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalJustifyStart: ImageVector
    get() {
        if (_alignHorizontalJustifyStart != null) return _alignHorizontalJustifyStart!!
        _alignHorizontalJustifyStart = lucideOutlineIcon(
            name = "AlignHorizontalJustifyStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5h2c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-2C6.895 19 6 18.105 6 17v-10C6 5.895 6.895 5 8 5Z")
            addPathData("M18 7h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z")
            addPathData("M2 2v20")
        }
        return _alignHorizontalJustifyStart!!
    }

private var _alignHorizontalJustifyStart: ImageVector? = null
