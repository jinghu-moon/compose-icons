package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquarePlay: ImageVector
    get() {
        if (_squarePlay != null) return _squarePlay!!
        _squarePlay = lucideOutlineIcon(
            name = "SquarePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M9 9.003c-.001-.361 .193-.695 .507-.873 .314-.178 .7-.173 1.01 .014l4.997 2.997c.303 .18 .488 .507 .488 .859 0 .352-.185 .679-.488 .859l-4.997 2.997c-.309 .187-.696 .192-1.01 .014C9.192 15.692 8.999 15.358 9 14.996Z")
        }
        return _squarePlay!!
    }

private var _squarePlay: ImageVector? = null
