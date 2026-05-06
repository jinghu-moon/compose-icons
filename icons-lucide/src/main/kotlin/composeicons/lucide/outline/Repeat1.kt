package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Repeat1: ImageVector
    get() {
        if (_repeat1 != null) return _repeat1!!
        _repeat1 = lucideOutlineIcon(
            name = "Repeat1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 2l4 4-4 4")
            addPathData("M3 11v-1C3 7.791 4.791 6 7 6h14")
            addPathData("M7 22 3 18 7 14")
            addPathData("M21 13v1c0 2.209-1.791 4-4 4h-14")
            addPathData("M11 10h1v4")
        }
        return _repeat1!!
    }

private var _repeat1: ImageVector? = null
