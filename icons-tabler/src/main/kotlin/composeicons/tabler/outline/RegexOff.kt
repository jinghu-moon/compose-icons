package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RegexOff: ImageVector
    get() {
        if (_regexOff != null) return _regexOff!!
        _regexOff = tablerOutlineIcon(
            name = "RegexOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 15C7.881 15 9 16.119 9 17.5 9 18.881 7.881 20 6.5 20 5.119 20 4 18.881 4 17.5 4 16.119 5.119 15 6.5 15")
            addPathData("M17 7.875 20 6.188")
            addPathData("M17 7.875v3.375")
            addPathData("M17 7.875 14 6.188")
            addPathData("M17 7.875l3 1.688")
            addPathData("M17 4.5v3.375")
            addPathData("M17 7.875 14 9.563")
            addPathData("M3 3 21 21")
        }
        return _regexOff!!
    }

private var _regexOff: ImageVector? = null
