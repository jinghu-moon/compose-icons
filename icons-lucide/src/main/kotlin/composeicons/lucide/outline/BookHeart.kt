package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) return _bookHeart!!
        _bookHeart = lucideOutlineIcon(
            name = "BookHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19.5v-15C4 3.119 5.119 2 6.5 2h12.5c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M8.62 9.8C8.047 9.203 7.848 8.339 8.103 7.551 8.357 6.763 9.024 6.179 9.838 6.029c.814-.149 1.645 .16 2.162 .807 .52-.639 1.348-.943 2.158-.792 .81 .151 1.473 .732 1.728 1.516 .255 .784 .061 1.644-.505 2.242l-2.626 2.856c-.19 .218-.464 .344-.753 .344-.289 0-.564-.125-.753-.344Z")
        }
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
