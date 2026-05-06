package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Navigation2Off: ImageVector
    get() {
        if (_navigation2Off != null) return _navigation2Off!!
        _navigation2Off = lucideOutlineIcon(
            name = "Navigation2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.31 9.31 5 21l7-4 7 4L17.83 17.83")
            addPathData("M14.53 8.88 12 2 10.83 5.17")
            addPathData("M2 2 22 22")
        }
        return _navigation2Off!!
    }

private var _navigation2Off: ImageVector? = null
