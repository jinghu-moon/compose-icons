package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CarFront: ImageVector
    get() {
        if (_carFront != null) return _carFront!!
        _carFront = lucideOutlineIcon(
            name = "CarFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8l-2 2L17.5 6.3C17.21 5.525 16.473 5.008 15.646 5h-7.246C7.566 4.981 6.807 5.482 6.497 6.257L5 10 3 8")
            addPathData("M7 14h.01")
            addPathData("M17 14h.01")
            addPathData("M5 10h14c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-14C3.895 18 3 17.105 3 16v-4c0-1.105 .895-2 2-2Z")
            addPathData("M5 18v2")
            addPathData("M19 18v2")
        }
        return _carFront!!
    }

private var _carFront: ImageVector? = null
