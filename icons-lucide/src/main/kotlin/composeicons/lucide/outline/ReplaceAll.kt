package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReplaceAll: ImageVector
    get() {
        if (_replaceAll != null) return _replaceAll!!
        _replaceAll = lucideOutlineIcon(
            name = "ReplaceAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1")
            addPathData("M14 4c0-.552 .448-1 1-1")
            addPathData("M15 10c-.552 0-1-.448-1-1")
            addPathData("M19 14c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1")
            addPathData("M21 4C21 3.448 20.552 3 20 3")
            addPathData("M21 9c0 .552-.448 1-1 1")
            addPathData("M3 7l3 3L9 7")
            addPathData("M6 10v-5C6 3.895 6.895 3 8 3h2")
            addPathData("M4 14h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5C3.448 21 3 20.552 3 20v-5c0-.552 .448-1 1-1Z")
        }
        return _replaceAll!!
    }

private var _replaceAll: ImageVector? = null
