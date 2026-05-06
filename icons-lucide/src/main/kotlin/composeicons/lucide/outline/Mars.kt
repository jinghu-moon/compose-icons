package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mars: ImageVector
    get() {
        if (_mars != null) return _mars!!
        _mars = lucideOutlineIcon(
            name = "Mars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3h5v5")
            addPathData("M21 3 14.25 9.75")
            addPathData("M16 14c0 3.314-2.686 6-6 6C6.686 20 4 17.314 4 14 4 10.686 6.686 8 10 8c3.314 0 6 2.686 6 6Z")
        }
        return _mars!!
    }

private var _mars: ImageVector? = null
