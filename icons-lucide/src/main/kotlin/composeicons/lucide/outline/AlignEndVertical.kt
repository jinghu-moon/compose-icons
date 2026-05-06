package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignEndVertical: ImageVector
    get() {
        if (_alignEndVertical != null) return _alignEndVertical!!
        _alignEndVertical = lucideOutlineIcon(
            name = "AlignEndVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h12c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-12C2.895 10 2 9.105 2 8v-2C2 4.895 2.895 4 4 4Z")
            addPathData("M11 14h5c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-5C9.895 20 9 19.105 9 18v-2c0-1.105 .895-2 2-2Z")
            addPathData("M22 22v-20")
        }
        return _alignEndVertical!!
    }

private var _alignEndVertical: ImageVector? = null
