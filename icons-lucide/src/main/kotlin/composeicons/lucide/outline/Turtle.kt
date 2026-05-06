package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Turtle: ImageVector
    get() {
        if (_turtle != null) return _turtle!!
        _turtle = lucideOutlineIcon(
            name = "Turtle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10l2 4v3c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-3C18 9.582 14.418 6 10 6 5.582 6 2 9.582 2 14v3c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-3L8 10h4Z")
            addPathData("M4.82 7.9 8 10")
            addPathData("M15.18 7.9 12 10")
            addPathData("M16.93 10h3.07c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-18")
        }
        return _turtle!!
    }

private var _turtle: ImageVector? = null
