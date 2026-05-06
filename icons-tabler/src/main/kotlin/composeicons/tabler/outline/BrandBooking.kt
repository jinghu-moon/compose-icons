package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBooking: ImageVector
    get() {
        if (_brandBooking != null) return _brandBooking!!
        _brandBooking = tablerOutlineIcon(
            name = "BrandBooking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-9.5C4 6.015 6.015 4 8.5 4h7C17.985 4 20 6.015 20 8.5v7C20 17.985 17.985 20 15.5 20h-9.5C4.895 20 4 19.105 4 18")
            addPathData("M8 12h3.5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3.5v-7C8 8.448 8.448 8 9 8h1.5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-1.5")
            addPathData("M16 16h.01")
        }
        return _brandBooking!!
    }

private var _brandBooking: ImageVector? = null
