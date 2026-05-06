package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCandle: ImageVector
    get() {
        if (_chartCandle != null) return _chartCandle!!
        _chartCandle = tablerOutlineIcon(
            name = "ChartCandle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7C4 6.448 4.448 6 5 6h2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-2C4.448 11 4 10.552 4 10v-3")
            addPathData("M6 4v2")
            addPathData("M6 11v9")
            addPathData("M10 15c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-3")
            addPathData("M12 4v10")
            addPathData("M12 19v1")
            addPathData("M16 6c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4")
            addPathData("M18 4v1")
            addPathData("M18 11v9")
        }
        return _chartCandle!!
    }

private var _chartCandle: ImageVector? = null
