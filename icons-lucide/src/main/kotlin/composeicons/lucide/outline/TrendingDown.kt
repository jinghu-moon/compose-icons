package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) return _trendingDown!!
        _trendingDown = lucideOutlineIcon(
            name = "TrendingDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 17h6v-6")
            addPathData("M22 17 13.5 8.5l-5 5L2 7")
        }
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
