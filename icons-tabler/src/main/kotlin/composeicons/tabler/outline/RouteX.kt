package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteX: ImageVector
    get() {
        if (_routeX != null) return _routeX!!
        _routeX = tablerOutlineIcon(
            name = "RouteX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17l4 4")
            addPathData("M7 17 3 21")
            addPathData("M17 3l4 4")
            addPathData("M21 3 17 7")
            addPathData("M11 19h5.5C18.433 19 20 17.433 20 15.5 20 13.567 18.433 12 16.5 12h-8C6.567 12 5 10.433 5 8.5 5 6.567 6.567 5 8.5 5h4.5")
        }
        return _routeX!!
    }

private var _routeX: ImageVector? = null
