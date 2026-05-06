package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Route: ImageVector
    get() {
        if (_route != null) return _route!!
        _route = lucideOutlineIcon(
            name = "Route",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 19c0 1.657-1.343 3-3 3C4.343 22 3 20.657 3 19 3 17.343 4.343 16 6 16c1.657 0 3 1.343 3 3Z")
            addPathData("M9 19h8.5C19.433 19 21 17.433 21 15.5 21 13.567 19.433 12 17.5 12h-11C4.567 12 3 10.433 3 8.5 3 6.567 4.567 5 6.5 5h8.5")
            addPathData("M21 5c0 1.657-1.343 3-3 3C16.343 8 15 6.657 15 5 15 3.343 16.343 2 18 2c1.657 0 3 1.343 3 3Z")
        }
        return _route!!
    }

private var _route: ImageVector? = null
