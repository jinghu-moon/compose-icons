package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrub: ImageVector
    get() {
        if (_shrub != null) return _shrub!!
        _shrub = lucideOutlineIcon(
            name = "Shrub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-5.172c-0-.53-.211-1.039-.586-1.414L9.5 13.5")
            addPathData("M14.5 14.5 12 17")
            addPathData("M17 8.8c2.392 1.373 3.54 4.2 2.782 6.852-.758 2.652-3.226 4.446-5.982 4.348h-3.8C7.187 19.809 4.818 17.827 4.134 15.091 3.451 12.356 4.608 9.492 7 8 7 5.239 9.239 3 12 3c2.761 0 5 2.239 5 5Z")
        }
        return _shrub!!
    }

private var _shrub: ImageVector? = null
