package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartAreaLine: ImageVector
    get() {
        if (_chartAreaLine != null) return _chartAreaLine!!
        _chartAreaLine = tablerOutlineIcon(
            name = "ChartAreaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19 8 13l4 2 4-5 4 4v5h-16")
            addPathData("M4 12 7 8l4 2L16 4l4 4")
        }
        return _chartAreaLine!!
    }

private var _chartAreaLine: ImageVector? = null
