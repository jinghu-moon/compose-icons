package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopOff: ImageVector
    get() {
        if (_deviceDesktopOff != null) return _deviceDesktopOff!!
        _deviceDesktopOff = tablerOutlineIcon(
            name = "DeviceDesktopOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h12c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1M16 16h-12C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4")
            addPathData("M7 20h10")
            addPathData("M9 16v4")
            addPathData("M15 16v4")
            addPathData("M3 3 21 21")
        }
        return _deviceDesktopOff!!
    }

private var _deviceDesktopOff: ImageVector? = null
