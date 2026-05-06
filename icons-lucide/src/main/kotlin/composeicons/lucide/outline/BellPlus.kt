package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellPlus: ImageVector
    get() {
        if (_bellPlus != null) return _bellPlus!!
        _bellPlus = lucideOutlineIcon(
            name = "BellPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M15 8h6")
            addPathData("M18 5v6")
            addPathData("M20.002 14.464c.228 .303 .474 .591 .738 .863 .266 .293 .335 .715 .175 1.078-.16 .362-.519 .596-.915 .595h-16c-.396 0-.755-.233-.915-.595-.16-.362-.092-.785 .175-1.078C4.59 13.956 6 12.499 6 8 6 5.907 7.091 3.966 8.878 2.877c1.787-1.089 4.012-1.168 5.872-.209")
        }
        return _bellPlus!!
    }

private var _bellPlus: ImageVector? = null
