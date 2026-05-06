package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignStartHorizontal: ImageVector
    get() {
        if (_alignStartHorizontal != null) return _alignStartHorizontal!!
        _alignStartHorizontal = lucideOutlineIcon(
            name = "AlignStartHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6h2c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-2C4.895 22 4 21.105 4 20v-12C4 6.895 4.895 6 6 6Z")
            addPathData("M16 6h2c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-5c0-1.105 .895-2 2-2Z")
            addPathData("M22 2h-20")
        }
        return _alignStartHorizontal!!
    }

private var _alignStartHorizontal: ImageVector? = null
