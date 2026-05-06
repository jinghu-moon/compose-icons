package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Combine: ImageVector
    get() {
        if (_combine != null) return _combine!!
        _combine = lucideOutlineIcon(
            name = "Combine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1")
            addPathData("M19 3c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1")
            addPathData("M7 15l3 3")
            addPathData("M7 21l3-3h-5C3.895 18 3 17.105 3 16v-2")
            addPathData("M15 14h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1Z")
            addPathData("M4 3h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5C3.448 10 3 9.552 3 9v-5C3 3.448 3.448 3 4 3Z")
        }
        return _combine!!
    }

private var _combine: ImageVector? = null
