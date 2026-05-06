package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Haze: ImageVector
    get() {
        if (_haze != null) return _haze!!
        _haze = lucideOutlineIcon(
            name = "Haze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.2 6.2 6.6 7.6")
            addPathData("M2 13h2")
            addPathData("M20 13h2")
            addPathData("M17.4 7.6 18.8 6.2")
            addPathData("M22 17h-20")
            addPathData("M22 21h-20")
            addPathData("M16 13C16 10.791 14.209 9 12 9 9.791 9 8 10.791 8 13")
            addPathData("M12 5v-2.5")
        }
        return _haze!!
    }

private var _haze: ImageVector? = null
