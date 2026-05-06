package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAndroid: ImageVector
    get() {
        if (_brandAndroid != null) return _brandAndroid!!
        _brandAndroid = tablerOutlineIcon(
            name = "BrandAndroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10v6")
            addPathData("M20 10v6")
            addPathData("M7 9h10v8c0 .552-.448 1-1 1h-8C7.448 18 7 17.552 7 17v-8C7 6.239 9.239 4 12 4c2.761 0 5 2.239 5 5")
            addPathData("M8 3 9 5")
            addPathData("M16 3 15 5")
            addPathData("M9 18v3")
            addPathData("M15 18v3")
        }
        return _brandAndroid!!
    }

private var _brandAndroid: ImageVector? = null
