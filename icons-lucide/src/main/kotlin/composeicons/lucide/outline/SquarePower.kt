package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquarePower: ImageVector
    get() {
        if (_squarePower != null) return _squarePower!!
        _squarePower = lucideOutlineIcon(
            name = "SquarePower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v4")
            addPathData("M7.998 9.003c-1.546 2.064-1.269 4.965 .64 6.698 1.909 1.734 4.822 1.732 6.729-.004 1.906-1.736 2.18-4.637 .631-6.699")
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
        }
        return _squarePower!!
    }

private var _squarePower: ImageVector? = null
