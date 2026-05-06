package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopCode: ImageVector
    get() {
        if (_deviceDesktopCode != null) return _deviceDesktopCode!!
        _deviceDesktopCode = tablerOutlineIcon(
            name = "DeviceDesktopCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 16h-8.5C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v8")
            addPathData("M7 20h4")
            addPathData("M9 16v4")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _deviceDesktopCode!!
    }

private var _deviceDesktopCode: ImageVector? = null
