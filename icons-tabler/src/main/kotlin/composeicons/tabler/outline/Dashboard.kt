package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dashboard: ImageVector
    get() {
        if (_dashboard != null) return _dashboard!!
        _dashboard = tablerOutlineIcon(
            name = "Dashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13.45 11.55 15.5 9.5")
            addPathData("M6.4 20C3.404 17.618 2.241 13.602 3.503 9.989 4.764 6.375 8.173 3.954 12 3.954c3.827 0 7.236 2.421 8.497 6.034 1.261 3.614 .099 7.63-2.897 10.011h-11.2")
        }
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
