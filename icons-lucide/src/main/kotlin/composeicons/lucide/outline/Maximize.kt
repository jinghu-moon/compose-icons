package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Maximize: ImageVector
    get() {
        if (_maximize != null) return _maximize!!
        _maximize = lucideOutlineIcon(
            name = "Maximize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h-3C3.895 3 3 3.895 3 5v3")
            addPathData("M21 8v-3C21 3.895 20.105 3 19 3h-3")
            addPathData("M3 16v3c0 1.105 .895 2 2 2h3")
            addPathData("M16 21h3c1.105 0 2-.895 2-2v-3")
        }
        return _maximize!!
    }

private var _maximize: ImageVector? = null
