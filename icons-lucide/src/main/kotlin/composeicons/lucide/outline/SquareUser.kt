package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareUser: ImageVector
    get() {
        if (_squareUser != null) return _squareUser!!
        _squareUser = lucideOutlineIcon(
            name = "SquareUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M7 21v-2c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2v2")
        }
        return _squareUser!!
    }

private var _squareUser: ImageVector? = null
