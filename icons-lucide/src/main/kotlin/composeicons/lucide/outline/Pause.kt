package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = lucideOutlineIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1Z")
            addPathData("M6 3h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-3C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3Z")
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
