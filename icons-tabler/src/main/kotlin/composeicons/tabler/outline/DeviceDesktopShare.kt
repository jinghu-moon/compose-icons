package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopShare: ImageVector
    get() {
        if (_deviceDesktopShare != null) return _deviceDesktopShare!!
        _deviceDesktopShare = tablerOutlineIcon(
            name = "DeviceDesktopShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 16h-8.5C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v8")
            addPathData("M7 20h5.5")
            addPathData("M9 16v4")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _deviceDesktopShare!!
    }

private var _deviceDesktopShare: ImageVector? = null
