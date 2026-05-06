package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitBattery: ImageVector
    get() {
        if (_circuitBattery != null) return _circuitBattery!!
        _circuitBattery = tablerOutlineIcon(
            name = "CircuitBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h4")
            addPathData("M18 12h4")
            addPathData("M18 5v14")
            addPathData("M14 9v6")
            addPathData("M10 5v14")
            addPathData("M6 9v6")
        }
        return _circuitBattery!!
    }

private var _circuitBattery: ImageVector? = null
