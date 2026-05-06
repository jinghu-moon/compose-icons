package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = lucideOutlineIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c.552 0 1.005-.449 .95-.998C21.475 6.269 17.731 2.525 12.997 2.051c-.55-.055-.998 .398-.998 .95v8c0 .552 .448 1 1 1Z")
            addPathData("M21.21 15.89c-1.75 4.139-6.046 6.602-10.502 6.022C6.252 21.331 2.73 17.849 2.099 13.4 1.467 8.951 3.881 4.627 8 2.83")
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
