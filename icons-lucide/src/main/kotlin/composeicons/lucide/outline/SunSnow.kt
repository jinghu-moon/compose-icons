package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SunSnow: ImageVector
    get() {
        if (_sunSnow != null) return _sunSnow!!
        _sunSnow = lucideOutlineIcon(
            name = "SunSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 21v-1")
            addPathData("M10 4v-1")
            addPathData("M10 9C8.343 9 7 10.343 7 12c0 1.657 1.343 3 3 3")
            addPathData("M14 20l1.25-2.5L18 18")
            addPathData("M14 4l1.25 2.5L18 6")
            addPathData("M17 21 14 15l1.5-3h6.5")
            addPathData("M17 3 14 9l1.5 3")
            addPathData("M2 12h1")
            addPathData("M20 10l-1.5 2L20 14")
            addPathData("M3.64 18.36l.7-.7")
            addPathData("M4.34 6.34 3.64 5.64")
        }
        return _sunSnow!!
    }

private var _sunSnow: ImageVector? = null
