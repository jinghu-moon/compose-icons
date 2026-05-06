package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Snail: ImageVector
    get() {
        if (_snail != null) return _snail!!
        _snail = lucideOutlineIcon(
            name = "Snail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 13c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C14 10.791 12.209 9 10 9 7.791 9 6 10.791 6 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M18 13c0 4.418-3.582 8-8 8C5.582 21 2 17.418 2 13 2 8.582 5.582 5 10 5c4.418 0 8 3.582 8 8Z")
            addPathData("M2 21h12c4.4 0 8-3.6 8-8v-6C22 5.895 21.105 5 20 5c-1.105 0-2 .895-2 2v6")
            addPathData("M18 3l1.1 2.2")
            addPathData("M22 3 20.9 5.2")
        }
        return _snail!!
    }

private var _snail: ImageVector? = null
