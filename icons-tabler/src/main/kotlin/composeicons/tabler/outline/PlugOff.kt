package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlugOff: ImageVector
    get() {
        if (_plugOff != null) return _plugOff!!
        _plugOff = tablerOutlineIcon(
            name = "PlugOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.123 16.092l-.177 .177c-1.458 1.516-3.62 2.126-5.655 1.595C8.256 17.333 6.667 15.744 6.136 13.709 5.605 11.674 6.215 9.512 7.731 8.054l.159-.159")
            addPathData("M4 20 7.5 16.5")
            addPathData("M15 4 11.5 7.5")
            addPathData("M20 9l-3.5 3.5")
            addPathData("M3 3 21 21")
        }
        return _plugOff!!
    }

private var _plugOff: ImageVector? = null
