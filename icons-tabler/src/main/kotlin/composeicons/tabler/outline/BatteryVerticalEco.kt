package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalEco: ImageVector
    get() {
        if (_batteryVerticalEco != null) return _batteryVerticalEco!!
        _batteryVerticalEco = tablerOutlineIcon(
            name = "BatteryVerticalEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-11C7 5.895 7.895 5 9 5h.5C9.776 5 10 4.776 10 4.5 10 4.224 10.224 4 10.5 4h3c.276 0 .5 .224 .5 .5 0 .276 .224 .5 .5 .5h.5c1.105 0 2 .895 2 2v1M9 20C7.895 20 7 19.105 7 18")
            addPathData("M13 17.143C13 14.303 15.09 12 17.667 12h2.333v.857C20 15.697 17.91 18 15.333 18h-2.333v-.857")
            addPathData("M13 21v-3")
        }
        return _batteryVerticalEco!!
    }

private var _batteryVerticalEco: ImageVector? = null
