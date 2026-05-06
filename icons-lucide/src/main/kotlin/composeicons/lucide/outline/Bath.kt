package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = lucideOutlineIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 4 8 6")
            addPathData("M17 19v2")
            addPathData("M2 12h20")
            addPathData("M7 19v2")
            addPathData("M9 5 7.621 3.621C7.03 3.027 6.146 2.837 5.363 3.135 4.58 3.433 4.046 4.164 4 5v12c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-5")
        }
        return _bath!!
    }

private var _bath: ImageVector? = null
