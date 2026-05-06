package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = lucideOutlineIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11h14c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-7c0-1.105 .895-2 2-2Z")
            addPathData("M7 11v-4C7 4.239 9.239 2 12 2c2.761 0 5 2.239 5 5v4")
        }
        return _lock!!
    }

private var _lock: ImageVector? = null
