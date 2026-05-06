package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalCharging2: ImageVector
    get() {
        if (_batteryVerticalCharging2 != null) return _batteryVerticalCharging2!!
        _batteryVerticalCharging2 = tablerOutlineIcon(
            name = "BatteryVerticalCharging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-11C7 5.895 7.895 5 9 5h.5C9.776 5 10 4.776 10 4.5 10 4.224 10.224 4 10.5 4h3c.276 0 .5 .224 .5 .5 0 .276 .224 .5 .5 .5h.5c1.105 0 2 .895 2 2v1M7 18c0 1.105 .895 2 2 2h1")
            addPathData("M12 14h6v2c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-2")
            addPathData("M15 21v-3")
            addPathData("M13 14v-2.5")
            addPathData("M17 14v-2.5")
        }
        return _batteryVerticalCharging2!!
    }

private var _batteryVerticalCharging2: ImageVector? = null
