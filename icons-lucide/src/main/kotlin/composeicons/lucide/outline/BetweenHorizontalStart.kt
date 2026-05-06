package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BetweenHorizontalStart: ImageVector
    get() {
        if (_betweenHorizontalStart != null) return _betweenHorizontalStart!!
        _betweenHorizontalStart = lucideOutlineIcon(
            name = "BetweenHorizontalStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h11c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-11C8.448 10 8 9.552 8 9v-5C8 3.448 8.448 3 9 3Z")
            addPathData("M2 9l3 3L2 15")
            addPathData("M9 14h11c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-11C8.448 21 8 20.552 8 20v-5c0-.552 .448-1 1-1Z")
        }
        return _betweenHorizontalStart!!
    }

private var _betweenHorizontalStart: ImageVector? = null
