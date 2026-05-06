package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingUp3: ImageVector
    get() {
        if (_trendingUp3 != null) return _trendingUp3!!
        _trendingUp3 = tablerOutlineIcon(
            name = "TrendingUp3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 5l3 3-3 3")
            addPathData("M3 18h2.397c1.632-0 3.16-.796 4.096-2.133l4.014-5.734C14.443 8.796 15.971 8 17.603 8h3.397")
        }
        return _trendingUp3!!
    }

private var _trendingUp3: ImageVector? = null
