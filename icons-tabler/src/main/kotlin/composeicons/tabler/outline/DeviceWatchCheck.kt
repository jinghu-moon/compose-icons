package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchCheck: ImageVector
    get() {
        if (_deviceWatchCheck != null) return _deviceWatchCheck!!
        _deviceWatchCheck = tablerOutlineIcon(
            name = "DeviceWatchCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18h-2C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v5.5")
            addPathData("M9 18v3h2.5")
            addPathData("M9 6v-3h6v3")
            addPathData("M15 19l2 2 4-4")
        }
        return _deviceWatchCheck!!
    }

private var _deviceWatchCheck: ImageVector? = null
