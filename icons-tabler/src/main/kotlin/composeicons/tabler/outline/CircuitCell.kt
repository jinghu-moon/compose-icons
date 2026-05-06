package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitCell: ImageVector
    get() {
        if (_circuitCell != null) return _circuitCell!!
        _circuitCell = tablerOutlineIcon(
            name = "CircuitCell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h8")
            addPathData("M14 12h8")
            addPathData("M10 5v14")
            addPathData("M14 9v6")
        }
        return _circuitCell!!
    }

private var _circuitCell: ImageVector? = null
