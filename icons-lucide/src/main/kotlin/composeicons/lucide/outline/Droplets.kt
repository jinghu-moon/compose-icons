package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = lucideOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16.3c2.2 0 4-1.83 4-4.05C11 11.09 10.43 9.99 9.29 9.06 8.15 8.13 7.29 6.75 7 5.3 6.71 6.75 5.86 8.14 4.71 9.06 3.56 9.98 3 11.1 3 12.25c0 2.22 1.8 4.05 4 4.05Z")
            addPathData("M12.56 6.6C13.248 5.501 13.735 4.289 14 3.02c.5 2.5 2 4.9 4 6.5 2 1.6 3 3.5 3 5.5 .012 2.827-1.683 5.382-4.292 6.47-2.609 1.089-5.617 .496-7.618-1.5")
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
