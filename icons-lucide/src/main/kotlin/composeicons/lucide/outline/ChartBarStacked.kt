package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartBarStacked: ImageVector
    get() {
        if (_chartBarStacked != null) return _chartBarStacked!!
        _chartBarStacked = lucideOutlineIcon(
            name = "ChartBarStacked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 13v4")
            addPathData("M15 5v4")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M8 13h7c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-7C7.448 17 7 16.552 7 16v-2c0-.552 .448-1 1-1Z")
            addPathData("M8 5h10c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-10C7.448 9 7 8.552 7 8v-2C7 5.448 7.448 5 8 5Z")
        }
        return _chartBarStacked!!
    }

private var _chartBarStacked: ImageVector? = null
