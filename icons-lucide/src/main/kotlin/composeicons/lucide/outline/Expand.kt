package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Expand: ImageVector
    get() {
        if (_expand != null) return _expand!!
        _expand = lucideOutlineIcon(
            name = "Expand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15l6 6")
            addPathData("M15 9 21 3")
            addPathData("M21 16v5h-5")
            addPathData("M21 8v-5h-5")
            addPathData("M3 16v5h5")
            addPathData("M3 21 9 15")
            addPathData("M3 8v-5h5")
            addPathData("M9 9 3 3")
        }
        return _expand!!
    }

private var _expand: ImageVector? = null
