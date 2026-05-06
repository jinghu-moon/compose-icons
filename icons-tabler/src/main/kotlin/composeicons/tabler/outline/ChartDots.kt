package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartDots: ImageVector
    get() {
        if (_chartDots != null) return _chartDots!!
        _chartDots = tablerOutlineIcon(
            name = "ChartDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v18h18")
            addPathData("M7 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C11 7.895 10.105 7 9 7 7.895 7 7 7.895 7 9")
            addPathData("M17 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 5.895 20.105 5 19 5c-1.105 0-2 .895-2 2")
            addPathData("M12 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10.16 10.62l2.34 2.88")
            addPathData("M15.088 13.328 17.925 8.742")
        }
        return _chartDots!!
    }

private var _chartDots: ImageVector? = null
