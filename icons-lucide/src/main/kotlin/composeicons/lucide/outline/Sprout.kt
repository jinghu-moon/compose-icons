package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sprout: ImageVector
    get() {
        if (_sprout != null) return _sprout!!
        _sprout = lucideOutlineIcon(
            name = "Sprout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9.536v-2.536C14 4.791 15.791 3 18 3h1.5c.276 0 .5 .224 .5 .5v1.5c0 2.209-1.791 4-4 4-2.209 0-4 1.791-4 4 0 2 1 3 1 5 0 1.082-.351 2.135-1 3")
            addPathData("M4 9C5.515 7.864 7.542 7.681 9.236 8.528 10.93 9.375 12 11.106 12 13c-1.515 1.136-3.542 1.319-5.236 .472C5.07 12.625 4 10.894 4 9")
            addPathData("M5 21h14")
        }
        return _sprout!!
    }

private var _sprout: ImageVector? = null
