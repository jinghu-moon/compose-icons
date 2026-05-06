package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = lucideOutlineIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7c0 .552-.448 1-1 1C9.448 8 9 7.552 9 7 9 6.448 9.448 6 10 6c.552 0 1 .448 1 1Z")
            addPathData("M5 20c0 .552-.448 1-1 1C3.448 21 3 20.552 3 20c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M4.7 19.3 19 5")
            addPathData("M21 3 18 4l2 2Z")
            addPathData("M9.26 7.68 5 12l2 5")
            addPathData("M10 14l5 2 3.5-3.5")
            addPathData("M18 12l1-1 1 1-1 1Z")
        }
        return _usb!!
    }

private var _usb: ImageVector? = null
