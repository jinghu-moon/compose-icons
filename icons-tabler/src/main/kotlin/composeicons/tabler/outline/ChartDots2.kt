package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartDots2: ImageVector
    get() {
        if (_chartDots2 != null) return _chartDots2!!
        _chartDots2 = tablerOutlineIcon(
            name = "ChartDots2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v18h18")
            addPathData("M7 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C15 3.895 14.105 3 13 3c-1.105 0-2 .895-2 2")
            addPathData("M16 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M21 3 15 4.5")
            addPathData("M14.113 6.65l2.771 3.695")
            addPathData("M16 12.5l-5 2")
        }
        return _chartDots2!!
    }

private var _chartDots2: ImageVector? = null
