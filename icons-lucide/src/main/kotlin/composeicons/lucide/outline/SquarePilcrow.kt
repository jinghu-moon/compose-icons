package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquarePilcrow: ImageVector
    get() {
        if (_squarePilcrow != null) return _squarePilcrow!!
        _squarePilcrow = lucideOutlineIcon(
            name = "SquarePilcrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M12 12h-2.5C8.119 12 7 10.881 7 9.5 7 8.119 8.119 7 9.5 7h7.5")
            addPathData("M12 7v10")
            addPathData("M16 7v10")
        }
        return _squarePilcrow!!
    }

private var _squarePilcrow: ImageVector? = null
