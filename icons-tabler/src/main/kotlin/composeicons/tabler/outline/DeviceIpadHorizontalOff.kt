package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalOff: ImageVector
    get() {
        if (_deviceIpadHorizontalOff != null) return _deviceIpadHorizontalOff!!
        _deviceIpadHorizontalOff = tablerOutlineIcon(
            name = "DeviceIpadHorizontalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h12c1.105 0 2 .895 2 2v12M20 20h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4")
            addPathData("M9 17h6")
            addPathData("M3 3 21 21")
        }
        return _deviceIpadHorizontalOff!!
    }

private var _deviceIpadHorizontalOff: ImageVector? = null
