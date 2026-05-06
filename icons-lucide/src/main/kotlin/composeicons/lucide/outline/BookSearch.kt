package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) return _bookSearch!!
        _bookSearch = lucideOutlineIcon(
            name = "BookSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 22h-5.5C4.119 22 3 20.881 3 19.5 3 18.119 4.119 17 5.5 17h4.501")
            addPathData("M21 22 19.121 20.122")
            addPathData("M3 19.5v-15C3 3.119 4.119 2 5.5 2h12.5c.552 0 1 .448 1 1v8")
            addPathData("M20 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
