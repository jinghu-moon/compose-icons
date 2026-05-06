package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitDiode: ImageVector
    get() {
        if (_circuitDiode != null) return _circuitDiode!!
        _circuitDiode = tablerOutlineIcon(
            name = "CircuitDiode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-6")
            addPathData("M2 12h6")
            addPathData("M8 7l8 5L8 17v-10")
            addPathData("M16 7v10")
        }
        return _circuitDiode!!
    }

private var _circuitDiode: ImageVector? = null
