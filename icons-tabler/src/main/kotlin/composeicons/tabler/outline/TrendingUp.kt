package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) return _trendingUp!!
        _trendingUp = tablerOutlineIcon(
            name = "TrendingUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17 9 11l4 4L21 7")
            addPathData("M14 7h7v7")
        }
        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
