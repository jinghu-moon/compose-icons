package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = lucideOutlineIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h.01")
            addPathData("M5 12.859c3.888-3.811 10.112-3.811 14 0")
            addPathData("M8.5 16.429c1.944-1.906 5.056-1.906 7 0")
        }
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
