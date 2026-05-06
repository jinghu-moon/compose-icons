package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiPen: ImageVector
    get() {
        if (_wifiPen != null) return _wifiPen!!
        _wifiPen = lucideOutlineIcon(
            name = "WifiPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8.82c5.694-5.093 14.306-5.093 20 0")
            addPathData("M21.378 16.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-4.01 4.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
            addPathData("M5 12.859C7.772 10.144 11.865 9.278 15.5 10.637")
            addPathData("M8.5 16.429c.811-.796 1.869-1.292 3-1.406")
        }
        return _wifiPen!!
    }

private var _wifiPen: ImageVector? = null
