package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartSpline: ImageVector
    get() {
        if (_chartSpline != null) return _chartSpline!!
        _chartSpline = lucideOutlineIcon(
            name = "ChartSpline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M7 16C7.5 14 8.5 9 11 9c2 0 2 3 4 3 2.5 0 4.5-5 5-7")
        }
        return _chartSpline!!
    }

private var _chartSpline: ImageVector? = null
