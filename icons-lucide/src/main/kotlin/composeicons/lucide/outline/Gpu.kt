package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gpu: ImageVector
    get() {
        if (_gpu != null) return _gpu!!
        _gpu = lucideOutlineIcon(
            name = "Gpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17h18c1.105 0 2-.895 2-2v-8C22 5.895 21.105 5 20 5h-18")
            addPathData("M2 21v-18")
            addPathData("M7 17v3c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-3")
            addPathData("M18 11c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M10 11c0 1.105-.895 2-2 2C6.895 13 6 12.105 6 11 6 9.895 6.895 9 8 9c1.105 0 2 .895 2 2Z")
        }
        return _gpu!!
    }

private var _gpu: ImageVector? = null
