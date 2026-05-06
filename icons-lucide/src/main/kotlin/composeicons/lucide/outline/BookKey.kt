package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookKey: ImageVector
    get() {
        if (_bookKey != null) return _bookKey!!
        _bookKey = lucideOutlineIcon(
            name = "BookKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 2h-6.5C5.119 2 4 3.119 4 4.5v15")
            addPathData("M17 2v6")
            addPathData("M17 4h2")
            addPathData("M20 15.2v5.8c0 .552-.448 1-1 1h-12.5C5.119 22 4 20.881 4 19.5 4 18.119 5.119 17 6.5 17h13.5")
            addPathData("M19 10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _bookKey!!
    }

private var _bookKey: ImageVector? = null
