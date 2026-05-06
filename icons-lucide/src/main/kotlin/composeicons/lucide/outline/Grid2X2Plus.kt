package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Grid2X2Plus: ImageVector
    get() {
        if (_grid2X2Plus != null) return _grid2X2Plus!!
        _grid2X2Plus = lucideOutlineIcon(
            name = "Grid2X2Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v17c0 .552-.448 1-1 1h-6C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v6c0 .552-.448 1-1 1h-17")
            addPathData("M16 19h6")
            addPathData("M19 22v-6")
        }
        return _grid2X2Plus!!
    }

private var _grid2X2Plus: ImageVector? = null
