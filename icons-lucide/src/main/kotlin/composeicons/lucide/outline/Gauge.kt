package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = lucideOutlineIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14l4-4")
            addPathData("M3.34 19C.913 14.797 1.854 9.459 5.572 6.339c3.718-3.12 9.138-3.12 12.856 0 3.718 3.12 4.659 8.458 2.232 12.661")
        }
        return _gauge!!
    }

private var _gauge: ImageVector? = null
