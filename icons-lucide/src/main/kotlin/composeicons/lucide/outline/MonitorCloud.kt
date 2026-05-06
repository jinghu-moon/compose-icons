package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorCloud: ImageVector
    get() {
        if (_monitorCloud != null) return _monitorCloud!!
        _monitorCloud = lucideOutlineIcon(
            name = "MonitorCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 13C9.475 12.999 8.193 11.854 8.021 10.338 7.849 8.822 8.842 7.419 10.328 7.077c1.487-.342 2.993 .485 3.502 1.923h.17c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z")
            addPathData("M12 17v4")
            addPathData("M8 21h8")
            addPathData("M4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3Z")
        }
        return _monitorCloud!!
    }

private var _monitorCloud: ImageVector? = null
