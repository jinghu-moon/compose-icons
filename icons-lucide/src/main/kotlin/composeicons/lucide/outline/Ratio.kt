package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ratio: ImageVector
    get() {
        if (_ratio != null) return _ratio!!
        _ratio = lucideOutlineIcon(
            name = "Ratio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2h8c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-8C6.895 22 6 21.105 6 20v-16C6 2.895 6.895 2 8 2Z")
            addPathData("M4 6h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z")
        }
        return _ratio!!
    }

private var _ratio: ImageVector? = null
