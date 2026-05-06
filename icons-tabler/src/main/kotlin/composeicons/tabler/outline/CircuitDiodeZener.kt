package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitDiodeZener: ImageVector
    get() {
        if (_circuitDiodeZener != null) return _circuitDiodeZener!!
        _circuitDiodeZener = tablerOutlineIcon(
            name = "CircuitDiodeZener",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-6")
            addPathData("M2 12h6")
            addPathData("M8 7l8 5L8 17v-10")
            addPathData("M14 7h2v10h2")
        }
        return _circuitDiodeZener!!
    }

private var _circuitDiodeZener: ImageVector? = null
