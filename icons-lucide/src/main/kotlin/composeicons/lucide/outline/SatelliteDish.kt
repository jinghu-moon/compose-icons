package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) return _satelliteDish!!
        _satelliteDish = lucideOutlineIcon(
            name = "SatelliteDish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c-1.677 2.869-1.208 6.508 1.142 8.858C7.492 21.208 11.131 21.677 14 20Z")
            addPathData("M9 15l3-3")
            addPathData("M17 13C17 9.686 14.314 7 11 7")
            addPathData("M21 13C21 7.477 16.523 3 11 3")
        }
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
