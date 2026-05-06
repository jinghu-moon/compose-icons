package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlassWater: ImageVector
    get() {
        if (_glassWater != null) return _glassWater!!
        _glassWater = lucideOutlineIcon(
            name = "GlassWater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.116 4.104c-.029-.282 .062-.563 .251-.773C5.557 3.12 5.827 3 6.11 3h11.78c.283 0 .553 .121 .743 .331 .19 .211 .281 .492 .251 .774L17.19 20.21c-.107 1.018-.966 1.791-1.99 1.79h-6.4c-1.027 .006-1.892-.768-2-1.79Z")
            addPathData("M6 12c1.778-1.333 4.222-1.333 6 0 1.778 1.333 4.222 1.333 6 0")
        }
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
