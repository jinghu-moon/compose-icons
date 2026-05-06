package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = lucideOutlineIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8c1.105 0 2-.895 2-2C20 4.895 19.105 4 18 4 18 2.895 17.105 2 16 2c-1.105 0-2 .895-2 2C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2C10 2.895 9.105 2 8 2 6.895 2 6 2.895 6 4 4.895 4 4 4.895 4 6c0 1.105 .895 2 2 2")
            addPathData("M10 22 9 8")
            addPathData("M14 22 15 8")
            addPathData("M20 8c.5 0 .9 .4 .8 1L18.2 21c-.1 .5-.7 1-1.2 1h-10C6.4 22 5.9 21.6 5.8 21L3.2 9C3.1 8.4 3.5 8 4 8Z")
        }
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
