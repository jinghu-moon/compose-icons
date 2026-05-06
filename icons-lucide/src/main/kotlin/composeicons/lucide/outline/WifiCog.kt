package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiCog: ImageVector
    get() {
        if (_wifiCog != null) return _wifiCog!!
        _wifiCog = lucideOutlineIcon(
            name = "WifiCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.305 19.53l.923-.382")
            addPathData("M15.228 16.852l-.923-.383")
            addPathData("M16.852 15.228l-.383-.923")
            addPathData("M16.852 20.772l-.383 .924")
            addPathData("M19.148 15.228l.383-.923")
            addPathData("M19.53 21.696l-.382-.924")
            addPathData("M2 7.82c5.694-5.093 14.306-5.093 20 0")
            addPathData("M20.772 16.852l.924-.383")
            addPathData("M20.772 19.148l.924 .383")
            addPathData("M5 11.858C8.057 8.864 12.68 8.146 16.5 10.073")
            addPathData("M8.5 15.429c.666-.653 1.502-1.107 2.413-1.31")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _wifiCog!!
    }

private var _wifiCog: ImageVector? = null
