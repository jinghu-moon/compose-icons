package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Route2: ImageVector
    get() {
        if (_route2 != null) return _route2!!
        _route2 = tablerOutlineIcon(
            name = "Route2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M19 7c1.105 0 2-.895 2-2C21 3.895 20.105 3 19 3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2")
            addPathData("M14 5c-1.105 0-2 .895-2 2v10c0 1.105-.895 2-2 2")
        }
        return _route2!!
    }

private var _route2: ImageVector? = null
