package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Maximize2: ImageVector
    get() {
        if (_maximize2 != null) return _maximize2!!
        _maximize2 = lucideOutlineIcon(
            name = "Maximize2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3h6v6")
            addPathData("M21 3l-7 7")
            addPathData("M3 21l7-7")
            addPathData("M9 21h-6v-6")
        }
        return _maximize2!!
    }

private var _maximize2: ImageVector? = null
