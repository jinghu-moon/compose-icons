package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiSync: ImageVector
    get() {
        if (_wifiSync != null) return _wifiSync!!
        _wifiSync = lucideOutlineIcon(
            name = "WifiSync",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.965 10.105v4l1.535-1.605c1.165-1.119 2.798-1.607 4.386-1.309 1.588 .298 2.934 1.344 3.614 2.809")
            addPathData("M11.965 14.105h4")
            addPathData("M17.965 18.105h4l-1.535 1.605c-1.165 1.119-2.798 1.607-4.386 1.309-1.588-.298-2.934-1.344-3.614-2.809")
            addPathData("M2 8.82c5.694-5.093 14.306-5.093 20 0")
            addPathData("M21.965 22.105v-4")
            addPathData("M5 12.86c.868-.854 1.885-1.543 3-2.032")
            addPathData("M8.5 16.429h.01")
        }
        return _wifiSync!!
    }

private var _wifiSync: ImageVector? = null
