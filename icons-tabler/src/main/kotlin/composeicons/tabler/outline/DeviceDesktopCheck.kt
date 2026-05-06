package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopCheck: ImageVector
    get() {
        if (_deviceDesktopCheck != null) return _deviceDesktopCheck!!
        _deviceDesktopCheck = tablerOutlineIcon(
            name = "DeviceDesktopCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16h-8C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v8")
            addPathData("M15 19l2 2 4-4")
            addPathData("M7 20h4")
            addPathData("M9 16v4")
        }
        return _deviceDesktopCheck!!
    }

private var _deviceDesktopCheck: ImageVector? = null
