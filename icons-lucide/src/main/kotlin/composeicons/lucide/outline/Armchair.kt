package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = lucideOutlineIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 9v-3C19 4.895 18.105 4 17 4h-10C5.895 4 5 4.895 5 6v3")
            addPathData("M3 16c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-5C21 9.895 20.105 9 19 9c-1.105 0-2 .895-2 2v1.5c0 .276-.224 .5-.5 .5h-9C7.224 13 7 12.776 7 12.5v-1.5C7 9.895 6.105 9 5 9 3.895 9 3 9.895 3 11Z")
            addPathData("M5 18v2")
            addPathData("M19 18v2")
        }
        return _armchair!!
    }

private var _armchair: ImageVector? = null
