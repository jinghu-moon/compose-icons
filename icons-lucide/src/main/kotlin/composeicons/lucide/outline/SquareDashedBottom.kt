package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareDashedBottom: ImageVector
    get() {
        if (_squareDashedBottom != null) return _squareDashedBottom!!
        _squareDashedBottom = lucideOutlineIcon(
            name = "SquareDashedBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2")
            addPathData("M9 21h1")
            addPathData("M14 21h1")
        }
        return _squareDashedBottom!!
    }

private var _squareDashedBottom: ImageVector? = null
