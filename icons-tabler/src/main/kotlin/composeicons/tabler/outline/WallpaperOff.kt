package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WallpaperOff: ImageVector
    get() {
        if (_wallpaperOff != null) return _wallpaperOff!!
        _wallpaperOff = tablerOutlineIcon(
            name = "WallpaperOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h8c1.105 0 2 .895 2 2v8M19.42 19.409c-.376 .378-.887 .591-1.42 .591h-12")
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M8 18v-10M4.573 4.598C4.22 4.96 4 5.454 4 6v12")
            addPathData("M3 3 21 21")
        }
        return _wallpaperOff!!
    }

private var _wallpaperOff: ImageVector? = null
