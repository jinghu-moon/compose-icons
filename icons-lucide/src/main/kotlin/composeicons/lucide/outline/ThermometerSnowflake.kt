package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThermometerSnowflake: ImageVector
    get() {
        if (_thermometerSnowflake != null) return _thermometerSnowflake!!
        _thermometerSnowflake = lucideOutlineIcon(
            name = "ThermometerSnowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20 8.75 17.5 6 18")
            addPathData("M10 4 8.75 6.5 6 6")
            addPathData("M10.585 15h-.585")
            addPathData("M2 12h6.5L10 9")
            addPathData("M20 14.54c1.568 .905 2.332 2.751 1.864 4.499-.469 1.749-2.053 2.965-3.864 2.965-1.81 0-3.395-1.216-3.864-2.965-.469-1.749 .296-3.594 1.864-4.499v-10.54c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M4 10l1.5 2L4 14")
            addPathData("M7 21l3-6L8.5 12")
            addPathData("M7 3l3 6h2")
        }
        return _thermometerSnowflake!!
    }

private var _thermometerSnowflake: ImageVector? = null
