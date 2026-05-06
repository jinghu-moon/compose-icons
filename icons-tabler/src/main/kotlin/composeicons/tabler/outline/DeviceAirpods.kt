package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirpods: ImageVector
    get() {
        if (_deviceAirpods != null) return _deviceAirpods!!
        _deviceAirpods = tablerOutlineIcon(
            name = "DeviceAirpods",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4c2.133-.003 3.893 1.669 4 3.8v.2 10.5C10 19.328 9.328 20 8.5 20 7.672 20 7 19.328 7 18.5v-6.5h-1C3.867 12.003 2.107 10.331 2 8.2v-.2C2 5.791 3.791 4 6 4")
            addPathData("M18 4C15.867 3.997 14.107 5.669 14 7.8v.2 10.5c0 .828 .672 1.5 1.5 1.5C16.328 20 17 19.328 17 18.5v-6.5h1c2.133 .003 3.893-1.669 4-3.8v-.2C22 5.791 20.209 4 18 4")
        }
        return _deviceAirpods!!
    }

private var _deviceAirpods: ImageVector? = null
