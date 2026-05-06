package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopDollar: ImageVector
    get() {
        if (_deviceDesktopDollar != null) return _deviceDesktopDollar!!
        _deviceDesktopDollar = tablerOutlineIcon(
            name = "DeviceDesktopDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16h-9C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v5.5")
            addPathData("M7 20h6.5")
            addPathData("M9 16v4")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _deviceDesktopDollar!!
    }

private var _deviceDesktopDollar: ImageVector? = null
