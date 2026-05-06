package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FoldersOff: ImageVector
    get() {
        if (_foldersOff != null) return _foldersOff!!
        _foldersOff = tablerOutlineIcon(
            name = "FoldersOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17h-8C7.895 17 7 16.105 7 15v-8M8.177 4.177C8.428 4.063 8.707 4 9 4h3l2 2h5c1.105 0 2 .895 2 2v7c0 .55-.223 1.05-.583 1.411")
            addPathData("M17 17v2c0 1.105-.895 2-2 2h-10C3.895 21 3 20.105 3 19v-9C3 8.895 3.895 8 5 8h2")
            addPathData("M3 3 21 21")
        }
        return _foldersOff!!
    }

private var _foldersOff: ImageVector? = null
