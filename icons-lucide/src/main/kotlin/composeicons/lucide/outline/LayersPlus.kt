package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayersPlus: ImageVector
    get() {
        if (_layersPlus != null) return _layersPlus!!
        _layersPlus = lucideOutlineIcon(
            name = "LayersPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.83 2.18c-.527-.24-1.133-.24-1.66 0L2.6 6.08c-.363 .16-.597 .519-.597 .915 0 .396 .234 .755 .597 .915l8.58 3.91c.261 .119 .544 .18 .83 .18 .286 0 .569-.061 .83-.18L21.42 7.92c.363-.16 .598-.519 .598-.916 0-.397-.234-.756-.598-.915Z")
            addPathData("M16 17h6")
            addPathData("M19 14v6")
            addPathData("M2 12c-.001 .391 .226 .746 .58 .91l8.6 3.91c.259 .117 .54 .178 .825 .178")
            addPathData("M2 17c-.001 .391 .226 .746 .58 .91l8.6 3.91c.524 .237 1.126 .237 1.65 0l2.116-.962")
        }
        return _layersPlus!!
    }

private var _layersPlus: ImageVector? = null
