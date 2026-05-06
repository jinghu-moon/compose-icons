package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStack: ImageVector
    get() {
        if (_squareStack != null) return _squareStack!!
        _squareStack = lucideOutlineIcon(
            name = "SquareStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10C2.9 10 2 9.1 2 8v-4C2 2.9 2.9 2 4 2h4c1.1 0 2 .9 2 2")
            addPathData("M10 16C8.9 16 8 15.1 8 14v-4C8 8.9 8.9 8 10 8h4c1.1 0 2 .9 2 2")
            addPathData("M16 14h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2Z")
        }
        return _squareStack!!
    }

private var _squareStack: ImageVector? = null
