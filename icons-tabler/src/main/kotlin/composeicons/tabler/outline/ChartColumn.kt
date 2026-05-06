package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartColumn: ImageVector
    get() {
        if (_chartColumn != null) return _chartColumn!!
        _chartColumn = tablerOutlineIcon(
            name = "ChartColumn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h3")
            addPathData("M17 20h3")
            addPathData("M10.5 20h3")
            addPathData("M4 16h3")
            addPathData("M17 16h3")
            addPathData("M10.5 16h3")
            addPathData("M4 12h3")
            addPathData("M17 12h3")
            addPathData("M10.5 12h3")
            addPathData("M4 8h3")
            addPathData("M17 8h3")
            addPathData("M4 4h3")
        }
        return _chartColumn!!
    }

private var _chartColumn: ImageVector? = null
