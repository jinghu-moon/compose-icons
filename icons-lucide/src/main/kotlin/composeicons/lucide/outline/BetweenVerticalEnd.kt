package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BetweenVerticalEnd: ImageVector
    get() {
        if (_betweenVerticalEnd != null) return _betweenVerticalEnd!!
        _betweenVerticalEnd = lucideOutlineIcon(
            name = "BetweenVerticalEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h5c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-5C3.448 16 3 15.552 3 15v-11C3 3.448 3.448 3 4 3Z")
            addPathData("M9 22l3-3 3 3")
            addPathData("M15 3h5c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-11c0-.552 .448-1 1-1Z")
        }
        return _betweenVerticalEnd!!
    }

private var _betweenVerticalEnd: ImageVector? = null
