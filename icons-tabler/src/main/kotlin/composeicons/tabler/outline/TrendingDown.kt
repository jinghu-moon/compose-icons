package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) return _trendingDown!!
        _trendingDown = tablerOutlineIcon(
            name = "TrendingDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7l6 6L13 9l8 8")
            addPathData("M21 10v7h-7")
        }
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
