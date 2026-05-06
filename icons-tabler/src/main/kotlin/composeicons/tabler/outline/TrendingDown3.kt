package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingDown3: ImageVector
    get() {
        if (_trendingDown3 != null) return _trendingDown3!!
        _trendingDown3 = tablerOutlineIcon(
            name = "TrendingDown3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h2.397c1.632 0 3.16 .796 4.096 2.133l4.014 5.734c.936 1.337 2.464 2.133 4.096 2.133h3.397")
            addPathData("M18 19l3-3L18 13")
        }
        return _trendingDown3!!
    }

private var _trendingDown3: ImageVector? = null
