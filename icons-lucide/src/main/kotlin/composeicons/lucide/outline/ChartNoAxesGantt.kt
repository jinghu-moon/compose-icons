package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartNoAxesGantt: ImageVector
    get() {
        if (_chartNoAxesGantt != null) return _chartNoAxesGantt!!
        _chartNoAxesGantt = lucideOutlineIcon(
            name = "ChartNoAxesGantt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5h12")
            addPathData("M4 12h10")
            addPathData("M12 19h8")
        }
        return _chartNoAxesGantt!!
    }

private var _chartNoAxesGantt: ImageVector? = null
