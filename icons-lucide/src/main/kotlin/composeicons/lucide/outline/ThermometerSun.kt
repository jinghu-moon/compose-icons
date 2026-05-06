package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThermometerSun: ImageVector
    get() {
        if (_thermometerSun != null) return _thermometerSun!!
        _thermometerSun = lucideOutlineIcon(
            name = "ThermometerSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v2")
            addPathData("M12 8C10.114 7.999 8.484 9.315 8.087 11.159c-.397 1.844 .548 3.714 2.268 4.488")
            addPathData("M2 12h2")
            addPathData("M20 14.54c1.568 .905 2.332 2.751 1.864 4.499-.469 1.749-2.053 2.965-3.864 2.965-1.81 0-3.395-1.216-3.864-2.965-.469-1.749 .296-3.594 1.864-4.499v-10.54c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M4.93 4.93 6.34 6.34")
            addPathData("M6.34 17.66 4.93 19.07")
        }
        return _thermometerSun!!
    }

private var _thermometerSun: ImageVector? = null
