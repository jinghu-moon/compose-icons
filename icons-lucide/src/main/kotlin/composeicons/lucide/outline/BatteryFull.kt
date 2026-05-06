package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BatteryFull: ImageVector
    get() {
        if (_batteryFull != null) return _batteryFull!!
        _batteryFull = lucideOutlineIcon(
            name = "BatteryFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v4")
            addPathData("M14 10v4")
            addPathData("M22 14v-4")
            addPathData("M6 10v4")
            addPathData("M4 6h12c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-12C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z")
        }
        return _batteryFull!!
    }

private var _batteryFull: ImageVector? = null
