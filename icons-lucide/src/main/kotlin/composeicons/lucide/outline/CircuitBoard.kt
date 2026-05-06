package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircuitBoard: ImageVector
    get() {
        if (_circuitBoard != null) return _circuitBoard!!
        _circuitBoard = lucideOutlineIcon(
            name = "CircuitBoard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M11 9h4c1.105 0 2-.895 2-2v-4")
            addPathData("M11 9c0 1.105-.895 2-2 2C7.895 11 7 10.105 7 9 7 7.895 7.895 7 9 7c1.105 0 2 .895 2 2Z")
            addPathData("M7 21v-4c0-1.105 .895-2 2-2h4")
            addPathData("M17 15c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _circuitBoard!!
    }

private var _circuitBoard: ImageVector? = null
