package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GripVertical: ImageVector
    get() {
        if (_gripVertical != null) return _gripVertical!!
        _gripVertical = lucideOutlineIcon(
            name = "GripVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 .552-.448 1-1 1C8.448 13 8 12.552 8 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M10 5c0 .552-.448 1-1 1C8.448 6 8 5.552 8 5 8 4.448 8.448 4 9 4c.552 0 1 .448 1 1Z")
            addPathData("M10 19c0 .552-.448 1-1 1C8.448 20 8 19.552 8 19c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M16 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M16 5c0 .552-.448 1-1 1C14.448 6 14 5.552 14 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M16 19c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _gripVertical!!
    }

private var _gripVertical: ImageVector? = null
