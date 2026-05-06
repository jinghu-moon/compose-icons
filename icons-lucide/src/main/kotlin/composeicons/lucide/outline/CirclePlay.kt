package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CirclePlay: ImageVector
    get() {
        if (_circlePlay != null) return _circlePlay!!
        _circlePlay = lucideOutlineIcon(
            name = "CirclePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9.003c-.001-.361 .193-.695 .507-.873 .314-.178 .7-.173 1.01 .014l4.997 2.997c.303 .18 .488 .507 .488 .859 0 .352-.185 .679-.488 .859l-4.997 2.997c-.309 .187-.696 .192-1.01 .014C9.192 15.692 8.999 15.358 9 14.996Z")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
        }
        return _circlePlay!!
    }

private var _circlePlay: ImageVector? = null
