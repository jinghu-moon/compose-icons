package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UtensilsCrossed: ImageVector
    get() {
        if (_utensilsCrossed != null) return _utensilsCrossed!!
        _utensilsCrossed = lucideOutlineIcon(
            name = "UtensilsCrossed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2 13.7 4.3c-1.143 1.167-1.143 3.033 0 4.2l1.8 1.8c1.167 1.143 3.033 1.143 4.2 0L22 8")
            addPathData("M15 15 3.3 3.3C2.494 4.09 2.039 5.171 2.039 6.3c0 1.129 .454 2.21 1.261 3l7.3 7.3c.7 .7 2 .7 2.8 0L15 15ZM15 15l7 7")
            addPathData("M2.1 21.8 8.5 15.5")
            addPathData("M19 5l-7 7")
        }
        return _utensilsCrossed!!
    }

private var _utensilsCrossed: ImageVector? = null
