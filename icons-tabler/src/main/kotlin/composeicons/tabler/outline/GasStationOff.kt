package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GasStationOff: ImageVector
    get() {
        if (_gasStationOff != null) return _gasStationOff!!
        _gasStationOff = tablerOutlineIcon(
            name = "GasStationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11c1.105 0 2 .895 2 2M20 16v-7L17 6")
            addPathData("M4 20v-14C4 5.452 4.22 4.956 4.577 4.595M8 4h4c1.105 0 2 .895 2 2v4M14 14v6")
            addPathData("M3 20h12")
            addPathData("M18 7v1c0 .552 .448 1 1 1h1")
            addPathData("M4 11h7")
            addPathData("M3 3 21 21")
        }
        return _gasStationOff!!
    }

private var _gasStationOff: ImageVector? = null
