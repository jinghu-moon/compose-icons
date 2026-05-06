package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) return _ellipsis!!
        _ellipsis = lucideOutlineIcon(
            name = "Ellipsis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 12c0 .552-.448 1-1 1C4.448 13 4 12.552 4 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
