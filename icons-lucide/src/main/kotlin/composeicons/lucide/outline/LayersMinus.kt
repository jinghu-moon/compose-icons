package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayersMinus: ImageVector
    get() {
        if (_layersMinus != null) return _layersMinus!!
        _layersMinus = lucideOutlineIcon(
            name = "LayersMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.83 2.18c-.527-.24-1.133-.24-1.66 0L2.6 6.08c-.363 .16-.597 .519-.597 .915 0 .396 .234 .755 .597 .915l8.58 3.91c.261 .119 .544 .18 .83 .18 .286 0 .569-.061 .83-.18L21.42 7.92c.364-.159 .599-.519 .599-.916 0-.397-.235-.757-.599-.916Z")
            addPathData("M16 17h6")
            addPathData("M2.003 11.995c0 .396 .234 .755 .597 .915l8.58 3.91c.261 .119 .544 .18 .83 .18")
            addPathData("M2.003 16.995c0 .396 .234 .755 .597 .915l8.58 3.91c.261 .119 .544 .18 .83 .18 .286 0 .569-.061 .83-.18l2.11-.96")
            addPathData("M22.018 12.004c0 .397-.235 .756-.598 .916L21.243 13")
        }
        return _layersMinus!!
    }

private var _layersMinus: ImageVector? = null
