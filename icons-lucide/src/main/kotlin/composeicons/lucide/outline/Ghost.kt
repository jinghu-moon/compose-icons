package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = lucideOutlineIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M12 2C7.582 2 4 5.582 4 10v12L7 19l2.5 2.5L12 19l2.5 2.5L17 19l3 3v-12C20 5.582 16.418 2 12 2Z")
        }
        return _ghost!!
    }

private var _ghost: ImageVector? = null
