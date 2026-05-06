package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceLaptop: ImageVector
    get() {
        if (_deviceLaptop != null) return _deviceLaptop!!
        _deviceLaptop = tablerOutlineIcon(
            name = "DeviceLaptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h18")
            addPathData("M5 7C5 6.448 5.448 6 6 6h12c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-12C5.448 16 5 15.552 5 15v-8")
        }
        return _deviceLaptop!!
    }

private var _deviceLaptop: ImageVector? = null
