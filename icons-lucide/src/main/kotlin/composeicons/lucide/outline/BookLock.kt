package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookLock: ImageVector
    get() {
        if (_bookLock != null) return _bookLock!!
        _bookLock = lucideOutlineIcon(
            name = "BookLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 6v-2C18 2.895 17.105 2 16 2c-1.105 0-2 .895-2 2v2")
            addPathData("M20 15v6c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h3.5")
            addPathData("M13 6h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _bookLock!!
    }

private var _bookLock: ImageVector? = null
