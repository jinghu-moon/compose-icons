package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LibraryBig: ImageVector
    get() {
        if (_libraryBig != null) return _libraryBig!!
        _libraryBig = lucideOutlineIcon(
            name = "LibraryBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h6c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-6C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3Z")
            addPathData("M7 3v18")
            addPathData("M20.4 18.9c.2 .5-.1 1.1-.6 1.3l-1.9 .7c-.5 .2-1.1-.1-1.3-.6L11.1 5.1C10.9 4.6 11.2 4 11.7 3.8l1.9-.7c.5-.2 1.1 .1 1.3 .6Z")
        }
        return _libraryBig!!
    }

private var _libraryBig: ImageVector? = null
