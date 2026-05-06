package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPaypay: ImageVector
    get() {
        if (_brandPaypay != null) return _brandPaypay!!
        _brandPaypay = tablerOutlineIcon(
            name = "BrandPaypay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.375 21 10.313 7.162")
            addPathData("M3 6c16.731 0 21.231 9.881 4.5 11")
            addPathData("M21 19v-14C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2")
        }
        return _brandPaypay!!
    }

private var _brandPaypay: ImageVector? = null
