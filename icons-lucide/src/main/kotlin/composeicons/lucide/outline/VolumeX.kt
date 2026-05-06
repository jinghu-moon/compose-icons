package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VolumeX: ImageVector
    get() {
        if (_volumeX != null) return _volumeX!!
        _volumeX = lucideOutlineIcon(
            name = "VolumeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4.702c-0-.285-.172-.541-.435-.65-.263-.109-.566-.049-.768 .152L6.413 7.587C6.149 7.852 5.79 8.001 5.416 8h-2.416C2.448 8 2 8.448 2 9v6c0 .552 .448 1 1 1h2.416c.374-.001 .733 .148 .997 .413l3.383 3.384c.202 .202 .505 .263 .769 .153 .264-.109 .435-.367 .435-.652Z")
            addPathData("M22 9l-6 6")
            addPathData("M16 9l6 6")
        }
        return _volumeX!!
    }

private var _volumeX: ImageVector? = null
