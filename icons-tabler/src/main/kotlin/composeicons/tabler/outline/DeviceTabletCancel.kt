package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletCancel: ImageVector
    get() {
        if (_deviceTabletCancel != null) return _deviceTabletCancel!!
        _deviceTabletCancel = tablerOutlineIcon(
            name = "DeviceTabletCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v8")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
            addPathData("M11 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _deviceTabletCancel!!
    }

private var _deviceTabletCancel: ImageVector? = null
