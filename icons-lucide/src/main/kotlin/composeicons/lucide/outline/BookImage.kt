package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookImage: ImageVector
    get() {
        if (_bookImage != null) return _bookImage!!
        _bookImage = lucideOutlineIcon(
            name = "BookImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13.7 17.9 11.6c-.778-.762-2.022-.762-2.8 0L9.7 17")
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M12 8c0 1.105-.895 2-2 2C8.895 10 8 9.105 8 8 8 6.895 8.895 6 10 6c1.105 0 2 .895 2 2Z")
        }
        return _bookImage!!
    }

private var _bookImage: ImageVector? = null
