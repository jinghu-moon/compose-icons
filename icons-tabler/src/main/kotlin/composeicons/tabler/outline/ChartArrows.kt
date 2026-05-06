package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartArrows: ImageVector
    get() {
        if (_chartArrows != null) return _chartArrows!!
        _chartArrows = tablerOutlineIcon(
            name = "ChartArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 18h14")
            addPathData("M9 9l3 3L9 15")
            addPathData("M14 15l3 3-3 3")
            addPathData("M3 3v18")
            addPathData("M3 12h9")
            addPathData("M18 3l3 3L18 9")
            addPathData("M3 6h18")
        }
        return _chartArrows!!
    }

private var _chartArrows: ImageVector? = null
