package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Luggage: ImageVector
    get() {
        if (_luggage != null) return _luggage!!
        _luggage = lucideOutlineIcon(
            name = "Luggage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 20C4.895 20 4 19.105 4 18v-10C4 6.895 4.895 6 6 6h12c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2")
            addPathData("M8 18v-14C8 2.895 8.895 2 10 2h4c1.105 0 2 .895 2 2v14")
            addPathData("M10 20h4")
            addPathData("M18 20c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M10 20c0 1.105-.895 2-2 2C6.895 22 6 21.105 6 20c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _luggage!!
    }

private var _luggage: ImageVector? = null
