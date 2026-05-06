package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = tablerOutlineIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 15.895 7.105 15 6 15c-1.105 0-2 .895-2 2")
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M4 17h-2v-11C2 5.448 2.448 5 3 5h14c2.761 0 5 3.134 5 7v5h-2M16 17h-8")
            addPathData("M16 5l1.5 7h4.5")
            addPathData("M2 10h15")
            addPathData("M7 5v5")
            addPathData("M12 5v5")
        }
        return _bus!!
    }

private var _bus: ImageVector? = null
