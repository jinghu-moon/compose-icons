package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartX: ImageVector
    get() {
        if (_heartX != null) return _heartX!!
        _heartX = lucideOutlineIcon(
            name = "HeartX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 12.5l5 5")
            addPathData("M20.5 12.5l-5 5")
            addPathData("M21.955 8.774C21.673 6.646 20.178 4.876 18.127 4.242 16.075 3.608 13.843 4.226 12.409 5.824c-.23 .215-.588 .215-.818 0C10.068 4.13 7.659 3.549 5.532 4.364 3.404 5.18 2 7.222 2 9.5c0 2.3 1.5 4 3 5.5l5.508 5.332c.654 .732 1.743 .881 2.57 .352")
        }
        return _heartX!!
    }

private var _heartX: ImageVector? = null
