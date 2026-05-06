package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresSubtract: ImageVector
    get() {
        if (_squaresSubtract != null) return _squaresSubtract!!
        _squaresSubtract = lucideOutlineIcon(
            name = "SquaresSubtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 22C8.895 22 8 21.105 8 20")
            addPathData("M16 22h-2")
            addPathData("M16 4C16 2.895 15.105 2 14 2h-10C2.895 2 2 2.895 2 4v10c0 1.105 .895 2 2 2h3c.552 0 1-.448 1-1v-5C8 8.895 8.895 8 10 8h5c.552 0 1-.448 1-1Z")
            addPathData("M20 8c1.105 0 2 .895 2 2")
            addPathData("M22 14v2")
            addPathData("M22 20c0 1.105-.895 2-2 2")
        }
        return _squaresSubtract!!
    }

private var _squaresSubtract: ImageVector? = null
