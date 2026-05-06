package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlbumOff: ImageVector
    get() {
        if (_albumOff != null) return _albumOff!!
        _albumOff = tablerOutlineIcon(
            name = "AlbumOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.419 19.41C19.057 19.774 18.555 20 18 20h-12C4.895 20 4 19.105 4 18v-12C4 5.448 4.224 4.948 4.585 4.587")
            addPathData("M12 4v4M13.503 9.497 14 9l2 2v-7")
            addPathData("M3 3 21 21")
        }
        return _albumOff!!
    }

private var _albumOff: ImageVector? = null
