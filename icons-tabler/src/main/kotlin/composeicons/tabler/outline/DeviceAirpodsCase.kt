package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirpodsCase: ImageVector
    get() {
        if (_deviceAirpodsCase != null) return _deviceAirpodsCase!!
        _deviceAirpodsCase = tablerOutlineIcon(
            name = "DeviceAirpodsCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 10h-18")
            addPathData("M3 8C3 5.791 4.791 4 7 4h10c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-10C4.791 20 3 18.209 3 16v-8")
            addPathData("M7 10v1.5C7 12.328 7.672 13 8.5 13h7C16.328 13 17 12.328 17 11.5v-1.5")
        }
        return _deviceAirpodsCase!!
    }

private var _deviceAirpodsCase: ImageVector? = null
