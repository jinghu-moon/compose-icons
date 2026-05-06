package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) return _ellipsisVertical!!
        _ellipsisVertical = lucideOutlineIcon(
            name = "EllipsisVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M13 5c0 .552-.448 1-1 1C11.448 6 11 5.552 11 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M13 19c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
