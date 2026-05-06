package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckDelivery: ImageVector
    get() {
        if (_truckDelivery != null) return _truckDelivery!!
        _truckDelivery = tablerOutlineIcon(
            name = "TruckDelivery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M15 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 17h-2v-4M2 5h11v12M9 17h6M19 17h2v-6h-8M13 6h5l3 5")
            addPathData("M3 9h4")
        }
        return _truckDelivery!!
    }

private var _truckDelivery: ImageVector? = null
