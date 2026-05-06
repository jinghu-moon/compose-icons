package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = lucideOutlineIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9v6")
            addPathData("M12.543 6h3.457c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-3.605")
            addPathData("M22 14v-4")
            addPathData("M7 12h6")
            addPathData("M7.606 18h-3.606C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6h3.606")
        }
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
