package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitVoltmeter: ImageVector
    get() {
        if (_circuitVoltmeter != null) return _circuitVoltmeter!!
        _circuitVoltmeter = tablerOutlineIcon(
            name = "CircuitVoltmeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12")
            addPathData("M5 12h-3")
            addPathData("M19 12h3")
            addPathData("M10 10l2 4 2-4")
        }
        return _circuitVoltmeter!!
    }

private var _circuitVoltmeter: ImageVector? = null
