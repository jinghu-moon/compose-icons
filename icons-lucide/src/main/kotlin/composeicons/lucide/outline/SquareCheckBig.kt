package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareCheckBig: ImageVector
    get() {
        if (_squareCheckBig != null) return _squareCheckBig!!
        _squareCheckBig = lucideOutlineIcon(
            name = "SquareCheckBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 10.656v8.344c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h12.344")
            addPathData("M9 11l3 3L22 4")
        }
        return _squareCheckBig!!
    }

private var _squareCheckBig: ImageVector? = null
