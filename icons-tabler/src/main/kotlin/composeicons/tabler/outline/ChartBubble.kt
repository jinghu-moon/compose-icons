package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) return _chartBubble!!
        _chartBubble = tablerOutlineIcon(
            name = "ChartBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 14.343 7.657 13 6 13 4.343 13 3 14.343 3 16")
            addPathData("M14 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10 7.5C10 9.985 12.015 12 14.5 12 16.985 12 19 9.985 19 7.5 19 5.015 16.985 3 14.5 3 12.015 3 10 5.015 10 7.5")
        }
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
