package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletDown: ImageVector
    get() {
        if (_deviceTabletDown != null) return _deviceTabletDown!!
        _deviceTabletDown = tablerOutlineIcon(
            name = "DeviceTabletDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v8")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
            addPathData("M11 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _deviceTabletDown!!
    }

private var _deviceTabletDown: ImageVector? = null
