package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopDown: ImageVector
    get() {
        if (_deviceDesktopDown != null) return _deviceDesktopDown!!
        _deviceDesktopDown = tablerOutlineIcon(
            name = "DeviceDesktopDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 16h-9.5C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v7.5")
            addPathData("M7 20h5")
            addPathData("M9 16v4")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _deviceDesktopDown!!
    }

private var _deviceDesktopDown: ImageVector? = null
