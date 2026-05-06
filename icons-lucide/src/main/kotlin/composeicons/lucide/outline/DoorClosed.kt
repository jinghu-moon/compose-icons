package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DoorClosed: ImageVector
    get() {
        if (_doorClosed != null) return _doorClosed!!
        _doorClosed = lucideOutlineIcon(
            name = "DoorClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h.01")
            addPathData("M18 20v-14C18 4.895 17.105 4 16 4h-8C6.895 4 6 4.895 6 6v14")
            addPathData("M2 20h20")
        }
        return _doorClosed!!
    }

private var _doorClosed: ImageVector? = null
