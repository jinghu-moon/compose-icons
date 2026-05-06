package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSim3: ImageVector
    get() {
        if (_deviceSim3 != null) return _deviceSim3!!
        _deviceSim3 = tablerOutlineIcon(
            name = "DeviceSim3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3h8.5L19 7.5v12.5c0 .552-.448 1-1 1h-12C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3")
            addPathData("M10 9h2.5C13.328 9 14 9.672 14 10.5v1C14 12.328 13.328 13 12.5 13h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C14 16.328 13.328 17 12.5 17h-2.5")
        }
        return _deviceSim3!!
    }

private var _deviceSim3: ImageVector? = null
