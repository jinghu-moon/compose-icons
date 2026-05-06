package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) return _volumeOff!!
        _volumeOff = lucideOutlineIcon(
            name = "VolumeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 9c.504 .672 .831 1.461 .95 2.293")
            addPathData("M19.364 5.636c2.617 2.616 3.367 6.567 1.889 9.96")
            addPathData("M2 2 22 22")
            addPathData("M7 7l-.587 .587C6.149 7.852 5.79 8.001 5.416 8h-2.416C2.448 8 2 8.448 2 9v6c0 .552 .448 1 1 1h2.416c.374-.001 .733 .148 .997 .413l3.383 3.384c.202 .202 .505 .263 .769 .153 .264-.109 .435-.367 .435-.652v-8.298")
            addPathData("M9.828 4.172c.196-.197 .492-.256 .748-.15 .257 .106 .424 .357 .424 .635v.686")
        }
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
