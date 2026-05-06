package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorCog: ImageVector
    get() {
        if (_monitorCog != null) return _monitorCog!!
        _monitorCog = lucideOutlineIcon(
            name = "MonitorCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M14.305 7.53l.923-.382")
            addPathData("M15.228 4.852l-.923-.383")
            addPathData("M16.852 3.228l-.383-.924")
            addPathData("M16.852 8.772l-.383 .923")
            addPathData("M19.148 3.228l.383-.924")
            addPathData("M19.53 9.696l-.382-.924")
            addPathData("M20.772 4.852l.924-.383")
            addPathData("M20.772 7.148l.924 .383")
            addPathData("M22 13v2c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3h7")
            addPathData("M8 21h8")
            addPathData("M21 6c0 1.657-1.343 3-3 3C16.343 9 15 7.657 15 6 15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3Z")
        }
        return _monitorCog!!
    }

private var _monitorCog: ImageVector? = null
