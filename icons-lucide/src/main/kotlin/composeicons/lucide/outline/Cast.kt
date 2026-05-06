package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cast: ImageVector
    get() {
        if (_cast != null) return _cast!!
        _cast = lucideOutlineIcon(
            name = "Cast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8v-2C2 4.895 2.895 4 4 4h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-6")
            addPathData("M2 12c4.219 .448 7.552 3.781 8 8")
            addPathData("M2 16c2.032 .378 3.622 1.968 4 4")
            addPathData("M2 20h.01")
        }
        return _cast!!
    }

private var _cast: ImageVector? = null
