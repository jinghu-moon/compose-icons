package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = lucideOutlineIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2h4")
            addPathData("M12 14l3-3")
            addPathData("M20 14c0 4.418-3.582 8-8 8C7.582 22 4 18.418 4 14 4 9.582 7.582 6 12 6c4.418 0 8 3.582 8 8Z")
        }
        return _timer!!
    }

private var _timer: ImageVector? = null
