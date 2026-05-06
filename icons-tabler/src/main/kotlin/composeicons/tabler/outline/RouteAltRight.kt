package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteAltRight: ImageVector
    get() {
        if (_routeAltRight != null) return _routeAltRight!!
        _routeAltRight = tablerOutlineIcon(
            name = "RouteAltRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3h5v5")
            addPathData("M8 3h-5v5")
            addPathData("M21 3l-7.536 7.536c-.937 .937-1.464 2.209-1.464 3.534v6.93")
            addPathData("M6 6.01v-.01")
            addPathData("M8 8.02v-.01")
            addPathData("M10 10v.01")
        }
        return _routeAltRight!!
    }

private var _routeAltRight: ImageVector? = null
