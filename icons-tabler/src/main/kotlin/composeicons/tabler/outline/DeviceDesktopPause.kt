package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopPause: ImageVector
    get() {
        if (_deviceDesktopPause != null) return _deviceDesktopPause!!
        _deviceDesktopPause = tablerOutlineIcon(
            name = "DeviceDesktopPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16h-9C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v8")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
            addPathData("M7 20h6")
            addPathData("M9 16v4")
        }
        return _deviceDesktopPause!!
    }

private var _deviceDesktopPause: ImageVector? = null
