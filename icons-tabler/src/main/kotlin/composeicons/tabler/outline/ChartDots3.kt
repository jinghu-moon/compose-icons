package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartDots3: ImageVector
    get() {
        if (_chartDots3 != null) return _chartDots3!!
        _chartDots3 = tablerOutlineIcon(
            name = "ChartDots3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7c0 1.105 .895 2 2 2C6.105 9 7 8.105 7 7 7 5.895 6.105 5 5 5 3.895 5 3 5.895 3 7")
            addPathData("M14 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M15 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 4.343 19.657 3 18 3 16.343 3 15 4.343 15 6")
            addPathData("M3 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 16.343 7.657 15 6 15 4.343 15 3 16.343 3 18")
            addPathData("M9 17l5-1.5")
            addPathData("M6.5 8.5l7.81 5.37")
            addPathData("M7 7 15 6")
        }
        return _chartDots3!!
    }

private var _chartDots3: ImageVector? = null
