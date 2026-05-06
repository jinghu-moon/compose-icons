package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellElectric: ImageVector
    get() {
        if (_bellElectric != null) return _bellElectric!!
        _bellElectric = lucideOutlineIcon(
            name = "BellElectric",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.518 17.347C17.255 18.414 15.654 19 14 19")
            addPathData("M18.8 4c.789 1.548 1.201 3.262 1.2 5")
            addPathData("M9 9h.01")
            addPathData("M22 16c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M16 9c0 3.866-3.134 7-7 7C5.134 16 2 12.866 2 9 2 5.134 5.134 2 9 2c3.866 0 7 3.134 7 7Z")
            addPathData("M6 16h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C4.895 22 4 21.105 4 20v-2c0-1.105 .895-2 2-2Z")
        }
        return _bellElectric!!
    }

private var _bellElectric: ImageVector? = null
