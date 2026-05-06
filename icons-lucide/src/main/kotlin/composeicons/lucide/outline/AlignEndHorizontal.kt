package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignEndHorizontal: ImageVector
    get() {
        if (_alignEndHorizontal != null) return _alignEndHorizontal!!
        _alignEndHorizontal = lucideOutlineIcon(
            name = "AlignEndHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h2c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-2C4.895 18 4 17.105 4 16v-12C4 2.895 4.895 2 6 2Z")
            addPathData("M16 9h2c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-5c0-1.105 .895-2 2-2Z")
            addPathData("M22 22h-20")
        }
        return _alignEndHorizontal!!
    }

private var _alignEndHorizontal: ImageVector? = null
