package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckReturn: ImageVector
    get() {
        if (_truckReturn != null) return _truckReturn!!
        _truckReturn = tablerOutlineIcon(
            name = "TruckReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M15 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 17h-2v-11C3 5.448 3.448 5 4 5h9v6h-5l2 2M10 9 8 11")
            addPathData("M9 17h6")
            addPathData("M13 6h5l3 5v6h-2")
        }
        return _truckReturn!!
    }

private var _truckReturn: ImageVector? = null
