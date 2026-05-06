package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFilezilla: ImageVector
    get() {
        if (_brandFilezilla != null) return _brandFilezilla!!
        _brandFilezilla = tablerOutlineIcon(
            name = "BrandFilezilla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 15.824c-.732 .223-1.512 .234-2.25 .033C13.012 15.656 11.732 15.777 11 16l4.583-5h-6.583")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M8 15 10 7h5")
        }
        return _brandFilezilla!!
    }

private var _brandFilezilla: ImageVector? = null
