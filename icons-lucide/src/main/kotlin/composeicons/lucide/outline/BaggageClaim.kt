package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BaggageClaim: ImageVector
    get() {
        if (_baggageClaim != null) return _baggageClaim!!
        _baggageClaim = lucideOutlineIcon(
            name = "BaggageClaim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 18h-16C4.895 18 4 17.105 4 16v-9C4 5.895 3.105 5 2 5")
            addPathData("M17 14v-10C17 2.895 16.105 2 15 2h-1c-1.105 0-2 .895-2 2v10")
            addPathData("M9 6h11c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-11C8.448 14 8 13.552 8 13v-6C8 6.448 8.448 6 9 6Z")
            addPathData("M20 20c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M11 20c0 1.105-.895 2-2 2C7.895 22 7 21.105 7 20c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _baggageClaim!!
    }

private var _baggageClaim: ImageVector? = null
