package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVertical3: ImageVector
    get() {
        if (_batteryVertical3 != null) return _batteryVertical3!!
        _batteryVertical3 = tablerOutlineIcon(
            name = "BatteryVertical3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-11C7 5.895 7.895 5 9 5h.5C9.776 5 10 4.776 10 4.5 10 4.224 10.224 4 10.5 4h3c.276 0 .5 .224 .5 .5 0 .276 .224 .5 .5 .5h.5c1.105 0 2 .895 2 2v11c0 1.105-.895 2-2 2h-6C7.895 20 7 19.105 7 18")
            addPathData("M10 17h4")
            addPathData("M10 14h4")
            addPathData("M10 11h4")
        }
        return _batteryVertical3!!
    }

private var _batteryVertical3: ImageVector? = null
