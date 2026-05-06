package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StretchVertical: ImageVector
    get() {
        if (_stretchVertical != null) return _stretchVertical!!
        _stretchVertical = lucideOutlineIcon(
            name = "StretchVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h2c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-2C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M16 2h2c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-16c0-1.105 .895-2 2-2Z")
        }
        return _stretchVertical!!
    }

private var _stretchVertical: ImageVector? = null
