package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchPause: ImageVector
    get() {
        if (_deviceWatchPause != null) return _deviceWatchPause!!
        _deviceWatchPause = tablerOutlineIcon(
            name = "DeviceWatchPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 18h-4C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v4")
            addPathData("M9 18v3h4")
            addPathData("M9 6v-3h6v3")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _deviceWatchPause!!
    }

private var _deviceWatchPause: ImageVector? = null
