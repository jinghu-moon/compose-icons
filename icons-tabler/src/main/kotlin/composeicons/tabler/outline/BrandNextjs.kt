package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNextjs: ImageVector
    get() {
        if (_brandNextjs != null) return _brandNextjs!!
        _brandNextjs = tablerOutlineIcon(
            name = "BrandNextjs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15v-6l7.745 10.65C12.771 22.118 7.569 21.131 4.776 17.378 1.983 13.626 2.531 8.359 6.036 5.261 9.541 2.163 14.835 2.267 18.216 5.5c3.381 3.233 3.722 8.517 .784 12.157")
            addPathData("M15 12v-3")
        }
        return _brandNextjs!!
    }

private var _brandNextjs: ImageVector? = null
