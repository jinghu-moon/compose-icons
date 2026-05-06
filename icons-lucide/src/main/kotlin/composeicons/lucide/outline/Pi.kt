package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = lucideOutlineIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4v16")
            addPathData("M4 7C4 5.3 5.3 4 7 4h13")
            addPathData("M18 20c-1.7 0-3-1.3-3-3v-13")
        }
        return _pi!!
    }

private var _pi: ImageVector? = null
