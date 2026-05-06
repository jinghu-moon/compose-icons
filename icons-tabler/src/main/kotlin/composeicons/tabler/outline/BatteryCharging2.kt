package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryCharging2: ImageVector
    get() {
        if (_batteryCharging2 != null) return _batteryCharging2!!
        _batteryCharging2 = tablerOutlineIcon(
            name = "BatteryCharging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9C4 7.895 4.895 7 6 7h11c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5c0 1.105-.895 2-2 2h-4.5")
            addPathData("M3 15h6v2c0 1.105-.895 2-2 2h-2C3.895 19 3 18.105 3 17v-2")
            addPathData("M6 22v-3")
            addPathData("M4 15v-2.5")
            addPathData("M8 15v-2.5")
        }
        return _batteryCharging2!!
    }

private var _batteryCharging2: ImageVector? = null
