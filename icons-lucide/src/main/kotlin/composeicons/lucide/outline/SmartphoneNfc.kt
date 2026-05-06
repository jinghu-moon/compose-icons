package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SmartphoneNfc: ImageVector
    get() {
        if (_smartphoneNfc != null) return _smartphoneNfc!!
        _smartphoneNfc = lucideOutlineIcon(
            name = "SmartphoneNfc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h5c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-5C2.448 18 2 17.552 2 17v-10C2 6.448 2.448 6 3 6Z")
            addPathData("M13 8.32c1.3 2.281 1.3 5.079 0 7.36")
            addPathData("M16.46 6.21c2.032 3.593 2.032 7.987 0 11.58")
            addPathData("M19.91 4.1c2.803 4.893 2.807 10.904 .01 15.8")
        }
        return _smartphoneNfc!!
    }

private var _smartphoneNfc: ImageVector? = null
