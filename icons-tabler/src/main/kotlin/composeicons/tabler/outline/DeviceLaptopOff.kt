package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceLaptopOff: ImageVector
    get() {
        if (_deviceLaptopOff != null) return _deviceLaptopOff!!
        _deviceLaptopOff = tablerOutlineIcon(
            name = "DeviceLaptopOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h16")
            addPathData("M10 6h8c.552 0 1 .448 1 1v8M16 16h-10C5.448 16 5 15.552 5 15v-8C5 6.448 5.448 6 6 6")
            addPathData("M3 3 21 21")
        }
        return _deviceLaptopOff!!
    }

private var _deviceLaptopOff: ImageVector? = null
