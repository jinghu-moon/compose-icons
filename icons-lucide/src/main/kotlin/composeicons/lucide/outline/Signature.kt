package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = lucideOutlineIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17 18.844 15.132c-.146-.138-.36-.176-.544-.095-.184 .08-.302 .263-.3 .463v.5c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1C14 13.455 10.009 12.03 5.5 12 4.119 12 3 13.119 3 14.5 3 15.881 4.119 17 5.5 17 9.653 17 10.245 5.705 11.208 3.5c.447-1.024 1.52-1.626 2.627-1.476 1.107 .15 1.98 1.016 2.139 2.122 .159 1.106-.435 2.183-1.455 2.638")
            addPathData("M3 21h18")
        }
        return _signature!!
    }

private var _signature: ImageVector? = null
