package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) return _trendingUp!!
        _trendingUp = lucideOutlineIcon(
            name = "TrendingUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 7h6v6")
            addPathData("M22 7l-8.5 8.5-5-5L2 17")
        }
        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
