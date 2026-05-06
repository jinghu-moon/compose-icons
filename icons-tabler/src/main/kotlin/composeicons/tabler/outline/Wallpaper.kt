package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) return _wallpaper!!
        _wallpaper = tablerOutlineIcon(
            name = "Wallpaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6h10c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-12")
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M8 18v-12C8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6v12")
        }
        return _wallpaper!!
    }

private var _wallpaper: ImageVector? = null
