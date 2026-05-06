package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadOff: ImageVector
    get() {
        if (_deviceIpadOff != null) return _deviceIpadOff!!
        _deviceIpadOff = tablerOutlineIcon(
            name = "DeviceIpadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h12c1.105 0 2 .895 2 2v12M20 20c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16")
            addPathData("M9 19h6")
            addPathData("M3 3 21 21")
        }
        return _deviceIpadOff!!
    }

private var _deviceIpadOff: ImageVector? = null
