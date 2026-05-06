package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrafficLights: ImageVector
    get() {
        if (_trafficLights != null) return _trafficLights!!
        _trafficLights = tablerOutlineIcon(
            name = "TrafficLights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7C7 4.239 9.239 2 12 2c2.761 0 5 2.239 5 5v10c0 2.761-2.239 5-5 5C9.239 22 7 19.761 7 17v-10")
            addPathData("M11 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _trafficLights!!
    }

private var _trafficLights: ImageVector? = null
