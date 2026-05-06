package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartColumnStacked: ImageVector
    get() {
        if (_chartColumnStacked != null) return _chartColumnStacked!!
        _chartColumnStacked = lucideOutlineIcon(
            name = "ChartColumnStacked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 13h-4")
            addPathData("M19 9h-4")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M16 5h2c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1Z")
            addPathData("M8 8h2c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-2C7.448 17 7 16.552 7 16v-7C7 8.448 7.448 8 8 8Z")
        }
        return _chartColumnStacked!!
    }

private var _chartColumnStacked: ImageVector? = null
