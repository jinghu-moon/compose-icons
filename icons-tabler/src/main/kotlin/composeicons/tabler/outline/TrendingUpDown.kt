package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingUpDown: ImageVector
    get() {
        if (_trendingUpDown != null) return _trendingUpDown!!
        _trendingUpDown = tablerOutlineIcon(
            name = "TrendingUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 14 8 8l4 4L21 3")
            addPathData("M15 3h6v6")
            addPathData("M15 21h6v-6")
            addPathData("M21 21 15 15")
        }
        return _trendingUpDown!!
    }

private var _trendingUpDown: ImageVector? = null
