package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchBolt: ImageVector
    get() {
        if (_deviceWatchBolt != null) return _deviceWatchBolt!!
        _deviceWatchBolt = tablerOutlineIcon(
            name = "DeviceWatchBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 18h-4C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v3")
            addPathData("M9 18v3h4.5")
            addPathData("M9 6v-3h6v3")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _deviceWatchBolt!!
    }

private var _deviceWatchBolt: ImageVector? = null
