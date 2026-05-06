package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShoeOff: ImageVector
    get() {
        if (_shoeOff != null) return _shoeOff!!
        _shoeOff = tablerOutlineIcon(
            name = "ShoeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.846 9.868l4.08 .972c1.802 .429 3.073 2.038 3.074 3.89v2.27M18 18h-14C3.448 18 3 17.552 3 17v-10C3 6.448 3.448 6 4 6h2")
            addPathData("M8 18v-1C8 14.791 6.209 13 4 13h-1")
            addPathData("M10 12l.663-1.327")
            addPathData("M3 3 21 21")
        }
        return _shoeOff!!
    }

private var _shoeOff: ImageVector? = null
