package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrafficConeOff: ImageVector
    get() {
        if (_trafficConeOff != null) return _trafficConeOff!!
        _trafficConeOff = tablerOutlineIcon(
            name = "TrafficConeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M9.4 10h.6M14 10h.6")
            addPathData("M7.8 15h7.2")
            addPathData("M6 20 9.5 9.5")
            addPathData("M10.5 6.5 11 5h2l2 6M17 17l1 3")
            addPathData("M3 3 21 21")
        }
        return _trafficConeOff!!
    }

private var _trafficConeOff: ImageVector? = null
