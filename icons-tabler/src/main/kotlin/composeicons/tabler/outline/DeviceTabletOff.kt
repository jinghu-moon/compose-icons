package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletOff: ImageVector
    get() {
        if (_deviceTabletOff != null) return _deviceTabletOff!!
        _deviceTabletOff = tablerOutlineIcon(
            name = "DeviceTabletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h11c.552 0 1 .448 1 1v11M19 19v1c0 .552-.448 1-1 1h-12C5.448 21 5 20.552 5 20v-15")
            addPathData("M11 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _deviceTabletOff!!
    }

private var _deviceTabletOff: ImageVector? = null
