package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrickWallShield: ImageVector
    get() {
        if (_brickWallShield != null) return _brickWallShield!!
        _brickWallShield = lucideOutlineIcon(
            name = "BrickWallShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v1.258")
            addPathData("M16 3v5.46")
            addPathData("M21 9.118v-4.118C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h5.75")
            addPathData("M22 17.5c0 2.499-1.75 3.749-3.83 4.474-.109 .037-.227 .035-.335-.005C15.75 21.249 14 19.999 14 17.499v-3.499c.001-.276 .224-.499 .5-.499 1 0 2.25-.6 3.12-1.36 .221-.181 .539-.182 .76-.001 .875 .765 2.12 1.36 3.12 1.36 .276 0 .5 .224 .5 .5Z")
            addPathData("M3 15h7")
            addPathData("M3 9h12.142")
            addPathData("M8 15v6")
            addPathData("M8 3v6")
        }
        return _brickWallShield!!
    }

private var _brickWallShield: ImageVector? = null
