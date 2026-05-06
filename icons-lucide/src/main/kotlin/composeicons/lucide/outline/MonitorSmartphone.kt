package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorSmartphone: ImageVector
    get() {
        if (_monitorSmartphone != null) return _monitorSmartphone!!
        _monitorSmartphone = lucideOutlineIcon(
            name = "MonitorSmartphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8v-2C18 4.895 17.105 4 16 4h-12C2.895 4 2 4.895 2 6v7c0 1.105 .895 2 2 2h8")
            addPathData("M10 19v-3.96 3.15")
            addPathData("M7 19h5")
            addPathData("M18 12h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z")
        }
        return _monitorSmartphone!!
    }

private var _monitorSmartphone: ImageVector? = null
