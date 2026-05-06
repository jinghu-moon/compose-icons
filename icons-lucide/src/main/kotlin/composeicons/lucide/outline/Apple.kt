package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = lucideOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6.528v-3.528c0-.552 .448-1 1-1h0")
            addPathData("M18.237 21C20.676 18.242 22.016 14.682 22 11 22 8.634 20.609 6.489 18.449 5.523 16.289 4.557 13.764 4.951 12 6.528 10.236 4.951 7.711 4.557 5.551 5.523 3.391 6.489 2 8.634 2 11c-.006 3.681 1.332 7.237 3.763 10 .921 1.031 2.428 1.298 3.648 .648 1.618-.863 3.56-.863 5.178 0 1.22 .65 2.727 .383 3.648-.648")
        }
        return _apple!!
    }

private var _apple: ImageVector? = null
