package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteSquare: ImageVector
    get() {
        if (_routeSquare != null) return _routeSquare!!
        _routeSquare = tablerOutlineIcon(
            name = "RouteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h4v4h-4v-4")
            addPathData("M17 3h4v4h-4v-4")
            addPathData("M11 19h5.5C18.433 19 20 17.433 20 15.5 20 13.567 18.433 12 16.5 12h-8C6.567 12 5 10.433 5 8.5 5 6.567 6.567 5 8.5 5h4.5")
        }
        return _routeSquare!!
    }

private var _routeSquare: ImageVector? = null
