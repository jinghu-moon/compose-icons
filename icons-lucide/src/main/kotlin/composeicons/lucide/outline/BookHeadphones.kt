package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookHeadphones: ImageVector
    get() {
        if (_bookHeadphones != null) return _bookHeadphones!!
        _bookHeadphones = lucideOutlineIcon(
            name = "BookHeadphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M8 12v-2C8 7.791 9.791 6 12 6c2.209 0 4 1.791 4 4v2")
            addPathData("M16 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M10 12c0 .552-.448 1-1 1C8.448 13 8 12.552 8 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _bookHeadphones!!
    }

private var _bookHeadphones: ImageVector? = null
