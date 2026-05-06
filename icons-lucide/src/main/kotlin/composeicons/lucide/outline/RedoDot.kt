package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RedoDot: ImageVector
    get() {
        if (_redoDot != null) return _redoDot!!
        _redoDot = lucideOutlineIcon(
            name = "RedoDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M21 7v6h-6")
            addPathData("M3 17C3 12.029 7.029 8 12 8c2.215 .002 4.351 .821 6 2.3L21 13")
        }
        return _redoDot!!
    }

private var _redoDot: ImageVector? = null
