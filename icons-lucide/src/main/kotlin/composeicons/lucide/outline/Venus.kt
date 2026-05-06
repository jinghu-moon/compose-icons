package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Venus: ImageVector
    get() {
        if (_venus != null) return _venus!!
        _venus = lucideOutlineIcon(
            name = "Venus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15v7")
            addPathData("M9 19h6")
            addPathData("M18 9c0 3.314-2.686 6-6 6C8.686 15 6 12.314 6 9 6 5.686 8.686 3 12 3c3.314 0 6 2.686 6 6Z")
        }
        return _venus!!
    }

private var _venus: ImageVector? = null
