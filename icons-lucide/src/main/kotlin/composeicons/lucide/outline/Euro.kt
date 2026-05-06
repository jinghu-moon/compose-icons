package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Euro: ImageVector
    get() {
        if (_euro != null) return _euro!!
        _euro = lucideOutlineIcon(
            name = "Euro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10h12")
            addPathData("M4 14h9")
            addPathData("M19 6C17.577 4.708 15.722 3.994 13.8 4 11.705 4.026 9.706 4.884 8.243 6.384 6.78 7.885 5.973 9.905 6 12c0 4.4 3.5 8 7.8 8 2 0 3.8-.8 5.2-2")
        }
        return _euro!!
    }

private var _euro: ImageVector? = null
