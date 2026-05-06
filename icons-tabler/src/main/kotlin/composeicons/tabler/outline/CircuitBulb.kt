package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitBulb: ImageVector
    get() {
        if (_circuitBulb != null) return _circuitBulb!!
        _circuitBulb = tablerOutlineIcon(
            name = "CircuitBulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h5")
            addPathData("M17 12h5")
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M8.5 8.5l7 7")
            addPathData("M15.5 8.5l-7 7")
        }
        return _circuitBulb!!
    }

private var _circuitBulb: ImageVector? = null
