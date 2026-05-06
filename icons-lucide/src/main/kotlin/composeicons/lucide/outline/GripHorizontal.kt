package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GripHorizontal: ImageVector
    get() {
        if (_gripHorizontal != null) return _gripHorizontal!!
        _gripHorizontal = lucideOutlineIcon(
            name = "GripHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 9c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 9c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 9c0 .552-.448 1-1 1C4.448 10 4 9.552 4 9 4 8.448 4.448 8 5 8c.552 0 1 .448 1 1Z")
            addPathData("M13 15c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 15c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 15c0 .552-.448 1-1 1C4.448 16 4 15.552 4 15c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _gripHorizontal!!
    }

private var _gripHorizontal: ImageVector? = null
