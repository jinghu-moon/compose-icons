package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookA: ImageVector
    get() {
        if (_bookA != null) return _bookA!!
        _bookA = lucideOutlineIcon(
            name = "BookA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M8 13 12 6l4 7")
            addPathData("M9.1 11h5.7")
        }
        return _bookA!!
    }

private var _bookA: ImageVector? = null
