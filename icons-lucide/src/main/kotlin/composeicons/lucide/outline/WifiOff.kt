package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) return _wifiOff!!
        _wifiOff = lucideOutlineIcon(
            name = "WifiOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h.01")
            addPathData("M8.5 16.429c1.944-1.906 5.056-1.906 7 0")
            addPathData("M5 12.859c1.418-1.39 3.218-2.327 5.17-2.69")
            addPathData("M19 12.859c-.602-.59-1.276-1.102-2.007-1.523")
            addPathData("M2 8.82C3.237 7.714 4.648 6.821 6.177 6.177")
            addPathData("M22 8.82C18.917 6.063 14.833 4.701 10.712 5.056")
            addPathData("M2 2 22 22")
        }
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
