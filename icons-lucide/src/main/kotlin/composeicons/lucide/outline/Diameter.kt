package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Diameter: ImageVector
    get() {
        if (_diameter != null) return _diameter!!
        _diameter = lucideOutlineIcon(
            name = "Diameter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M7 5C7 6.105 6.105 7 5 7 3.895 7 3 6.105 3 5 3 3.895 3.895 3 5 3c1.105 0 2 .895 2 2Z")
            addPathData("M6.48 3.66C10.445 1.032 15.712 1.561 19.076 4.924c3.364 3.364 3.892 8.631 1.264 12.596")
            addPathData("M6.41 6.41 17.59 17.59")
            addPathData("M3.66 6.48C1.032 10.445 1.561 15.712 4.924 19.076c3.364 3.364 8.631 3.892 12.596 1.264")
        }
        return _diameter!!
    }

private var _diameter: ImageVector? = null
