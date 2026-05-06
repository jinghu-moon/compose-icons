package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopX: ImageVector
    get() {
        if (_deviceDesktopX != null) return _deviceDesktopX!!
        _deviceDesktopX = tablerOutlineIcon(
            name = "DeviceDesktopX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16h-9C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v8")
            addPathData("M7 20h6.5")
            addPathData("M9 16v4")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _deviceDesktopX!!
    }

private var _deviceDesktopX: ImageVector? = null
