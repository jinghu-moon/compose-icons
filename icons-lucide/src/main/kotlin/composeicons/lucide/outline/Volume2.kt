package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Volume2: ImageVector
    get() {
        if (_volume2 != null) return _volume2!!
        _volume2 = lucideOutlineIcon(
            name = "Volume2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4.702c-0-.285-.172-.541-.435-.65-.263-.109-.566-.049-.768 .152L6.413 7.587C6.149 7.852 5.79 8.001 5.416 8h-2.416C2.448 8 2 8.448 2 9v6c0 .552 .448 1 1 1h2.416c.374-.001 .733 .148 .997 .413l3.383 3.384c.202 .202 .505 .263 .769 .153 .264-.109 .435-.367 .435-.652Z")
            addPathData("M16 9c1.333 1.778 1.333 4.222 0 6")
            addPathData("M19.364 18.364C21.052 16.676 22 14.387 22 12c0-2.387-.948-4.676-2.636-6.364")
        }
        return _volume2!!
    }

private var _volume2: ImageVector? = null
