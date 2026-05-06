package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PolygonOff: ImageVector
    get() {
        if (_polygonOff != null) return _polygonOff!!
        _polygonOff = tablerOutlineIcon(
            name = "PolygonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M17 8c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 6.895 20.105 6 19 6c-1.105 0-2 .895-2 2")
            addPathData("M3 11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 9.895 6.105 9 5 9 3.895 9 3 9.895 3 11")
            addPathData("M13 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6.5 9.5 8.046 8.189")
            addPathData("M14 5.5 17 7")
            addPathData("M18.5 10l-1.185 3.318M16.253 16.29 16 17")
            addPathData("M13.5 17.5l-7-5")
            addPathData("M3 3 21 21")
        }
        return _polygonOff!!
    }

private var _polygonOff: ImageVector? = null
