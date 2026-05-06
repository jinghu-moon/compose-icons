package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CapStraight: ImageVector
    get() {
        if (_capStraight != null) return _capStraight!!
        _capStraight = tablerOutlineIcon(
            name = "CapStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 1.105-.895 2-2 2C4.895 14 4 13.105 4 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M8 12h12")
            addPathData("M20 6h-12C6.895 6 6 6.895 6 8v2")
            addPathData("M6 14v2c0 1.105 .895 2 2 2h12")
        }
        return _capStraight!!
    }

private var _capStraight: ImageVector? = null
