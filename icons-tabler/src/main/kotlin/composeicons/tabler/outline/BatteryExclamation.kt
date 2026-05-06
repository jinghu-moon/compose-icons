package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryExclamation: ImageVector
    get() {
        if (_batteryExclamation != null) return _batteryExclamation!!
        _batteryExclamation = tablerOutlineIcon(
            name = "BatteryExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 17h8c1.105 0 2-.895 2-2v-.5c0-.276 .224-.5 .5-.5 .276 0 .5-.224 .5-.5v-3C20 10.224 19.776 10 19.5 10 19.224 10 19 9.776 19 9.5v-.5C19 7.895 18.105 7 17 7h-11C4.895 7 4 7.895 4 9v3")
            addPathData("M5 16v3")
            addPathData("M5 22v.01")
        }
        return _batteryExclamation!!
    }

private var _batteryExclamation: ImageVector? = null
