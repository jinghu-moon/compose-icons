package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareCenterlineDashedVertical: ImageVector
    get() {
        if (_squareCenterlineDashedVertical != null) return _squareCenterlineDashedVertical!!
        _squareCenterlineDashedVertical = lucideOutlineIcon(
            name = "SquareCenterlineDashedVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8v-3C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v3")
            addPathData("M21 16v3c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-3")
            addPathData("M4 12h-2")
            addPathData("M10 12h-2")
            addPathData("M16 12h-2")
            addPathData("M22 12h-2")
        }
        return _squareCenterlineDashedVertical!!
    }

private var _squareCenterlineDashedVertical: ImageVector? = null
