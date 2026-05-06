package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = tablerOutlineIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M9.4 10h5.2")
            addPathData("M7.8 15h8.4")
            addPathData("M6 20 11 5h2l5 15")
        }
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
