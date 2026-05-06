package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSim2: ImageVector
    get() {
        if (_deviceSim2 != null) return _deviceSim2!!
        _deviceSim2 = tablerOutlineIcon(
            name = "DeviceSim2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3h8.5L19 7.5v12.5c0 .552-.448 1-1 1h-12C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3")
            addPathData("M10 9h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _deviceSim2!!
    }

private var _deviceSim2: ImageVector? = null
