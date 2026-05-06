package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleUser: ImageVector
    get() {
        if (_circleUser != null) return _circleUser!!
        _circleUser = lucideOutlineIcon(
            name = "CircleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M7 20.662v-1.662c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2v1.662")
        }
        return _circleUser!!
    }

private var _circleUser: ImageVector? = null
