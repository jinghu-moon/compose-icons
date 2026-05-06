package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitSwitchClosed: ImageVector
    get() {
        if (_circuitSwitchClosed != null) return _circuitSwitchClosed!!
        _circuitSwitchClosed = tablerOutlineIcon(
            name = "CircuitSwitchClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h2")
            addPathData("M20 12h2")
            addPathData("M4 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 10.895 7.105 10 6 10c-1.105 0-2 .895-2 2")
            addPathData("M16 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M8 12h8")
        }
        return _circuitSwitchClosed!!
    }

private var _circuitSwitchClosed: ImageVector? = null
