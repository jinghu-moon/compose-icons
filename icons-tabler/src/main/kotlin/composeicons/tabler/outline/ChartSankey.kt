package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartSankey: ImageVector
    get() {
        if (_chartSankey != null) return _chartSankey!!
        _chartSankey = tablerOutlineIcon(
            name = "ChartSankey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v18h18")
            addPathData("M3 6h18")
            addPathData("M3 8c10 0 8 9 18 9")
        }
        return _chartSankey!!
    }

private var _chartSankey: ImageVector? = null
