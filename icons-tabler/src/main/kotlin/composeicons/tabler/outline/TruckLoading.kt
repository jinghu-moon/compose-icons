package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) return _truckLoading!!
        _truckLoading = tablerOutlineIcon(
            name = "TruckLoading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 3h1c1.105 0 2 .895 2 2v10c0 1.105 .895 2 2 2h15")
            addPathData("M9 9C9 7.343 10.343 6 12 6h4c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-4C10.343 14 9 12.657 9 11v-2")
            addPathData("M7 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M16 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
