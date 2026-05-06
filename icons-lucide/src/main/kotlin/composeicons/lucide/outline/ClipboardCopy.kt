package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardCopy: ImageVector
    get() {
        if (_clipboardCopy != null) return _clipboardCopy!!
        _clipboardCopy = lucideOutlineIcon(
            name = "ClipboardCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 2h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6C8.448 6 8 5.552 8 5v-2C8 2.448 8.448 2 9 2Z")
            addPathData("M8 4h-2C4.895 4 4 4.895 4 6v14c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v4")
            addPathData("M21 14h-10")
            addPathData("M15 10l-4 4 4 4")
        }
        return _clipboardCopy!!
    }

private var _clipboardCopy: ImageVector? = null
