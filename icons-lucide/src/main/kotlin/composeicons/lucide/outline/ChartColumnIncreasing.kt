package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartColumnIncreasing: ImageVector
    get() {
        if (_chartColumnIncreasing != null) return _chartColumnIncreasing!!
        _chartColumnIncreasing = lucideOutlineIcon(
            name = "ChartColumnIncreasing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17v-8")
            addPathData("M18 17v-12")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M8 17v-3")
        }
        return _chartColumnIncreasing!!
    }

private var _chartColumnIncreasing: ImageVector? = null
