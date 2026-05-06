package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = lucideOutlineIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M19 9l-5 5L10 10 7 13")
        }
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
