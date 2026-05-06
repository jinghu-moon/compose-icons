package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareDashed: ImageVector
    get() {
        if (_squareDashed != null) return _squareDashed!!
        _squareDashed = lucideOutlineIcon(
            name = "SquareDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3C3.895 3 3 3.895 3 5")
            addPathData("M19 3c1.105 0 2 .895 2 2")
            addPathData("M21 19c0 1.105-.895 2-2 2")
            addPathData("M5 21C3.895 21 3 20.105 3 19")
            addPathData("M9 3h1")
            addPathData("M9 21h1")
            addPathData("M14 3h1")
            addPathData("M14 21h1")
            addPathData("M3 9v1")
            addPathData("M21 9v1")
            addPathData("M3 14v1")
            addPathData("M21 14v1")
        }
        return _squareDashed!!
    }

private var _squareDashed: ImageVector? = null
