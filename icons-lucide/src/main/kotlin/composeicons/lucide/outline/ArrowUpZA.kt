package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpZA: ImageVector
    get() {
        if (_arrowUpZA != null) return _arrowUpZA!!
        _arrowUpZA = lucideOutlineIcon(
            name = "ArrowUpZA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8 7 4l4 4")
            addPathData("M7 4v16")
            addPathData("M15 4h5l-5 6h5")
            addPathData("M15 20v-3.5C15 15.119 16.119 14 17.5 14 18.881 14 20 15.119 20 16.5v3.5")
            addPathData("M20 18h-5")
        }
        return _arrowUpZA!!
    }

private var _arrowUpZA: ImageVector? = null
