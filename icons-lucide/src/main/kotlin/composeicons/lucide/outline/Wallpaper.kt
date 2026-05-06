package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) return _wallpaper!!
        _wallpaper = lucideOutlineIcon(
            name = "Wallpaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M8 21h8")
            addPathData("M9 17l6.1-6.1c.782-.766 2.034-.762 2.81 .01L22 15")
            addPathData("M10 9c0 1.105-.895 2-2 2C6.895 11 6 10.105 6 9 6 7.895 6.895 7 8 7c1.105 0 2 .895 2 2Z")
            addPathData("M4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3Z")
        }
        return _wallpaper!!
    }

private var _wallpaper: ImageVector? = null
