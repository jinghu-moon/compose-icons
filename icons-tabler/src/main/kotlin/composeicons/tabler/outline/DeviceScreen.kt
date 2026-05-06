package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceScreen: ImageVector
    get() {
        if (_deviceScreen != null) return _deviceScreen!!
        _deviceScreen = tablerOutlineIcon(
            name = "DeviceScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M15 7 9 17")
            addPathData("M15 14l-1.75 3")
            addPathData("M10.75 7 9 10")
        }
        return _deviceScreen!!
    }

private var _deviceScreen: ImageVector? = null
