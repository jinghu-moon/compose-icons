package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorStop: ImageVector
    get() {
        if (_monitorStop != null) return _monitorStop!!
        _monitorStop = lucideOutlineIcon(
            name = "MonitorStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M8 21h8")
            addPathData("M4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3Z")
            addPathData("M10 7h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 13 9 12.552 9 12v-4C9 7.448 9.448 7 10 7Z")
        }
        return _monitorStop!!
    }

private var _monitorStop: ImageVector? = null
