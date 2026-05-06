package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = tablerOutlineIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v18h18")
            addPathData("M8 15.015v.015")
            addPathData("M16 16.015v.015")
            addPathData("M8 7.03v.015")
            addPathData("M12 11.03v.015")
            addPathData("M19 11.03v.015")
        }
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
