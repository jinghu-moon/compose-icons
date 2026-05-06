package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceUsb: ImageVector
    get() {
        if (_deviceUsb != null) return _deviceUsb!!
        _deviceUsb = tablerOutlineIcon(
            name = "DeviceUsb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h10v8c0 2.761-2.239 5-5 5C9.239 21 7 18.761 7 16v-8")
            addPathData("M9 8v-5h6v5")
        }
        return _deviceUsb!!
    }

private var _deviceUsb: ImageVector? = null
