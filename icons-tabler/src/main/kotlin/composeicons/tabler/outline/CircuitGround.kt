package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitGround: ImageVector
    get() {
        if (_circuitGround != null) return _circuitGround!!
        _circuitGround = tablerOutlineIcon(
            name = "CircuitGround",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v-8")
            addPathData("M4 13h16")
            addPathData("M7 16h10")
            addPathData("M10 19h4")
        }
        return _circuitGround!!
    }

private var _circuitGround: ImageVector? = null
