package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = tablerOutlineIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 7h1c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5c0 1.105-.895 2-2 2h-2")
            addPathData("M8 7h-2C4.895 7 4 7.895 4 9v6c0 1.105 .895 2 2 2h1")
            addPathData("M12 8l-2 4h3l-2 4")
        }
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
