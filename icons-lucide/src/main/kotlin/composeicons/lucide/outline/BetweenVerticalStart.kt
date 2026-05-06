package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BetweenVerticalStart: ImageVector
    get() {
        if (_betweenVerticalStart != null) return _betweenVerticalStart!!
        _betweenVerticalStart = lucideOutlineIcon(
            name = "BetweenVerticalStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h5c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-5C3.448 21 3 20.552 3 20v-11C3 8.448 3.448 8 4 8Z")
            addPathData("M15 2 12 5 9 2")
            addPathData("M15 8h5c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-11c0-.552 .448-1 1-1Z")
        }
        return _betweenVerticalStart!!
    }

private var _betweenVerticalStart: ImageVector? = null
