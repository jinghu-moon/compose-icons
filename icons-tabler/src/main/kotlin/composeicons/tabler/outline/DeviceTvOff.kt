package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTvOff: ImageVector
    get() {
        if (_deviceTvOff != null) return _deviceTvOff!!
        _deviceTvOff = tablerOutlineIcon(
            name = "DeviceTvOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h8c1.105 0 2 .895 2 2v8M19.822 19.824C19.572 19.937 19.293 20 19 20h-14C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h2")
            addPathData("M16 3 12 7 8 3")
            addPathData("M3 3 21 21")
        }
        return _deviceTvOff!!
    }

private var _deviceTvOff: ImageVector? = null
