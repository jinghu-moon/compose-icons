package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareBottomDashedScissors: ImageVector
    get() {
        if (_squareBottomDashedScissors != null) return _squareBottomDashedScissors!!
        _squareBottomDashedScissors = lucideOutlineIcon(
            name = "SquareBottomDashedScissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14")
            addPathData("M3 5v14")
            addPathData("M21 5v14")
            addPathData("M9 21h1")
            addPathData("M14 21h1")
            addPathData("M3 5C3 3.895 3.895 3 5 3")
            addPathData("M19 3c1.105 0 2 .895 2 2")
            addPathData("M5 21C3.895 21 3 20.105 3 19")
            addPathData("M21 19c0 1.105-.895 2-2 2")
            addPathData("M10 8.5C10 9.328 9.328 10 8.5 10 7.672 10 7 9.328 7 8.5 7 7.672 7.672 7 8.5 7 9.328 7 10 7.672 10 8.5Z")
            addPathData("M9.561 9.561 12 12")
            addPathData("M17 17 14.82 14.82")
            addPathData("M10 15.5C10 16.328 9.328 17 8.5 17 7.672 17 7 16.328 7 15.5 7 14.672 7.672 14 8.5 14c.828 0 1.5 .672 1.5 1.5Z")
            addPathData("M9.561 14.439 17 7")
        }
        return _squareBottomDashedScissors!!
    }

private var _squareBottomDashedScissors: ImageVector? = null
