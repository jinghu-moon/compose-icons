package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MirrorRectangular: ImageVector
    get() {
        if (_mirrorRectangular != null) return _mirrorRectangular!!
        _mirrorRectangular = lucideOutlineIcon(
            name = "MirrorRectangular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 6 8 9")
            addPathData("M16 7 8 15")
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
        }
        return _mirrorRectangular!!
    }

private var _mirrorRectangular: ImageVector? = null
