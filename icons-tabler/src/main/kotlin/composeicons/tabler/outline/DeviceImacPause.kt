package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacPause: ImageVector
    get() {
        if (_deviceImacPause != null) return _deviceImacPause!!
        _deviceImacPause = tablerOutlineIcon(
            name = "DeviceImacPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17h-9C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v9")
            addPathData("M3 13h18")
            addPathData("M8 21h5")
            addPathData("M10 17l-.5 4")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _deviceImacPause!!
    }

private var _deviceImacPause: ImageVector? = null
