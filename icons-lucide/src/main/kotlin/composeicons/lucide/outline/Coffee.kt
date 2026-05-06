package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = lucideOutlineIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v2")
            addPathData("M14 2v2")
            addPathData("M16 8c.552 0 1 .448 1 1v8c0 2.209-1.791 4-4 4h-6C4.791 21 3 19.209 3 17v-8C3 8.448 3.448 8 4 8h14c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-1")
            addPathData("M6 2v2")
        }
        return _coffee!!
    }

private var _coffee: ImageVector? = null
