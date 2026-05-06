package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresIntersect: ImageVector
    get() {
        if (_squaresIntersect != null) return _squaresIntersect!!
        _squaresIntersect = lucideOutlineIcon(
            name = "SquaresIntersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 22C8.895 22 8 21.105 8 20")
            addPathData("M14 2c1.105 0 2 .895 2 2")
            addPathData("M16 22h-2")
            addPathData("M2 10v-2")
            addPathData("M2 4C2 2.895 2.895 2 4 2")
            addPathData("M20 8c1.105 0 2 .895 2 2")
            addPathData("M22 14v2")
            addPathData("M22 20c0 1.105-.895 2-2 2")
            addPathData("M4 16C2.895 16 2 15.105 2 14")
            addPathData("M8 10C8 8.895 8.895 8 10 8h5c.552 0 1 .448 1 1v5c0 1.105-.895 2-2 2h-5C8.448 16 8 15.552 8 15Z")
            addPathData("M8 2h2")
        }
        return _squaresIntersect!!
    }

private var _squaresIntersect: ImageVector? = null
