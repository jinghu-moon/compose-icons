package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = lucideOutlineIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v14")
            addPathData("M3 18C2.448 18 2 17.552 2 17v-13C2 3.448 2.448 3 3 3h5c2.209 0 4 1.791 4 4C12 4.791 13.791 3 16 3h5c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-6c-1.657 0-3 1.343-3 3C12 19.343 10.657 18 9 18Z")
        }
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
