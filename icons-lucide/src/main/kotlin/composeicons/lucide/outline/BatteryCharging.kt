package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = lucideOutlineIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7 8 12h4L9 17")
            addPathData("M14.856 6h1.144c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2.935")
            addPathData("M22 14v-4")
            addPathData("M5.14 18h-1.14C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6h2.936")
        }
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
