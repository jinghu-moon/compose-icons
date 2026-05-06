package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHelping: ImageVector
    get() {
        if (_handHelping != null) return _handHelping!!
        _handHelping = lucideOutlineIcon(
            name = "HandHelping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12h2c1.105 0 2-.895 2-2C15 8.895 14.105 8 13 8h-3C9.4 8 8.9 8.2 8.6 8.6L3 14")
            addPathData("M7 18 8.6 16.6C8.9 16.2 9.4 16 10 16h4c1.1 0 2.1-.4 2.8-1.2l4.6-4.4c.804-.759 .839-2.026 .08-2.83-.759-.804-2.026-.839-2.83-.08l-4.2 3.9")
            addPathData("M2 13l6 6")
        }
        return _handHelping!!
    }

private var _handHelping: ImageVector? = null
