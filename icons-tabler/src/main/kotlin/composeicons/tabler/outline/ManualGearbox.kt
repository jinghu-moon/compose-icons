package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ManualGearbox: ImageVector
    get() {
        if (_manualGearbox != null) return _manualGearbox!!
        _manualGearbox = tablerOutlineIcon(
            name = "ManualGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6c0 1.105 .895 2 2 2C6.105 8 7 7.105 7 6 7 4.895 6.105 4 5 4 3.895 4 3 4.895 3 6")
            addPathData("M10 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2")
            addPathData("M17 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 4.895 20.105 4 19 4c-1.105 0-2 .895-2 2")
            addPathData("M3 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 16.895 6.105 16 5 16c-1.105 0-2 .895-2 2")
            addPathData("M10 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 8v8")
            addPathData("M12 8v8")
            addPathData("M19 8v2c0 1.105-.895 2-2 2h-12")
        }
        return _manualGearbox!!
    }

private var _manualGearbox: ImageVector? = null
