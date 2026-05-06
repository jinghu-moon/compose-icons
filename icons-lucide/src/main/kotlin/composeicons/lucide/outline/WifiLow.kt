package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = lucideOutlineIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h.01")
            addPathData("M8.5 16.429c1.944-1.906 5.056-1.906 7 0")
        }
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
