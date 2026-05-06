package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchStats2: ImageVector
    get() {
        if (_deviceWatchStats2 != null) return _deviceWatchStats2!!
        _deviceWatchStats2 = tablerOutlineIcon(
            name = "DeviceWatchStats2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v6c0 1.657-1.343 3-3 3h-6C7.343 18 6 16.657 6 15v-6")
            addPathData("M9 18v3h6v-3")
            addPathData("M9 6v-3h6v3")
            addPathData("M12 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _deviceWatchStats2!!
    }

private var _deviceWatchStats2: ImageVector? = null
