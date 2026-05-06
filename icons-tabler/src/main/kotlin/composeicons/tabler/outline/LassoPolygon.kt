package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) return _lassoPolygon!!
        _lassoPolygon = tablerOutlineIcon(
            name = "LassoPolygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.028 13.252 3 10 5 3l7 5L20 5l1 9-9 3L6.856 15.745")
            addPathData("M3 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 13.895 6.105 13 5 13c-1.105 0-2 .895-2 2")
            addPathData("M5 17c0 1.42 .316 2.805 1 4")
        }
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
