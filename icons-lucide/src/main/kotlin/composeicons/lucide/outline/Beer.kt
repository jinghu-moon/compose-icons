package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = lucideOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 11h1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-1")
            addPathData("M9 12v6")
            addPathData("M13 12v6")
            addPathData("M14 7.5C13 7.5 12.56 8 11 8 9.44 8 9 7.5 8 7.5 7 7.5 6.28 8 5.5 8 4.119 8 3 6.881 3 5.5 3 4.119 4.119 3 5.5 3 6.28 3 7.07 3.5 8 3.5 8.93 3.5 9.44 2 11 2c1.56 0 2 1.5 3 1.5C15 3.5 15.72 3 16.5 3 17.881 3 19 4.119 19 5.5 19 6.881 17.881 8 16.5 8 15.72 8 15 7.5 14 7.5Z")
            addPathData("M5 8v12c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-12")
        }
        return _beer!!
    }

private var _beer: ImageVector? = null
