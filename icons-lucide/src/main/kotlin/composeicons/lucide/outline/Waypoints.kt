package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Waypoints: ImageVector
    get() {
        if (_waypoints != null) return _waypoints!!
        _waypoints = lucideOutlineIcon(
            name = "Waypoints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.586 5.414 5.414 10.586")
            addPathData("M18.586 13.414l-5.172 5.172")
            addPathData("M6 12h12")
            addPathData("M14 20c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M14 4c0 1.105-.895 2-2 2C10.895 6 10 5.105 10 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M22 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M6 12c0 1.105-.895 2-2 2C2.895 14 2 13.105 2 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _waypoints!!
    }

private var _waypoints: ImageVector? = null
