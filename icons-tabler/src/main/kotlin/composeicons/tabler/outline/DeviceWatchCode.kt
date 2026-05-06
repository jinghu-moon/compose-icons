package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchCode: ImageVector
    get() {
        if (_deviceWatchCode != null) return _deviceWatchCode!!
        _deviceWatchCode = tablerOutlineIcon(
            name = "DeviceWatchCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18h-2C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v4")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
            addPathData("M9 18v3h3")
            addPathData("M9 6v-3h6v3")
        }
        return _deviceWatchCode!!
    }

private var _deviceWatchCode: ImageVector? = null
