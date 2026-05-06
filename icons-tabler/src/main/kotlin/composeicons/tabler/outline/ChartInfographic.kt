package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartInfographic: ImageVector
    get() {
        if (_chartInfographic != null) return _chartInfographic!!
        _chartInfographic = tablerOutlineIcon(
            name = "ChartInfographic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C11 4.791 9.209 3 7 3 4.791 3 3 4.791 3 7")
            addPathData("M7 3v4h4")
            addPathData("M9 17v4")
            addPathData("M17 14v7")
            addPathData("M13 13v8")
            addPathData("M21 12v9")
        }
        return _chartInfographic!!
    }

private var _chartInfographic: ImageVector? = null
