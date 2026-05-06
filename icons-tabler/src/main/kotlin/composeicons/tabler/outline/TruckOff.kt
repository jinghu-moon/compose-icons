package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckOff: ImageVector
    get() {
        if (_truckOff != null) return _truckOff!!
        _truckOff = tablerOutlineIcon(
            name = "TruckOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M15.585 15.586c-.782 .78-.783 2.047-.002 2.828 .78 .782 2.047 .783 2.828 .003")
            addPathData("M5 17h-2v-11C3 5.448 3.448 5 4 5h1M8.96 5h4.04v4M13 13v4M9 17h6M21 17v-6h-6M13 6h5l3 5")
            addPathData("M3 3 21 21")
        }
        return _truckOff!!
    }

private var _truckOff: ImageVector? = null
