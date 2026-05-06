package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UndoDot: ImageVector
    get() {
        if (_undoDot != null) return _undoDot!!
        _undoDot = lucideOutlineIcon(
            name = "UndoDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17C20.997 13.452 18.91 10.238 15.67 8.791 12.431 7.344 8.644 7.935 6 10.3L3 13")
            addPathData("M3 7v6h6")
            addPathData("M13 17c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _undoDot!!
    }

private var _undoDot: ImageVector? = null
