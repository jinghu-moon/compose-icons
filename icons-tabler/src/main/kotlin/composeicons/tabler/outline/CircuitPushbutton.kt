package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitPushbutton: ImageVector
    get() {
        if (_circuitPushbutton != null) return _circuitPushbutton!!
        _circuitPushbutton = tablerOutlineIcon(
            name = "CircuitPushbutton",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17h2")
            addPathData("M20 17h2")
            addPathData("M4 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 15.895 7.105 15 6 15c-1.105 0-2 .895-2 2")
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 11h12")
            addPathData("M12 11v-6")
        }
        return _circuitPushbutton!!
    }

private var _circuitPushbutton: ImageVector? = null
