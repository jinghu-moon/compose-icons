package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VectorSquare: ImageVector
    get() {
        if (_vectorSquare != null) return _vectorSquare!!
        _vectorSquare = lucideOutlineIcon(
            name = "VectorSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 7c.702 3.296 .702 6.704 0 10")
            addPathData("M4.5 7c-.702 3.296-.702 6.704 0 10")
            addPathData("M7 19.5c3.296 .702 6.704 .702 10 0")
            addPathData("M7 4.5c3.296-.702 6.704-.702 10 0")
            addPathData("M18 17h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
            addPathData("M18 2h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C17.448 7 17 6.552 17 6v-3c0-.552 .448-1 1-1Z")
            addPathData("M3 17h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C2.448 22 2 21.552 2 21v-3c0-.552 .448-1 1-1Z")
            addPathData("M3 2h3c.552 0 1 .448 1 1v3C7 6.552 6.552 7 6 7h-3C2.448 7 2 6.552 2 6v-3C2 2.448 2.448 2 3 2Z")
        }
        return _vectorSquare!!
    }

private var _vectorSquare: ImageVector? = null
