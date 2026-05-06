package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Route: ImageVector
    get() {
        if (_route != null) return _route!!
        _route = tablerOutlineIcon(
            name = "Route",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M19 7c1.105 0 2-.895 2-2C21 3.895 20.105 3 19 3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2")
            addPathData("M11 19h5.5C18.433 19 20 17.433 20 15.5 20 13.567 18.433 12 16.5 12h-8C6.567 12 5 10.433 5 8.5 5 6.567 6.567 5 8.5 5h4.5")
        }
        return _route!!
    }

private var _route: ImageVector? = null
