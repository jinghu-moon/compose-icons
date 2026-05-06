package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartCandlestick: ImageVector
    get() {
        if (_chartCandlestick != null) return _chartCandlestick!!
        _chartCandlestick = lucideOutlineIcon(
            name = "ChartCandlestick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5v4")
            addPathData("M8 9h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2C7.448 15 7 14.552 7 14v-4C7 9.448 7.448 9 8 9Z")
            addPathData("M9 15v2")
            addPathData("M17 3v2")
            addPathData("M16 5h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1Z")
            addPathData("M17 13v3")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
        }
        return _chartCandlestick!!
    }

private var _chartCandlestick: ImageVector? = null
