package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteSquare2: ImageVector
    get() {
        if (_routeSquare2 != null) return _routeSquare2!!
        _routeSquare2 = tablerOutlineIcon(
            name = "RouteSquare2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 5c-1.105 0-2 .895-2 2v10c0 1.105-.895 2-2 2")
            addPathData("M3 17h4v4h-4v-4")
            addPathData("M17 3h4v4h-4v-4")
        }
        return _routeSquare2!!
    }

private var _routeSquare2: ImageVector? = null
