package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorOff: ImageVector
    get() {
        if (_monitorOff != null) return _monitorOff!!
        _monitorOff = lucideOutlineIcon(
            name = "MonitorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M17 17h-13C2.895 17 2 16.105 2 15v-10C2 4.211 2.464 3.496 3.184 3.174")
            addPathData("M2 2 22 22")
            addPathData("M8 21h8")
            addPathData("M8.656 3h11.344c1.105 0 2 .895 2 2v10c-0 .368-.101 .728-.293 1.042")
        }
        return _monitorOff!!
    }

private var _monitorOff: ImageVector? = null
