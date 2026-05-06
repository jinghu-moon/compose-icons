package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileVibration: ImageVector
    get() {
        if (_deviceMobileVibration != null) return _deviceMobileVibration!!
        _deviceMobileVibration = tablerOutlineIcon(
            name = "DeviceMobileVibration",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h8c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-8C3.895 21 3 20.105 3 19v-14")
            addPathData("M8 4h2")
            addPathData("M9 17v.01")
            addPathData("M21 6 19 9l2 3-2 3 2 3")
        }
        return _deviceMobileVibration!!
    }

private var _deviceMobileVibration: ImageVector? = null
