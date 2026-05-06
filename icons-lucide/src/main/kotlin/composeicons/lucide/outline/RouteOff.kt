package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RouteOff: ImageVector
    get() {
        if (_routeOff != null) return _routeOff!!
        _routeOff = lucideOutlineIcon(
            name = "RouteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 19c0 1.657-1.343 3-3 3C4.343 22 3 20.657 3 19 3 17.343 4.343 16 6 16c1.657 0 3 1.343 3 3Z")
            addPathData("M9 19h8.5c.4 0 .9-.1 1.3-.2")
            addPathData("M5.2 5.2C3.652 5.835 2.765 7.484 3.082 9.138c.316 1.654 1.748 2.853 3.418 2.862h5.5")
            addPathData("M2 2 22 22")
            addPathData("M21 15.3C20.901 13.52 19.48 12.099 17.7 12")
            addPathData("M15 5h-4.3")
            addPathData("M21 5c0 1.657-1.343 3-3 3C16.343 8 15 6.657 15 5 15 3.343 16.343 2 18 2c1.657 0 3 1.343 3 3Z")
        }
        return _routeOff!!
    }

private var _routeOff: ImageVector? = null
