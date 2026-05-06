package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WineOff: ImageVector
    get() {
        if (_wineOff != null) return _wineOff!!
        _wineOff = lucideOutlineIcon(
            name = "WineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 22h8")
            addPathData("M7 10h3M17 10h-1.343")
            addPathData("M12 15v7")
            addPathData("M7.307 7.307C7.106 8.191 7.003 9.094 7 10c0 1.764 .93 3.397 2.446 4.298 1.517 .901 3.396 .936 4.945 .093M8.638 2.981C8.75 2.668 8.872 2.34 9 2h6c1.5 4 2 6 2 8 0 .407-.05 .809-.145 1.198")
            addPathData("M2 2 22 22")
        }
        return _wineOff!!
    }

private var _wineOff: ImageVector? = null
