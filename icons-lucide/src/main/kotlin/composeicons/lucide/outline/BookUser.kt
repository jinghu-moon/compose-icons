package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookUser: ImageVector
    get() {
        if (_bookUser != null) return _bookUser!!
        _bookUser = lucideOutlineIcon(
            name = "BookUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 13c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M14 8c0 1.105-.895 2-2 2C10.895 10 10 9.105 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _bookUser!!
    }

private var _bookUser: ImageVector? = null
