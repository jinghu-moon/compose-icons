package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalOff: ImageVector
    get() {
        if (_batteryVerticalOff != null) return _batteryVerticalOff!!
        _batteryVerticalOff = tablerOutlineIcon(
            name = "BatteryVerticalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M17 13v-6C17 5.895 16.105 5 15 5h-.5C14.224 5 14 4.776 14 4.5 14 4.224 13.776 4 13.5 4h-3C10.224 4 10 4.224 10 4.5 10 4.776 9.776 5 9.5 5h-.5M7 7v11c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-1")
        }
        return _batteryVerticalOff!!
    }

private var _batteryVerticalOff: ImageVector? = null
