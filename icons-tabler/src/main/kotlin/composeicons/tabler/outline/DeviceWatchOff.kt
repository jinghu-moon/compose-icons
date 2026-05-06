package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchOff: ImageVector
    get() {
        if (_deviceWatchOff != null) return _deviceWatchOff!!
        _deviceWatchOff = tablerOutlineIcon(
            name = "DeviceWatchOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h5c1.657 0 3 1.343 3 3v5M17.11 17.132c-.561 .557-1.32 .869-2.11 .868h-6C7.343 18 6 16.657 6 15v-6C6 8.183 6.327 7.441 6.857 6.9")
            addPathData("M9 18v3h6v-3")
            addPathData("M9 5v-2h6v3")
            addPathData("M3 3 21 21")
        }
        return _deviceWatchOff!!
    }

private var _deviceWatchOff: ImageVector? = null
