package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchUp: ImageVector
    get() {
        if (_deviceWatchUp != null) return _deviceWatchUp!!
        _deviceWatchUp = tablerOutlineIcon(
            name = "DeviceWatchUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h-3C7.343 18 6 16.657 6 15v-6C6 7.343 7.343 6 9 6h6c1.657 0 3 1.343 3 3v3")
            addPathData("M9 18v3h3.5")
            addPathData("M9 6v-3h6v3")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _deviceWatchUp!!
    }

private var _deviceWatchUp: ImageVector? = null
