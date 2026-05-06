package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookX: ImageVector
    get() {
        if (_bookX != null) return _bookX!!
        _bookX = lucideOutlineIcon(
            name = "BookX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 7l-5 5")
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M9.5 7l5 5")
        }
        return _bookX!!
    }

private var _bookX: ImageVector? = null
