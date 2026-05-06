package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryOff: ImageVector
    get() {
        if (_batteryOff != null) return _batteryOff!!
        _batteryOff = tablerOutlineIcon(
            name = "BatteryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M11 7h6c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5M17 17h-11C4.895 17 4 16.105 4 15v-6C4 7.895 4.895 7 6 7h1")
        }
        return _batteryOff!!
    }

private var _batteryOff: ImageVector? = null
