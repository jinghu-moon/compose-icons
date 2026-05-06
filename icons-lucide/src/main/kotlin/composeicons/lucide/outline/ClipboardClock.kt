package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardClock: ImageVector
    get() {
        if (_clipboardClock != null) return _clipboardClock!!
        _clipboardClock = lucideOutlineIcon(
            name = "ClipboardClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14v2.2l1.6 1")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v.832")
            addPathData("M8 4h-2C4.895 4 4 4.895 4 6v14c0 1.105 .895 2 2 2h2")
            addPathData("M22 16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z")
            addPathData("M9 2h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6C8.448 6 8 5.552 8 5v-2C8 2.448 8.448 2 9 2Z")
        }
        return _clipboardClock!!
    }

private var _clipboardClock: ImageVector? = null
