package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitCellPlus: ImageVector
    get() {
        if (_circuitCellPlus != null) return _circuitCellPlus!!
        _circuitCellPlus = tablerOutlineIcon(
            name = "CircuitCellPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h9")
            addPathData("M15 12h7")
            addPathData("M11 5v14")
            addPathData("M15 9v6")
            addPathData("M3 5h4")
            addPathData("M5 3v4")
        }
        return _circuitCellPlus!!
    }

private var _circuitCellPlus: ImageVector? = null
