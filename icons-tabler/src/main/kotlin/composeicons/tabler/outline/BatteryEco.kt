package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryEco: ImageVector
    get() {
        if (_batteryEco != null) return _batteryEco!!
        _batteryEco = tablerOutlineIcon(
            name = "BatteryEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9C4 7.895 4.895 7 6 7h11c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5c0 1.105-.895 2-2 2h-5.5")
            addPathData("M3 16.143C3 13.303 5.09 11 7.667 11h2.333v.857C10 14.697 7.91 17 5.333 17h-2.333v-.857")
            addPathData("M3 20v-3")
        }
        return _batteryEco!!
    }

private var _batteryEco: ImageVector? = null
