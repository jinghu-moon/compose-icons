package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartBarIncreasing: ImageVector
    get() {
        if (_chartBarIncreasing != null) return _chartBarIncreasing!!
        _chartBarIncreasing = lucideOutlineIcon(
            name = "ChartBarIncreasing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M7 11h8")
            addPathData("M7 16h12")
            addPathData("M7 6h3")
        }
        return _chartBarIncreasing!!
    }

private var _chartBarIncreasing: ImageVector? = null
