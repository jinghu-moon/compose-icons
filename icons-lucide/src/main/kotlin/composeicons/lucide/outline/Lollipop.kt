package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lollipop: ImageVector
    get() {
        if (_lollipop != null) return _lollipop!!
        _lollipop = lucideOutlineIcon(
            name = "Lollipop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 11c0 4.418-3.582 8-8 8C6.582 19 3 15.418 3 11 3 6.582 6.582 3 11 3c4.418 0 8 3.582 8 8Z")
            addPathData("M21 21 16.7 16.7")
            addPathData("M11 11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C15 8.791 13.209 7 11 7 8.791 7 7 8.791 7 11c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6")
        }
        return _lollipop!!
    }

private var _lollipop: ImageVector? = null
