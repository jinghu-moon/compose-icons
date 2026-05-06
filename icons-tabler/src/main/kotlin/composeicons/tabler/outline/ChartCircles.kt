package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCircles: ImageVector
    get() {
        if (_chartCircles != null) return _chartCircles!!
        _chartCircles = tablerOutlineIcon(
            name = "ChartCircles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9.5C4 12.538 6.462 15 9.5 15 12.538 15 15 12.538 15 9.5 15 6.462 12.538 4 9.5 4 6.462 4 4 6.462 4 9.5")
            addPathData("M9 14.5C9 17.538 11.462 20 14.5 20 17.538 20 20 17.538 20 14.5 20 11.462 17.538 9 14.5 9 11.462 9 9 11.462 9 14.5")
        }
        return _chartCircles!!
    }

private var _chartCircles: ImageVector? = null
