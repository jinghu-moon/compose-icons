package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalExclamation: ImageVector
    get() {
        if (_batteryVerticalExclamation != null) return _batteryVerticalExclamation!!
        _batteryVerticalExclamation = tablerOutlineIcon(
            name = "BatteryVerticalExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12v-5C17 5.895 16.105 5 15 5h-.5C14.224 5 14 4.776 14 4.5 14 4.224 13.776 4 13.5 4h-3C10.224 4 10 4.224 10 4.5 10 4.776 9.776 5 9.5 5h-.5C7.895 5 7 5.895 7 7v11c0 1.105 .895 2 2 2h6")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _batteryVerticalExclamation!!
    }

private var _batteryVerticalExclamation: ImageVector? = null
