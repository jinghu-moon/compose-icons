package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Construction: ImageVector
    get() {
        if (_construction != null) return _construction!!
        _construction = lucideOutlineIcon(
            name = "Construction",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h18c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-18C2.448 14 2 13.552 2 13v-6C2 6.448 2.448 6 3 6Z")
            addPathData("M17 14v7")
            addPathData("M7 14v7")
            addPathData("M17 3v3")
            addPathData("M7 3v3")
            addPathData("M10 14 2.3 6.3")
            addPathData("M14 6l7.7 7.7")
            addPathData("M8 6l8 8")
        }
        return _construction!!
    }

private var _construction: ImageVector? = null
