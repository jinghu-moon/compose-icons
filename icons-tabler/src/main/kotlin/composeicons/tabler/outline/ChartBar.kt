package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = tablerOutlineIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 13c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C3.448 20 3 19.552 3 19v-6")
            addPathData("M15 9c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-10")
            addPathData("M9 5C9 4.448 9.448 4 10 4h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-4C9.448 20 9 19.552 9 19v-14")
            addPathData("M4 20h14")
        }
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
