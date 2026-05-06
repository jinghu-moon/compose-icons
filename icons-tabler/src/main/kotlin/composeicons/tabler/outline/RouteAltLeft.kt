package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteAltLeft: ImageVector
    get() {
        if (_routeAltLeft != null) return _routeAltLeft!!
        _routeAltLeft = tablerOutlineIcon(
            name = "RouteAltLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h-5v5")
            addPathData("M16 3h5v5")
            addPathData("M3 3l7.536 7.536c.937 .937 1.464 2.209 1.464 3.534v6.93")
            addPathData("M18 6.01v-.01")
            addPathData("M16 8.02v-.01")
            addPathData("M14 10v.01")
        }
        return _routeAltLeft!!
    }

private var _routeAltLeft: ImageVector? = null
