package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Helicopter: ImageVector
    get() {
        if (_helicopter != null) return _helicopter!!
        _helicopter = lucideOutlineIcon(
            name = "Helicopter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17v4")
            addPathData("M14 3v8c0 1.105 .895 2 2 2h5.865")
            addPathData("M17 17v4")
            addPathData("M18 17c2.209 0 4-1.791 4-4C22 9.686 18.418 7 14 7 10.686 7 8 9.239 8 12v3c0 1.105 .895 2 2 2Z")
            addPathData("M2 10v5")
            addPathData("M6 3h16")
            addPathData("M7 21h14")
            addPathData("M8 13h-6")
        }
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
