package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalSpaceBetween: ImageVector
    get() {
        if (_alignHorizontalSpaceBetween != null) return _alignHorizontalSpaceBetween!!
        _alignHorizontalSpaceBetween = lucideOutlineIcon(
            name = "AlignHorizontalSpaceBetween",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5h2c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-2C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5Z")
            addPathData("M17 7h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z")
            addPathData("M3 2v20")
            addPathData("M21 2v20")
        }
        return _alignHorizontalSpaceBetween!!
    }

private var _alignHorizontalSpaceBetween: ImageVector? = null
