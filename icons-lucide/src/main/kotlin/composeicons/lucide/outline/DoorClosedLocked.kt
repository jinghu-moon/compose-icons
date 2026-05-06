package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DoorClosedLocked: ImageVector
    get() {
        if (_doorClosedLocked != null) return _doorClosedLocked!!
        _doorClosedLocked = lucideOutlineIcon(
            name = "DoorClosedLocked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h.01")
            addPathData("M18 9v-3C18 4.895 17.105 4 16 4h-8C6.895 4 6 4.895 6 6v14")
            addPathData("M2 20h8")
            addPathData("M20 17v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2")
            addPathData("M15 17h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _doorClosedLocked!!
    }

private var _doorClosedLocked: ImageVector? = null
