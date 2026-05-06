package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitChangeover: ImageVector
    get() {
        if (_circuitChangeover != null) return _circuitChangeover!!
        _circuitChangeover = tablerOutlineIcon(
            name = "CircuitChangeover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h2")
            addPathData("M20 7h2")
            addPathData("M4 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 10.895 7.105 10 6 10c-1.105 0-2 .895-2 2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M20 17h2")
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7.5 10.5 16 7")
        }
        return _circuitChangeover!!
    }

private var _circuitChangeover: ImageVector? = null
