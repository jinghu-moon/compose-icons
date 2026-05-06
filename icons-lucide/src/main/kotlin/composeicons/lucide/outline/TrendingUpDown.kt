package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrendingUpDown: ImageVector
    get() {
        if (_trendingUpDown != null) return _trendingUpDown!!
        _trendingUpDown = lucideOutlineIcon(
            name = "TrendingUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.828 14.828 21 21")
            addPathData("M21 16v5h-5")
            addPathData("M21 3l-9 9L8 8 2 14")
            addPathData("M21 8v-5h-5")
        }
        return _trendingUpDown!!
    }

private var _trendingUpDown: ImageVector? = null
