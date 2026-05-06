package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Group: ImageVector
    get() {
        if (_group != null) return _group!!
        _group = lucideOutlineIcon(
            name = "Group",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v-2C3 3.9 3.9 3 5 3h2")
            addPathData("M17 3h2c1.1 0 2 .9 2 2v2")
            addPathData("M21 17v2c0 1.1-.9 2-2 2h-2")
            addPathData("M7 21h-2C3.9 21 3 20.1 3 19v-2")
            addPathData("M8 7h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5C7.448 12 7 11.552 7 11v-3C7 7.448 7.448 7 8 7Z")
            addPathData("M11 12h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _group!!
    }

private var _group: ImageVector? = null
