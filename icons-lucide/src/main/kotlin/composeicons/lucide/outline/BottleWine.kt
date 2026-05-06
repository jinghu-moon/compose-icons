package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BottleWine: ImageVector
    get() {
        if (_bottleWine != null) return _bottleWine!!
        _bottleWine = lucideOutlineIcon(
            name = "BottleWine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 1.298 .421 2.561 1.2 3.6l.6 .8C16.579 10.439 17 11.702 17 13v8c0 .552-.448 1-1 1h-8C7.448 22 7 21.552 7 21v-8C7 11.702 7.421 10.439 8.2 9.4l.6-.8C9.579 7.561 10 6.298 10 5Z")
            addPathData("M17 13h-4c-.552 0-1 .448-1 1v3c0 .552 .448 1 1 1h4")
        }
        return _bottleWine!!
    }

private var _bottleWine: ImageVector? = null
