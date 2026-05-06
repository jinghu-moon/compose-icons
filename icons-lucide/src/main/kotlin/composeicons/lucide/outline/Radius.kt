package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radius: ImageVector
    get() {
        if (_radius != null) return _radius!!
        _radius = lucideOutlineIcon(
            name = "Radius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.34 17.52C23.174 13.238 22.304 7.506 18.328 4.257 14.351 1.008 8.561 1.299 4.93 4.93 1.299 8.561 1.008 14.351 4.257 18.328c3.249 3.976 8.981 4.846 13.263 2.012")
            addPathData("M21 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M13.41 13.41l4.18 4.18")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _radius!!
    }

private var _radius: ImageVector? = null
