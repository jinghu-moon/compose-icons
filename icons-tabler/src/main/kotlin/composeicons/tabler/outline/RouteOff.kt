package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteOff: ImageVector
    get() {
        if (_routeOff != null) return _routeOff!!
        _routeOff = tablerOutlineIcon(
            name = "RouteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 17.895 7.105 17 6 17c-1.105 0-2 .895-2 2")
            addPathData("M16 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 3.895 19.105 3 18 3c-1.105 0-2 .895-2 2")
            addPathData("M12 19h4.5c.71 0 1.372-.212 1.924-.576M19.969 15.965c.134-1-.17-2.01-.835-2.77C18.47 12.436 17.509 12 16.5 12h-.499M12.001 12h-3.501C7.085 12 5.81 11.148 5.268 9.841 4.726 8.534 5.024 7.03 6.023 6.028M8.5 5h3.5")
            addPathData("M3 3 21 21")
        }
        return _routeOff!!
    }

private var _routeOff: ImageVector? = null
