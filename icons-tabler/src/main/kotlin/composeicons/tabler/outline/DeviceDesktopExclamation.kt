package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopExclamation: ImageVector
    get() {
        if (_deviceDesktopExclamation != null) return _deviceDesktopExclamation!!
        _deviceDesktopExclamation = tablerOutlineIcon(
            name = "DeviceDesktopExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 16h-11C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v7")
            addPathData("M7 20h8")
            addPathData("M9 16v4")
            addPathData("M15 16v4")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _deviceDesktopExclamation!!
    }

private var _deviceDesktopExclamation: ImageVector? = null
