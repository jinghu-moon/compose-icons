package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Camper: ImageVector
    get() {
        if (_camper != null) return _camper!!
        _camper = tablerOutlineIcon(
            name = "Camper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16c-1.105 0-2 .895-2 2")
            addPathData("M15 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 18h-1C3.448 18 3 17.552 3 17v-11C3 4.895 3.895 4 5 4h12c2.209 0 4 1.791 4 4h-18")
            addPathData("M9 18h6")
            addPathData("M19 18h1c.552 0 1-.448 1-1v-4L18 8")
            addPathData("M21 13h-7")
            addPathData("M14 8v10")
        }
        return _camper!!
    }

private var _camper: ImageVector? = null
