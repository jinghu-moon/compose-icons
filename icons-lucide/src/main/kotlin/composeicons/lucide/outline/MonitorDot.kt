package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorDot: ImageVector
    get() {
        if (_monitorDot != null) return _monitorDot!!
        _monitorDot = lucideOutlineIcon(
            name = "MonitorDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M22 12.307v2.693c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3h8.693")
            addPathData("M8 21h8")
            addPathData("M22 6c0 1.657-1.343 3-3 3C17.343 9 16 7.657 16 6 16 4.343 17.343 3 19 3c1.657 0 3 1.343 3 3Z")
        }
        return _monitorDot!!
    }

private var _monitorDot: ImageVector? = null
