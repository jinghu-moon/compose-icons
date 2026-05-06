package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = lucideOutlineIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5.88 14 10h5.83c.63 0 1.222 .296 1.6 .8 .378 .504 .496 1.156 .32 1.76l-2.33 8C19.171 21.413 18.389 22 17.5 22h-13.5C2.895 22 2 21.105 2 20v-8c0-1.105 .895-2 2-2h2.76C7.519 10 8.212 9.57 8.55 8.89L12 2c.955 .012 1.853 .459 2.437 1.215 .584 .756 .792 1.737 .563 2.665Z")
            addPathData("M7 10v12")
        }
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
