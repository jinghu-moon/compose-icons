package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartGridDots: ImageVector
    get() {
        if (_chartGridDots != null) return _chartGridDots!!
        _chartGridDots = tablerOutlineIcon(
            name = "ChartGridDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 4.895 19.105 4 18 4c-1.105 0-2 .895-2 2")
            addPathData("M4 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 10.895 7.105 10 6 10c-1.105 0-2 .895-2 2")
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M8 18h8")
            addPathData("M18 20v1")
            addPathData("M18 3v1")
            addPathData("M6 20v1")
            addPathData("M6 10v-7")
            addPathData("M12 3v18")
            addPathData("M18 8v8")
            addPathData("M8 12h13")
            addPathData("M21 6h-1")
            addPathData("M16 6h-13")
            addPathData("M3 12h1")
            addPathData("M20 18h1")
            addPathData("M3 18h1")
            addPathData("M6 14v2")
        }
        return _chartGridDots!!
    }

private var _chartGridDots: ImageVector? = null
