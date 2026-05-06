package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrafficLightsOff: ImageVector
    get() {
        if (_trafficLightsOff != null) return _trafficLightsOff!!
        _trafficLightsOff = tablerOutlineIcon(
            name = "TrafficLightsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4C8.912 2.781 10.36 2 12 2c2.761 0 5 2.239 5 5v6M17 17c0 2.761-2.239 5-5 5C9.239 22 7 19.761 7 17v-10")
            addPathData("M12 8c.552 0 1-.448 1-1C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1")
            addPathData("M11.291 11.295c-.378 .393-.371 1.017 .016 1.402 .387 .385 1.011 .388 1.402 .008")
            addPathData("M11 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _trafficLightsOff!!
    }

private var _trafficLightsOff: ImageVector? = null
