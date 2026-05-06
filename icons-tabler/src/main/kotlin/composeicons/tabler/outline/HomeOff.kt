package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeOff: ImageVector
    get() {
        if (_homeOff != null) return _homeOff!!
        _homeOff = tablerOutlineIcon(
            name = "HomeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h-2L7.497 7.503M9.497 5.503 12.001 2.999l9 9h-2")
            addPathData("M5 12v7c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2M19 15v-3")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2M15 15v6")
            addPathData("M3 3 21 21")
        }
        return _homeOff!!
    }

private var _homeOff: ImageVector? = null
