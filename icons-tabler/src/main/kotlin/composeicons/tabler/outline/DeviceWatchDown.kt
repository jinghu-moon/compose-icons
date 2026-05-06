package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchDown: ImageVector
    get() {
        if (_deviceWatchDown != null) return _deviceWatchDown!!
        _deviceWatchDown = tablerOutlineIcon(
            name = "DeviceWatchDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h-3C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v3")
            addPathData("M9 18v3h3.5")
            addPathData("M9 6v-3h6v3")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _deviceWatchDown!!
    }

private var _deviceWatchDown: ImageVector? = null
