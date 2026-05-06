package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopAnalytics: ImageVector
    get() {
        if (_deviceDesktopAnalytics != null) return _deviceDesktopAnalytics!!
        _deviceDesktopAnalytics = tablerOutlineIcon(
            name = "DeviceDesktopAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 16 3 15.552 3 15v-10")
            addPathData("M7 20h10")
            addPathData("M9 16v4")
            addPathData("M15 16v4")
            addPathData("M9 12v-4")
            addPathData("M12 12v-1")
            addPathData("M15 12v-2")
            addPathData("M12 12v-1")
        }
        return _deviceDesktopAnalytics!!
    }

private var _deviceDesktopAnalytics: ImageVector? = null
