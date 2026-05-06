package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = tablerOutlineIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19h16")
            addPathData("M4 15 8 9l4 2L16 6l4 4v5h-16")
        }
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
