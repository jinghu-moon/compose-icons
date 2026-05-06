package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletCheck: ImageVector
    get() {
        if (_deviceTabletCheck != null) return _deviceTabletCheck!!
        _deviceTabletCheck = tablerOutlineIcon(
            name = "DeviceTabletCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-5.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v9.5")
            addPathData("M12.314 16.05c-.435-.144-.911 .026-1.157 .412-.246 .386-.199 .89 .115 1.223")
            addPathData("M15 19l2 2 4-4")
        }
        return _deviceTabletCheck!!
    }

private var _deviceTabletCheck: ImageVector? = null
