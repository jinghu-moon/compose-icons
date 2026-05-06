package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStackshare: ImageVector
    get() {
        if (_brandStackshare != null) return _brandStackshare!!
        _brandStackshare = tablerOutlineIcon(
            name = "BrandStackshare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 4.895 20.105 4 19 4c-1.105 0-2 .895-2 2")
            addPathData("M17 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 10.895 6.105 10 5 10c-1.105 0-2 .895-2 2")
            addPathData("M7 12h3l3.5 6h3.5")
            addPathData("M17 6h-3.5L10 12")
        }
        return _brandStackshare!!
    }

private var _brandStackshare: ImageVector? = null
