package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteX2: ImageVector
    get() {
        if (_routeX2 != null) return _routeX2!!
        _routeX2 = tablerOutlineIcon(
            name = "RouteX2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17l4 4")
            addPathData("M7 17 3 21")
            addPathData("M17 3l4 4")
            addPathData("M21 3 17 7")
            addPathData("M14 5c-1.105 0-2 .895-2 2v10c0 1.105-.895 2-2 2")
        }
        return _routeX2!!
    }

private var _routeX2: ImageVector? = null
