package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Forward: ImageVector
    get() {
        if (_forward != null) return _forward!!
        _forward = lucideOutlineIcon(
            name = "Forward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17l5-5L15 7")
            addPathData("M4 18v-2C4 13.791 5.791 12 8 12h12")
        }
        return _forward!!
    }

private var _forward: ImageVector? = null
