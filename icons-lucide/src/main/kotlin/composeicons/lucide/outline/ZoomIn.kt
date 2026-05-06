package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) return _zoomIn!!
        _zoomIn = lucideOutlineIcon(
            name = "ZoomIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 11c0 4.418-3.582 8-8 8C6.582 19 3 15.418 3 11 3 6.582 6.582 3 11 3c4.418 0 8 3.582 8 8Z")
            addPathData("M21 21 16.65 16.65")
            addPathData("M11 8v6")
            addPathData("M8 11h6")
        }
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
