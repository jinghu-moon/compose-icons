package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingUp2: ImageVector
    get() {
        if (_trendingUp2 != null) return _trendingUp2!!
        _trendingUp2 = tablerOutlineIcon(
            name = "TrendingUp2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 5l3 3-3 3")
            addPathData("M3 18h5L15 8h6")
        }
        return _trendingUp2!!
    }

private var _trendingUp2: ImageVector? = null
