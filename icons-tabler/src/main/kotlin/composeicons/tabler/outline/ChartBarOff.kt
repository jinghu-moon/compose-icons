package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartBarOff: ImageVector
    get() {
        if (_chartBarOff != null) return _chartBarOff!!
        _chartBarOff = tablerOutlineIcon(
            name = "ChartBarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 13c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C3.448 20 3 19.552 3 19v-6")
            addPathData("M12 8h2c.552 0 1 .448 1 1v2M15 15v4c0 .552-.448 1-1 1h-4C9.448 20 9 19.552 9 19v-10")
            addPathData("M15 11v-6c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v12M20 20h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M4 20h14")
            addPathData("M3 3 21 21")
        }
        return _chartBarOff!!
    }

private var _chartBarOff: ImageVector? = null
