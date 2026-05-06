package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = lucideOutlineIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13v-4.5C14 7 15 7 15 5 15 3.343 13.657 2 12 2 10.343 2 9 3.343 9 5c0 2 1 2 1 3.5v4.5")
            addPathData("M20 15.5C20 14.119 18.881 13 17.5 13h-11C5.119 13 4 14.119 4 15.5v1.5c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1Z")
            addPathData("M5 22h14")
        }
        return _stamp!!
    }

private var _stamp: ImageVector? = null
