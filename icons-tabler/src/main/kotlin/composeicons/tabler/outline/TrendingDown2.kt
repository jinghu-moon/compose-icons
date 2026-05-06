package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingDown2: ImageVector
    get() {
        if (_trendingDown2 != null) return _trendingDown2!!
        _trendingDown2 = tablerOutlineIcon(
            name = "TrendingDown2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h5l7 10h6")
            addPathData("M18 19l3-3L18 13")
        }
        return _trendingDown2!!
    }

private var _trendingDown2: ImageVector? = null
