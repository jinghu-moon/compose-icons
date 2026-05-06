package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresExclude: ImageVector
    get() {
        if (_squaresExclude != null) return _squaresExclude!!
        _squaresExclude = lucideOutlineIcon(
            name = "SquaresExclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12v2c0 1.105-.895 2-2 2h-5c-.552 0-1 .448-1 1v3c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-10C22 8.895 21.105 8 20 8h0")
            addPathData("M4 16C2.895 16 2 15.105 2 14v-10C2 2.895 2.895 2 4 2h10c1.105 0 2 .895 2 2v3c0 .552-.448 1-1 1h-5C8.895 8 8 8.895 8 10v2")
        }
        return _squaresExclude!!
    }

private var _squaresExclude: ImageVector? = null
