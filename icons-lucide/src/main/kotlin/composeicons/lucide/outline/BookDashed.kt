package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookDashed: ImageVector
    get() {
        if (_bookDashed != null) return _bookDashed!!
        _bookDashed = lucideOutlineIcon(
            name = "BookDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17h1.5")
            addPathData("M12 22h1.5")
            addPathData("M12 2h1.5")
            addPathData("M17.5 22h1.5c.552 0 1-.448 1-1")
            addPathData("M17.5 2h1.5c.552 0 1 .448 1 1v1.5")
            addPathData("M20 14v3h-2.5")
            addPathData("M20 8.5v1.5")
            addPathData("M4 10v-1.5")
            addPathData("M4 19.5v-5.5")
            addPathData("M4 4.5C4 3.119 5.119 2 6.5 2h1.5")
            addPathData("M8 22h-1.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h1.5")
        }
        return _bookDashed!!
    }

private var _bookDashed: ImageVector? = null
