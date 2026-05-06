package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareSplitHorizontal: ImageVector
    get() {
        if (_squareSplitHorizontal != null) return _squareSplitHorizontal!!
        _squareSplitHorizontal = lucideOutlineIcon(
            name = "SquareSplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19h-3C4 19 3 18 3 17v-10C3 6 4 5 5 5h3")
            addPathData("M16 5h3c1 0 2 1 2 2v10c0 1-1 2-2 2h-3")
            addPathData("M12 4v16")
        }
        return _squareSplitHorizontal!!
    }

private var _squareSplitHorizontal: ImageVector? = null
