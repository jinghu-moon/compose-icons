package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitGroundDigital: ImageVector
    get() {
        if (_circuitGroundDigital != null) return _circuitGroundDigital!!
        _circuitGroundDigital = tablerOutlineIcon(
            name = "CircuitGroundDigital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v-10")
            addPathData("M12 21 6 13h12l-6 8")
        }
        return _circuitGroundDigital!!
    }

private var _circuitGroundDigital: ImageVector? = null
