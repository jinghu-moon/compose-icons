package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextSearch: ImageVector
    get() {
        if (_textSearch != null) return _textSearch!!
        _textSearch = lucideOutlineIcon(
            name = "TextSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M10 12h-7")
            addPathData("M10 19h-7")
            addPathData("M20 15c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M21 19 19.1 17.1")
        }
        return _textSearch!!
    }

private var _textSearch: ImageVector? = null
