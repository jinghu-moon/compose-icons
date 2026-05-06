package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrickWallFire: ImageVector
    get() {
        if (_brickWallFire != null) return _brickWallFire!!
        _brickWallFire = lucideOutlineIcon(
            name = "BrickWallFire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3v2.107")
            addPathData("M17 9c1 3 2.5 3.5 3.5 4.5 .942 .923 1.481 2.181 1.5 3.5 0 2.761-2.239 5-5 5-2.761 0-5-2.239-5-5 0-.3 0-.6 .1-.9 .232 .811 .947 1.389 1.788 1.446 .841 .057 1.628-.42 1.967-1.192 .339-.772 .157-1.674-.454-2.254C13 11.5 16 9 17 9")
            addPathData("M21 8.274v-3.274C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h3.938")
            addPathData("M3 15h5.253")
            addPathData("M3 9h8.228")
            addPathData("M8 15v6")
            addPathData("M8 3v6")
        }
        return _brickWallFire!!
    }

private var _brickWallFire: ImageVector? = null
