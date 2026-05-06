package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookOpenCheck: ImageVector
    get() {
        if (_bookOpenCheck != null) return _bookOpenCheck!!
        _bookOpenCheck = lucideOutlineIcon(
            name = "BookOpenCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-14")
            addPathData("M16 12l2 2 4-4")
            addPathData("M22 6v-2C22 3.448 21.552 3 21 3h-5C13.791 3 12 4.791 12 7 12 4.791 10.209 3 8 3h-5C2.448 3 2 3.448 2 4v13c0 .552 .448 1 1 1h6c1.657 0 3 1.343 3 3 0-1.657 1.343-3 3-3h6c.552 0 1-.448 1-1v-1.3")
        }
        return _bookOpenCheck!!
    }

private var _bookOpenCheck: ImageVector? = null
