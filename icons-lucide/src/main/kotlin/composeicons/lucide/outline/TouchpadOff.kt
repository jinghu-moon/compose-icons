package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TouchpadOff: ImageVector
    get() {
        if (_touchpadOff != null) return _touchpadOff!!
        _touchpadOff = lucideOutlineIcon(
            name = "TouchpadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v-6")
            addPathData("M19.656 14h2.344")
            addPathData("M2 14h12")
            addPathData("M2 2 22 22")
            addPathData("M20 20h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4")
            addPathData("M9.656 4h10.344c1.105 0 2 .895 2 2v10.344")
        }
        return _touchpadOff!!
    }

private var _touchpadOff: ImageVector? = null
