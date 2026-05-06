package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorX: ImageVector
    get() {
        if (_monitorX != null) return _monitorX!!
        _monitorX = lucideOutlineIcon(
            name = "MonitorX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 12.5l-5-5")
            addPathData("M9.5 12.5l5-5")
            addPathData("M4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3Z")
            addPathData("M12 17v4")
            addPathData("M8 21h8")
        }
        return _monitorX!!
    }

private var _monitorX: ImageVector? = null
