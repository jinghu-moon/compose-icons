package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartArcs: ImageVector
    get() {
        if (_chartArcs != null) return _chartArcs!!
        _chartArcs = tablerOutlineIcon(
            name = "ChartArcs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M16.924 11.132C16.573 9.14 15.057 7.556 13.082 7.119 11.108 6.681 9.064 7.475 7.904 9.132c-1.16 1.657-1.208 3.849-.121 5.554 1.087 1.706 3.094 2.589 5.085 2.238")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _chartArcs!!
    }

private var _chartArcs: ImageVector? = null
