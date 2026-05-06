package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShipWheel: ImageVector
    get() {
        if (_shipWheel != null) return _shipWheel!!
        _shipWheel = lucideOutlineIcon(
            name = "ShipWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8Z")
            addPathData("M12 2v7.5")
            addPathData("M19 5l-5.23 5.23")
            addPathData("M22 12h-7.5")
            addPathData("M19 19 13.77 13.77")
            addPathData("M12 14.5v7.5")
            addPathData("M10.23 13.77 5 19")
            addPathData("M9.5 12h-7.5")
            addPathData("M10.23 10.23 5 5")
            addPathData("M14.5 12c0 1.381-1.119 2.5-2.5 2.5C10.619 14.5 9.5 13.381 9.5 12 9.5 10.619 10.619 9.5 12 9.5c1.381 0 2.5 1.119 2.5 2.5Z")
        }
        return _shipWheel!!
    }

private var _shipWheel: ImageVector? = null
