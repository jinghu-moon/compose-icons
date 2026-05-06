package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = lucideOutlineIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11h3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C3.895 18 3 17.105 3 16v-5ZM3 11C3 6.029 7.029 2 12 2c4.971 0 9 4.029 9 9M21 11v5c0 1.105-.895 2-2 2h-1c-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2h3Z")
            addPathData("M21 16v2c0 2.209-1.791 4-4 4h-5")
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
