package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = lucideOutlineIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2v14c0 1.105 .895 2 2 2h14")
            addPathData("M18 22v-14C18 6.895 17.105 6 16 6h-14")
        }
        return _crop!!
    }

private var _crop: ImageVector? = null
