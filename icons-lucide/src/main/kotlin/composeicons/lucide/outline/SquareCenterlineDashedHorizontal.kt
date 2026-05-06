package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareCenterlineDashedHorizontal: ImageVector
    get() {
        if (_squareCenterlineDashedHorizontal != null) return _squareCenterlineDashedHorizontal!!
        _squareCenterlineDashedHorizontal = lucideOutlineIcon(
            name = "SquareCenterlineDashedHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h-3C3.895 3 3 3.895 3 5v14c0 1.1 .9 2 2 2h3")
            addPathData("M16 3h3c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-3")
            addPathData("M12 20v2")
            addPathData("M12 14v2")
            addPathData("M12 8v2")
            addPathData("M12 2v2")
        }
        return _squareCenterlineDashedHorizontal!!
    }

private var _squareCenterlineDashedHorizontal: ImageVector? = null
