package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileOff: ImageVector
    get() {
        if (_deviceMobileOff != null) return _deviceMobileOff!!
        _deviceMobileOff = tablerOutlineIcon(
            name = "DeviceMobileOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.159 3.185C7.415 3.066 7.699 3 8 3h8c1.105 0 2 .895 2 2v9M18 18v1c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-13")
            addPathData("M11 4h2")
            addPathData("M3 3 21 21")
            addPathData("M12 17v.01")
        }
        return _deviceMobileOff!!
    }

private var _deviceMobileOff: ImageVector? = null
