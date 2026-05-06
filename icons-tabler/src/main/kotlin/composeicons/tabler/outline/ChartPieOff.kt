package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPieOff: ImageVector
    get() {
        if (_chartPieOff != null) return _chartPieOff!!
        _chartPieOff = tablerOutlineIcon(
            name = "ChartPieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.63 5.643C2.119 9.162 2.125 14.86 5.643 18.372c3.519 3.511 9.217 3.505 12.728-.014M20.046 16.068c.335-.656 .588-1.35 .754-2.068 0-.552-.448-1-1-1h-2.8M13 13c-1.105 0-2-.895-2-2M11 7v-3c-.025-.239-.145-.459-.333-.609C10.479 3.241 10.239 3.172 10 3.2c-.714 .165-1.404 .417-2.057 .749")
            addPathData("M15 3.5c2.572 .906 4.594 2.928 5.5 5.5h-4.5C15.448 9 15 8.552 15 8v-4.5")
            addPathData("M3 3 21 21")
        }
        return _chartPieOff!!
    }

private var _chartPieOff: ImageVector? = null
