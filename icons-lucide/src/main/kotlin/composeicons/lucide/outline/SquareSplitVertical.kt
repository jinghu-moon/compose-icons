package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = lucideOutlineIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8v-3C5 4 6 3 7 3h10c1 0 2 1 2 2v3")
            addPathData("M19 16v3c0 1-1 2-2 2h-10C6 21 5 20 5 19v-3")
            addPathData("M4 12h16")
        }
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
