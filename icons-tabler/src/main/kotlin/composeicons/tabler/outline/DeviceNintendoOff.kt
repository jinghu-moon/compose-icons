package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceNintendoOff: ImageVector
    get() {
        if (_deviceNintendoOff != null) return _deviceNintendoOff!!
        _deviceNintendoOff = tablerOutlineIcon(
            name = "DeviceNintendoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.713 4.718C3.64 5.466 3 6.692 3 8v8c0 2.209 1.791 4 4 4h3v-10M10 6v-2h-2")
            addPathData("M14 10v-6h3c2.209 0 4 1.791 4 4v8c0 .308-.035 .608-.1 .896M19.28 19.286c-.669 .466-1.465 .715-2.28 .714h-3v-6")
            addPathData("M5.5 8.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _deviceNintendoOff!!
    }

private var _deviceNintendoOff: ImageVector? = null
