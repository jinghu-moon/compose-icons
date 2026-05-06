package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sandwich: ImageVector
    get() {
        if (_sandwich != null) return _sandwich!!
        _sandwich = lucideOutlineIcon(
            name = "Sandwich",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.37 11.223 10.742 4.446c.734-.594 1.782-.594 2.516 0l8.371 6.777")
            addPathData("M21 15c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-5.25")
            addPathData("M3 15c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h9")
            addPathData("M6.67 15l6.13 4.6c.884 .663 2.137 .484 2.8-.4L18.75 15")
            addPathData("M3 11h18c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-18C2.448 15 2 14.552 2 14v-2c0-.552 .448-1 1-1Z")
        }
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
