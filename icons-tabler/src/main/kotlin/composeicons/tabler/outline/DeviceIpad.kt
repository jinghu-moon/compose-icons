package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpad: ImageVector
    get() {
        if (_deviceIpad != null) return _deviceIpad!!
        _deviceIpad = tablerOutlineIcon(
            name = "DeviceIpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 3c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12")
            addPathData("M9 18h6")
        }
        return _deviceIpad!!
    }

private var _deviceIpad: ImageVector? = null
