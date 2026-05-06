package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartGantt: ImageVector
    get() {
        if (_chartGantt != null) return _chartGantt!!
        _chartGantt = lucideOutlineIcon(
            name = "ChartGantt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h8")
            addPathData("M12 16h6")
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M8 11h7")
        }
        return _chartGantt!!
    }

private var _chartGantt: ImageVector? = null
