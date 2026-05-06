package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = lucideOutlineIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 6.5 10.352 3.352c-.471-.47-1.233-.47-1.704 0L6.352 5.648c-.47 .471-.47 1.233 0 1.704l3.148 3.148")
            addPathData("M16.5 7.5 19 5")
            addPathData("M17.5 10.5l3.148 3.148c.47 .471 .47 1.233 0 1.704l-2.296 2.296c-.471 .47-1.233 .47-1.704 0L13.5 14.5")
            addPathData("M9 21C9 17.686 6.314 15 3 15")
            addPathData("M9.352 10.648c-.47 .471-.47 1.233 0 1.704l2.296 2.296c.471 .47 1.233 .47 1.704 0l4.296-4.296c.47-.471 .47-1.233 0-1.704L15.352 6.352c-.471-.47-1.233-.47-1.704 0Z")
        }
        return _satellite!!
    }

private var _satellite: ImageVector? = null
