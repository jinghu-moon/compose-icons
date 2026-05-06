package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitCapacitor: ImageVector
    get() {
        if (_circuitCapacitor != null) return _circuitCapacitor!!
        _circuitCapacitor = tablerOutlineIcon(
            name = "CircuitCapacitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-8")
            addPathData("M2 12h8")
            addPathData("M10 7v10")
            addPathData("M14 7v10")
        }
        return _circuitCapacitor!!
    }

private var _circuitCapacitor: ImageVector? = null
