package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartNoAxesColumn: ImageVector
    get() {
        if (_chartNoAxesColumn != null) return _chartNoAxesColumn!!
        _chartNoAxesColumn = lucideOutlineIcon(
            name = "ChartNoAxesColumn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-6")
            addPathData("M12 21v-18")
            addPathData("M19 21v-12")
        }
        return _chartNoAxesColumn!!
    }

private var _chartNoAxesColumn: ImageVector? = null
