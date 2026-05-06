package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignStartVertical: ImageVector
    get() {
        if (_alignStartVertical != null) return _alignStartVertical!!
        _alignStartVertical = lucideOutlineIcon(
            name = "AlignStartVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 14h5c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-5C6.895 20 6 19.105 6 18v-2c0-1.105 .895-2 2-2Z")
            addPathData("M8 4h12c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-12C6.895 10 6 9.105 6 8v-2C6 4.895 6.895 4 8 4Z")
            addPathData("M2 2v20")
        }
        return _alignStartVertical!!
    }

private var _alignStartVertical: ImageVector? = null
