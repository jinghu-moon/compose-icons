package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = lucideOutlineIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v14")
            addPathData("M16 12h2")
            addPathData("M16 8h2")
            addPathData("M3 18C2.448 18 2 17.552 2 17v-13C2 3.448 2.448 3 3 3h5c2.209 0 4 1.791 4 4C12 4.791 13.791 3 16 3h5c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-6c-1.657 0-3 1.343-3 3C12 19.343 10.657 18 9 18Z")
            addPathData("M6 12h2")
            addPathData("M6 8h2")
        }
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
