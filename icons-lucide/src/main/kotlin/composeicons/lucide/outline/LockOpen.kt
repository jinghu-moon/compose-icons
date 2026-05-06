package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) return _lockOpen!!
        _lockOpen = lucideOutlineIcon(
            name = "LockOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11h14c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-7c0-1.105 .895-2 2-2Z")
            addPathData("M7 11v-4C6.997 4.431 8.942 2.278 11.498 2.02 14.053 1.762 16.389 3.483 16.9 6")
        }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
